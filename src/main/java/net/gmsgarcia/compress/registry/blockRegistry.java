package net.gmsgarcia.compress.registry;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.gmsgarcia.compress.blocks.*;

import net.gmsgarcia.compress.blocks.block_entities.CompressorEntity;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class blockRegistry {

/*    public static final String MOD_ID = "compress";
    // a public identifier for multiple parts of our bigger chest
    public static final Identifier BOX = new Identifier(MOD_ID, "compressor");*/

    public static final ItemGroup COMPRESS_BLOCKS = FabricItemGroupBuilder.build(new Identifier("compress", "blocks"), () -> new ItemStack(Blocks.COARSE_DIRT));

    public static final Block COMPRESSOR = new CompressorRegistry();
    public static BlockEntityType<CompressorEntity> COMPRESSOR_ENTITY;

    /* DIRT */
    public static final Block COMPRESSED_DIRT_1 = new CompressedDirt();
    public static final Block COMPRESSED_DIRT_2 = new CompressedDirt();
    public static final Block COMPRESSED_DIRT_3 = new CompressedDirt();
    public static final Block COMPRESSED_DIRT_4 = new CompressedDirt();
    public static final Block COMPRESSED_DIRT_5 = new CompressedDirt();
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

        // COMPRESSED END_STONE [Blocks]
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_end_stone_1"), COMPRESSED_END_STONE_1);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_end_stone_2"), COMPRESSED_END_STONE_2);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_end_stone_3"), COMPRESSED_END_STONE_3);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_end_stone_4"), COMPRESSED_END_STONE_4);
        Registry.register(Registry.BLOCK, new Identifier("compress", "compressed_end_stone_5"), COMPRESSED_END_STONE_5);
        // COMPRESSED END_STONE [Items]
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_end_stone_1"), new BlockItem(COMPRESSED_END_STONE_1, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_end_stone_2"), new BlockItem(COMPRESSED_END_STONE_2, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_end_stone_3"), new BlockItem(COMPRESSED_END_STONE_3, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_end_stone_4"), new BlockItem(COMPRESSED_END_STONE_4, new Item.Settings().group(COMPRESS_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("compress", "compressed_end_stone_5"), new BlockItem(COMPRESSED_END_STONE_5, new Item.Settings().group(COMPRESS_BLOCKS)));

    }
}