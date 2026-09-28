package net.gmsgarcia.compress;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import net.gmsgarcia.compress.content.CompressBlocks;
import net.gmsgarcia.compress.content.CompressItems;
import net.gmsgarcia.compress.item.YarnBallItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

/**
 * The ported bootstrap: registers all 156 of Compress 'em's content entries --
 * 130 blocks and 26 plain items, which together with the 130 block items make the
 * 156 items the mod reports at startup. 1.17 declared 306; the ruby line and the
 * four baskets are gone, taking 10 blocks, their 10 block items and 16 recipes
 * with them.
 *
 * <p>Replaces 1.17's {@code mainCompress}, which called three registry classes
 * ({@code blockRegistry} 735 lines, {@code itemRegistry}, {@code foodRegistry}).
 * Those held 140 public static block fields and registered each one twice, once
 * to {@code Registry.BLOCK} and once to {@code Registry.ITEM} as a
 * {@code BlockItem}. The ids and their order are unchanged; only the mechanism
 * is.
 *
 * <p>What reaches the loader is a {@link ContentRegistrar} plus a set of
 * factories, never a built object. An earlier design sketched that interface for
 * a reason that turned out not to exist: 1.21 removed {@code tab(...)} from both
 * {@code Item.Properties} and the loaders' extension interfaces, so creative
 * tabs have to be built with vanilla's {@link CreativeModeTab.Builder} and
 * filled through {@code displayItems} whichever loader is running, and that is
 * still what happens here. The interface is needed for a second reason instead,
 * and that one is not optional -- see {@link ContentRegistrar}.
 *
 * <p>The bookkeeping is therefore two layers rather than one. The id lists fill
 * the moment {@link #init} runs, so they answer "what does this mod declare?"
 * before anything has been registered. The maps hold live instances and fill
 * when each factory is invoked, which on NeoForge is during
 * {@code RegisterEvent}. Keeping them apart is what makes the counts honest on
 * both loaders: the old {@code BLOCKS.isEmpty()} double-init guard would have
 * been vacuous under deferred registration, and the entrypoint log lines would
 * have reported zero.
 */
public final class CompressEm {

    public static final String MOD_ID = "compress";

    /** 1.17 registered this tab as {@code compress:blocks}. */
    public static final String BLOCKS_TAB_ID = "blocks";
    /** 1.17 registered this tab as {@code compress:items}. */
    public static final String ITEMS_TAB_ID = "items";

    private static final List<String> BLOCK_IDS = new ArrayList<>();
    private static final List<String> ITEM_IDS = new ArrayList<>();

    private static final Map<String, Block> BLOCKS = new LinkedHashMap<>();
    private static final Map<String, Item> BLOCK_ITEMS = new LinkedHashMap<>();
    private static final Map<String, Item> ITEMS = new LinkedHashMap<>();

    private static boolean initialised;

    private CompressEm() {
    }

    /**
     * Registers every block, block item, item and creative tab, leaving
     * {@code registrar} to decide when each one is actually built.
     *
     * <p>Called once per game launch by the loader entrypoint. Guarded because a
     * second call would re-register ids and throw deep inside the registry
     * freeze, which is a much worse error message than this one.
     */
    public static void init(ContentRegistrar registrar) {
        if (initialised) {
            throw new IllegalStateException(MOD_ID + " was initialised twice");
        }
        registerBlocks(registrar);
        registerBlockItems(registrar);
        registerItems(registrar);
        registerTabs(registrar);
        initialised = true;
    }

    /**
     * Builds each block's {@code ResourceKey} once and hands the same key to both
     * {@code Properties.setId} and the registration site, so the id a block is
     * built with can never disagree with the id it is registered under. 1.17 had no
     * such coupling -- see {@link net.gmsgarcia.compress.content.BlockSpec#toProperties}.
     *
     * <p>Only the key is created here. {@code entry.spec().create(key)} runs
     * inside the factory, because on NeoForge it may not be allowed to run until
     * {@code RegisterEvent}.
     */
    private static void registerBlocks(ContentRegistrar registrar) {
        for (CompressBlocks.Entry entry : CompressBlocks.all()) {
            String path = entry.id();
            ResourceKey<Block> key = ResourceKey.create(Registries.BLOCK, id(path));
            BLOCK_IDS.add(path);
            registrar.block(path, key, once(() -> {
                Block block = entry.spec().create(key);
                BLOCKS.put(path, block);
                return block;
            }));
        }
    }

