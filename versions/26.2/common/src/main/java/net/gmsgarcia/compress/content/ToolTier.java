package net.gmsgarcia.compress.content;

/**
 * The tool tier a block demands, replacing 1.17's per-block
 * {@code breakByTool(FabricToolTags.PICKAXES, level)} call.
 *
 * <p>That API is gone, and the modern replacement is not the single tag it
 * superficially resembles. Two independent things must both hold before a
 * tiered block drops, and missing either one fails silently.
 *
 * <p>1. {@link BlockSpec#toProperties()} sets
 * {@code requiresCorrectToolForDrops}, which is only the block's half of the
 * bargain. 2. The tool's own {@code minecraft:tool} component decides the
 * rest: a tool carries a list of rules, and a stone pickaxe is built as
 * {@code deniesDrops(#incorrect_for_stone_tool)} followed by
 * {@code minesAndDrops(#mineable/pickaxe, speed)}. {@code Tool.isCorrectForDrops}
 * returns the first rule whose block set contains the block, and
 * <em>false when no rule matches at all</em>. A block missing from
 * {@code #mineable/pickaxe} is therefore undroppable by every pickaxe,
 * whatever the tier tags say -- it just breaks slowly, because the block
 * still demands a tool it can never be given.
 *
 * <p>The tier tags are consequently an input to vanilla's own tags rather than
 * something the game consults for us. {@code #incorrect_for_stone_tool} is
 * literally {@code #needs_diamond_tool} plus {@code #needs_iron_tool}, so
 * listing a block in {@code needs_iron_tool} is what makes it incorrect for
 * wooden, stone and copper tools simultaneously. Both halves ship under
 * {@code data/minecraft/tags/block/}: {@code needs_<tier>_tool.json}, one file
 * per tier, and {@code mineable/pickaxe.json}; the ungated {@link #NONE} blocks
 * are listed in {@code mineable/shovel.json} so shovels break them at full
 * speed. Omit the first and every tool counts as correct; omit the second and
 * none does. Neither shows up as a build error or a launch failure, which is
 * why the invariant is written down here.
 *
 * <p>Each tier mirrors the vanilla block it compresses, read straight out of
 * {@code data/minecraft/tags/block/needs_<tier>_tool.json} in the 1.21.11 and
 * 26.1 clients, whose tag data is byte-identical. Vanilla defines only three
 * gated tiers: {@code needs_stone_tool} covers the iron, copper and lapis
 * blocks; {@code needs_iron_tool} covers gold, diamond and emerald blocks plus
 * the gold, diamond, emerald and redstone ores; {@code needs_diamond_tool}
 * covers only obsidian, crying obsidian, netherite block, respawn anchor and
 * ancient debris. Hence a compressed gold block belongs to
 * {@code needs_iron_tool}, and hence {@link #DIAMOND} is declared but
 * currently unused -- no compressed block mirrors an obsidian- or
 * netherite-tier block.
 *
 * <p>Most of the stone family -- stone, cobblestone, netherrack, deepslate,
 * calcite, tuff, amethyst, dripstone, smooth basalt, end stone, and the coal
 * and redstone blocks -- is in <em>no</em> {@code needs_<tier>_tool} tag
 * whatsoever, only in {@code mineable/pickaxe}. Vanilla is saying "a pickaxe of
 * any tier, wooden included", not "a stone pickaxe", and {@link #PICKAXE} is
 * how that reads here: {@code requiresCorrectToolForDrops} stays on so bare
 * hands still drop nothing, but the block is listed in no tier tag, and the
 * tier tag is the only thing that can deny a wooden pickaxe. Anything 1.17
 * gated behind a shovel or an axe, or left ungated, is {@link #NONE}.
 */
public enum ToolTier {
    /** No tool needed at all: the block drops bare-handed. */
    NONE(null),
    /**
     * A pickaxe of any tier, wooden included. Vanilla expresses this by not
     * tagging the block at all -- it keeps {@code requiresCorrectToolForDrops}
     * and {@code mineable/pickaxe} membership while sitting outside every
     * {@code needs_<tier>_tool} tag, so nothing ever denies a wooden pickaxe.
     * Sharing a null tag id with {@link #NONE} is deliberate; the two are told
     * apart by {@code requiresCorrectTool}, not by the tier.
     */
    PICKAXE(null),
    STONE("needs_stone_tool"),
    IRON("needs_iron_tool"),
    DIAMOND("needs_diamond_tool");

    private final String vanillaTagId;

    ToolTier(String vanillaTagId) {
        this.vanillaTagId = vanillaTagId;
    }

    /**
     * @return the vanilla block tag id this tier needs, or {@code null} for
     *         {@link #NONE}
     */
    public String vanillaTagId() {
        return vanillaTagId;
    }
}
