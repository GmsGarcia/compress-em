package net.gmsgarcia.compress.content;

import java.util.List;

/**
 * Compress 'em's 26 non-block items, in 1.17 registration order.
 *
 * <p>1.17 had a {@code BagWithItems} class that extended {@code Item} and
 * overrode nothing, so bags are plain {@code Item} instances here. Only
 * {@code yarn_ball} ever had behaviour, and that behaviour moved into
 * {@link net.gmsgarcia.compress.item.YarnBallItem}.
 */
public final class CompressItems {

    public enum ItemKind {
        BAG,
        YARN_BALL
    }

    public record Entry(String id, ItemKind kind) {
    }

    public static final List<Entry> ALL = List.of(
        // 13 flower bags, then the drop bags -- 1.17 order,
        item("bag_with_dandelions", ItemKind.BAG),
        item("bag_with_poppies", ItemKind.BAG),
        item("bag_with_blue_orchids", ItemKind.BAG),
        item("bag_with_allium", ItemKind.BAG),
        item("bag_with_azure_bluet", ItemKind.BAG),
        item("bag_with_red_tulip", ItemKind.BAG),
        item("bag_with_orange_tulip", ItemKind.BAG),
        item("bag_with_white_tulip", ItemKind.BAG),
        item("bag_with_pink_tulip", ItemKind.BAG),
        item("bag_with_oxeye_daisy", ItemKind.BAG),
        item("bag_with_cornflower", ItemKind.BAG),
        item("bag_with_lily_of_the_valley", ItemKind.BAG),
        item("bag_with_wither_rose", ItemKind.BAG),
        item("bag_with_rotten_flesh", ItemKind.BAG),
        item("bag_with_bones", ItemKind.BAG),
        item("bag_with_arrows", ItemKind.BAG),
        item("bag_with_spider_eyes", ItemKind.BAG),
        item("yarn_ball", ItemKind.YARN_BALL),
        item("bag_with_feathers", ItemKind.BAG),
        item("bag_with_gunpowder", ItemKind.BAG),
        item("bag_with_glowstone_dust", ItemKind.BAG),
        item("bag_with_sugar", ItemKind.BAG),
        item("bag_with_clay", ItemKind.BAG),
        item("bag_with_ender_pearls", ItemKind.BAG),
        item("bag_with_blaze_rods", ItemKind.BAG),
        item("bundle_of_sticks", ItemKind.BAG)
    );

    public static List<Entry> all() {
        return ALL;
    }

    private static Entry item(String id, ItemKind kind) {
        return new Entry(id, kind);
    }

    private CompressItems() {
    }
}
