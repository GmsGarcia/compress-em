plugins {
    id("dev.prism")
}

group = "net.gmsgarcia.compress"
version = "2.0.0"

prism {
    metadata {
        modId = "compress"
        name = "Compress 'em"
        description = "Compress 'em Allows You To Compress Almost 60k Block In Only ONE!"
        // Matches the LICENSE file and README ("Attribution-NonCommercial-ShareAlike
        // 4.0"). The 1.17 fabric.mod.json said "cc-by-sa-4.0", which dropped the
        // NonCommercial term and contradicted both of those -- corrected here.
        license = "CC-BY-NC-SA-4.0"
        author("GmsGarcia#1553")
        // Prism appends the version itself, so {version} is deliberately
        // omitted here -- including it yields "2.0.0-2.0.0".
        archivesName = "compress-em-{mc}-{loader}"
        expand("homepage", "http://gmsgarcia.ga/compress-em")
        expand("sources", "https://github.com/GmsGarcia/compress-em")
    }

    // No yarn(...) call anywhere: its absence is what selects Mojmap (section 6.3).

    // The access widener is not optional: 26.1 made CreativeModeTab$Output
    // protected, which makes DisplayItemsGenerator impossible to implement, so
    // the creative tabs cannot be filled without widening it. See the comment
    // inside the files themselves.
    //
    // Each version needs its own file because the format differs: 1.21.11 is
    // obfuscated and remapped by fabric-loom-remap, so it uses the classic
    // .accesswidener; 26.1+ ships unobfuscated, where Loom expects the newer
    // class-tweaker format with an "official" namespace. Prism feeds the same
    // file to NeoForge as an access transformer, and "official" names on 26.x
    // are the mojmap names, so that conversion stays correct on both.
    //
    version("1.21.11") {
        accessWidener("versions/1.21.11/common/src/main/resources/compress.accesswidener")
        javaVersion = 21
        fabric {
            loaderVersion = "0.19.5"
            fabricApi("0.141.6+1.21.11")
        }
        neoforge { loaderVersion = "21.11.45" }
    }

    version("26.1") {
        // One jar serves the whole 26.1.x family (26.1, 26.1.1, 26.1.2):
        // same pack format, so same jar. This call only sets the *publishing*
        // game-version list (Modrinth/CurseForge) -- it does not reach loader
        // metadata. Runtime bounds live in the loader templates, which are not
        // interchangeable because Fabric rejects Maven range syntax:
        //   fabric.mod.json      ">=${minecraft_version} <26.2"
        //   neoforge.mods.toml   "[${minecraft_version},26.2)"
        // A bare "26.1" means EXACT on Fabric, and ">=26.1" alone would leak
        // into 26.2.x. When a 26.2 target lands it gets its own block/bounds.
        minecraftVersions("26.1", "26.1.1", "26.1.2")
        accessWidener("versions/26.1/common/src/main/resources/compress.classtweaker")
        javaVersion = 25
        fabric {
            loaderVersion = "0.19.5"
            fabricApi("0.155.3+26.1.2")
        }
        neoforge { loaderVersion = "26.1.2.109" }
    }
}
