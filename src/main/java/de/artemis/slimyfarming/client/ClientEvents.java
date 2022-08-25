package de.artemis.slimyfarming.client;

import de.artemis.slimyfarming.SlimyFarming;
import de.artemis.slimyfarming.common.registration.ModContainers;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = SlimyFarming.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientEvents {

    @SubscribeEvent
    public static void init(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            MenuScreens.register(ModContainers.SLIME_FABRICATOR_CONTAINER.get(), SlimeFabricatorScreen::new);
        });
    }

}
