package net.gmsgarcia.compress.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class CompressedCobblestone extends Block {

    public CompressedCobblestone() {
        super(FabricBlockSettings.of(Material.STONE)
                .hardness(6f)
                .resistance(2f)
                .requiresTool()
                .breakByTool(FabricToolTags.PICKAXES, 0)
                .sounds(BlockSoundGroup.STONE));
    }
}
