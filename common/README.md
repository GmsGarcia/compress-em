# `common/` — shared across ALL Minecraft versions

Code here is compiled once and reused by every target, which means it **must not
reference any Minecraft class**. It exists via `sharedCommon()` in
`settings.gradle.kts`.

There are currently no candidates: Compress 'em is almost entirely
Minecraft-dependent, so essentially all real code belongs in
`versions/{mc}/common/` instead, where vanilla classes are available.

Put Minecraft-free helpers here if any appear — string and id formatting, or the
recipe-family math from the `Families` content table.

**Do not** put content or block/item code here. It will not compile.
