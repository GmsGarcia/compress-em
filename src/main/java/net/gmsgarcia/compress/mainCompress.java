package net.gmsgarcia.compress;

import net.fabricmc.api.ModInitializer;

import net.gmsgarcia.compress.registry.blockRegistry;
import net.gmsgarcia.compress.registry.foodRegistry;
import net.gmsgarcia.compress.registry.itemRegistry;

public class mainCompress implements ModInitializer {

	@Override
	public void onInitialize() {
		blockRegistry.registerBlocks();
		itemRegistry.registerItems();
		foodRegistry.registerFood();
	}
}
