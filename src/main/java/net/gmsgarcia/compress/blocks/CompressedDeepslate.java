package net.gmsgarcia.compress.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class CompressedDeepslate extends Block {

    public CompressedDeepslate() {
        super(FabricBlockSettings.of(Material.STONE)
                .resistance(6f)
                .hardness(3f)
                .requiresTool()
                .breakByTool(FabricToolTags.PICKAXES, 0)
                .sounds(BlockSoundGroup.DEEPSLATE));
    }
}
