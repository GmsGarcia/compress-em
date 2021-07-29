package net.gmsgarcia.compress.blocks.block_entities;

import net.gmsgarcia.compress.ImplementedInventory;
import net.gmsgarcia.compress.registry.blockRegistry;
import net.gmsgarcia.compress.screens.screenhandlers.CompressorScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;

public class CompressorEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {

    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(9, ItemStack.EMPTY);

    public CompressorEntity(BlockPos pos, BlockState state) {
        super(blockRegistry.COMPRESSOR_ENTITY, pos, state);
    }

    //From the ImplementedInventory Interface

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;

    }

    //These Methods are from the NamedScreenHandlerFactory Interface
    //createMenu creates the ScreenHandler itself
    //getDisplayName will Provide its name which is normally shown at the top

    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        //We provide *this* to the screenHandler as our class Implements Inventory
        //Only the Server has the Inventory at the start, this will be synced to the client in the ScreenHandler
        return new CompressorScreenHandler(syncId, playerInventory, this);
    }

    @Override
    public Text getDisplayName() {
        return new TranslatableText(getCachedState().getBlock().getTranslationKey());
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, this.inventory);
    }

    @Override
    public NbtCompound writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, this.inventory);
        return nbt;
    }
}
