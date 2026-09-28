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
        // SUPPORT POLICY: one jar per Minecraft MINOR line, covering every
        // patch in it. 26.1.0/26.1.1/26.1.2 share pack format resource 84.0 /
        // data 101.1, so a single jar serves all three and nothing needs
        // rebuilding when Mojang ships another patch.
        //
        // Three places have to agree on that line, and only two are here:
        //   1. minecraftVersions(...)  -- publishing list. Platforms require
        //      explicit version strings, so this is a hardcoded list and must
        //      be extended by hand when 26.1.3 ships. Nothing else fails
        //      loudly if it is missed; users just cannot find the release.
        //   2. fabric.mod.json         -- ">=26.1 <26.2"
        //   3. neoforge.mods.toml      -- minecraft "[26.1,26.2)",
        //                                neoforge "[26.1,)" (a literal, NOT
        //                                ${neoforge_version} -- see the long
        //                                comment in that file)
        // Bounds are per-loader because Fabric rejects Maven range syntax:
        // ">=" / "<" only, with a space, never "[1.21,2)".
        //
        // ">=26.1" alone would leak into 26.2.x, hence the <26.2 cap, and a
        // bare "26.1" would be EXACT on Fabric, hence the >=. The 26.2 and
        // 26.3 blocks below copy this shape, each with its own pack.mcmeta.
        minecraftVersions("26.1", "26.1.1", "26.1.2")
        accessWidener("versions/26.1/common/src/main/resources/compress.classtweaker")
        javaVersion = 25
        fabric {
            loaderVersion = "0.19.5"
            fabricApi("0.155.3+26.1.2")
        }
        neoforge {
            // Compile target only. Deliberately the newest patch in the line,
            // so the jar is built against the most recent 26.1 API. This value
            // is NOT the runtime floor -- that lives as a literal in
            // neoforge.mods.toml, because Prism would otherwise turn this
            // exact string into a floor like "[26.1.2.112,)" and lock out
            // 26.1.0/26.1.1, whose NeoForge builds sort below it.
            loaderVersion = "26.1.2.112"
        }
    }

    // 26.2. Pack format moves 84.0/101.1 -> 88.0/107.1, so this needs its own
    // pack.mcmeta and its own common tree. NeoForge is stable here.
    version("26.2") {
        // See the 26.1 block above for what each of these three places does.
        // Both ranges are the minor line, so future 26.2.x patches need only a
        // new entry in this list, never a rebuild of the jar itself.
        minecraftVersions("26.2")
        accessWidener("versions/26.2/common/src/main/resources/compress.classtweaker")
        javaVersion = 25
        fabric {
            loaderVersion = "0.19.5"
            fabricApi("0.161.0+26.2")
        }
        neoforge {
            loaderVersion = "26.2.0.88"
        }
    }

    // 26.3. Pack format 97.1/121.0.
    //
    // CAVEAT: Minecraft 26.3 shipped 2026-09-15 and NeoForge has NOT cut a
    // stable build for it yet -- 26.3.0.26-beta is the newest. This target
    // therefore compiles against a beta loader and should be treated as
    // provisional: the NeoForge floor in neoforge.mods.toml is a literal
    // "[26.3,)" so a future 26.3.0.99 release drops straight in with no
    // metadata change, but do not publish this jar as stable support.
    version("26.3") {
        minecraftVersions("26.3")
        accessWidener("versions/26.3/common/src/main/resources/compress.classtweaker")
        javaVersion = 25
        fabric {
            loaderVersion = "0.19.5"
            fabricApi("0.161.0+26.3")
        }
        neoforge {
            loaderVersion = "26.3.0.26-beta"
        }
    }
}
