package net.gmsgarcia.compress.fabric;

import net.fabricmc.api.ModInitializer;
import net.gmsgarcia.compress.CompressEm;
import net.gmsgarcia.compress.VanillaRegistrar;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Fabric entrypoint: the only loader-specific part of the port.
 *
 * <p>Everything else is the loader-neutral common bootstrap, so this class does
 * not grow as content does. 1.17's equivalent was {@code mainCompress}, which
 * was itself loader-specific and held the registration calls directly; moving
 * those calls into {@link CompressEm} is what lets the two loaders share them.
 *
 * <p>Fabric's {@code ModInitializer} still runs before the registry freeze, so
 * {@link VanillaRegistrar} builds each object inline and the log line can report
 * real counts immediately. NeoForge is handed the identical set of factories but
 * has to defer them, and therefore logs a moment later.
 */
public class FabricCompressEm implements ModInitializer {

    private static final Logger LOGGER = LoggerFactory.getLogger(CompressEm.MOD_ID);

    @Override
    public void onInitialize() {
        CompressEm.init(new VanillaRegistrar());
        LOGGER.info("Compress 'em loaded: {} blocks, {} items",
                CompressEm.registeredBlockIds().size(),
                CompressEm.registeredItemIds().size() + CompressEm.blockItems().size());
    }
}
