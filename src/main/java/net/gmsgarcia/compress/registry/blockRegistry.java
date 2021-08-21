package net.gmsgarcia.compress.registry;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.gmsgarcia.compress.blocks.*;

import net.gmsgarcia.compress.blocks.block_entities.CompressorEntity;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class blockRegistry {

    // public static final String MOD_ID = "compress";
    // a public identifier for multiple parts of our bigger chest
    // public static final Identifier BOX = new Identifier(MOD_ID, "compressor");

    public static final ItemGroup COMPRESS_BLOCKS = FabricItemGroupBuilder.build(new Identifier("compress", "blocks"), () -> new ItemStack(Blocks.COBBLESTONE));

    public static final Block COMPRESSOR = new CompressorRegistry();
    public static BlockEntityType<CompressorEntity> COMPRESSOR_ENTITY;

    /* DIRT */
    public static final Block COMPRESSED_DIRT_1 = new CompressedDirt();
    public static final Block COMPRESSED_DIRT_2 = new CompressedDirt();
    public static final Block COMPRESSED_DIRT_3 = new CompressedDirt();
    public static final Block COMPRESSED_DIRT_4 = new CompressedDirt();
    public static final Block COMPRESSED_DIRT_5 = new CompressedDirt();
    /* SAND */
    public static final Block COMPRESSED_SAND_1 = new FallingBlock(FabricBlockSettings.of(Material.SOIL).resistance(0.5f).hardness(0.5f).breakByTool(FabricToolTags.SHOVELS, 0).sounds(BlockSoundGroup.SAND));
    public static final Block COMPRESSED_SAND_2 = new FallingBlock(FabricBlockSettings.of(Material.SOIL).resistance(0.5f).hardness(0.5f).breakByTool(FabricToolTags.SHOVELS, 0).sounds(BlockSoundGroup.SAND));
    public static final Block COMPRESSED_SAND_3 = new FallingBlock(FabricBlockSettings.of(Material.SOIL).resistance(0.5f).hardness(0.5f).breakByTool(FabricToolTags.SHOVELS, 0).sounds(BlockSoundGroup.SAND));
    public static final Block COMPRESSED_SAND_4 = new FallingBlock(FabricBlockSettings.of(Material.SOIL).resistance(0.5f).hardness(0.5f).breakByTool(FabricToolTags.SHOVELS, 0).sounds(BlockSoundGroup.SAND));
    public static final Block COMPRESSED_SAND_5 = new FallingBlock(FabricBlockSettings.of(Material.SOIL).resistance(0.5f).hardness(0.5f).breakByTool(FabricToolTags.SHOVELS, 0).sounds(BlockSoundGroup.SAND));
    /* RED SAND */
    public static final Block COMPRESSED_RED_SAND_1 = new FallingBlock(FabricBlockSettings.of(Material.SOIL).resistance(0.5f).hardness(0.5f).breakByTool(FabricToolTags.SHOVELS, 0).sounds(BlockSoundGroup.SAND));
    public static final Block COMPRESSED_RED_SAND_2 = new FallingBlock(FabricBlockSettings.of(Material.SOIL).resistance(0.5f).hardness(0.5f).breakByTool(FabricToolTags.SHOVELS, 0).sounds(BlockSoundGroup.SAND));
    public static final Block COMPRESSED_RED_SAND_3 = new FallingBlock(FabricBlockSettings.of(Material.SOIL).resistance(0.5f).hardness(0.5f).breakByTool(FabricToolTags.SHOVELS, 0).sounds(BlockSoundGroup.SAND));
    public static final Block COMPRESSED_RED_SAND_4 = new FallingBlock(FabricBlockSettings.of(Material.SOIL).resistance(0.5f).hardness(0.5f).breakByTool(FabricToolTags.SHOVELS, 0).sounds(BlockSoundGroup.SAND));
    public static final Block COMPRESSED_RED_SAND_5 = new FallingBlock(FabricBlockSettings.of(Material.SOIL).resistance(0.5f).hardness(0.5f).breakByTool(FabricToolTags.SHOVELS, 0).sounds(BlockSoundGroup.SAND));
    /* GRAVEL */
    public static final Block COMPRESSED_GRAVEL_1 = new FallingBlock(FabricBlockSettings.of(Material.SOIL).resistance(0.6f).hardness(0.6f).breakByTool(FabricToolTags.SHOVELS, 0).sounds(BlockSoundGroup.GRAVEL));
    public static final Block COMPRESSED_GRAVEL_2 = new FallingBlock(FabricBlockSettings.of(Material.SOIL).resistance(0.6f).hardness(0.6f).breakByTool(FabricToolTags.SHOVELS, 0).sounds(BlockSoundGroup.GRAVEL));
    public static final Block COMPRESSED_GRAVEL_3 = new FallingBlock(FabricBlockSettings.of(Material.SOIL).resistance(0.6f).hardness(0.6f).breakByTool(FabricToolTags.SHOVELS, 0).sounds(BlockSoundGroup.GRAVEL));
    public static final Block COMPRESSED_GRAVEL_4 = new FallingBlock(FabricBlockSettings.of(Material.SOIL).resistance(0.6f).hardness(0.6f).breakByTool(FabricToolTags.SHOVELS, 0).sounds(BlockSoundGroup.GRAVEL));
    public static final Block COMPRESSED_GRAVEL_5 = new FallingBlock(FabricBlockSettings.of(Material.SOIL).resistance(0.6f).hardness(0.6f).breakByTool(FabricToolTags.SHOVELS, 0).sounds(BlockSoundGroup.GRAVEL));
    /* COBBLESTONE */
    public static final Block COMPRESSED_COBBLESTONE_1 = new CompressedCobblestone();
    public static final Block COMPRESSED_COBBLESTONE_2 = new CompressedCobblestone();
    public static final Block COMPRESSED_COBBLESTONE_3 = new CompressedCobblestone();
    public static final Block COMPRESSED_COBBLESTONE_4 = new CompressedCobblestone();
    public static final Block COMPRESSED_COBBLESTONE_5 = new CompressedCobblestone();
    /* STONE */
    public static final Block COMPRESSED_STONE_1 = new CompressedGenericStone();
    public static final Block COMPRESSED_STONE_2 = new CompressedGenericStone();
    public static final Block COMPRESSED_STONE_3 = new CompressedGenericStone();
    public static final Block COMPRESSED_STONE_4 = new CompressedGenericStone();
    public static final Block COMPRESSED_STONE_5 = new CompressedGenericStone();
    /* ANDESITE */
    public static final Block COMPRESSED_ANDESITE_1 = new CompressedGenericStone();
    public static final Block COMPRESSED_ANDESITE_2 = new CompressedGenericStone();
    public static final Block COMPRESSED_ANDESITE_3 = new CompressedGenericStone();
    public static final Block COMPRESSED_ANDESITE_4 = new CompressedGenericStone();
    public static final Block COMPRESSED_ANDESITE_5 = new CompressedGenericStone();
    /* DIORITE */
    public static final Block COMPRESSED_DIORITE_1 = new CompressedGenericStone();
    public static final Block COMPRESSED_DIORITE_2 = new CompressedGenericStone();
    public static final Block COMPRESSED_DIORITE_3 = new CompressedGenericStone();
    public static final Block COMPRESSED_DIORITE_4 = new CompressedGenericStone();
    public static final Block COMPRESSED_DIORITE_5 = new CompressedGenericStone();
    /* GRANITE */
    public static final Block COMPRESSED_GRANITE_1 = new CompressedGenericStone();
    public static final Block COMPRESSED_GRANITE_2 = new CompressedGenericStone();
    public static final Block COMPRESSED_GRANITE_3 = new CompressedGenericStone();
    public static final Block COMPRESSED_GRANITE_4 = new CompressedGenericStone();
    public static final Block COMPRESSED_GRANITE_5 = new CompressedGenericStone();
    /* NETHERRACK */
    public static final Block COMPRESSED_NETHERRACK_1 = new CompressedNetherrack();
    public static final Block COMPRESSED_NETHERRACK_2 = new CompressedNetherrack();
    public static final Block COMPRESSED_NETHERRACK_3 = new CompressedNetherrack();
    public static final Block COMPRESSED_NETHERRACK_4 = new CompressedNetherrack();
    public static final Block COMPRESSED_NETHERRACK_5 = new CompressedNetherrack();
    /* END STONE */
    public static final Block COMPRESSED_END_STONE_1 = new CompressedEndStone();
    public static final Block COMPRESSED_END_STONE_2 = new CompressedEndStone();
    public static final Block COMPRESSED_END_STONE_3 = new CompressedEndStone();
    public static final Block COMPRESSED_END_STONE_4 = new CompressedEndStone();
    public static final Block COMPRESSED_END_STONE_5 = new CompressedEndStone();
    /* AMETHYST BLOCK */
    public static final Block COMPRESSED_AMETHYST_BLOCK_1 = new CompressedAmethystBlock();
    public static final Block COMPRESSED_AMETHYST_BLOCK_2 = new CompressedAmethystBlock();
    public static final Block COMPRESSED_AMETHYST_BLOCK_3 = new CompressedAmethystBlock();
    public static final Block COMPRESSED_AMETHYST_BLOCK_4 = new CompressedAmethystBlock();
    public static final Block COMPRESSED_AMETHYST_BLOCK_5 = new CompressedAmethystBlock();
    /* CALCITE */
    public static final Block COMPRESSED_CALCITE_1 = new CompressedCalcite();
    public static final Block COMPRESSED_CALCITE_2 = new CompressedCalcite();
    public static final Block COMPRESSED_CALCITE_3 = new CompressedCalcite();
    public static final Block COMPRESSED_CALCITE_4 = new CompressedCalcite();
    public static final Block COMPRESSED_CALCITE_5 = new CompressedCalcite();
    /* COBBLED DEEPSLATE */
    public static final Block COMPRESSED_COBBLED_DEEPSLATE_1 = new CompressedCobbledDeepslate();
    public static final Block COMPRESSED_COBBLED_DEEPSLATE_2 = new CompressedCobbledDeepslate();
    public static final Block COMPRESSED_COBBLED_DEEPSLATE_3 = new CompressedCobbledDeepslate();
    public static final Block COMPRESSED_COBBLED_DEEPSLATE_4 = new CompressedCobbledDeepslate();
    public static final Block COMPRESSED_COBBLED_DEEPSLATE_5 = new CompressedCobbledDeepslate();
    /* DEEPSLATE */
    public static final Block COMPRESSED_DEEPSLATE_1 = new CompressedDeepslate();
    public static final Block COMPRESSED_DEEPSLATE_2 = new CompressedDeepslate();
    public static final Block COMPRESSED_DEEPSLATE_3 = new CompressedDeepslate();
    public static final Block COMPRESSED_DEEPSLATE_4 = new CompressedDeepslate();
    public static final Block COMPRESSED_DEEPSLATE_5 = new CompressedDeepslate();
    /* DRIPSTONE BLOCK */
    public static final Block COMPRESSED_DRIPSTONE_BLOCK_1 = new CompressedDripstoneBlock();
    public static final Block COMPRESSED_DRIPSTONE_BLOCK_2 = new CompressedDripstoneBlock();
    public static final Block COMPRESSED_DRIPSTONE_BLOCK_3 = new CompressedDripstoneBlock();
    public static final Block COMPRESSED_DRIPSTONE_BLOCK_4 = new CompressedDripstoneBlock();
    public static final Block COMPRESSED_DRIPSTONE_BLOCK_5 = new CompressedDripstoneBlock();
    /* COAL BLOCK */
    public static final Block COMPRESSED_COAL_BLOCK_1 = new CompressedCoalBlock();
    public static final Block COMPRESSED_COAL_BLOCK_2 = new CompressedCoalBlock();
    public static final Block COMPRESSED_COAL_BLOCK_3 = new CompressedCoalBlock();
    public static final Block COMPRESSED_COAL_BLOCK_4 = new CompressedCoalBlock();
    public static final Block COMPRESSED_COAL_BLOCK_5 = new CompressedCoalBlock();
    /* COPPER BLOCK */
    public static final Block COMPRESSED_COPPER_BLOCK_1 = new CompressedCopperBlock();
    public static final Block COMPRESSED_COPPER_BLOCK_2 = new CompressedCopperBlock();
    public static final Block COMPRESSED_COPPER_BLOCK_3 = new CompressedCopperBlock();
    public static final Block COMPRESSED_COPPER_BLOCK_4 = new CompressedCopperBlock();
    public static final Block COMPRESSED_COPPER_BLOCK_5 = new CompressedCopperBlock();
    /* IRON BLOCK */
    public static final Block COMPRESSED_IRON_BLOCK_1 = new CompressedIronBlock();
    public static final Block COMPRESSED_IRON_BLOCK_2 = new CompressedIronBlock();
    public static final Block COMPRESSED_IRON_BLOCK_3 = new CompressedIronBlock();
    public static final Block COMPRESSED_IRON_BLOCK_4 = new CompressedIronBlock();
    public static final Block COMPRESSED_IRON_BLOCK_5 = new CompressedIronBlock();
    /* LAPIS LAZULI BLOCK */
    public static final Block COMPRESSED_LAPIS_BLOCK_1 = new CompressedLapisBlock();
    public static final Block COMPRESSED_LAPIS_BLOCK_2 = new CompressedLapisBlock();
    public static final Block COMPRESSED_LAPIS_BLOCK_3 = new CompressedLapisBlock();
    public static final Block COMPRESSED_LAPIS_BLOCK_4 = new CompressedLapisBlock();
    public static final Block COMPRESSED_LAPIS_BLOCK_5 = new CompressedLapisBlock();
    /* REDSTONE BLOCK */
    public static final Block COMPRESSED_REDSTONE_BLOCK_1 = new CompressedRedstoneBlock();
    public static final Block COMPRESSED_REDSTONE_BLOCK_2 = new CompressedRedstoneBlock();
    public static final Block COMPRESSED_REDSTONE_BLOCK_3 = new CompressedRedstoneBlock();
    public static final Block COMPRESSED_REDSTONE_BLOCK_4 = new CompressedRedstoneBlock();
    public static final Block COMPRESSED_REDSTONE_BLOCK_5 = new CompressedRedstoneBlock();
    /* GOLD BLOCK */
    public static final Block COMPRESSED_GOLD_BLOCK_1 = new CompressedGoldBlock();
    public static final Block COMPRESSED_GOLD_BLOCK_2 = new CompressedGoldBlock();
    public static final Block COMPRESSED_GOLD_BLOCK_3 = new CompressedGoldBlock();
    public static final Block COMPRESSED_GOLD_BLOCK_4 = new CompressedGoldBlock();
    public static final Block COMPRESSED_GOLD_BLOCK_5 = new CompressedGoldBlock();
    /* DIAMOND BLOCK */
    public static final Block COMPRESSED_DIAMOND_BLOCK_1 = new CompressedGenericOreBlocks();
    public static final Block COMPRESSED_DIAMOND_BLOCK_2 = new CompressedGenericOreBlocks();
    public static final Block COMPRESSED_DIAMOND_BLOCK_3 = new CompressedGenericOreBlocks();
    public static final Block COMPRESSED_DIAMOND_BLOCK_4 = new CompressedGenericOreBlocks();
    public static final Block COMPRESSED_DIAMOND_BLOCK_5 = new CompressedGenericOreBlocks();
    /* EMERALD BLOCK */
    public static final Block COMPRESSED_EMERALD_BLOCK_1 = new CompressedGenericOreBlocks();
    public static final Block COMPRESSED_EMERALD_BLOCK_2 = new CompressedGenericOreBlocks();
    public static final Block COMPRESSED_EMERALD_BLOCK_3 = new CompressedGenericOreBlocks();
    public static final Block COMPRESSED_EMERALD_BLOCK_4 = new CompressedGenericOreBlocks();
    public static final Block COMPRESSED_EMERALD_BLOCK_5 = new CompressedGenericOreBlocks();
    /* RUBY BLOCK */
    public static final Block RUBY_BLOCK = new CompressedGenericOreBlocks();
    public static final Block COMPRESSED_RUBY_BLOCK_1 = new CompressedGenericOreBlocks();
    public static final Block COMPRESSED_RUBY_BLOCK_2 = new CompressedGenericOreBlocks();
    public static final Block COMPRESSED_RUBY_BLOCK_3 = new CompressedGenericOreBlocks();
    public static final Block COMPRESSED_RUBY_BLOCK_4 = new CompressedGenericOreBlocks();
    public static final Block COMPRESSED_RUBY_BLOCK_5 = new CompressedGenericOreBlocks();
    /* SMOOTH BASALT */
    public static final Block COMPRESSED_SMOOTH_BASALT_1 = new CompressedBasalt();
    public static final Block COMPRESSED_SMOOTH_BASALT_2 = new CompressedBasalt();
    public static final Block COMPRESSED_SMOOTH_BASALT_3 = new CompressedBasalt();
    public static final Block COMPRESSED_SMOOTH_BASALT_4 = new CompressedBasalt();
    public static final Block COMPRESSED_SMOOTH_BASALT_5 = new CompressedBasalt();
    /* TUFF */
    public static final Block COMPRESSED_TUFF_1 = new CompressedTuff();
    public static final Block COMPRESSED_TUFF_2 = new CompressedTuff();
    public static final Block COMPRESSED_TUFF_3 = new CompressedTuff();
    public static final Block COMPRESSED_TUFF_4 = new CompressedTuff();
    public static final Block COMPRESSED_TUFF_5 = new CompressedTuff();

    public static void registerBlocks() {

        // Register Compressor Block
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressor"), COMPRESSOR);
        // Register Compressor BlockEntity
        COMPRESSOR_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier("compress", "compressor"), FabricBlockEntityTypeBuilder.create(CompressorEntity::new, COMPRESSOR).build(null));
        // Register Compressor Block's Item
        Registry.register(Registry.ITEM, new Identifier("compress", "compressor"), new BlockItem(COMPRESSOR, new Item.Settings().group(COMPRESS_BLOCKS)));

     /* ██████╗ ██╗██████╗ ████████╗
        ██╔══██╗██║██╔══██╗╚══██╔══╝
        ██║  ██║██║██████╔╝   ██║
        ██║  ██║██║██╔══██╗   ██║
        ██████╔╝██║██║  ██║   ██║
        ╚═════╝ ╚═╝╚═╝  ╚═╝   ╚═╝*/

        // COMPRESSED DIRT [Blocks]
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_dirt_1"), COMPRESSED_DIRT_1);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_dirt_2"), COMPRESSED_DIRT_2);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_dirt_3"), COMPRESSED_DIRT_3);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_dirt_4"), COMPRESSED_DIRT_4);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_dirt_5"), COMPRESSED_DIRT_5);
        // COMPRESSED DIRT [Items]
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_dirt_1"), new BlockItem(COMPRESSED_DIRT_1, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_dirt_2"), new BlockItem(COMPRESSED_DIRT_2, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_dirt_3"), new BlockItem(COMPRESSED_DIRT_3, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_dirt_4"), new BlockItem(COMPRESSED_DIRT_4, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_dirt_5"), new BlockItem(COMPRESSED_DIRT_5, new Item.Settings().group(COMPRESS_BLOCKS)));

     /* ███████╗ █████╗ ███╗   ██╗██████╗
        ██╔════╝██╔══██╗████╗  ██║██╔══██╗
        ███████╗███████║██╔██╗ ██║██║  ██║
        ╚════██║██╔══██║██║╚██╗██║██║  ██║
        ███████║██║  ██║██║ ╚████║██████╔╝
        ╚══════╝╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝*/

        // COMPRESSED SAND [Blocks]
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_sand_1"), COMPRESSED_SAND_1);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_sand_2"), COMPRESSED_SAND_2);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_sand_3"), COMPRESSED_SAND_3);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_sand_4"), COMPRESSED_SAND_4);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_sand_5"), COMPRESSED_SAND_5);
        // COMPRESSED SAND [Items]
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_sand_1"), new BlockItem(COMPRESSED_SAND_1, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_sand_2"), new BlockItem(COMPRESSED_SAND_2, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_sand_3"), new BlockItem(COMPRESSED_SAND_3, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_sand_4"), new BlockItem(COMPRESSED_SAND_4, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_sand_5"), new BlockItem(COMPRESSED_SAND_5, new Item.Settings().group(COMPRESS_BLOCKS)));

     /* ██████╗ ███████╗██████╗     ███████╗ █████╗ ███╗   ██╗██████╗
        ██╔══██╗██╔════╝██╔══██╗    ██╔════╝██╔══██╗████╗  ██║██╔══██╗
        ██████╔╝█████╗  ██║  ██║    ███████╗███████║██╔██╗ ██║██║  ██║
        ██╔══██╗██╔══╝  ██║  ██║    ╚════██║██╔══██║██║╚██╗██║██║  ██║
        ██║  ██║███████╗██████╔╝    ███████║██║  ██║██║ ╚████║██████╔╝
        ╚═╝  ╚═╝╚══════╝╚═════╝     ╚══════╝╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝*/

        // COMPRESSED RED SAND [Blocks]
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_red_sand_1"), COMPRESSED_RED_SAND_1);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_red_sand_2"), COMPRESSED_RED_SAND_2);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_red_sand_3"), COMPRESSED_RED_SAND_3);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_red_sand_4"), COMPRESSED_RED_SAND_4);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_red_sand_5"), COMPRESSED_RED_SAND_5);
        // COMPRESSED RED SAND [Items]
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_red_sand_1"), new BlockItem(COMPRESSED_RED_SAND_1, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_red_sand_2"), new BlockItem(COMPRESSED_RED_SAND_2, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_red_sand_3"), new BlockItem(COMPRESSED_RED_SAND_3, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_red_sand_4"), new BlockItem(COMPRESSED_RED_SAND_4, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_red_sand_5"), new BlockItem(COMPRESSED_RED_SAND_5, new Item.Settings().group(COMPRESS_BLOCKS)));

      /* ██████╗ ██████╗  █████╗ ██╗   ██╗███████╗██╗
        ██╔════╝ ██╔══██╗██╔══██╗██║   ██║██╔════╝██║
        ██║  ███╗██████╔╝███████║██║   ██║█████╗  ██║
        ██║   ██║██╔══██╗██╔══██║╚██╗ ██╔╝██╔══╝  ██║
        ╚██████╔╝██║  ██║██║  ██║ ╚████╔╝ ███████╗███████╗
         ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝  ╚═══╝  ╚══════╝╚══════╝*/

        // COMPRESSED GRAVEL [Blocks]
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_gravel_1"), COMPRESSED_GRAVEL_1);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_gravel_2"), COMPRESSED_GRAVEL_2);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_gravel_3"), COMPRESSED_GRAVEL_3);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_gravel_4"), COMPRESSED_GRAVEL_4);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_gravel_5"), COMPRESSED_GRAVEL_5);
        // COMPRESSED GRAVEL [Items]
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_gravel_1"), new BlockItem(COMPRESSED_GRAVEL_1, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_gravel_2"), new BlockItem(COMPRESSED_GRAVEL_2, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_gravel_3"), new BlockItem(COMPRESSED_GRAVEL_3, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_gravel_4"), new BlockItem(COMPRESSED_GRAVEL_4, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_gravel_5"), new BlockItem(COMPRESSED_GRAVEL_5, new Item.Settings().group(COMPRESS_BLOCKS)));

     /* ███████╗████████╗ ██████╗ ███╗   ██╗███████╗
        ██╔════╝╚══██╔══╝██╔═══██╗████╗  ██║██╔════╝
        ███████╗   ██║   ██║   ██║██╔██╗ ██║█████╗
        ╚════██║   ██║   ██║   ██║██║╚██╗██║██╔══╝
        ███████║   ██║   ╚██████╔╝██║ ╚████║███████╗
        ╚══════╝   ╚═╝    ╚═════╝ ╚═╝  ╚═══╝╚══════╝*/

        // COMPRESSED STONE [Blocks]
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_stone_1"), COMPRESSED_STONE_1);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_stone_2"), COMPRESSED_STONE_2);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_stone_3"), COMPRESSED_STONE_3);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_stone_4"), COMPRESSED_STONE_4);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_stone_5"), COMPRESSED_STONE_5);
        // COMPRESSED STONE [Items]
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_stone_1"), new BlockItem(COMPRESSED_STONE_1, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_stone_2"), new BlockItem(COMPRESSED_STONE_2, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_stone_3"), new BlockItem(COMPRESSED_STONE_3, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_stone_4"), new BlockItem(COMPRESSED_STONE_4, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_stone_5"), new BlockItem(COMPRESSED_STONE_5, new Item.Settings().group(COMPRESS_BLOCKS)));

      /* ██████╗ ██████╗ ██████╗ ██████╗ ██╗     ███████╗███████╗████████╗ ██████╗ ███╗   ██╗███████╗
        ██╔════╝██╔═══██╗██╔══██╗██╔══██╗██║     ██╔════╝██╔════╝╚══██╔══╝██╔═══██╗████╗  ██║██╔════╝
        ██║     ██║   ██║██████╔╝██████╔╝██║     █████╗  ███████╗   ██║   ██║   ██║██╔██╗ ██║█████╗
        ██║     ██║   ██║██╔══██╗██╔══██╗██║     ██╔══╝  ╚════██║   ██║   ██║   ██║██║╚██╗██║██╔══╝
        ╚██████╗╚██████╔╝██████╔╝██████╔╝███████╗███████╗███████║   ██║   ╚██████╔╝██║ ╚████║███████╗
         ╚═════╝ ╚═════╝ ╚═════╝ ╚═════╝ ╚══════╝╚══════╝╚══════╝   ╚═╝    ╚═════╝ ╚═╝  ╚═══╝╚══════╝*/

        // COMPRESSED COBBLESTONE [Blocks]
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_cobblestone_1"), COMPRESSED_COBBLESTONE_1);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_cobblestone_2"), COMPRESSED_COBBLESTONE_2);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_cobblestone_3"), COMPRESSED_COBBLESTONE_3);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_cobblestone_4"), COMPRESSED_COBBLESTONE_4);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_cobblestone_5"), COMPRESSED_COBBLESTONE_5);
        // COMPRESSED COBBLESTONE [Items]
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_cobblestone_1"), new BlockItem(COMPRESSED_COBBLESTONE_1, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_cobblestone_2"), new BlockItem(COMPRESSED_COBBLESTONE_2, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_cobblestone_3"), new BlockItem(COMPRESSED_COBBLESTONE_3, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_cobblestone_4"), new BlockItem(COMPRESSED_COBBLESTONE_4, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_cobblestone_5"), new BlockItem(COMPRESSED_COBBLESTONE_5, new Item.Settings().group(COMPRESS_BLOCKS)));

      /* █████╗ ███╗   ██╗██████╗ ███████╗███████╗██╗████████╗███████╗
        ██╔══██╗████╗  ██║██╔══██╗██╔════╝██╔════╝██║╚══██╔══╝██╔════╝
        ███████║██╔██╗ ██║██║  ██║█████╗  ███████╗██║   ██║   █████╗
        ██╔══██║██║╚██╗██║██║  ██║██╔══╝  ╚════██║██║   ██║   ██╔══╝
        ██║  ██║██║ ╚████║██████╔╝███████╗███████║██║   ██║   ███████╗
        ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝ ╚══════╝╚══════╝╚═╝   ╚═╝   ╚══════╝*/

        // COMPRESSED ANDESITE [Blocks]
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_andesite_1"), COMPRESSED_ANDESITE_1);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_andesite_2"), COMPRESSED_ANDESITE_2);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_andesite_3"), COMPRESSED_ANDESITE_3);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_andesite_4"), COMPRESSED_ANDESITE_4);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_andesite_5"), COMPRESSED_ANDESITE_5);
        // COMPRESSED ANDESITE [Items]
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_andesite_1"), new BlockItem(COMPRESSED_ANDESITE_1, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_andesite_2"), new BlockItem(COMPRESSED_ANDESITE_2, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_andesite_3"), new BlockItem(COMPRESSED_ANDESITE_3, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_andesite_4"), new BlockItem(COMPRESSED_ANDESITE_4, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_andesite_5"), new BlockItem(COMPRESSED_ANDESITE_5, new Item.Settings().group(COMPRESS_BLOCKS)));

     /* ██████╗ ██╗ ██████╗ ██████╗ ██╗████████╗███████╗
        ██╔══██╗██║██╔═══██╗██╔══██╗██║╚══██╔══╝██╔════╝
        ██║  ██║██║██║   ██║██████╔╝██║   ██║   █████╗
        ██║  ██║██║██║   ██║██╔══██╗██║   ██║   ██╔══╝
        ██████╔╝██║╚██████╔╝██║  ██║██║   ██║   ███████╗
        ╚═════╝ ╚═╝ ╚═════╝ ╚═╝  ╚═╝╚═╝   ╚═╝   ╚══════╝*/

        // COMPRESSED DIORITE [Blocks]
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_diorite_1"), COMPRESSED_DIORITE_1);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_diorite_2"), COMPRESSED_DIORITE_2);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_diorite_3"), COMPRESSED_DIORITE_3);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_diorite_4"), COMPRESSED_DIORITE_4);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_diorite_5"), COMPRESSED_DIORITE_5);
        // COMPRESSED DIORITE [Items]
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_diorite_1"), new BlockItem(COMPRESSED_DIORITE_1, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_diorite_2"), new BlockItem(COMPRESSED_DIORITE_2, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_diorite_3"), new BlockItem(COMPRESSED_DIORITE_3, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_diorite_4"), new BlockItem(COMPRESSED_DIORITE_4, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_diorite_5"), new BlockItem(COMPRESSED_DIORITE_5, new Item.Settings().group(COMPRESS_BLOCKS)));

      /* ██████╗ ██████╗  █████╗ ███╗   ██╗██╗████████╗███████╗
        ██╔════╝ ██╔══██╗██╔══██╗████╗  ██║██║╚══██╔══╝██╔════╝
        ██║  ███╗██████╔╝███████║██╔██╗ ██║██║   ██║   █████╗
        ██║   ██║██╔══██╗██╔══██║██║╚██╗██║██║   ██║   ██╔══╝
        ╚██████╔╝██║  ██║██║  ██║██║ ╚████║██║   ██║   ███████╗
         ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝   ╚═╝   ╚══════╝*/

        // COMPRESSED GRANITE [Blocks]
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_granite_1"), COMPRESSED_GRANITE_1);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_granite_2"), COMPRESSED_GRANITE_2);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_granite_3"), COMPRESSED_GRANITE_3);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_granite_4"), COMPRESSED_GRANITE_4);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_granite_5"), COMPRESSED_GRANITE_5);
        // COMPRESSED GRANITE [Items]
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_granite_1"), new BlockItem(COMPRESSED_GRANITE_1, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_granite_2"), new BlockItem(COMPRESSED_GRANITE_2, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_granite_3"), new BlockItem(COMPRESSED_GRANITE_3, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_granite_4"), new BlockItem(COMPRESSED_GRANITE_4, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_granite_5"), new BlockItem(COMPRESSED_GRANITE_5, new Item.Settings().group(COMPRESS_BLOCKS)));

     /* ███╗   ██╗███████╗████████╗██╗  ██╗███████╗██████╗ ██████╗  █████╗  ██████╗██╗  ██╗
        ████╗  ██║██╔════╝╚══██╔══╝██║  ██║██╔════╝██╔══██╗██╔══██╗██╔══██╗██╔════╝██║ ██╔╝
        ██╔██╗ ██║█████╗     ██║   ███████║█████╗  ██████╔╝██████╔╝███████║██║     █████╔╝
        ██║╚██╗██║██╔══╝     ██║   ██╔══██║██╔══╝  ██╔══██╗██╔══██╗██╔══██║██║     ██╔═██╗
        ██║ ╚████║███████╗   ██║   ██║  ██║███████╗██║  ██║██║  ██║██║  ██║╚██████╗██║  ██╗
        ╚═╝  ╚═══╝╚══════╝   ╚═╝   ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝*/

        // COMPRESSED NETHERRACK [Blocks]
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_netherrack_1"), COMPRESSED_NETHERRACK_1);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_netherrack_2"), COMPRESSED_NETHERRACK_2);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_netherrack_3"), COMPRESSED_NETHERRACK_3);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_netherrack_4"), COMPRESSED_NETHERRACK_4);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_netherrack_5"), COMPRESSED_NETHERRACK_5);
        // COMPRESSED NETHERRACK [Items]
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_netherrack_1"), new BlockItem(COMPRESSED_NETHERRACK_1, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_netherrack_2"), new BlockItem(COMPRESSED_NETHERRACK_2, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_netherrack_3"), new BlockItem(COMPRESSED_NETHERRACK_3, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_netherrack_4"), new BlockItem(COMPRESSED_NETHERRACK_4, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_netherrack_5"), new BlockItem(COMPRESSED_NETHERRACK_5, new Item.Settings().group(COMPRESS_BLOCKS)));

     /* ███████╗███╗   ██╗██████╗         ███████╗████████╗ ██████╗ ███╗   ██╗███████╗
        ██╔════╝████╗  ██║██╔══██╗        ██╔════╝╚══██╔══╝██╔═══██╗████╗  ██║██╔════╝
        █████╗  ██╔██╗ ██║██║  ██║        ███████╗   ██║   ██║   ██║██╔██╗ ██║█████╗
        ██╔══╝  ██║╚██╗██║██║  ██║        ╚════██║   ██║   ██║   ██║██║╚██╗██║██╔══╝
        ███████╗██║ ╚████║██████╔╝███████╗███████║   ██║   ╚██████╔╝██║ ╚████║███████╗
        ╚══════╝╚═╝  ╚═══╝╚═════╝ ╚══════╝╚══════╝   ╚═╝    ╚═════╝ ╚═╝  ╚═══╝╚══════╝*/

        // COMPRESSED END STONE [Blocks]
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_end_stone_1"), COMPRESSED_END_STONE_1);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_end_stone_2"), COMPRESSED_END_STONE_2);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_end_stone_3"), COMPRESSED_END_STONE_3);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_end_stone_4"), COMPRESSED_END_STONE_4);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_end_stone_5"), COMPRESSED_END_STONE_5);
        // COMPRESSED END STONE [Items]
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_end_stone_1"), new BlockItem(COMPRESSED_END_STONE_1, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_end_stone_2"), new BlockItem(COMPRESSED_END_STONE_2, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_end_stone_3"), new BlockItem(COMPRESSED_END_STONE_3, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_end_stone_4"), new BlockItem(COMPRESSED_END_STONE_4, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_end_stone_5"), new BlockItem(COMPRESSED_END_STONE_5, new Item.Settings().group(COMPRESS_BLOCKS)));

      /* █████╗ ███╗   ███╗███████╗████████╗██╗  ██╗██╗   ██╗███████╗████████╗    ██████╗ ██╗      ██████╗  ██████╗██╗  ██╗
        ██╔══██╗████╗ ████║██╔════╝╚══██╔══╝██║  ██║╚██╗ ██╔╝██╔════╝╚══██╔══╝    ██╔══██╗██║     ██╔═══██╗██╔════╝██║ ██╔╝
        ███████║██╔████╔██║█████╗     ██║   ███████║ ╚████╔╝ ███████╗   ██║       ██████╔╝██║     ██║   ██║██║     █████╔╝
        ██╔══██║██║╚██╔╝██║██╔══╝     ██║   ██╔══██║  ╚██╔╝  ╚════██║   ██║       ██╔══██╗██║     ██║   ██║██║     ██╔═██╗
        ██║  ██║██║ ╚═╝ ██║███████╗   ██║   ██║  ██║   ██║   ███████║   ██║       ██████╔╝███████╗╚██████╔╝╚██████╗██║  ██╗
        ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝   ╚═╝   ╚═╝  ╚═╝   ╚═╝   ╚══════╝   ╚═╝       ╚═════╝ ╚══════╝ ╚═════╝  ╚═════╝╚═╝  ╚═╝*/

        // COMPRESSED AMETHYST BLOCK [Blocks]
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_amethyst_block_1"), COMPRESSED_AMETHYST_BLOCK_1);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_amethyst_block_2"), COMPRESSED_AMETHYST_BLOCK_2);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_amethyst_block_3"), COMPRESSED_AMETHYST_BLOCK_3);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_amethyst_block_4"), COMPRESSED_AMETHYST_BLOCK_4);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_amethyst_block_5"), COMPRESSED_AMETHYST_BLOCK_5);
        // COMPRESSED AMETHYST BLOCK [Items]
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_amethyst_block_1"), new BlockItem(COMPRESSED_AMETHYST_BLOCK_1, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_amethyst_block_2"), new BlockItem(COMPRESSED_AMETHYST_BLOCK_2, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_amethyst_block_3"), new BlockItem(COMPRESSED_AMETHYST_BLOCK_3, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_amethyst_block_4"), new BlockItem(COMPRESSED_AMETHYST_BLOCK_4, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_amethyst_block_5"), new BlockItem(COMPRESSED_AMETHYST_BLOCK_5, new Item.Settings().group(COMPRESS_BLOCKS)));

      /* ██████╗ █████╗ ██╗      ██████╗██╗████████╗███████╗
        ██╔════╝██╔══██╗██║     ██╔════╝██║╚══██╔══╝██╔════╝
        ██║     ███████║██║     ██║     ██║   ██║   █████╗
        ██║     ██╔══██║██║     ██║     ██║   ██║   ██╔══╝
        ╚██████╗██║  ██║███████╗╚██████╗██║   ██║   ███████╗
         ╚═════╝╚═╝  ╚═╝╚══════╝ ╚═════╝╚═╝   ╚═╝   ╚══════╝*/

        // COMPRESSED CALCITE BLOCK [Blocks]
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_calcite_1"), COMPRESSED_CALCITE_1);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_calcite_2"), COMPRESSED_CALCITE_2);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_calcite_3"), COMPRESSED_CALCITE_3);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_calcite_4"), COMPRESSED_CALCITE_4);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_calcite_5"), COMPRESSED_CALCITE_5);
        // COMPRESSED CALCITE BLOCK [Items]
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_calcite_1"), new BlockItem(COMPRESSED_CALCITE_1, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_calcite_2"), new BlockItem(COMPRESSED_CALCITE_2, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_calcite_3"), new BlockItem(COMPRESSED_CALCITE_3, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_calcite_4"), new BlockItem(COMPRESSED_CALCITE_4, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_calcite_5"), new BlockItem(COMPRESSED_CALCITE_5, new Item.Settings().group(COMPRESS_BLOCKS)));

      /* ██████╗ ██████╗ ██████╗ ██████╗ ██╗     ███████╗██████╗     ██████╗ ███████╗███████╗██████╗ ███████╗██╗      █████╗ ████████╗███████╗
        ██╔════╝██╔═══██╗██╔══██╗██╔══██╗██║     ██╔════╝██╔══██╗    ██╔══██╗██╔════╝██╔════╝██╔══██╗██╔════╝██║     ██╔══██╗╚══██╔══╝██╔════╝
        ██║     ██║   ██║██████╔╝██████╔╝██║     █████╗  ██║  ██║    ██║  ██║█████╗  █████╗  ██████╔╝███████╗██║     ███████║   ██║   █████╗
        ██║     ██║   ██║██╔══██╗██╔══██╗██║     ██╔══╝  ██║  ██║    ██║  ██║██╔══╝  ██╔══╝  ██╔═══╝ ╚════██║██║     ██╔══██║   ██║   ██╔══╝
        ╚██████╗╚██████╔╝██████╔╝██████╔╝███████╗███████╗██████╔╝    ██████╔╝███████╗███████╗██║     ███████║███████╗██║  ██║   ██║   ███████╗
         ╚═════╝ ╚═════╝ ╚═════╝ ╚═════╝ ╚══════╝╚══════╝╚═════╝     ╚═════╝ ╚══════╝╚══════╝╚═╝     ╚══════╝╚══════╝╚═╝  ╚═╝   ╚═╝   ╚══════╝*/

        // COMPRESSED COBBLED DEEPSLATE BLOCK [Blocks]
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_cobbled_deepslate_1"), COMPRESSED_COBBLED_DEEPSLATE_1);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_cobbled_deepslate_2"), COMPRESSED_COBBLED_DEEPSLATE_2);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_cobbled_deepslate_3"), COMPRESSED_COBBLED_DEEPSLATE_3);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_cobbled_deepslate_4"), COMPRESSED_COBBLED_DEEPSLATE_4);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_cobbled_deepslate_5"), COMPRESSED_COBBLED_DEEPSLATE_5);
        // COMPRESSED COBBLED DEEPSLATE BLOCK [Items]
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_cobbled_deepslate_1"), new BlockItem(COMPRESSED_COBBLED_DEEPSLATE_1, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_cobbled_deepslate_2"), new BlockItem(COMPRESSED_COBBLED_DEEPSLATE_2, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_cobbled_deepslate_3"), new BlockItem(COMPRESSED_COBBLED_DEEPSLATE_3, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_cobbled_deepslate_4"), new BlockItem(COMPRESSED_COBBLED_DEEPSLATE_4, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_cobbled_deepslate_5"), new BlockItem(COMPRESSED_COBBLED_DEEPSLATE_5, new Item.Settings().group(COMPRESS_BLOCKS)));

     /* ██████╗ ███████╗███████╗██████╗ ███████╗██╗      █████╗ ████████╗███████╗
        ██╔══██╗██╔════╝██╔════╝██╔══██╗██╔════╝██║     ██╔══██╗╚══██╔══╝██╔════╝
        ██║  ██║█████╗  █████╗  ██████╔╝███████╗██║     ███████║   ██║   █████╗
        ██║  ██║██╔══╝  ██╔══╝  ██╔═══╝ ╚════██║██║     ██╔══██║   ██║   ██╔══╝
        ██████╔╝███████╗███████╗██║     ███████║███████╗██║  ██║   ██║   ███████╗
        ╚═════╝ ╚══════╝╚══════╝╚═╝     ╚══════╝╚══════╝╚═╝  ╚═╝   ╚═╝   ╚══════╝*/

        // COMPRESSED DEEPSLATE BLOCK [Blocks]
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_deepslate_1"), COMPRESSED_DEEPSLATE_1);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_deepslate_2"), COMPRESSED_DEEPSLATE_2);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_deepslate_3"), COMPRESSED_DEEPSLATE_3);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_deepslate_4"), COMPRESSED_DEEPSLATE_4);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_deepslate_5"), COMPRESSED_DEEPSLATE_5);
        // COMPRESSED DEEPSLATE BLOCK [Items]
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_deepslate_1"), new BlockItem(COMPRESSED_DEEPSLATE_1, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_deepslate_2"), new BlockItem(COMPRESSED_DEEPSLATE_2, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_deepslate_3"), new BlockItem(COMPRESSED_DEEPSLATE_3, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_deepslate_4"), new BlockItem(COMPRESSED_DEEPSLATE_4, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_deepslate_5"), new BlockItem(COMPRESSED_DEEPSLATE_5, new Item.Settings().group(COMPRESS_BLOCKS)));

     /* ██████╗ ██████╗ ██╗██████╗ ███████╗████████╗ ██████╗ ███╗   ██╗███████╗    ██████╗ ██╗      ██████╗  ██████╗██╗  ██╗
        ██╔══██╗██╔══██╗██║██╔══██╗██╔════╝╚══██╔══╝██╔═══██╗████╗  ██║██╔════╝    ██╔══██╗██║     ██╔═══██╗██╔════╝██║ ██╔╝
        ██║  ██║██████╔╝██║██████╔╝███████╗   ██║   ██║   ██║██╔██╗ ██║█████╗      ██████╔╝██║     ██║   ██║██║     █████╔╝
        ██║  ██║██╔══██╗██║██╔═══╝ ╚════██║   ██║   ██║   ██║██║╚██╗██║██╔══╝      ██╔══██╗██║     ██║   ██║██║     ██╔═██╗
        ██████╔╝██║  ██║██║██║     ███████║   ██║   ╚██████╔╝██║ ╚████║███████╗    ██████╔╝███████╗╚██████╔╝╚██████╗██║  ██╗
        ╚═════╝ ╚═╝  ╚═╝╚═╝╚═╝     ╚══════╝   ╚═╝    ╚═════╝ ╚═╝  ╚═══╝╚══════╝    ╚═════╝ ╚══════╝ ╚═════╝  ╚═════╝╚═╝  ╚═╝*/

        // COMPRESSED DRIPSTONE BLOCK [Blocks]
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_dripstone_block_1"), COMPRESSED_DRIPSTONE_BLOCK_1);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_dripstone_block_2"), COMPRESSED_DRIPSTONE_BLOCK_2);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_dripstone_block_3"), COMPRESSED_DRIPSTONE_BLOCK_3);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_dripstone_block_4"), COMPRESSED_DRIPSTONE_BLOCK_4);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_dripstone_block_5"), COMPRESSED_DRIPSTONE_BLOCK_5);
        // COMPRESSED DRIPSTONE BLOCK [Items]
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_dripstone_block_1"), new BlockItem(COMPRESSED_DRIPSTONE_BLOCK_1, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_dripstone_block_2"), new BlockItem(COMPRESSED_DRIPSTONE_BLOCK_2, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_dripstone_block_3"), new BlockItem(COMPRESSED_DRIPSTONE_BLOCK_3, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_dripstone_block_4"), new BlockItem(COMPRESSED_DRIPSTONE_BLOCK_4, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_dripstone_block_5"), new BlockItem(COMPRESSED_DRIPSTONE_BLOCK_5, new Item.Settings().group(COMPRESS_BLOCKS)));

     /* ███████╗███╗   ███╗ ██████╗  ██████╗ ████████╗██╗  ██╗    ██████╗  █████╗ ███████╗ █████╗ ██╗     ████████╗
        ██╔════╝████╗ ████║██╔═══██╗██╔═══██╗╚══██╔══╝██║  ██║    ██╔══██╗██╔══██╗██╔════╝██╔══██╗██║     ╚══██╔══╝
        ███████╗██╔████╔██║██║   ██║██║   ██║   ██║   ███████║    ██████╔╝███████║███████╗███████║██║        ██║
        ╚════██║██║╚██╔╝██║██║   ██║██║   ██║   ██║   ██╔══██║    ██╔══██╗██╔══██║╚════██║██╔══██║██║        ██║
        ███████║██║ ╚═╝ ██║╚██████╔╝╚██████╔╝   ██║   ██║  ██║    ██████╔╝██║  ██║███████║██║  ██║███████╗   ██║
        ╚══════╝╚═╝     ╚═╝ ╚═════╝  ╚═════╝    ╚═╝   ╚═╝  ╚═╝    ╚═════╝ ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚══════╝   ╚═╝*/

        // COMPRESSED SMOOTH BASALT [Blocks]
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_smooth_basalt_1"), COMPRESSED_SMOOTH_BASALT_1);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_smooth_basalt_2"), COMPRESSED_SMOOTH_BASALT_2);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_smooth_basalt_3"), COMPRESSED_SMOOTH_BASALT_3);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_smooth_basalt_4"), COMPRESSED_SMOOTH_BASALT_4);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_smooth_basalt_5"), COMPRESSED_SMOOTH_BASALT_5);
        // COMPRESSED SMOOTH BASALT [Items]
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_smooth_basalt_1"), new BlockItem(COMPRESSED_SMOOTH_BASALT_1, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_smooth_basalt_2"), new BlockItem(COMPRESSED_SMOOTH_BASALT_2, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_smooth_basalt_3"), new BlockItem(COMPRESSED_SMOOTH_BASALT_3, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_smooth_basalt_4"), new BlockItem(COMPRESSED_SMOOTH_BASALT_4, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_smooth_basalt_5"), new BlockItem(COMPRESSED_SMOOTH_BASALT_5, new Item.Settings().group(COMPRESS_BLOCKS)));

     /* ████████╗██╗   ██╗███████╗███████╗
        ╚══██╔══╝██║   ██║██╔════╝██╔════╝
           ██║   ██║   ██║█████╗  █████╗
           ██║   ██║   ██║██╔══╝  ██╔══╝
           ██║   ╚██████╔╝██║     ██║
           ╚═╝    ╚═════╝ ╚═╝     ╚═╝*/

        // COMPRESSED TUFF [Blocks]
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_tuff_1"), COMPRESSED_TUFF_1);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_tuff_2"), COMPRESSED_TUFF_2);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_tuff_3"), COMPRESSED_TUFF_3);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_tuff_4"), COMPRESSED_TUFF_4);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_tuff_5"), COMPRESSED_TUFF_5);
        // COMPRESSED TUFF [Items]
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_tuff_1"), new BlockItem(COMPRESSED_TUFF_1, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_tuff_2"), new BlockItem(COMPRESSED_TUFF_2, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_tuff_3"), new BlockItem(COMPRESSED_TUFF_3, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_tuff_4"), new BlockItem(COMPRESSED_TUFF_4, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_tuff_5"), new BlockItem(COMPRESSED_TUFF_5, new Item.Settings().group(COMPRESS_BLOCKS)));

      /* ██████╗ ██████╗  █████╗ ██╗         ██████╗ ██╗      ██████╗  ██████╗██╗  ██╗
        ██╔════╝██╔═══██╗██╔══██╗██║         ██╔══██╗██║     ██╔═══██╗██╔════╝██║ ██╔╝
        ██║     ██║   ██║███████║██║         ██████╔╝██║     ██║   ██║██║     █████╔╝
        ██║     ██║   ██║██╔══██║██║         ██╔══██╗██║     ██║   ██║██║     ██╔═██╗
        ╚██████╗╚██████╔╝██║  ██║███████╗    ██████╔╝███████╗╚██████╔╝╚██████╗██║  ██╗
         ╚═════╝ ╚═════╝ ╚═╝  ╚═╝╚══════╝    ╚═════╝ ╚══════╝ ╚═════╝  ╚═════╝╚═╝  ╚═╝*/

        // COMPRESSED COAL BLOCK [Blocks]
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_coal_block_1"), COMPRESSED_COAL_BLOCK_1);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_coal_block_2"), COMPRESSED_COAL_BLOCK_2);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_coal_block_3"), COMPRESSED_COAL_BLOCK_3);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_coal_block_4"), COMPRESSED_COAL_BLOCK_4);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_coal_block_5"), COMPRESSED_COAL_BLOCK_5);
        // COMPRESSED COAL BLOCK [Items]
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_coal_block_1"), new BlockItem(COMPRESSED_COAL_BLOCK_1, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_coal_block_2"), new BlockItem(COMPRESSED_COAL_BLOCK_2, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_coal_block_3"), new BlockItem(COMPRESSED_COAL_BLOCK_3, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_coal_block_4"), new BlockItem(COMPRESSED_COAL_BLOCK_4, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_coal_block_5"), new BlockItem(COMPRESSED_COAL_BLOCK_5, new Item.Settings().group(COMPRESS_BLOCKS)));

      /* ██████╗ ██████╗ ██████╗ ██████╗ ███████╗██████╗     ██████╗ ██╗      ██████╗  ██████╗██╗  ██╗
        ██╔════╝██╔═══██╗██╔══██╗██╔══██╗██╔════╝██╔══██╗    ██╔══██╗██║     ██╔═══██╗██╔════╝██║ ██╔╝
        ██║     ██║   ██║██████╔╝██████╔╝█████╗  ██████╔╝    ██████╔╝██║     ██║   ██║██║     █████╔╝
        ██║     ██║   ██║██╔═══╝ ██╔═══╝ ██╔══╝  ██╔══██╗    ██╔══██╗██║     ██║   ██║██║     ██╔═██╗
        ╚██████╗╚██████╔╝██║     ██║     ███████╗██║  ██║    ██████╔╝███████╗╚██████╔╝╚██████╗██║  ██╗
         ╚═════╝ ╚═════╝ ╚═╝     ╚═╝     ╚══════╝╚═╝  ╚═╝    ╚═════╝ ╚══════╝ ╚═════╝  ╚═════╝╚═╝  ╚═╝*/

        // COMPRESSED COPPER BLOCK [Blocks]
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_copper_block_1"), COMPRESSED_COPPER_BLOCK_1);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_copper_block_2"), COMPRESSED_COPPER_BLOCK_2);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_copper_block_3"), COMPRESSED_COPPER_BLOCK_3);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_copper_block_4"), COMPRESSED_COPPER_BLOCK_4);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_copper_block_5"), COMPRESSED_COPPER_BLOCK_5);
        // COMPRESSED COPPER BLOCK [Items]
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_copper_block_1"), new BlockItem(COMPRESSED_COPPER_BLOCK_1, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_copper_block_2"), new BlockItem(COMPRESSED_COPPER_BLOCK_2, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_copper_block_3"), new BlockItem(COMPRESSED_COPPER_BLOCK_3, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_copper_block_4"), new BlockItem(COMPRESSED_COPPER_BLOCK_4, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_copper_block_5"), new BlockItem(COMPRESSED_COPPER_BLOCK_5, new Item.Settings().group(COMPRESS_BLOCKS)));

     /* ██╗██████╗  ██████╗ ███╗   ██╗    ██████╗ ██╗      ██████╗  ██████╗██╗  ██╗
        ██║██╔══██╗██╔═══██╗████╗  ██║    ██╔══██╗██║     ██╔═══██╗██╔════╝██║ ██╔╝
        ██║██████╔╝██║   ██║██╔██╗ ██║    ██████╔╝██║     ██║   ██║██║     █████╔╝
        ██║██╔══██╗██║   ██║██║╚██╗██║    ██╔══██╗██║     ██║   ██║██║     ██╔═██╗
        ██║██║  ██║╚██████╔╝██║ ╚████║    ██████╔╝███████╗╚██████╔╝╚██████╗██║  ██╗
        ╚═╝╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═══╝    ╚═════╝ ╚══════╝ ╚═════╝  ╚═════╝╚═╝  ╚═╝*/

        // COMPRESSED IRON BLOCK [Blocks]
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_iron_block_1"), COMPRESSED_IRON_BLOCK_1);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_iron_block_2"), COMPRESSED_IRON_BLOCK_2);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_iron_block_3"), COMPRESSED_IRON_BLOCK_3);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_iron_block_4"), COMPRESSED_IRON_BLOCK_4);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_iron_block_5"), COMPRESSED_IRON_BLOCK_5);
        // COMPRESSED IRON BLOCK [Items]
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_iron_block_1"), new BlockItem(COMPRESSED_IRON_BLOCK_1, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_iron_block_2"), new BlockItem(COMPRESSED_IRON_BLOCK_2, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_iron_block_3"), new BlockItem(COMPRESSED_IRON_BLOCK_3, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_iron_block_4"), new BlockItem(COMPRESSED_IRON_BLOCK_4, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_iron_block_5"), new BlockItem(COMPRESSED_IRON_BLOCK_5, new Item.Settings().group(COMPRESS_BLOCKS)));

     /* ██╗      █████╗ ██████╗ ██╗███████╗    ██████╗ ██╗      ██████╗  ██████╗██╗  ██╗
        ██║     ██╔══██╗██╔══██╗██║██╔════╝    ██╔══██╗██║     ██╔═══██╗██╔════╝██║ ██╔╝
        ██║     ███████║██████╔╝██║███████╗    ██████╔╝██║     ██║   ██║██║     █████╔╝
        ██║     ██╔══██║██╔═══╝ ██║╚════██║    ██╔══██╗██║     ██║   ██║██║     ██╔═██╗
        ███████╗██║  ██║██║     ██║███████║    ██████╔╝███████╗╚██████╔╝╚██████╗██║  ██╗
        ╚══════╝╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝    ╚═════╝ ╚══════╝ ╚═════╝  ╚═════╝╚═╝  ╚═╝*/

        // COMPRESSED LAPIS BLOCK [Blocks]
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_lapis_block_1"), COMPRESSED_LAPIS_BLOCK_1);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_lapis_block_2"), COMPRESSED_LAPIS_BLOCK_2);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_lapis_block_3"), COMPRESSED_LAPIS_BLOCK_3);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_lapis_block_4"), COMPRESSED_LAPIS_BLOCK_4);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_lapis_block_5"), COMPRESSED_LAPIS_BLOCK_5);
        // COMPRESSED LAPIS BLOCK [Items]
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_lapis_block_1"), new BlockItem(COMPRESSED_LAPIS_BLOCK_1, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_lapis_block_2"), new BlockItem(COMPRESSED_LAPIS_BLOCK_2, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_lapis_block_3"), new BlockItem(COMPRESSED_LAPIS_BLOCK_3, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_lapis_block_4"), new BlockItem(COMPRESSED_LAPIS_BLOCK_4, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_lapis_block_5"), new BlockItem(COMPRESSED_LAPIS_BLOCK_5, new Item.Settings().group(COMPRESS_BLOCKS)));

     /* ██████╗ ███████╗██████╗ ███████╗████████╗ ██████╗ ███╗   ██╗███████╗    ██████╗ ██╗      ██████╗  ██████╗██╗  ██╗
        ██╔══██╗██╔════╝██╔══██╗██╔════╝╚══██╔══╝██╔═══██╗████╗  ██║██╔════╝    ██╔══██╗██║     ██╔═══██╗██╔════╝██║ ██╔╝
        ██████╔╝█████╗  ██║  ██║███████╗   ██║   ██║   ██║██╔██╗ ██║█████╗      ██████╔╝██║     ██║   ██║██║     █████╔╝
        ██╔══██╗██╔══╝  ██║  ██║╚════██║   ██║   ██║   ██║██║╚██╗██║██╔══╝      ██╔══██╗██║     ██║   ██║██║     ██╔═██╗
        ██║  ██║███████╗██████╔╝███████║   ██║   ╚██████╔╝██║ ╚████║███████╗    ██████╔╝███████╗╚██████╔╝╚██████╗██║  ██╗
        ╚═╝  ╚═╝╚══════╝╚═════╝ ╚══════╝   ╚═╝    ╚═════╝ ╚═╝  ╚═══╝╚══════╝    ╚═════╝ ╚══════╝ ╚═════╝  ╚═════╝╚═╝  ╚═╝*/

        // COMPRESSED REDSTONE BLOCK [Blocks]
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_redstone_block_1"), COMPRESSED_REDSTONE_BLOCK_1);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_redstone_block_2"), COMPRESSED_REDSTONE_BLOCK_2);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_redstone_block_3"), COMPRESSED_REDSTONE_BLOCK_3);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_redstone_block_4"), COMPRESSED_REDSTONE_BLOCK_4);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_redstone_block_5"), COMPRESSED_REDSTONE_BLOCK_5);
        // COMPRESSED REDSTONE BLOCK [Items]
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_redstone_block_1"), new BlockItem(COMPRESSED_REDSTONE_BLOCK_1, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_redstone_block_2"), new BlockItem(COMPRESSED_REDSTONE_BLOCK_2, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_redstone_block_3"), new BlockItem(COMPRESSED_REDSTONE_BLOCK_3, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_redstone_block_4"), new BlockItem(COMPRESSED_REDSTONE_BLOCK_4, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_redstone_block_5"), new BlockItem(COMPRESSED_REDSTONE_BLOCK_5, new Item.Settings().group(COMPRESS_BLOCKS)));

      /* ██████╗  ██████╗ ██╗     ██████╗     ██████╗ ██╗      ██████╗  ██████╗██╗  ██╗
        ██╔════╝ ██╔═══██╗██║     ██╔══██╗    ██╔══██╗██║     ██╔═══██╗██╔════╝██║ ██╔╝
        ██║  ███╗██║   ██║██║     ██║  ██║    ██████╔╝██║     ██║   ██║██║     █████╔╝
        ██║   ██║██║   ██║██║     ██║  ██║    ██╔══██╗██║     ██║   ██║██║     ██╔═██╗
        ╚██████╔╝╚██████╔╝███████╗██████╔╝    ██████╔╝███████╗╚██████╔╝╚██████╗██║  ██╗
         ╚═════╝  ╚═════╝ ╚══════╝╚═════╝     ╚═════╝ ╚══════╝ ╚═════╝  ╚═════╝╚═╝  ╚═╝*/

        // COMPRESSED GOLD BLOCK [Blocks]
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_gold_block_1"), COMPRESSED_GOLD_BLOCK_1);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_gold_block_2"), COMPRESSED_GOLD_BLOCK_2);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_gold_block_3"), COMPRESSED_GOLD_BLOCK_3);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_gold_block_4"), COMPRESSED_GOLD_BLOCK_4);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_gold_block_5"), COMPRESSED_GOLD_BLOCK_5);
        // COMPRESSED GOLD BLOCK [Items]
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_gold_block_1"), new BlockItem(COMPRESSED_GOLD_BLOCK_1, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_gold_block_2"), new BlockItem(COMPRESSED_GOLD_BLOCK_2, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_gold_block_3"), new BlockItem(COMPRESSED_GOLD_BLOCK_3, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_gold_block_4"), new BlockItem(COMPRESSED_GOLD_BLOCK_4, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_gold_block_5"), new BlockItem(COMPRESSED_GOLD_BLOCK_5, new Item.Settings().group(COMPRESS_BLOCKS)));

     /* ██████╗ ██╗ █████╗ ███╗   ███╗ ██████╗ ███╗   ██╗██████╗     ██████╗ ██╗      ██████╗  ██████╗██╗  ██╗
        ██╔══██╗██║██╔══██╗████╗ ████║██╔═══██╗████╗  ██║██╔══██╗    ██╔══██╗██║     ██╔═══██╗██╔════╝██║ ██╔╝
        ██║  ██║██║███████║██╔████╔██║██║   ██║██╔██╗ ██║██║  ██║    ██████╔╝██║     ██║   ██║██║     █████╔╝
        ██║  ██║██║██╔══██║██║╚██╔╝██║██║   ██║██║╚██╗██║██║  ██║    ██╔══██╗██║     ██║   ██║██║     ██╔═██╗
        ██████╔╝██║██║  ██║██║ ╚═╝ ██║╚██████╔╝██║ ╚████║██████╔╝    ██████╔╝███████╗╚██████╔╝╚██████╗██║  ██╗
        ╚═════╝ ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝ ╚═════╝ ╚═╝  ╚═══╝╚═════╝     ╚═════╝ ╚══════╝ ╚═════╝  ╚═════╝╚═╝  ╚═╝*/

        // COMPRESSED DIAMOND BLOCK [Blocks]
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_diamond_block_1"), COMPRESSED_DIAMOND_BLOCK_1);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_diamond_block_2"), COMPRESSED_DIAMOND_BLOCK_2);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_diamond_block_3"), COMPRESSED_DIAMOND_BLOCK_3);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_diamond_block_4"), COMPRESSED_DIAMOND_BLOCK_4);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_diamond_block_5"), COMPRESSED_DIAMOND_BLOCK_5);
        // COMPRESSED DIAMOND BLOCK [Items]
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_diamond_block_1"), new BlockItem(COMPRESSED_DIAMOND_BLOCK_1, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_diamond_block_2"), new BlockItem(COMPRESSED_DIAMOND_BLOCK_2, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_diamond_block_3"), new BlockItem(COMPRESSED_DIAMOND_BLOCK_3, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_diamond_block_4"), new BlockItem(COMPRESSED_DIAMOND_BLOCK_4, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_diamond_block_5"), new BlockItem(COMPRESSED_DIAMOND_BLOCK_5, new Item.Settings().group(COMPRESS_BLOCKS)));

     /* ███████╗███╗   ███╗███████╗██████╗  █████╗ ██╗     ██████╗     ██████╗ ██╗      ██████╗  ██████╗██╗  ██╗
        ██╔════╝████╗ ████║██╔════╝██╔══██╗██╔══██╗██║     ██╔══██╗    ██╔══██╗██║     ██╔═══██╗██╔════╝██║ ██╔╝
        █████╗  ██╔████╔██║█████╗  ██████╔╝███████║██║     ██║  ██║    ██████╔╝██║     ██║   ██║██║     █████╔╝
        ██╔══╝  ██║╚██╔╝██║██╔══╝  ██╔══██╗██╔══██║██║     ██║  ██║    ██╔══██╗██║     ██║   ██║██║     ██╔═██╗
        ███████╗██║ ╚═╝ ██║███████╗██║  ██║██║  ██║███████╗██████╔╝    ██████╔╝███████╗╚██████╔╝╚██████╗██║  ██╗
        ╚══════╝╚═╝     ╚═╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝╚═════╝     ╚═════╝ ╚══════╝ ╚═════╝  ╚═════╝╚═╝  ╚═╝*/

        // COMPRESSED EMERALD BLOCK [Blocks]
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_emerald_block_1"), COMPRESSED_EMERALD_BLOCK_1);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_emerald_block_2"), COMPRESSED_EMERALD_BLOCK_2);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_emerald_block_3"), COMPRESSED_EMERALD_BLOCK_3);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_emerald_block_4"), COMPRESSED_EMERALD_BLOCK_4);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_emerald_block_5"), COMPRESSED_EMERALD_BLOCK_5);
        // COMPRESSED EMERALD BLOCK [Items]
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_emerald_block_1"), new BlockItem(COMPRESSED_EMERALD_BLOCK_1, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_emerald_block_2"), new BlockItem(COMPRESSED_EMERALD_BLOCK_2, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_emerald_block_3"), new BlockItem(COMPRESSED_EMERALD_BLOCK_3, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_emerald_block_4"), new BlockItem(COMPRESSED_EMERALD_BLOCK_4, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_emerald_block_5"), new BlockItem(COMPRESSED_EMERALD_BLOCK_5, new Item.Settings().group(COMPRESS_BLOCKS)));

     /* ██████╗ ██╗   ██╗██████╗ ██╗   ██╗    ██████╗ ██╗      ██████╗  ██████╗██╗  ██╗
        ██╔══██╗██║   ██║██╔══██╗╚██╗ ██╔╝    ██╔══██╗██║     ██╔═══██╗██╔════╝██║ ██╔╝
        ██████╔╝██║   ██║██████╔╝ ╚████╔╝     ██████╔╝██║     ██║   ██║██║     █████╔╝
        ██╔══██╗██║   ██║██╔══██╗  ╚██╔╝      ██╔══██╗██║     ██║   ██║██║     ██╔═██╗
        ██║  ██║╚██████╔╝██████╔╝   ██║       ██████╔╝███████╗╚██████╔╝╚██████╗██║  ██╗
        ╚═╝  ╚═╝ ╚═════╝ ╚═════╝    ╚═╝       ╚═════╝ ╚══════╝ ╚═════╝  ╚═════╝╚═╝  ╚═╝*/

        // COMPRESSED RUBY BLOCK [Blocks]
        Registry.register(Registry.BLOCK, new Identifier("compress", "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_ruby_block_1"), COMPRESSED_RUBY_BLOCK_1);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_ruby_block_2"), COMPRESSED_RUBY_BLOCK_2);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_ruby_block_3"), COMPRESSED_RUBY_BLOCK_3);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_ruby_block_4"), COMPRESSED_RUBY_BLOCK_4);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_ruby_block_5"), COMPRESSED_RUBY_BLOCK_5);
        // COMPRESSED RUBY BLOCK [Items]
        Registry.register(Registry.ITEM, new Identifier("compress", "ruby_block"), new BlockItem(RUBY_BLOCK, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_ruby_block_1"), new BlockItem(COMPRESSED_RUBY_BLOCK_1, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_ruby_block_2"), new BlockItem(COMPRESSED_RUBY_BLOCK_2, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_ruby_block_3"), new BlockItem(COMPRESSED_RUBY_BLOCK_3, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_ruby_block_4"), new BlockItem(COMPRESSED_RUBY_BLOCK_4, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_ruby_block_5"), new BlockItem(COMPRESSED_RUBY_BLOCK_5, new Item.Settings().group(COMPRESS_BLOCKS)));


    }
}