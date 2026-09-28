package net.gmsgarcia.compress.content;

import net.gmsgarcia.compress.block.CompressedFallingBlock;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

/**
 * The property set behind a Compress 'em block, and the one place those
 * properties are turned into a real block.
 *
   * <p>1.17 spread this across 20 classes that differed only in their constructor
   * arguments. Collapsing them into data is the whole point of this record, but
   * the numbers are preserved exactly -- see {@link BlockFamilies} for the
   * per-family mapping.
 *
 * @param mapColor             replaces {@code Material}; affects map rendering only
 * @param sound                replaces {@code BlockSoundGroup}, renamed to {@code SoundType}
 * @param destroyTime          1.17's {@code hardness}
 * @param explosionResistance  1.17's {@code resistance}
 * @param requiresCorrectTool  1.17's {@code requiresTool()}
 * @param toolTier             1.17's {@code breakByTool(...)} level, now a block tag
 * @param kind                 which block class to instantiate
 */
public record BlockSpec(
        MapColor mapColor,
        SoundType sound,
        float destroyTime,
        float explosionResistance,
        boolean requiresCorrectTool,
        ToolTier toolTier,
        BlockKind kind) {

    public BlockSpec {
        if (destroyTime < 0.0f || explosionResistance < 0.0f) {
            throw new IllegalArgumentException("negative block strength");
        }
    }

    /**
     * Builds the modern equivalent of a 1.17
     * {@code FabricBlockSettings.of(Material.X).hardness(h).resistance(r)...} chain.
     *
     * <p>Argument order matters and is easy to get backwards:
     * {@code strength(a, b)} assigns {@code a} to {@code destroyTime} and
     * {@code b} to {@code explosionResistance}, so 1.17's
     * {@code hardness(h).resistance(r)} becomes {@code strength(h, r)}.
     *
     * <p>What 1.17's {@code Material} used to imply is now spelled out:
     * {@code Material} is gone and only its map colour survives. Nothing else is
   * added here on purpose -- the occlusion and lava-immolation tuning that the
   * old non-solid materials implied is left at the vanilla defaults rather than
   * guessed at.
     *
     * <p>{@code setId} is not cosmetic. Block drops became data-driven in
     * 1.21.2, so {@code Block}'s constructor resolves this block's loot table
     * through its registry key, and every build of {@code Properties} here is
     * only valid once that key is known. 1.17 had no such requirement --
     * {@code BlockSettings} never asked which block it was describing -- which
     * is why a spec alone was enough to build a block then, and is not enough
     * now. Omitting it fails at launch with {@code NullPointerException: Block
     * id not set} from {@code Properties.effectiveDrops()}, before the mod
     * finishes its first entrypoint. The key therefore has to be threaded in
     * from the registration site, which is the one place that knows the id.
     */
    public BlockBehaviour.Properties toProperties(ResourceKey<Block> key) {
        BlockBehaviour.Properties properties = BlockBehaviour.Properties.of()
                .mapColor(mapColor)
                .sound(sound)
                .strength(destroyTime, explosionResistance)
                .setId(key);
        if (requiresCorrectTool) {
            properties = properties.requiresCorrectToolForDrops();
        }
        return properties;
    }

    public Block create(ResourceKey<Block> key) {
        return switch (kind) {
            case SOLID -> new Block(toProperties(key));
            case FALLING -> new CompressedFallingBlock(toProperties(key));
        };
    }
}
