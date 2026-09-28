# Changelog

All notable changes to Compress 'em are recorded here.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

The 1.17.1 → 1.21.11 / 26.1 port is a **breaking change** (a full target and
loader matrix change), hence 2.0.0.

## [2.0.0] - unreleased

### Added

- `bag_with_allium` and `un_bag_with_allium` recipes. The item was registered
  since 1.14.6 but had no recipe at all, making it the only compressed item
  that could not be obtained or consumed. The 3×3 → 9-output rule matches all 23
  sibling pairs.
- Fabric and NeoForge targets for Minecraft 1.21.11 and 26.1, built with Prism.

### Changed

- All 326 recipes converted to the 1.21 format: `recipes/` → `recipe/`,
  `{"item": "x"}` ingredients → `"x"` string shorthand, `{"item": ...}` results →
  `{"id": ...}`. The `"group"` field is dropped — it was already inconsistent
  between recipes and has no effect on crafting.
- Block states, block models, item model definitions and the 176 textures are
  regenerated for 1.21+ layout. Textures and all translated strings are carried
  over unchanged.
- Registration goes through vanilla registries with a single shared
  implementation. Creative tabs are built with vanilla's `CreativeModeTab.Builder`
  and filled through `displayItems` on both loaders, rather than through a
  per-loader tab handle, which 1.21 removed along with `Item.Properties#tab`.
- The license metadata is corrected to `CC-BY-NC-SA-4.0`. The 1.17
  `fabric.mod.json` declared `cc-by-sa-4.0`, dropping the NonCommercial term and
  contradicting both the `LICENSE` file and the README, which both state
  `CC-BY-NC-SA-4.0`. The built jar metadata now agrees with them.

### Removed

- **The ruby line — all six blocks.** `ruby_block` and
  `compressed_ruby_block_1` through `_5`, their block items, blockstates, models,
  textures, 12 recipes and translation keys. **If you had placed or crafted any
  ruby block, it is gone — there is no replacement.**
- **The four produce baskets and their `*_cesta` models.** `apple_basket`,
  `potato_basket`, `carrot_basket` and `beetroot_basket`, their block items,
  blockstates, the four reverse-only `un_*_basket` recipes, the four hand-authored
  `*_cesta` models and their translation keys. **If you had placed or crafted a
  basket, it is gone — there is no replacement.**
- Seven textures that existed only for the baskets: `apple_block`,
  `beetroot_block`, `carrot_block`, `potato_block` and `planks_1`, `planks_2`,
  `planks_90deg`.
- All 140 `data/compress/loot_tables/blocks/*` self-drop tables. Every one was an
  identity drop; blocks now drop themselves by default.
- The 140 `models/item/<block_id>.json` block-item aliases. These have been
  unreadable since 1.21.9 replaced them with `assets/compress/items/<id>.json`
  model definitions, which now point each block item directly at its block
  model.

### Fixed

- **The port could not start at all.** Every build crashed on launch with
  `NullPointerException: Block id not set`, thrown from
  `BlockBehaviour$Properties.effectiveDrops()` before the mod finished its
  first entrypoint, on all four targets. Block drops became data-driven in
  1.21.2, so a block's `Properties` must now be told its own registry key
  before the `Block` constructor runs; 1.17's `BlockSettings` never asked. The
  key is now built once per id and used for both `Properties.setId` and the
  registry call, so a block can no longer be built with one id and registered
  under another. The same fix applies to `Item.Properties`, which has the same
  requirement. Found by the first real launch — no static gate could see it.
- **The NeoForge jars failed to load at all, with `Missing license (main)`.** FML
  reads `license` from the *root* of `neoforge.mods.toml`, via
  `getConfigElement("license")` on the file-level config, but the template
  declared it inside `[[mods]]` — where the loader never looks. The parenthesised
  `(main)` is just the id FML assigns the jar itself. `logoFile` was misplaced the
  same way and has been moved to the root as well.
- **NeoForge crashed on startup with `Registry is already frozen`.** NeoForge
  freezes every registry *before* it constructs the `@Mod` class, so the shared
  bootstrap could not build its content there. This is not only a problem with the
  `Registry.register` call: `Block`'s constructor claims an intrusive registry
  holder as part of constructing the object, so deferring just the register call
  would still have crashed. The common bootstrap now hands a
  `ContentRegistrar` a set of factories instead of built objects; Fabric builds
  and registers them inline, while NeoForge queues them on `DeferredRegister`s
  and builds them during `RegisterEvent`. All four targets now log
  `Compress 'em loaded: 130 blocks, 156 items`.
