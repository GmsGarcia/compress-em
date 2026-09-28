package net.gmsgarcia.compress;

import java.util.function.Supplier;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

/**
 * The immediate, vanilla-registry {@link ContentRegistrar}, used by Fabric.
 *
 * <p>Calls each factory once, in the order {@link CompressEm} hands them over,
 * and registers the result straight into the matching
 * {@link BuiltInRegistries} field. This is the 1.17 mechanism: 1.17 registered
 * ids directly through the loader, and on Fabric the modern vanilla registry
 * path is still open at {@code ModInitializer} time, so there is nothing to
 * defer.
 *
 * <p>Loader-neutral by construction -- it names no Fabric or NeoForge class --
 * which is why it lives in {@code common} next to the entrypoint that uses it
 * rather than in {@code fabric/}.
 */
public final class VanillaRegistrar implements ContentRegistrar {

    @Override
    public void block(String path, ResourceKey<Block> key, Supplier<Block> factory) {
        Registry.register(BuiltInRegistries.BLOCK, key, factory.get());
    }

    @Override
    public void blockItem(String path, ResourceKey<Item> key, Supplier<Item> factory) {
        Registry.register(BuiltInRegistries.ITEM, key, factory.get());
    }

    @Override
    public void item(String path, ResourceKey<Item> key, Supplier<Item> factory) {
        Registry.register(BuiltInRegistries.ITEM, key, factory.get());
    }

    @Override
    public void tab(String path, ResourceKey<CreativeModeTab> key, Supplier<CreativeModeTab> factory) {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, key, factory.get());
    }
}
