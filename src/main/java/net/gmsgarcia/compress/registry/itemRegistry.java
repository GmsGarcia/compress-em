package net.gmsgarcia.compress.registry;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

import net.gmsgarcia.compress.items.BagWithItems;
import net.gmsgarcia.compress.items.YarnBall;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class itemRegistry {

    public static final ItemGroup COMPRESS_ITEMS = FabricItemGroupBuilder.build(new Identifier("compress", "items"), () -> new ItemStack(Items.STICK));

    /////////////
    /* FLOWERS */
    /////////////

    public static final Item BAG_WITH_DANDELIONS = new BagWithItems(new Item.Settings().group(COMPRESS_ITEMS));
    public static final Item BAG_WITH_POPPIES = new BagWithItems(new Item.Settings().group(COMPRESS_ITEMS));
    public static final Item BAG_WITH_BLUE_ORCHIDS = new BagWithItems(new Item.Settings().group(COMPRESS_ITEMS));
    public static final Item BAG_WITH_ALLIUM = new BagWithItems(new Item.Settings().group(COMPRESS_ITEMS));
    public static final Item BAG_WITH_AZURE_BLUET = new BagWithItems(new Item.Settings().group(COMPRESS_ITEMS));
    public static final Item BAG_WITH_RED_TULIP = new BagWithItems(new Item.Settings().group(COMPRESS_ITEMS));
    public static final Item BAG_WITH_ORANGE_TULIP = new BagWithItems(new Item.Settings().group(COMPRESS_ITEMS));
    public static final Item BAG_WITH_WHITE_TULIP = new BagWithItems(new Item.Settings().group(COMPRESS_ITEMS));
    public static final Item BAG_WITH_PINK_TULIP = new BagWithItems(new Item.Settings().group(COMPRESS_ITEMS));
    public static final Item BAG_WITH_OXEYE_DAISY = new BagWithItems(new Item.Settings().group(COMPRESS_ITEMS));
    public static final Item BAG_WITH_CORNFLOWER = new BagWithItems(new Item.Settings().group(COMPRESS_ITEMS));
    public static final Item BAG_WITH_LILY_OF_THE_VALLEY = new BagWithItems(new Item.Settings().group(COMPRESS_ITEMS));
    public static final Item BAG_WITH_WITHER_ROSE = new BagWithItems(new Item.Settings().group(COMPRESS_ITEMS));

    ///////////
    /* DROPS */
    ///////////

    public static final Item BAG_WITH_ROTTEN_FLESH = new BagWithItems(new Item.Settings().group(COMPRESS_ITEMS));
    public static final Item BAG_WITH_BONES = new BagWithItems(new Item.Settings().group(COMPRESS_ITEMS));
    public static final Item BAG_WITH_ARROWS = new BagWithItems(new Item.Settings().group(COMPRESS_ITEMS));
    public static final Item BAG_WITH_SPIDER_EYES = new BagWithItems(new Item.Settings().group(COMPRESS_ITEMS));
    public static final Item YARN_BALL = new YarnBall(new Item.Settings().group(COMPRESS_ITEMS));
    public static final Item BAG_WITH_FEATHERS = new BagWithItems(new Item.Settings().group(COMPRESS_ITEMS));
    public static final Item BAG_WITH_GUNPOWDER = new BagWithItems(new Item.Settings().group(COMPRESS_ITEMS));
    public static final Item BAG_WITH_GLOWSTONE_DUST = new BagWithItems(new Item.Settings().group(COMPRESS_ITEMS));
    public static final Item BAG_WITH_SUGAR = new BagWithItems(new Item.Settings().group(COMPRESS_ITEMS));
    public static final Item BAG_WITH_CLAY = new BagWithItems(new Item.Settings().group(COMPRESS_ITEMS));
    public static final Item BAG_WITH_ENDER_PEARLS = new BagWithItems(new Item.Settings().group(COMPRESS_ITEMS));
    public static final Item BAG_WITH_BLAZE_RODS = new BagWithItems(new Item.Settings().group(COMPRESS_ITEMS));
    public static final Item BUNDLE_OF_STICKS = new BagWithItems(new Item.Settings().group(COMPRESS_ITEMS));

    public static void registerItems() {

        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_dandelions"), BAG_WITH_DANDELIONS);
        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_poppies"), BAG_WITH_POPPIES);
        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_blue_orchids"), BAG_WITH_BLUE_ORCHIDS);
        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_allium"), BAG_WITH_ALLIUM);
        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_azure_bluet"), BAG_WITH_AZURE_BLUET);
        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_red_tulip"), BAG_WITH_RED_TULIP);
        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_orange_tulip"), BAG_WITH_ORANGE_TULIP);
        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_white_tulip"), BAG_WITH_WHITE_TULIP);
        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_pink_tulip"), BAG_WITH_PINK_TULIP);
        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_oxeye_daisy"), BAG_WITH_OXEYE_DAISY);
        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_cornflower"), BAG_WITH_CORNFLOWER);
        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_lily_of_the_valley"), BAG_WITH_LILY_OF_THE_VALLEY);
        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_wither_rose"), BAG_WITH_WITHER_ROSE);

        ///////////
        /* DROPS */
        ///////////

        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_rotten_flesh"), BAG_WITH_ROTTEN_FLESH);
        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_bones"), BAG_WITH_BONES);
        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_arrows"), BAG_WITH_ARROWS);
        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_spider_eyes"), BAG_WITH_SPIDER_EYES);
        Registry.register(Registry.ITEM, new Identifier("compress", "yarn_ball"), YARN_BALL);
        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_feathers"), BAG_WITH_FEATHERS);
        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_gunpowder"), BAG_WITH_GUNPOWDER);
        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_glowstone_dust"), BAG_WITH_GLOWSTONE_DUST);
        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_sugar"), BAG_WITH_SUGAR);
        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_clay"), BAG_WITH_CLAY);
        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_ender_pearls"), BAG_WITH_ENDER_PEARLS);
        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_blaze_rods"), BAG_WITH_BLAZE_RODS);
        Registry.register(Registry.ITEM, new Identifier("compress", "bundle_of_sticks"), BUNDLE_OF_STICKS);

    }
}