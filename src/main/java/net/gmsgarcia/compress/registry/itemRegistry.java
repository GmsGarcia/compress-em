package net.gmsgarcia.compress.registry;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.gmsgarcia.compress.items.AlbertoXenowra;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class itemRegistry {

    public static final ItemGroup COMPRESS_ITEMS = FabricItemGroupBuilder.build(new Identifier("compress", "items"), () -> new ItemStack(Items.STICK));

    public static final Item ALBERTO_XENOWRA = new AlbertoXenowra(new Item.Settings().group(COMPRESS_ITEMS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier("compress", "alberto_xenowra"), ALBERTO_XENOWRA);
    }
}