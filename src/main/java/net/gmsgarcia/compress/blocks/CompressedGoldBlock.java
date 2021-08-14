package net.gmsgarcia.compress.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class CompressedGoldBlock extends Block {

    public CompressedGoldBlock() {
        super(FabricBlockSettings.of(Material.METAL)
                .resistance(6f)
                .hardness(3f)
                .requiresTool()
                .breakByTool(FabricToolTags.PICKAXES, 2)
                .sounds(BlockSoundGroup.METAL));
    }
}
