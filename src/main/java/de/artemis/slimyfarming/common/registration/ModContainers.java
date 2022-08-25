package de.artemis.slimyfarming.common.registration;

import de.artemis.slimyfarming.common.blocks.SlimeFabricatorContainer;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.registries.RegistryObject;

import static de.artemis.slimyfarming.common.registration.Registration.CONTAINERS;

public class ModContainers {

    public static void register() {
    }

    public static final RegistryObject<MenuType<SlimeFabricatorContainer>> SLIME_FABRICATOR_CONTAINER = CONTAINERS.register("slime_fabricator",
            () -> IForgeMenuType.create((windowId, inv, data) -> new SlimeFabricatorContainer(windowId, data.readBlockPos(), inv, inv.player)));
}
