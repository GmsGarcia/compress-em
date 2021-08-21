package net.gmsgarcia.compress.registry;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.gmsgarcia.compress.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class foodRegistry {

    public static final ItemGroup COMPRESS_FOODS = FabricItemGroupBuilder.build(new Identifier("compress", "food"), () -> new ItemStack(Items.BREAD));

    /* BASKETS */
    public static final Block APPLE_BASKET = new BasketBlock();
    public static final Block POTATO_BASKET = new BasketBlock();
    public static final Block CARROT_BASKET = new BasketBlock();
    public static final Block BEETROOT_BASKET = new BasketBlock();

    public static void registerFood() {

        
        // Register Apple Basket Block
        Registry.register(Registry.BLOCK, new Identifier("compress", "apple_basket"), APPLE_BASKET);
        // Register Apple Basket Block's Item
        Registry.register(Registry.ITEM, new Identifier("compress", "apple_basket"), new BlockItem(APPLE_BASKET, new Item.Settings().group(COMPRESS_FOODS)));

        // Register Potato Basket Block
        Registry.register(Registry.BLOCK, new Identifier("compress", "potato_basket"), POTATO_BASKET);
        // Register Potato Basket Block's Item
        Registry.register(Registry.ITEM, new Identifier("compress", "potato_basket"), new BlockItem(POTATO_BASKET, new Item.Settings().group(COMPRESS_FOODS)));

        // Register Beetroot Basket Block
        Registry.register(Registry.BLOCK, new Identifier("compress", "carrot_basket"), CARROT_BASKET);
        // Register Beetroot Basket Block's Item
        Registry.register(Registry.ITEM, new Identifier("compress", "carrot_basket"), new BlockItem(CARROT_BASKET, new Item.Settings().group(COMPRESS_FOODS)));

        // Register Beetroot Basket Block
        Registry.register(Registry.BLOCK, new Identifier("compress", "beetroot_basket"), BEETROOT_BASKET);
        // Register Beetroot Basket Block's Item
        Registry.register(Registry.ITEM, new Identifier("compress", "beetroot_basket"), new BlockItem(BEETROOT_BASKET, new Item.Settings().group(COMPRESS_FOODS)));

    }
}