- **Block items showed their raw id instead of their name.** The creative tab
  listed entries like `compress.compressed_dirt_1` rather than
  `Compressed Dirt (x1)`. The `en_us.json` file was correct throughout: it
  defines all 130 `block.compress.*` keys. The bug was that `Item` resolves its
  translation key once in its constructor, from
  `Properties.effectiveDescriptionId()`, and `getDescriptionId()` is `final`, so
  a `BlockItem` cannot correct it afterwards. Without
  `useBlockDescriptionPrefix()` every block item looked up
  `item.compress.<id>` — a key that does not exist for any block — and fell
  through to the raw id. The 26 plain items were unaffected, which is why items
  had names and blocks did not.
- **The mod icon is back.** The per-loader metadata written in the port omitted
  the `icon` / `logoFile` field that 1.17's `fabric.mod.json` carried, and the
  port also never copied `assets/compress/icon.png` across, so the mod would
  have shipped with no icon on both CurseForge and Modrinth. The file is now
  carried by the resource generator and referenced from both loaders.
- The creative tab's `displayItems` lambda compiled on 1.21.11 but not on 26.1,
  where `CreativeModeTab$Output` is `protected`. Widened per version via an
  access widener (1.21.11) and a class tweaker (26.1).
- **No block dropped anything.** None of the 130 blocks shipped a loot table.
  Block drops became data-driven in 1.21.2, and 1.17's
  `BlockDropTable`-style registration did not survive the port, so every
  compressed block broke to nothing no matter which tool was used. All 130 now
  ship a `data/compress/loot_table/blocks/<id>.json` with a
  `survives_explosion` pool and a per-block `random_sequence`.
- **No block could drop *correctly*, even once it had a loot table.** Two
  independent halves of the drop check had to hold, and the port had neither in
  the modern form. `BlockSpec#toProperties` sets
  `requiresCorrectToolForDrops`, but the tool's own `minecraft:tool` component
  is the other half: it carries `deniesDrops(#incorrect_for_<material>_tool)`
  followed by `minesAndDrops(#mineable/<tool type>, speed)`, and
  `Tool.isCorrectForDrops` returns the first matching rule's verdict -- and
  `false` when nothing matches at all. The 110 tiered blocks were in no
  `mineable/pickaxe` tag, so every pickaxe was denied and they dropped nothing
  while still breaking at pickaxe speed. `mineable/pickaxe` and
  `mineable/shovel` tags now ship for all 110 + 20 blocks respectively, and
  1.17's per-block `breakByTool` level became a `needs_<tier>_tool` tag, which
  vanilla consumes transitively via its own `incorrect_for_*` tags.
- **Tool tiers did not match the blocks they compress.** The tiers were carried
  over from 1.17's `breakByTool` levels, which no longer correspond to vanilla's
  tags. Reading `needs_<tier>_tool` out of the 1.21.11 and 26.1 clients, whose
  tag data is byte-identical: `needs_stone_tool` covers the iron, copper and
  lapis blocks (was `needs_iron_tool` here), `needs_iron_tool` covers gold,
  diamond and emerald blocks and their ores (gold was `needs_diamond_tool`),
  and `needs_diamond_tool` covers only obsidian, netherite block, respawn
  anchor and ancient debris -- so no compressed block needs a diamond pickaxe
  and that tag now ships empty. The stone family is in *no* `needs_*` tag at
  all, only in `mineable/pickaxe`, which means "a pickaxe of any tier, wooden
  included" rather than "a stone pickaxe"; `ToolTier.PICKAXE` expresses that
  (a pickaxe is required, but no tier tag denies a wooden one), which affected
  75 blocks that were over-gated to stone pickaxes.

### Migration notes

- **Ten ids are gone**: `ruby_block`, `compressed_ruby_block_1` through
  `_5`, and `apple_basket`, `potato_basket`, `carrot_basket`,
  `beetroot_basket`. Every remaining id is byte-for-byte identical to 1.17.1 and
  in the same relative registration order, so existing 1.17 worlds keep all
  other blocks and items. A world that contained a removed block will have it
  stripped from the chunk on load, and its item form will not exist.
- Item models for blocks are unchanged visually, so existing resource packs'
  block models still apply. Packs that override `models/item/<block_id>.json`
  (which 1.21.9+ ignores) should move to overriding
  `models/block/<block_id>.json` instead. Packs that reference the removed
  `*_cesta` models or the seven basket-only textures will have those references
  dangle, harmlessly.
- Requires Java 21 (1.21.11) or 25 (26.1).
- The `Missing texture references in model` warnings on startup are gone. They
  came from the four `*_cesta` models, and the baskets no longer exist.
