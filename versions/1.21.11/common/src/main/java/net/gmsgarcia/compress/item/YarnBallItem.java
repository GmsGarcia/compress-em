package net.gmsgarcia.compress.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundEvents;

/**
 * Yarn ball: makes a wool-thump sound when used.
 *
 * <p>1.17 overrode {@code use(World, PlayerEntity, Hand)} and returned
 * {@code TypedActionResult.success(stack)}. Both halves of that moved:
 * {@code TypedActionResult} collapsed into {@link InteractionResult}, and
 * {@code SoundEvents.BLOCK_WOOL_HIT} lost its {@code BLOCK_} prefix upstream.
 */
public class YarnBallItem extends Item {

    public YarnBallItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult use(Level level, Player player, InteractionHand hand) {
        player.playSound(SoundEvents.WOOL_HIT, 1.0f, 1.0f);
        return InteractionResult.SUCCESS;
    }
}
