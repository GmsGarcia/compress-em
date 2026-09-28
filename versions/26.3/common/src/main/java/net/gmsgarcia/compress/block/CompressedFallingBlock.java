package net.gmsgarcia.compress.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

/**
 * Compressed sand, red sand and gravel: falls when it loses support.
 *
 * <p>1.17 could write {@code new FallingBlock(settings, true)}. Modern
 * {@code FallingBlock} is abstract, so falling blocks need a concrete
 * subclass. Fifteen blocks need one, which is the only reason this class
 * exists.
 *
 * <p>{@link #getDustColor} reads the map colour back off the block state,
 * which is where it already lives after {@code mapColor(...)}. 1.17 derived
 * the same value from the material.
 *
 * <p><b>26.3 only.</b> This class is deliberately NOT in step with the 26.1
 * and 26.2 copies, which is the one sanctioned divergence between the 26.x
 * common trees. 26.3 deleted the block codec system outright: {@code Block},
 * {@code FallingBlock} and {@code ColoredFallingBlock} no longer declare
 * {@code CODEC} or {@code codec()} at all, where 26.1 and 26.2 still declare
 * an abstract {@code codec()} on {@code FallingBlock} and the older copies
 * must therefore build one with {@code BlockBehaviour.simpleCodec} to
 * round-trip the {@code Properties} through world save data. Copying the
 * 26.1 file here verbatim fails to compile with "cannot find symbol:
 * simpleCodec" and "method does not override or implement a method from a
 * supertype".
 */
public class CompressedFallingBlock extends FallingBlock {

    public CompressedFallingBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public int getDustColor(BlockState state, BlockGetter level, BlockPos pos) {
        return state.getMapColor(level, pos).col;
    }
}
