package net.gmsgarcia.compress;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.gmsgarcia.compress.registry.screenRegistry;
import net.gmsgarcia.compress.screens.CompressorScreen;

@Environment(EnvType.CLIENT)
public class mainCompressClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ScreenRegistry.register(screenRegistry.COMPRESSOR_SCREEN_HANDLER, CompressorScreen::new);
    }
}