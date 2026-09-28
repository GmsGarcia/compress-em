package net.gmsgarcia.compress.neoforge;

import net.gmsgarcia.compress.CompressEm;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * NeoForge entrypoint: the only loader-specific part of the port.
 *
 * <p>Two steps, in this order. {@code CompressEm.init} queues every block, item
 * and tab as a factory through {@code NeoForgeContentRegistrar}, which builds
 * nothing; {@code attach} then binds those queues to the mod event bus so
 * NeoForge runs them during {@code RegisterEvent}. The split is not cosmetic --
 * an object cannot be built in this constructor at all, because the registries
 * are already frozen by the time it runs.
 *
 * <p>The log line waits for {@link FMLCommonSetupEvent} rather than running here
 * because the item count it prints is the size of {@code CompressEm}'s instance
 * map, and that map is still empty until {@code RegisterEvent} has run. The
 * declared id list would have been available already, but reporting a half-empty
 * result is worse than reporting the real one slightly later.
 */
@Mod(CompressEm.MOD_ID)
public class NeoForgeCompressEm {

    private static final Logger LOGGER = LoggerFactory.getLogger(CompressEm.MOD_ID);

    public NeoForgeCompressEm(IEventBus eventBus) {
        NeoForgeContentRegistrar registrar = new NeoForgeContentRegistrar();
        CompressEm.init(registrar);
        registrar.attach(eventBus);
        eventBus.addListener(NeoForgeCompressEm::logLoaded);
    }

    private static void logLoaded(FMLCommonSetupEvent event) {
        LOGGER.info("Compress 'em loaded: {} blocks, {} items",
                CompressEm.registeredBlockIds().size(),
                CompressEm.registeredItemIds().size() + CompressEm.blockItems().size());
    }
}
