package net.gmsgarcia.compress.content;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

/**
 * The 22 distinct block property sets behind Compress 'em's 140 blocks.
 *
 * <p>1.17 had 20 near-identical block classes that differed only in their
 * property values, plus 15 blocks built from an inline
 * {@code new FallingBlock(...)}. Every one of them is now a row in this table.
 *
 * <p>Each constant is named after the 1.17 class it replaces, so the mapping
 * stays checkable against the preservation tag.
 */
public final class BlockFamilies {

    /** dirt */
    public static final BlockSpec DIRT = new BlockSpec(
            MapColor.DIRT, SoundType.GRAVEL, 0.5f, 0.5f,
            false, ToolTier.NONE, BlockKind.SOLID);

    /** falling sand */
    public static final BlockSpec FALLING_SAND = new BlockSpec(
            MapColor.DIRT, SoundType.SAND, 0.5f, 0.5f,
            false, ToolTier.NONE, BlockKind.FALLING);

    /** falling gravel */
    public static final BlockSpec FALLING_GRAVEL = new BlockSpec(
            MapColor.DIRT, SoundType.GRAVEL, 0.6f, 0.6f,
            false, ToolTier.NONE, BlockKind.FALLING);

    /** generic stone */
    public static final BlockSpec GENERIC_STONE = new BlockSpec(
            MapColor.STONE, SoundType.STONE, 1.5f, 6.0f,
            true, ToolTier.PICKAXE, BlockKind.SOLID);

    /** cobblestone */
    public static final BlockSpec COBBLESTONE = new BlockSpec(
            MapColor.STONE, SoundType.STONE, 2.0f, 6.0f,
            true, ToolTier.PICKAXE, BlockKind.SOLID);

    /** netherrack */
    public static final BlockSpec NETHERRACK = new BlockSpec(
            MapColor.STONE, SoundType.STONE, 0.4f, 0.4f,
            true, ToolTier.PICKAXE, BlockKind.SOLID);

    /** end stone */
    public static final BlockSpec END_STONE = new BlockSpec(
            MapColor.STONE, SoundType.STONE, 3.0f, 9.0f,
            true, ToolTier.PICKAXE, BlockKind.SOLID);

    /** amethyst */
    public static final BlockSpec AMETHYST = new BlockSpec(
            MapColor.QUARTZ, SoundType.AMETHYST, 1.5f, 1.5f,
            true, ToolTier.PICKAXE, BlockKind.SOLID);

    /** calcite */
    public static final BlockSpec CALCITE = new BlockSpec(
            MapColor.STONE, SoundType.CALCITE, 0.75f, 0.75f,
            true, ToolTier.PICKAXE, BlockKind.SOLID);

    /** cobbled deepslate */
    public static final BlockSpec COBBLED_DEEPSLATE = new BlockSpec(
            MapColor.STONE, SoundType.DEEPSLATE, 3.5f, 6.0f,
            true, ToolTier.PICKAXE, BlockKind.SOLID);

    /** deepslate */
    public static final BlockSpec DEEPSLATE = new BlockSpec(
            MapColor.STONE, SoundType.DEEPSLATE, 3.0f, 6.0f,
            true, ToolTier.PICKAXE, BlockKind.SOLID);

    /** dripstone block */
    public static final BlockSpec DRIPSTONE_BLOCK = new BlockSpec(
            MapColor.STONE, SoundType.DRIPSTONE_BLOCK, 1.5f, 1.0f,
            true, ToolTier.PICKAXE, BlockKind.SOLID);

    /** smooth basalt */
    public static final BlockSpec SMOOTH_BASALT = new BlockSpec(
            MapColor.STONE, SoundType.BASALT, 1.25f, 4.2f,
            true, ToolTier.PICKAXE, BlockKind.SOLID);

    /** tuff */
    public static final BlockSpec TUFF = new BlockSpec(
            MapColor.STONE, SoundType.TUFF, 1.5f, 6.0f,
            true, ToolTier.PICKAXE, BlockKind.SOLID);

    /** coal block */
    public static final BlockSpec COAL_BLOCK = new BlockSpec(
            MapColor.STONE, SoundType.STONE, 5.0f, 6.0f,
            true, ToolTier.PICKAXE, BlockKind.SOLID);

    /** copper block */
    public static final BlockSpec COPPER_BLOCK = new BlockSpec(
            MapColor.STONE, SoundType.COPPER, 3.0f, 6.0f,
            true, ToolTier.STONE, BlockKind.SOLID);

    /** iron block */
    public static final BlockSpec IRON_BLOCK = new BlockSpec(
            MapColor.METAL, SoundType.METAL, 5.0f, 6.0f,
            true, ToolTier.STONE, BlockKind.SOLID);

    /** lapis block */
    public static final BlockSpec LAPIS_BLOCK = new BlockSpec(
            MapColor.STONE, SoundType.STONE, 3.0f, 3.0f,
            true, ToolTier.STONE, BlockKind.SOLID);

    /** redstone block */
    public static final BlockSpec REDSTONE_BLOCK = new BlockSpec(
            MapColor.METAL, SoundType.METAL, 5.0f, 6.0f,
            true, ToolTier.IRON, BlockKind.SOLID);

    /** gold block */
    public static final BlockSpec GOLD_BLOCK = new BlockSpec(
            MapColor.METAL, SoundType.METAL, 3.0f, 6.0f,
            true, ToolTier.IRON, BlockKind.SOLID);

    /** generic ore */
    public static final BlockSpec GENERIC_ORE = new BlockSpec(
            MapColor.METAL, SoundType.METAL, 5.0f, 6.0f,
            true, ToolTier.IRON, BlockKind.SOLID);

    private BlockFamilies() {
    }
}
