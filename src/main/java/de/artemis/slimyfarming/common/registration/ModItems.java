package de.artemis.slimyfarming.common.registration;

import de.artemis.slimyfarming.SlimyFarming;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static void register() {
    }

    public static final RegistryObject<Item> BUZZ_WAX = Registration.ITEMS.register("buzz_wax",
            () -> new Item(new Item.Properties().tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> HEXA_COMB = Registration.ITEMS.register("hexa_comb",
            () -> new Item(new Item.Properties().tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> WILD_HONEY = Registration.ITEMS.register("wild_honey",
            () -> new Item(new Item.Properties().tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> ROYAL_JELLY = Registration.ITEMS.register("royal_jelly",
            () -> new Item(new Item.Properties().tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> PEPPER_JAM = Registration.ITEMS.register("pepper_jam",
            () -> new Item(new Item.Properties().tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> INDIGONIUM = Registration.ITEMS.register("indigonium",
            () -> new Item(new Item.Properties().tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> JELLYSTONE = Registration.ITEMS.register("jellystone",
            () -> new Item(new Item.Properties().tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> SLIME_FOSSIL = Registration.ITEMS.register("slime_fossil",
            () -> new Item(new Item.Properties().tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> GLASS_SHARD = Registration.ITEMS.register("glass_shard",
            () -> new Item(new Item.Properties().tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> STRANGE_DIAMOND = Registration.ITEMS.register("strange_diamond",
            () -> new Item(new Item.Properties().tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> PRIMORDY_OIL = Registration.ITEMS.register("primordy_oil",
            () -> new Item(new Item.Properties().tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> DEEP_BRINE = Registration.ITEMS.register("deep_brine",
            () -> new Item(new Item.Properties().tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> SILKY_SAND = Registration.ITEMS.register("silky_sand",
            () -> new Item(new Item.Properties().tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> SPIRAL_STEAM = Registration.ITEMS.register("spiral_steam",
            () -> new Item(new Item.Properties().tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> LAVA_DUST = Registration.ITEMS.register("lava_dust",
            () -> new Item(new Item.Properties().tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> PINK_SLIME_SEEDS = Registration.ITEMS.register("pink_slime_seeds",
            () -> new ItemNameBlockItem(ModBlocks.PINK_SLIME_CROP.get(), (new Item.Properties()).tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> PINK_SLIME_FRUIT = Registration.ITEMS.register("pink_slime_fruit",
            () -> new Item(new Item.Properties().tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> ROCK_SLIME_SEEDS = Registration.ITEMS.register("rock_slime_seeds",
            () -> new ItemNameBlockItem(ModBlocks.ROCK_SLIME_CROP.get(), (new Item.Properties()).tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> ROCK_SLIME_FRUIT = Registration.ITEMS.register("rock_slime_fruit",
            () -> new Item(new Item.Properties().tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> PHOSPHOR_SLIME_SEEDS = Registration.ITEMS.register("phosphor_slime_seeds",
            () -> new ItemNameBlockItem(ModBlocks.PHOSPHOR_SLIME_CROP.get(), (new Item.Properties()).tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> PHOSPHOR_SLIME_FRUIT = Registration.ITEMS.register("phosphor_slime_fruit",
            () -> new Item(new Item.Properties().tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> TABBY_SLIME_SEEDS = Registration.ITEMS.register("tabby_slime_seeds",
            () -> new ItemNameBlockItem(ModBlocks.TABBY_SLIME_CROP.get(), (new Item.Properties()).tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> TABBY_SLIME_FRUIT = Registration.ITEMS.register("tabby_slime_fruit",
            () -> new Item(new Item.Properties().tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> RAD_SLIME_SEEDS = Registration.ITEMS.register("rad_slime_seeds",
            () -> new ItemNameBlockItem(ModBlocks.RAD_SLIME_CROP.get(), (new Item.Properties()).tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> RAD_SLIME_FRUIT = Registration.ITEMS.register("rad_slime_fruit",
            () -> new Item(new Item.Properties().tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> HONEY_SLIME_SEEDS = Registration.ITEMS.register("honey_slime_seeds",
            () -> new ItemNameBlockItem(ModBlocks.HONEY_SLIME_CROP.get(), (new Item.Properties()).tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> HONEY_SLIME_FRUIT = Registration.ITEMS.register("honey_slime_fruit",
            () -> new Item(new Item.Properties().tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> BOOM_SLIME_SEEDS = Registration.ITEMS.register("boom_slime_seeds",
            () -> new ItemNameBlockItem(ModBlocks.BOOM_SLIME_CROP.get(), (new Item.Properties()).tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> BOOM_SLIME_FRUIT = Registration.ITEMS.register("boom_slime_fruit",
            () -> new Item(new Item.Properties().tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> PUDDLE_SLIME_SEEDS = Registration.ITEMS.register("puddle_slime_seeds",
            () -> new ItemNameBlockItem(ModBlocks.PUDDLE_SLIME_CROP.get(), (new Item.Properties()).tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> PUDDLE_SLIME_FRUIT = Registration.ITEMS.register("puddle_slime_fruit",
            () -> new Item(new Item.Properties().tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> FIRE_SLIME_SEEDS = Registration.ITEMS.register("fire_slime_seeds",
            () -> new ItemNameBlockItem(ModBlocks.FIRE_SLIME_CROP.get(), (new Item.Properties()).tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> FIRE_SLIME_FRUIT = Registration.ITEMS.register("fire_slime_fruit",
            () -> new Item(new Item.Properties().tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> CRYSTAL_SLIME_SEEDS = Registration.ITEMS.register("crystal_slime_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CRYSTAL_SLIME_CROP.get(), (new Item.Properties()).tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> CRYSTAL_SLIME_FRUIT = Registration.ITEMS.register("crystal_slime_fruit",
            () -> new Item(new Item.Properties().tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> QUANTUM_SLIME_SEEDS = Registration.ITEMS.register("quantum_slime_seeds",
            () -> new ItemNameBlockItem(ModBlocks.QUANTUM_SLIME_CROP.get(), (new Item.Properties()).tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> QUANTUM_SLIME_FRUIT = Registration.ITEMS.register("quantum_slime_fruit",
            () -> new Item(new Item.Properties().tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> DERVISH_SLIME_SEEDS = Registration.ITEMS.register("dervish_slime_seeds",
            () -> new ItemNameBlockItem(ModBlocks.DERVISH_SLIME_CROP.get(), (new Item.Properties()).tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> DERVISH_SLIME_FRUIT = Registration.ITEMS.register("dervish_slime_fruit",
            () -> new Item(new Item.Properties().tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> HUNTER_SLIME_SEEDS = Registration.ITEMS.register("hunter_slime_seeds",
            () -> new ItemNameBlockItem(ModBlocks.HUNTER_SLIME_CROP.get(), (new Item.Properties()).tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> HUNTER_SLIME_FRUIT = Registration.ITEMS.register("hunter_slime_fruit",
            () -> new Item(new Item.Properties().tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> MOSAIC_SLIME_SEEDS = Registration.ITEMS.register("mosaic_slime_seeds",
            () -> new ItemNameBlockItem(ModBlocks.MOSAIC_SLIME_CROP.get(), (new Item.Properties()).tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> MOSAIC_SLIME_FRUIT = Registration.ITEMS.register("mosaic_slime_fruit",
            () -> new Item(new Item.Properties().tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> TANGLE_SLIME_SEEDS = Registration.ITEMS.register("tangle_slime_seeds",
            () -> new ItemNameBlockItem(ModBlocks.TANGLE_SLIME_CROP.get(), (new Item.Properties()).tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> TANGLE_SLIME_FRUIT = Registration.ITEMS.register("tangle_slime_fruit",
            () -> new Item(new Item.Properties().tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> SABER_SLIME_SEEDS = Registration.ITEMS.register("saber_slime_seeds",
            () -> new ItemNameBlockItem(ModBlocks.SABER_SLIME_CROP.get(), (new Item.Properties()).tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> SABER_SLIME_FRUIT = Registration.ITEMS.register("saber_slime_fruit",
            () -> new Item(new Item.Properties().tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> GOLD_SLIME_SEEDS = Registration.ITEMS.register("gold_slime_seeds",
            () -> new ItemNameBlockItem(ModBlocks.GOLD_SLIME_CROP.get(), (new Item.Properties()).tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> GOLD_SLIME_FRUIT = Registration.ITEMS.register("gold_slime_fruit",
            () -> new Item(new Item.Properties().tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> QUICKSILVER_SLIME_SEEDS = Registration.ITEMS.register("quicksilver_slime_seeds",
            () -> new ItemNameBlockItem(ModBlocks.QUICKSILVER_SLIME_CROP.get(), (new Item.Properties()).tab(SlimyFarming.INVENTORY_TAB)));

    public static final RegistryObject<Item> QUICKSILVER_SLIME_FRUIT = Registration.ITEMS.register("quicksilver_slime_fruit",
            () -> new Item(new Item.Properties().tab(SlimyFarming.INVENTORY_TAB)));
}
