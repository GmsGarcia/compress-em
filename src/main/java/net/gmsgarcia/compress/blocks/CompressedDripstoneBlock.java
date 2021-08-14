package net.gmsgarcia.compress.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class CompressedDripstoneBlock extends Block {

    public CompressedDripstoneBlock() {
        super(FabricBlockSettings.of(Material.STONE)
                .resistance(1f)
                .hardness(1.5f)
                .requiresTool()
                .breakByTool(FabricToolTags.PICKAXES, 0)
                .sounds(BlockSoundGroup.DRIPSTONE_BLOCK));
    }
}
