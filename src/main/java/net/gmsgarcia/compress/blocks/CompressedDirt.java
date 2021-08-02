package net.gmsgarcia.compress.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class CompressedDirt extends Block {

    public CompressedDirt() {
        super(FabricBlockSettings.of(Material.SOIL)
                .hardness(0.6f)
                .resistance(0.8f)
                .breakByTool(FabricToolTags.SHOVELS, 0)
                .sounds(BlockSoundGroup.GRAVEL));
    }
}
