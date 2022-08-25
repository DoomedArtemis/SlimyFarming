package de.artemis.slimyfarming.common.data;

import de.artemis.slimyfarming.SlimyFarming;
import de.artemis.slimyfarming.common.registration.ModBlocks;
import de.artemis.slimyfarming.common.registration.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.ExistingFileHelper;

public class LanguageProvider extends net.minecraftforge.common.data.LanguageProvider {
    public LanguageProvider(DataGenerator gen, String locale) {
        super(gen, SlimyFarming.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add(ModBlocks.SLIME_FABRICATOR.get(), "Slime Fabricator");

        add("text.slimefabricator.block_inventory_title", "Slime Fabricator");
        add("text.slimefabricator.player_inventory_title", "Inventory");

        add(ModItems.BUZZ_WAX.get(), "Buzz Wax");
        add(ModItems.WILD_HONEY.get(), "Wild Honey");
        add(ModItems.HEXA_COMB.get(), "Hexa Comb");
        add(ModItems.ROYAL_JELLY.get(), "Royal Jelly");
        add(ModItems.PEPPER_JAM.get(), "Pepper Jam");
        add(ModItems.INDIGONIUM.get(), "Indigonium");
        add(ModItems.JELLYSTONE.get(), "Jellystone");
        add(ModItems.SLIME_FOSSIL.get(), "Slime Fossil");
        add(ModItems.GLASS_SHARD.get(), "Glass Shard");
        add(ModItems.STRANGE_DIAMOND.get(), "Strange Diamond");
        add(ModItems.PRIMORDY_OIL.get(), "Primordy Oil");
        add(ModItems.DEEP_BRINE.get(), "Deep Brine");
        add(ModItems.SILKY_SAND.get(), "Silky Sand");
        add(ModItems.SPIRAL_STEAM.get(), "Spiral Steam");
        add(ModItems.LAVA_DUST.get(), "Lava Dust");

        add(ModItems.PINK_SLIME_FRUIT.get(), "Pink Slime Fruit");
        add(ModItems.PINK_SLIME_SEEDS.get(), "Pink Slime Seeds");
        add(ModItems.ROCK_SLIME_FRUIT.get(), "Rock Slime Fruit");
        add(ModItems.ROCK_SLIME_SEEDS.get(), "Rock Slime Seeds");
        add(ModItems.PHOSPHOR_SLIME_FRUIT.get(), "Phosphor Slime Fruit");
        add(ModItems.PHOSPHOR_SLIME_SEEDS.get(), "Phosphor Slime Seeds");
        add(ModItems.TABBY_SLIME_FRUIT.get(), "Tabby Slime Fruit");
        add(ModItems.TABBY_SLIME_SEEDS.get(), "Tabby Slime Seeds");
        add(ModItems.RAD_SLIME_FRUIT.get(), "Rad Slime Fruit");
        add(ModItems.RAD_SLIME_SEEDS.get(), "Rad Slime Seeds");
        add(ModItems.HONEY_SLIME_FRUIT.get(), "Honey Slime Fruit");
        add(ModItems.HONEY_SLIME_SEEDS.get(), "Honey Slime Seeds");
        add(ModItems.BOOM_SLIME_FRUIT.get(), "Boom Slime Fruit");
        add(ModItems.BOOM_SLIME_SEEDS.get(), "Boom Slime Seeds");
        add(ModItems.PUDDLE_SLIME_FRUIT.get(), "Puddle Slime Fruit");
        add(ModItems.PUDDLE_SLIME_SEEDS.get(), "Puddle Slime Seeds");
        add(ModItems.FIRE_SLIME_FRUIT.get(), "Fire Slime Fruit");
        add(ModItems.FIRE_SLIME_SEEDS.get(), "Fire Slime Seeds");
        add(ModItems.CRYSTAL_SLIME_FRUIT.get(), "Crystal Slime Fruit");
        add(ModItems.CRYSTAL_SLIME_SEEDS.get(), "Crystal Slime Seeds");
        add(ModItems.QUANTUM_SLIME_FRUIT.get(), "Quantum Slime Fruit");
        add(ModItems.QUANTUM_SLIME_SEEDS.get(), "Quantum Slime Seeds");
        add(ModItems.DERVISH_SLIME_FRUIT.get(), "Dervish Slime Fruit");
        add(ModItems.DERVISH_SLIME_SEEDS.get(), "Dervish Slime Seeds");
        add(ModItems.HUNTER_SLIME_FRUIT.get(), "Hunter Slime Fruit");
        add(ModItems.HUNTER_SLIME_SEEDS.get(), "Hunter Slime Seeds");
        add(ModItems.MOSAIC_SLIME_FRUIT.get(), "Mosaic Slime Fruit");
        add(ModItems.MOSAIC_SLIME_SEEDS.get(), "Mosaic Slime Seeds");
        add(ModItems.TANGLE_SLIME_FRUIT.get(), "Tangle Slime Fruit");
        add(ModItems.TANGLE_SLIME_SEEDS.get(), "Tangle Slime Seeds");
        add(ModItems.SABER_SLIME_FRUIT.get(), "Saber Slime Fruit");
        add(ModItems.SABER_SLIME_SEEDS.get(), "Saber Slime Seeds");
        add(ModItems.GOLD_SLIME_FRUIT.get(), "Gold Slime Fruit");
        add(ModItems.GOLD_SLIME_SEEDS.get(), "Gold Slime Seeds");
        add(ModItems.QUICKSILVER_SLIME_FRUIT.get(), "Quicksilver Slime Fruit");
        add(ModItems.QUICKSILVER_SLIME_SEEDS.get(), "Quicksilver Slime Seeds");

        add(ModBlocks.PINK_SLIME_BLOCK.get(), "Pink Slime Block");
        add(ModBlocks.ROCK_SLIME_BLOCK.get(), "Rock Slime Block");
        add(ModBlocks.PHOSPHOR_SLIME_BLOCK.get(), "Phosphor Slime Block");
        add(ModBlocks.TABBY_SLIME_BLOCK.get(), "Tabby Slime Block");
        add(ModBlocks.RAD_SLIME_BLOCK.get(), "Rad Slime Block");
        add(ModBlocks.HONEY_SLIME_BLOCK.get(), "Honey Slime Block");
        add(ModBlocks.BOOM_SLIME_BLOCK.get(), "Boom Slime Block");
        add(ModBlocks.PUDDLE_SLIME_BLOCK.get(), "Puddle Slime Block");
        add(ModBlocks.FIRE_SLIME_BLOCK.get(), "Fire Slime Block");
        add(ModBlocks.CRYSTAL_SLIME_BLOCK.get(), "Crystal Slime Block");
        add(ModBlocks.QUANTUM_SLIME_BLOCK.get(), "Quantum Slime Block");
        add(ModBlocks.DERVISH_SLIME_BLOCK.get(), "Dervish Slime Block");
        add(ModBlocks.HUNTER_SLIME_BLOCK.get(), "Hunter Slime Block");
        add(ModBlocks.MOSAIC_SLIME_BLOCK.get(), "Mosaic Slime Block");
        add(ModBlocks.TANGLE_SLIME_BLOCK.get(), "Tangle Slime Block");
        add(ModBlocks.SABER_SLIME_BLOCK.get(), "Saber Slime Block");
        add(ModBlocks.GOLD_SLIME_BLOCK.get(), "Gold Slime Block");
        add(ModBlocks.QUICKSILVER_SLIME_BLOCK.get(), "Quicksilver Slime Block");

        add("itemGroup.slimyfarming", "Slimy Farming");
    }
}
