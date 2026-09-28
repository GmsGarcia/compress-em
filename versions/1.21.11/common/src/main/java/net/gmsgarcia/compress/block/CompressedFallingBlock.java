package net.gmsgarcia.compress.block;

import com.mojang.serialization.MapCodec;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

/**
 * Compressed sand, red sand and gravel: falls when it loses support.
 *
 * <p>1.17 could write {@code new FallingBlock(settings, true)}. Modern
 * {@code FallingBlock} is abstract, with two abstract members, so falling
 * blocks need a concrete subclass. Fifteen blocks need one, which is the only
 * reason this class exists.
 *
 * <p>Both abstract members are inherited from vanilla's own falling blocks
 * rather than invented here:
 * <ul>
 *   <li>{@link #CODEC} is built with {@code BlockBehaviour.simpleCodec}, which
 *       round-trips the {@code Properties} through world save data. Passing the
 *       spec's colour through a side channel instead would silently reset the
 *       hardness and dust colour on every world reload.
 *   <li>{@link #getDustColor} reads the map colour back off the block state,
 *       which is where it already lives after {@code mapColor(...)}. 1.17
 *       derived the same value from the material.
 * </ul>
 */
public class CompressedFallingBlock extends FallingBlock {

    public static final MapCodec<CompressedFallingBlock> CODEC = simpleCodec(CompressedFallingBlock::new);

    public CompressedFallingBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    protected MapCodec<? extends FallingBlock> codec() {
        return CODEC;
    }

    @Override
    public int getDustColor(BlockState state, BlockGetter level, BlockPos pos) {
        return state.getMapColor(level, pos).col;
    }
}
