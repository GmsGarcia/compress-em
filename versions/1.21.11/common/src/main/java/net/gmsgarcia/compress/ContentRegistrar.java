package net.gmsgarcia.compress;

import java.util.function.Supplier;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

/**
 * The platform seam between {@link CompressEm}'s content tables and whichever
 * loader is running.
 *
 * <p>Every method takes a {@link Supplier} rather than an already-built
 * instance, and that is the entire point of the interface. The two loaders
 * disagree about <em>when</em> a registry entry may be created:
 *
 * <ul>
 *   <li>Fabric's {@code ModInitializer} runs before the registry freeze, so
 *       {@link VanillaRegistrar} can build and register each object inline.
 *   <li>NeoForge freezes the registries <em>before</em> it constructs the
 *       {@code @Mod} class, so building a block there fails outright:
 *       {@code Block}'s constructor claims an intrusive registry holder and
 *       {@code MappedRegistry.validateWrite} throws
 *       {@code IllegalStateException: Registry is already frozen}. Its
 *       {@code DeferredRegister}s have to construct the object later, during
 *       {@code RegisterEvent}.
 * </ul>
 *
 * <p>Deferring <em>construction</em>, not merely the {@code Registry.register}
 * call, is what lets one common bootstrap serve both loaders. Handing over a
 * factory also keeps the instance recorded in {@link CompressEm}'s lookup maps
 * identical to the instance the registry ends up holding.
 *
 * <p><b>Ordering contract:</b> implementations must construct all blocks before
 * any block item, and both before creative tabs. A block item is built around
 * its block, and a tab's {@code displayItems} reads the recorded block items.
 * Breaking the order surfaces as {@link CompressEm} failing with
 * "no such block: &lt;id&gt;" rather than as a silent misregistration.
 */
public interface ContentRegistrar {

    void block(String path, ResourceKey<Block> key, Supplier<Block> factory);

    void blockItem(String path, ResourceKey<Item> key, Supplier<Item> factory);

    void item(String path, ResourceKey<Item> key, Supplier<Item> factory);

    void tab(String path, ResourceKey<CreativeModeTab> key, Supplier<CreativeModeTab> factory);
}
