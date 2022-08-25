package de.artemis.slimyfarming.common.registration;

import de.artemis.slimyfarming.common.blocks.SlimeFabricatorBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.RegistryObject;

import static de.artemis.slimyfarming.common.registration.Registration.BLOCK_ENTITIES;

public class ModBlockEntities {

    public static void register() {
    }

    public static final RegistryObject<BlockEntityType<SlimeFabricatorBlockEntity>> SLIME_FABRICATOR_BLOCK_ENTITY = BLOCK_ENTITIES.register("slime_fabricator",
            () -> BlockEntityType.Builder.of(SlimeFabricatorBlockEntity::new, ModBlocks.SLIME_FABRICATOR.get()).build(null));
}
