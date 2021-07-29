package net.gmsgarcia.compress;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.gmsgarcia.compress.registry.blockRegistry;
import net.gmsgarcia.compress.registry.itemRegistry;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class mainCompress implements ModInitializer {

	@Override
	public void onInitialize() {
		blockRegistry.registerBlocks();
		itemRegistry.registerItems();
	}
}
