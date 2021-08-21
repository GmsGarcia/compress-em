package net.gmsgarcia.compress.registry;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.gmsgarcia.compress.items.AlbertoXenowra;

import net.gmsgarcia.compress.items.BagOFlowers;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class itemRegistry {

    public static final ItemGroup COMPRESS_ITEMS = FabricItemGroupBuilder.build(new Identifier("compress", "items"), () -> new ItemStack(Items.STICK));

    public static final Item ALBERTO_XENOWRA = new AlbertoXenowra(new Item.Settings().group(COMPRESS_ITEMS));

    /* DANDELIONS */
    public static final Item BAG_WITH_DANDELIONS = new BagOFlowers(new Item.Settings().group(COMPRESS_ITEMS));
    public static final Item BAG_WITH_DANDELIONS_2 = new BagOFlowers(new Item.Settings().group(COMPRESS_ITEMS));
    /* POPPIES */
    public static final Item BAG_WITH_POPPIES = new BagOFlowers(new Item.Settings().group(COMPRESS_ITEMS));
    public static final Item BAG_WITH_POPPIES_2 = new BagOFlowers(new Item.Settings().group(COMPRESS_ITEMS));
    /* BLUE ORCHIDS */
    public static final Item BAG_WITH_BLUE_ORCHIDS = new BagOFlowers(new Item.Settings().group(COMPRESS_ITEMS));
    public static final Item BAG_WITH_BLUE_ORCHIDS_2 = new BagOFlowers(new Item.Settings().group(COMPRESS_ITEMS));
    /* ALLIUM */
    public static final Item BAG_WITH_ALLIUM = new BagOFlowers(new Item.Settings().group(COMPRESS_ITEMS));
    public static final Item BAG_WITH_ALLIUM_2 = new BagOFlowers(new Item.Settings().group(COMPRESS_ITEMS));
    /* AZURE BLUET */
    public static final Item BAG_WITH_AZURE_BLUET = new BagOFlowers(new Item.Settings().group(COMPRESS_ITEMS));
    public static final Item BAG_WITH_AZURE_BLUET_2 = new BagOFlowers(new Item.Settings().group(COMPRESS_ITEMS));
    /* RED TULIP */
    public static final Item BAG_WITH_RED_TULIP = new BagOFlowers(new Item.Settings().group(COMPRESS_ITEMS));
    public static final Item BAG_WITH_RED_TULIP_2 = new BagOFlowers(new Item.Settings().group(COMPRESS_ITEMS));
    /* ORANGE TULIP */
    public static final Item BAG_WITH_ORANGE_TULIP = new BagOFlowers(new Item.Settings().group(COMPRESS_ITEMS));
    public static final Item BAG_WITH_ORANGE_TULIP_2 = new BagOFlowers(new Item.Settings().group(COMPRESS_ITEMS));
    /* WHITE TULIP */
    public static final Item BAG_WITH_WHITE_TULIP = new BagOFlowers(new Item.Settings().group(COMPRESS_ITEMS));
    public static final Item BAG_WITH_WHITE_TULIP_2 = new BagOFlowers(new Item.Settings().group(COMPRESS_ITEMS));
    /* PINK TULIP */
    public static final Item BAG_WITH_PINK_TULIP = new BagOFlowers(new Item.Settings().group(COMPRESS_ITEMS));
    public static final Item BAG_WITH_PINK_TULIP_2 = new BagOFlowers(new Item.Settings().group(COMPRESS_ITEMS));
    /* OXEYE DAISY */
    public static final Item BAG_WITH_OXEYE_DAISY = new BagOFlowers(new Item.Settings().group(COMPRESS_ITEMS));
    public static final Item BAG_WITH_OXEYE_DAISY_2 = new BagOFlowers(new Item.Settings().group(COMPRESS_ITEMS));
    /* CORNFLOWER */
    public static final Item BAG_WITH_CORNFLOWER = new BagOFlowers(new Item.Settings().group(COMPRESS_ITEMS));
    public static final Item BAG_WITH_CORNFLOWER_2 = new BagOFlowers(new Item.Settings().group(COMPRESS_ITEMS));
    /* LILY OF THE VALLEY */
    public static final Item BAG_WITH_LILY_OF_THE_VALLEY = new BagOFlowers(new Item.Settings().group(COMPRESS_ITEMS));
    public static final Item BAG_WITH_LILY_OF_THE_VALLEY_2 = new BagOFlowers(new Item.Settings().group(COMPRESS_ITEMS));
    /* WITHER ROSE */
    public static final Item BAG_WITH_WITHER_ROSE = new BagOFlowers(new Item.Settings().group(COMPRESS_ITEMS));
    public static final Item BAG_WITH_WITHER_ROSE_2 = new BagOFlowers(new Item.Settings().group(COMPRESS_ITEMS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier("compress", "alberto_xenowra"), ALBERTO_XENOWRA);

        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_dandelions"), BAG_WITH_DANDELIONS);
        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_dandelions_2"), BAG_WITH_DANDELIONS_2);

        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_poppies"), BAG_WITH_POPPIES);
        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_poppies_2"), BAG_WITH_POPPIES_2);

        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_blue_orchids"), BAG_WITH_BLUE_ORCHIDS);
        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_blue_orchids_2"), BAG_WITH_BLUE_ORCHIDS_2);

        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_allium"), BAG_WITH_ALLIUM);
        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_allium_2"), BAG_WITH_ALLIUM_2);

        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_azure_bluet"), BAG_WITH_AZURE_BLUET);
        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_azure_bluet_2"), BAG_WITH_AZURE_BLUET_2);

        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_red_tulip"), BAG_WITH_RED_TULIP);
        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_red_tulip_2"), BAG_WITH_RED_TULIP_2);

        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_orange_tulip"), BAG_WITH_ORANGE_TULIP);
        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_orange_tulip_2"), BAG_WITH_ORANGE_TULIP_2);

        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_white_tulip"), BAG_WITH_WHITE_TULIP);
        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_white_tulip_2"), BAG_WITH_WHITE_TULIP_2);

        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_pink_tulip"), BAG_WITH_PINK_TULIP);
        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_pink_tulip_2"), BAG_WITH_PINK_TULIP_2);

        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_oxeye_daisy"), BAG_WITH_OXEYE_DAISY);
        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_oxeye_daisy_2"), BAG_WITH_OXEYE_DAISY_2);

        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_cornflower"), BAG_WITH_CORNFLOWER);
        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_cornflower_2"), BAG_WITH_CORNFLOWER_2);

        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_lily_of_the_valley"), BAG_WITH_LILY_OF_THE_VALLEY);
        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_lily_of_the_valley_2"), BAG_WITH_LILY_OF_THE_VALLEY_2);

        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_wither_rose"), BAG_WITH_WITHER_ROSE);
        Registry.register(Registry.ITEM, new Identifier("compress", "bag_with_wither_rose_2"), BAG_WITH_WITHER_ROSE_2);

    }
}