package net.gmsgarcia.compress.neoforge;

import java.util.function.Supplier;

import net.gmsgarcia.compress.CompressEm;
import net.gmsgarcia.compress.ContentRegistrar;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * The NeoForge {@link ContentRegistrar}: three {@link DeferredRegister}s and the
 * order they fire in.
 *
 * <p>NeoForge freezes every registry before it constructs the {@code @Mod} class,
 * so nothing here builds an object. Every factory is queued on a
 * {@code DeferredRegister} and invoked later, during {@code RegisterEvent}, when
 * the registry is writable again. That is the reason this class exists at all;
 * see {@link ContentRegistrar} for the full argument.
 *
 * *<p>Blocks and items share an id space in 1.17 -- {@code compressed_stone_1}
 * names both -- but they are separate registries, so they get separate
 * {@code DeferredRegister}s. {@link #attach} is what fixes their order: a
 * {@code DeferredRegister} fires in the order it was attached to the bus, so
 * attaching {@link #blocks} before {@link #items} is what guarantees every
 * {@code BlockItem} can find its block. Tabs attach last; they only need
 * suppliers, so they are not on the critical path at all.
 */
final class NeoForgeContentRegistrar implements ContentRegistrar {

    private final DeferredRegister<Block> blocks =
            DeferredRegister.create(Registries.BLOCK, CompressEm.MOD_ID);
    private final DeferredRegister<Item> items =
            DeferredRegister.create(Registries.ITEM, CompressEm.MOD_ID);
    private final DeferredRegister<CreativeModeTab> tabs =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CompressEm.MOD_ID);

    @Override
    public void block(String path, ResourceKey<Block> key, Supplier<Block> factory) {
        blocks.register(path, factory);
    }

    @Override
    public void blockItem(String path, ResourceKey<Item> key, Supplier<Item> factory) {
        items.register(path, factory);
    }

    @Override
    public void item(String path, ResourceKey<Item> key, Supplier<Item> factory) {
        items.register(path, factory);
    }

    @Override
    public void tab(String path, ResourceKey<CreativeModeTab> key, Supplier<CreativeModeTab> factory) {
        tabs.register(path, factory);
    }

    /**
     * Binds the three registers to the mod event bus, in the order given.
     *
     * <p>Must run after {@link CompressEm#init(ContentRegistrar)}, which is what
     * queues the factories in the first place.
     */
    void attach(IEventBus eventBus) {
        blocks.register(eventBus);
        items.register(eventBus);
        tabs.register(eventBus);
    }
}
