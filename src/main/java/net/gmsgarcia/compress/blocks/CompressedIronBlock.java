package net.gmsgarcia.compress.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class CompressedIronBlock extends Block {

    public CompressedIronBlock() {
        super(FabricBlockSettings.of(Material.METAL)
                .resistance(6f)
                .hardness(5f)
                .requiresTool()
                .breakByTool(FabricToolTags.PICKAXES, 1)
                .sounds(BlockSoundGroup.METAL));
    }
}
