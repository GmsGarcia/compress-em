package net.gmsgarcia.compress.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class CompressedDirt extends Block {

    public CompressedDirt() {
        super(FabricBlockSettings.of(Material.SOIL)
                .resistance(0.5f)
                .hardness(0.5f)
                .breakByTool(FabricToolTags.SHOVELS, 0)
                .sounds(BlockSoundGroup.GRAVEL));
    }
}