    /**
     * Each block gets an item under the <em>same</em> id, as in 1.17 -- where
     * {@code compressed_stone_1} names both a block and a block item.
     *
     * <p>{@code useBlockDescriptionPrefix()} is load-bearing. {@code Item}'s
     * constructor resolves its translation key once, from
     * {@code Properties.effectiveDescriptionId()}, and {@code getDescriptionId()}
     * is final so a {@code BlockItem} cannot fix it afterwards. Without the
     * prefix every block item looks up {@code item.compress.<id>}, which no
     * translation key exists for, and the creative tab shows the raw id
     * ({@code compress.compressed_dirt_1}) instead of {@code block.compress.
     * compressed_dirt_1}.
     *
     * <p>{@code requireBlock} is what turns a registrar that violates the
     * ordering contract into a legible error: under deferred registration these
     * factories are not called until the block factories have been.
     */
    private static void registerBlockItems(ContentRegistrar registrar) {
        for (CompressBlocks.Entry entry : CompressBlocks.all()) {
            String path = entry.id();
            ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, id(path));
            registrar.blockItem(path, key, once(() -> {
                Item item = new BlockItem(requireBlock(path),
                        new Item.Properties().setId(key).useBlockDescriptionPrefix());
                BLOCK_ITEMS.put(path, item);
                return item;
            }));
        }
    }

    private static void registerItems(ContentRegistrar registrar) {
        for (CompressItems.Entry entry : CompressItems.all()) {
            String path = entry.id();
            ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, id(path));
            ITEM_IDS.add(path);
            registrar.item(path, key, once(() -> {
                Item.Properties properties = new Item.Properties().setId(key);
                Item item = entry.kind() == CompressItems.ItemKind.YARN_BALL
                        ? new YarnBallItem(properties)
                        : new Item(properties);
                ITEMS.put(path, item);
                return item;
            }));
        }
    }

    /**
     * Rebuilds the two 1.17 creative tabs.
     *
     * <p>1.17 put 136 block items in {@code compress:blocks} and 26 items in
     * {@code compress:items}, and left the four baskets in no tab at all. The
     * baskets no longer exist, so this tab is again a straight
     * registration-order pass over every block -- there is nothing to append and
     * no untabbed content.
     *
     * <p>{@code displayItems} is a deferred consumer rather than a captured list
     * of objects, which is what lets the tab be built before the block items
     * exist. It runs when the creative inventory is assembled, long after
     * registration.
     */
    private static void registerTabs(ContentRegistrar registrar) {
        registrar.tab(BLOCKS_TAB_ID,
                ResourceKey.create(Registries.CREATIVE_MODE_TAB, id(BLOCKS_TAB_ID)),
                once(() -> new CreativeModeTab.Builder(CreativeModeTab.Row.TOP, 0)
                        .title(Component.translatable("itemGroup.compress." + BLOCKS_TAB_ID))
                        .icon(() -> new ItemStack(Blocks.COBBLESTONE))
                        .displayItems((parameters, output) -> CompressBlocks.all().stream()
                                .forEach(entry -> output.accept(requireBlockItem(entry.id()))))
                        .build()));

        registrar.tab(ITEMS_TAB_ID,
                ResourceKey.create(Registries.CREATIVE_MODE_TAB, id(ITEMS_TAB_ID)),
                once(() -> new CreativeModeTab.Builder(CreativeModeTab.Row.TOP, 1)
                        .title(Component.translatable("itemGroup.compress." + ITEMS_TAB_ID))
                        .icon(() -> new ItemStack(Items.STICK))
                        .displayItems((parameters, output) -> CompressItems.all().stream()
                                .forEach(entry -> output.accept(requireItem(entry.id()))))
                        .build()));
    }

    private static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }

    /**
     * Wraps a factory so that it runs at most once.
     *
     * <p>Without this, a loader that happened to call a factory twice would
     * leave the recorded instance in {@link #BLOCKS} and its siblings as the
     * <em>second</em> object -- a block that exists but was never registered.
     * The recorded instance has to be the registered one, because block items
     * and creative tabs are both built from these maps.
     */
    private static <T> Supplier<T> once(Supplier<T> factory) {
        return new Once<>(factory);
    }

    private static final class Once<T> implements Supplier<T> {

        private final Supplier<T> factory;
        private T value;

        private Once(Supplier<T> factory) {
            this.factory = factory;
        }

        @Override
        public synchronized T get() {
            if (value == null) {
                value = factory.get();
            }
            return value;
        }
    }

    public static Map<String, Block> blocks() {
        return Collections.unmodifiableMap(BLOCKS);
    }

    public static Map<String, Item> blockItems() {
        return Collections.unmodifiableMap(BLOCK_ITEMS);
    }

    public static Map<String, Item> items() {
        return Collections.unmodifiableMap(ITEMS);
    }

    /**
     * The ids this bootstrap declares, in registration order, whether or not the
     * objects behind them have been built yet. This is what the id gate and the
     * entrypoint log lines read, so they do not depend on registration timing.
     */
    public static List<String> registeredBlockIds() {
        return List.copyOf(BLOCK_IDS);
    }

    public static List<String> registeredItemIds() {
        return List.copyOf(ITEM_IDS);
    }

    private static Block requireBlock(String id) {
        Block block = BLOCKS.get(id);
        if (block == null) {
            throw new IllegalStateException("no such block: " + id);
        }
        return block;
    }

    private static Item requireBlockItem(String id) {
        Item item = BLOCK_ITEMS.get(id);
        if (item == null) {
            throw new IllegalStateException("no such block item: " + id);
        }
        return item;
    }

    private static Item requireItem(String id) {
        Item item = ITEMS.get(id);
        if (item == null) {
            throw new IllegalStateException("no such item: " + id);
        }
        return item;
    }
}
