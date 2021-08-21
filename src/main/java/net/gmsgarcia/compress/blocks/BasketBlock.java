package net.gmsgarcia.compress.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.ShapeContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class BasketBlock extends Block {

    public BasketBlock() {
        super(FabricBlockSettings.of(Material.WOOD)
                .resistance(3f)
                .hardness(2f)
                .breakByTool(FabricToolTags.AXES, 0)
                .sounds(BlockSoundGroup.WOOD));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return VoxelShapes.cuboid(0.0f, 0.0f, 0f, 1.0f, 0.6875f, 1.0f);
    }
}
