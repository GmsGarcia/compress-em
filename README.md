[![](https://shields.io/badge/CurseForge-Click%20Here-F16436?logo=curseforge&style=for-the-badge&logoColor=F16436)](https://www.curseforge.com/minecraft/mc-mods/compress-em) [![](https://shields.io/badge/Modrinth-Click%20Here-00AF5C?logo=modrinth&style=for-the-badge&logoColor=00AF5C)](https://modrinth.com/mod/compress-em)

# Compress 'em

Compress 'em lets you compress almost 60k blocks in just ONE!

## Supported versions

| Minecraft | Fabric | NeoForge |
| --- | --- | --- |
| 1.21.11 | yes | yes |
| 26.1, 26.1.1, 26.1.2 | yes | yes |
| 26.2 | yes | yes |
| 26.3 | yes | beta loader only |

One jar per Minecraft *minor* line: the 26.1 jar covers every 26.1.x patch, the
26.2 jar every 26.2.x, and so on, so a new Mojang patch needs no rebuild.
26.3 has no stable NeoForge release yet, so treat that jar as provisional.

## Recipes

![lol](https://media.discordapp.net/attachments/571421269740879887/869684362281615501/manually.png?width=1080&height=248)

## Building from source

Requires JDK 25 (and JDK 21 for the 1.21.11 toolchain). Everything else,
including the JDKs themselves, is fetched automatically.

```bash
./gradlew build
```

> **Never run `./gradlew clean build` as a single command.** Prism writes the
> generated access transformers (`build/generated/prism/at/*_accesstransformer.cfg`)
> during the *configuration* phase, and `clean` then deletes them before
> `createMinecraftArtifacts` reads them, so NFRT dies with
> `NoSuchFileException: ..._accesstransformer.cfg` and every target fails.
> This is a Prism 0.6.0 ordering bug, not a problem with this project. To force
> a from-scratch build, run the two commands separately:
>
> ```bash
> ./gradlew clean
> ./gradlew build
> ```

This produces eight jars under `versions/*/*/build/libs/`.

## Disclaimer

Older versions (1.18.x and older) will not receive support.

## License

**Compress 'em** is licensed under the Creative Commons
Attribution-NonCommercial-ShareAlike 4.0 International License. To view a copy of
this license, visit
[Creative Commons' website](http://creativecommons.org/licenses/by-nc-sa/4.0/)
or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
