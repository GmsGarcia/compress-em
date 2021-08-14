package net.gmsgarcia.compress.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class CompressedAmethystBlock extends Block {

    public CompressedAmethystBlock() {
        super(FabricBlockSettings.of(Material.AMETHYST)
                .resistance(1.5f)
                .hardness(1.5f)
                .requiresTool()
                .breakByTool(FabricToolTags.PICKAXES, 0)
                .sounds(BlockSoundGroup.AMETHYST_BLOCK));
    }
}
