package de.artemis.slimyfarming.common.registration;

import de.artemis.slimyfarming.SlimyFarming;
import de.artemis.slimyfarming.common.blocks.SlimeCropBlock;
import de.artemis.slimyfarming.common.blocks.SlimeFabricatorBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HoneyBlock;
import net.minecraft.world.level.block.SlimeBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {

        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(toReturn.get(),
                new Item.Properties().tab(SlimyFarming.INVENTORY_TAB)));

        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block, Supplier<? extends BlockItem> item) {

        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block);
        Registration.ITEMS.register(name, item);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block);
        return toReturn;
    }

    public static boolean never(BlockState state, BlockGetter blockGetter, BlockPos pos) {
        return false;
    }

    public static void register() {
    }

    public static final RegistryObject<SlimeFabricatorBlock> SLIME_FABRICATOR = register("slime_fabricator",
            SlimeFabricatorBlock::new);

    public static final RegistryObject<SlimeCropBlock> PINK_SLIME_CROP = register("pink_slime_crop",
            () -> new SlimeCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP), ModItems.PINK_SLIME_SEEDS::get, ModItems.PINK_SLIME_FRUIT::get));

    public static final RegistryObject<SlimeBlock> PINK_SLIME_BLOCK = register("pink_slime_block",
            () -> new SlimeBlock(BlockBehaviour.Properties.of(Material.CLAY).speedFactor(0.4F).jumpFactor(0.5F).noOcclusion().sound(SoundType.HONEY_BLOCK)));

    public static final RegistryObject<SlimeCropBlock> ROCK_SLIME_CROP = register("rock_slime_crop",
            () -> new SlimeCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP), ModItems.ROCK_SLIME_SEEDS::get, ModItems.ROCK_SLIME_FRUIT::get));

    public static final RegistryObject<HoneyBlock> ROCK_SLIME_BLOCK = register("rock_slime_block",
            () -> new HoneyBlock(BlockBehaviour.Properties.of(Material.CLAY).speedFactor(0.4F).jumpFactor(0.5F).noOcclusion().sound(SoundType.HONEY_BLOCK)));

    public static final RegistryObject<SlimeCropBlock> PHOSPHOR_SLIME_CROP = register("phosphor_slime_crop",
            () -> new SlimeCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP), ModItems.PHOSPHOR_SLIME_SEEDS::get, ModItems.PHOSPHOR_SLIME_FRUIT::get));

    public static final RegistryObject<HoneyBlock> PHOSPHOR_SLIME_BLOCK = register("phosphor_slime_block",
            () -> new HoneyBlock(BlockBehaviour.Properties.of(Material.CLAY).speedFactor(0.4F).jumpFactor(0.5F).noOcclusion().sound(SoundType.HONEY_BLOCK)));

    public static final RegistryObject<SlimeCropBlock> TABBY_SLIME_CROP = register("tabby_slime_crop",
            () -> new SlimeCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP), ModItems.TABBY_SLIME_SEEDS::get, ModItems.TABBY_SLIME_FRUIT::get));

    public static final RegistryObject<HoneyBlock> TABBY_SLIME_BLOCK = register("tabby_slime_block",
            () -> new HoneyBlock(BlockBehaviour.Properties.of(Material.CLAY).speedFactor(0.4F).jumpFactor(0.5F).noOcclusion().sound(SoundType.HONEY_BLOCK)));

    public static final RegistryObject<SlimeCropBlock> RAD_SLIME_CROP = register("rad_slime_crop",
            () -> new SlimeCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP), ModItems.RAD_SLIME_SEEDS::get, ModItems.RAD_SLIME_FRUIT::get));

    public static final RegistryObject<HoneyBlock> RAD_SLIME_BLOCK = register("rad_slime_block",
            () -> new HoneyBlock(BlockBehaviour.Properties.of(Material.CLAY).speedFactor(0.4F).jumpFactor(0.5F).noOcclusion().sound(SoundType.HONEY_BLOCK)));

    public static final RegistryObject<SlimeCropBlock> HONEY_SLIME_CROP = register("honey_slime_crop",
            () -> new SlimeCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP), ModItems.HONEY_SLIME_SEEDS::get, ModItems.HONEY_SLIME_FRUIT::get));

    public static final RegistryObject<HoneyBlock> HONEY_SLIME_BLOCK = register("honey_slime_block",
            () -> new HoneyBlock(BlockBehaviour.Properties.of(Material.CLAY).speedFactor(0.4F).jumpFactor(0.5F).noOcclusion().sound(SoundType.HONEY_BLOCK)));

    public static final RegistryObject<SlimeCropBlock> BOOM_SLIME_CROP = register("boom_slime_crop",
            () -> new SlimeCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP), ModItems.BOOM_SLIME_SEEDS::get, ModItems.BOOM_SLIME_FRUIT::get));

    public static final RegistryObject<HoneyBlock> BOOM_SLIME_BLOCK = register("boom_slime_block",
            () -> new HoneyBlock(BlockBehaviour.Properties.of(Material.CLAY).speedFactor(0.4F).jumpFactor(0.5F).noOcclusion().sound(SoundType.HONEY_BLOCK)));

    public static final RegistryObject<SlimeCropBlock> PUDDLE_SLIME_CROP = register("puddle_slime_crop",
            () -> new SlimeCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP), ModItems.PUDDLE_SLIME_SEEDS::get, ModItems.PUDDLE_SLIME_FRUIT::get));

    public static final RegistryObject<HoneyBlock> PUDDLE_SLIME_BLOCK = register("puddle_slime_block",
            () -> new HoneyBlock(BlockBehaviour.Properties.of(Material.CLAY).speedFactor(0.4F).jumpFactor(0.5F).noOcclusion().sound(SoundType.HONEY_BLOCK)));

    public static final RegistryObject<SlimeCropBlock> FIRE_SLIME_CROP = register("fire_slime_crop",
            () -> new SlimeCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP), ModItems.FIRE_SLIME_SEEDS::get, ModItems.FIRE_SLIME_FRUIT::get));

    public static final RegistryObject<HoneyBlock> FIRE_SLIME_BLOCK = register("fire_slime_block",
            () -> new HoneyBlock(BlockBehaviour.Properties.of(Material.CLAY).speedFactor(0.4F).jumpFactor(0.5F).noOcclusion().sound(SoundType.HONEY_BLOCK)));

    public static final RegistryObject<SlimeCropBlock> CRYSTAL_SLIME_CROP = register("crystal_slime_crop",
            () -> new SlimeCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP), ModItems.CRYSTAL_SLIME_SEEDS::get, ModItems.CRYSTAL_SLIME_FRUIT::get));

    public static final RegistryObject<HoneyBlock> CRYSTAL_SLIME_BLOCK = register("crystal_slime_block",
            () -> new HoneyBlock(BlockBehaviour.Properties.of(Material.CLAY).speedFactor(0.4F).jumpFactor(0.5F).noOcclusion().sound(SoundType.HONEY_BLOCK)));

    public static final RegistryObject<SlimeCropBlock> QUANTUM_SLIME_CROP = register("quantum_slime_crop",
            () -> new SlimeCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP), ModItems.QUANTUM_SLIME_SEEDS::get, ModItems.QUANTUM_SLIME_FRUIT::get));

    public static final RegistryObject<HoneyBlock> QUANTUM_SLIME_BLOCK = register("quantum_slime_block",
            () -> new HoneyBlock(BlockBehaviour.Properties.of(Material.CLAY).speedFactor(0.4F).jumpFactor(0.5F).noOcclusion().sound(SoundType.HONEY_BLOCK)));

    public static final RegistryObject<SlimeCropBlock> DERVISH_SLIME_CROP = register("dervish_slime_crop",
            () -> new SlimeCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP), ModItems.DERVISH_SLIME_SEEDS::get, ModItems.DERVISH_SLIME_FRUIT::get));

    public static final RegistryObject<HoneyBlock> DERVISH_SLIME_BLOCK = register("dervish_slime_block",
            () -> new HoneyBlock(BlockBehaviour.Properties.of(Material.CLAY).speedFactor(0.4F).jumpFactor(0.5F).noOcclusion().sound(SoundType.HONEY_BLOCK)));

    public static final RegistryObject<SlimeCropBlock> HUNTER_SLIME_CROP = register("hunter_slime_crop",
            () -> new SlimeCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP), ModItems.HUNTER_SLIME_SEEDS::get, ModItems.HUNTER_SLIME_FRUIT::get));

    public static final RegistryObject<HoneyBlock> HUNTER_SLIME_BLOCK = register("hunter_slime_block",
            () -> new HoneyBlock(BlockBehaviour.Properties.of(Material.CLAY).speedFactor(0.4F).jumpFactor(0.5F).noOcclusion().sound(SoundType.HONEY_BLOCK)));

    public static final RegistryObject<SlimeCropBlock> MOSAIC_SLIME_CROP = register("mosaic_slime_crop",
            () -> new SlimeCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP), ModItems.MOSAIC_SLIME_SEEDS::get, ModItems.MOSAIC_SLIME_FRUIT::get));

    public static final RegistryObject<HoneyBlock> MOSAIC_SLIME_BLOCK = register("mosaic_slime_block",
            () -> new HoneyBlock(BlockBehaviour.Properties.of(Material.CLAY).speedFactor(0.4F).jumpFactor(0.5F).noOcclusion().sound(SoundType.HONEY_BLOCK)));

    public static final RegistryObject<SlimeCropBlock> TANGLE_SLIME_CROP = register("tangle_slime_crop",
            () -> new SlimeCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP), ModItems.TANGLE_SLIME_SEEDS::get, ModItems.TANGLE_SLIME_FRUIT::get));

    public static final RegistryObject<HoneyBlock> TANGLE_SLIME_BLOCK = register("tangle_slime_block",
            () -> new HoneyBlock(BlockBehaviour.Properties.of(Material.CLAY).speedFactor(0.4F).jumpFactor(0.5F).noOcclusion().sound(SoundType.HONEY_BLOCK)));

    public static final RegistryObject<SlimeCropBlock> SABER_SLIME_CROP = register("saber_slime_crop",
            () -> new SlimeCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP), ModItems.SABER_SLIME_SEEDS::get, ModItems.SABER_SLIME_FRUIT::get));

    public static final RegistryObject<HoneyBlock> SABER_SLIME_BLOCK = register("saber_slime_block",
            () -> new HoneyBlock(BlockBehaviour.Properties.of(Material.CLAY).speedFactor(0.4F).jumpFactor(0.5F).noOcclusion().sound(SoundType.HONEY_BLOCK)));

    public static final RegistryObject<SlimeCropBlock> GOLD_SLIME_CROP = register("gold_slime_crop",
            () -> new SlimeCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP), ModItems.GOLD_SLIME_SEEDS::get, ModItems.GOLD_SLIME_FRUIT::get));

    public static final RegistryObject<HoneyBlock> GOLD_SLIME_BLOCK = register("gold_slime_block",
            () -> new HoneyBlock(BlockBehaviour.Properties.of(Material.CLAY).speedFactor(0.4F).jumpFactor(0.5F).noOcclusion().sound(SoundType.HONEY_BLOCK)));

    public static final RegistryObject<SlimeCropBlock> QUICKSILVER_SLIME_CROP = register("quicksilver_slime_crop",
            () -> new SlimeCropBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP), ModItems.QUICKSILVER_SLIME_SEEDS::get, ModItems.QUICKSILVER_SLIME_FRUIT::get));;

    public static final RegistryObject<HoneyBlock> QUICKSILVER_SLIME_BLOCK = register("quicksilver_slime_block",
            () -> new HoneyBlock(BlockBehaviour.Properties.of(Material.CLAY).speedFactor(0.4F).jumpFactor(0.5F).noOcclusion().sound(SoundType.HONEY_BLOCK)));

}
