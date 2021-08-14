package net.gmsgarcia.compress.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class CompressedTuff extends Block {

    public CompressedTuff() {
        super(FabricBlockSettings.of(Material.STONE)
                .resistance(6f)
                .hardness(1.5f)
                .requiresTool()
                .breakByTool(FabricToolTags.PICKAXES, 0)
                .sounds(BlockSoundGroup.TUFF));
    }
}
