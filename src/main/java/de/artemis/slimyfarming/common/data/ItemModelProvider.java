package de.artemis.slimyfarming.common.data;

import de.artemis.slimyfarming.SlimyFarming;
import de.artemis.slimyfarming.common.blocks.SlimeCropBlock;
import de.artemis.slimyfarming.common.registration.ModBlocks;
import de.artemis.slimyfarming.common.registration.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemModelProvider extends net.minecraftforge.client.model.generators.ItemModelProvider {
    public ItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, SlimyFarming.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(DataProvider.getRegistryName(ModBlocks.SLIME_FABRICATOR.get().asItem()),
                new ResourceLocation(SlimyFarming.MODID, "block/slime_fabricator"));

        simpleItem(ModItems.BUZZ_WAX.get());
        simpleItem(ModItems.HEXA_COMB.get());
        simpleItem(ModItems.WILD_HONEY.get());
        simpleItem(ModItems.ROYAL_JELLY.get());
        simpleItem(ModItems.PEPPER_JAM.get());
        simpleItem(ModItems.INDIGONIUM.get());
        simpleItem(ModItems.JELLYSTONE.get());
        simpleItem(ModItems.SLIME_FOSSIL.get());
        simpleItem(ModItems.GLASS_SHARD.get());
        simpleItem(ModItems.STRANGE_DIAMOND.get());
        simpleItem(ModItems.PRIMORDY_OIL.get());
        simpleItem(ModItems.DEEP_BRINE.get());
        simpleItem(ModItems.SILKY_SAND.get());
        simpleItem(ModItems.SPIRAL_STEAM.get());
        simpleItem(ModItems.LAVA_DUST.get());
        simpleItem(ModItems.PINK_SLIME_SEEDS.get());
        simpleItem(ModItems.ROCK_SLIME_SEEDS.get());
        simpleItem(ModItems.PHOSPHOR_SLIME_SEEDS.get());
        simpleItem(ModItems.TABBY_SLIME_SEEDS.get());
        simpleItem(ModItems.RAD_SLIME_SEEDS.get());
        simpleItem(ModItems.HONEY_SLIME_SEEDS.get());
        simpleItem(ModItems.BOOM_SLIME_SEEDS.get());
        simpleItem(ModItems.PUDDLE_SLIME_SEEDS.get());
        simpleItem(ModItems.FIRE_SLIME_SEEDS.get());
        simpleItem(ModItems.CRYSTAL_SLIME_SEEDS.get());
        simpleItem(ModItems.QUANTUM_SLIME_SEEDS.get());
        simpleItem(ModItems.DERVISH_SLIME_SEEDS.get());
        simpleItem(ModItems.HUNTER_SLIME_SEEDS.get());
        simpleItem(ModItems.MOSAIC_SLIME_SEEDS.get());
        simpleItem(ModItems.TANGLE_SLIME_SEEDS.get());
        simpleItem(ModItems.SABER_SLIME_SEEDS.get());
        simpleItem(ModItems.GOLD_SLIME_SEEDS.get());
        simpleItem(ModItems.QUICKSILVER_SLIME_SEEDS.get());

        slimeFruitItem((ModItems.PINK_SLIME_FRUIT.get().asItem()),
                new ResourceLocation(SlimyFarming.MODID, "item/pink_slime_fruit"));
        slimeFruitItem((ModItems.ROCK_SLIME_FRUIT.get().asItem()),
                new ResourceLocation(SlimyFarming.MODID, "item/rock_slime_fruit"));
        slimeFruitItem((ModItems.PHOSPHOR_SLIME_FRUIT.get().asItem()),
                new ResourceLocation(SlimyFarming.MODID, "item/phosphor_slime_fruit"));
        slimeFruitItem((ModItems.TABBY_SLIME_FRUIT.get().asItem()),
                new ResourceLocation(SlimyFarming.MODID, "item/tabby_slime_fruit"));
        slimeFruitItem((ModItems.RAD_SLIME_FRUIT.get().asItem()),
                new ResourceLocation(SlimyFarming.MODID, "item/rad_slime_fruit"));
        slimeFruitItem((ModItems.HONEY_SLIME_FRUIT.get().asItem()),
                new ResourceLocation(SlimyFarming.MODID, "item/honey_slime_fruit"));
        slimeFruitItem((ModItems.BOOM_SLIME_FRUIT.get().asItem()),
                new ResourceLocation(SlimyFarming.MODID, "item/boom_slime_fruit"));
        slimeFruitItem((ModItems.PUDDLE_SLIME_FRUIT.get().asItem()),
                new ResourceLocation(SlimyFarming.MODID, "item/puddle_slime_fruit"));
        slimeFruitItem((ModItems.FIRE_SLIME_FRUIT.get().asItem()),
                new ResourceLocation(SlimyFarming.MODID, "item/fire_slime_fruit"));
        slimeFruitItem((ModItems.CRYSTAL_SLIME_FRUIT.get().asItem()),
                new ResourceLocation(SlimyFarming.MODID, "item/crystal_slime_fruit"));
        slimeFruitItem((ModItems.QUANTUM_SLIME_FRUIT.get().asItem()),
                new ResourceLocation(SlimyFarming.MODID, "item/quantum_slime_fruit"));
        slimeFruitItem((ModItems.DERVISH_SLIME_FRUIT.get().asItem()),
                new ResourceLocation(SlimyFarming.MODID, "item/dervish_slime_fruit"));
        slimeFruitItem((ModItems.HUNTER_SLIME_FRUIT.get().asItem()),
                new ResourceLocation(SlimyFarming.MODID, "item/hunter_slime_fruit"));
        slimeFruitItem((ModItems.MOSAIC_SLIME_FRUIT.get().asItem()),
                new ResourceLocation(SlimyFarming.MODID, "item/mosaic_slime_fruit"));
        slimeFruitItem((ModItems.TANGLE_SLIME_FRUIT.get().asItem()),
                new ResourceLocation(SlimyFarming.MODID, "item/tangle_slime_fruit"));
        slimeFruitItem((ModItems.SABER_SLIME_FRUIT.get().asItem()),
                new ResourceLocation(SlimyFarming.MODID, "item/saber_slime_fruit"));
        slimeFruitItem((ModItems.GOLD_SLIME_FRUIT.get().asItem()),
                new ResourceLocation(SlimyFarming.MODID, "item/gold_slime_fruit"));
        slimeFruitItem((ModItems.QUICKSILVER_SLIME_FRUIT.get().asItem()),
                new ResourceLocation(SlimyFarming.MODID, "item/quicksilver_slime_fruit"));

        withExistingParent(DataProvider.getRegistryName(ModBlocks.PINK_SLIME_BLOCK.get().asItem()),
                new ResourceLocation(SlimyFarming.MODID, "block/pink_slime_block"));
        withExistingParent(DataProvider.getRegistryName(ModBlocks.ROCK_SLIME_BLOCK.get().asItem()),
                new ResourceLocation(SlimyFarming.MODID, "block/rock_slime_block"));
        withExistingParent(DataProvider.getRegistryName(ModBlocks.PHOSPHOR_SLIME_BLOCK.get().asItem()),
                new ResourceLocation(SlimyFarming.MODID, "block/phosphor_slime_block"));
        withExistingParent(DataProvider.getRegistryName(ModBlocks.TABBY_SLIME_BLOCK.get().asItem()),
                new ResourceLocation(SlimyFarming.MODID, "block/tabby_slime_block"));
        withExistingParent(DataProvider.getRegistryName(ModBlocks.RAD_SLIME_BLOCK.get().asItem()),
                new ResourceLocation(SlimyFarming.MODID, "block/rad_slime_block"));
        withExistingParent(DataProvider.getRegistryName(ModBlocks.HONEY_SLIME_BLOCK.get().asItem()),
                new ResourceLocation(SlimyFarming.MODID, "block/honey_slime_block"));
        withExistingParent(DataProvider.getRegistryName(ModBlocks.BOOM_SLIME_BLOCK.get().asItem()),
                new ResourceLocation(SlimyFarming.MODID, "block/boom_slime_block"));
        withExistingParent(DataProvider.getRegistryName(ModBlocks.PUDDLE_SLIME_BLOCK.get().asItem()),
                new ResourceLocation(SlimyFarming.MODID, "block/puddle_slime_block"));
        withExistingParent(DataProvider.getRegistryName(ModBlocks.FIRE_SLIME_BLOCK.get().asItem()),
                new ResourceLocation(SlimyFarming.MODID, "block/fire_slime_block"));
        withExistingParent(DataProvider.getRegistryName(ModBlocks.CRYSTAL_SLIME_BLOCK.get().asItem()),
                new ResourceLocation(SlimyFarming.MODID, "block/crystal_slime_block"));
        withExistingParent(DataProvider.getRegistryName(ModBlocks.QUANTUM_SLIME_BLOCK.get().asItem()),
                new ResourceLocation(SlimyFarming.MODID, "block/quantum_slime_block"));
        withExistingParent(DataProvider.getRegistryName(ModBlocks.DERVISH_SLIME_BLOCK.get().asItem()),
                new ResourceLocation(SlimyFarming.MODID, "block/dervish_slime_block"));
        withExistingParent(DataProvider.getRegistryName(ModBlocks.HUNTER_SLIME_BLOCK.get().asItem()),
                new ResourceLocation(SlimyFarming.MODID, "block/hunter_slime_block"));
        withExistingParent(DataProvider.getRegistryName(ModBlocks.MOSAIC_SLIME_BLOCK.get().asItem()),
                new ResourceLocation(SlimyFarming.MODID, "block/mosaic_slime_block"));
        withExistingParent(DataProvider.getRegistryName(ModBlocks.TANGLE_SLIME_BLOCK.get().asItem()),
                new ResourceLocation(SlimyFarming.MODID, "block/tangle_slime_block"));
        withExistingParent(DataProvider.getRegistryName(ModBlocks.SABER_SLIME_BLOCK.get().asItem()),
                new ResourceLocation(SlimyFarming.MODID, "block/saber_slime_block"));
        withExistingParent(DataProvider.getRegistryName(ModBlocks.GOLD_SLIME_BLOCK.get().asItem()),
                new ResourceLocation(SlimyFarming.MODID, "block/gold_slime_block"));
        withExistingParent(DataProvider.getRegistryName(ModBlocks.QUICKSILVER_SLIME_BLOCK.get().asItem()),
                new ResourceLocation(SlimyFarming.MODID, "block/quicksilver_slime_block"));
    }

    public void slimeFruitItem(Item item, ResourceLocation texture) {
        withExistingParent(DataProvider.getRegistryName(item),
                new ResourceLocation(SlimyFarming.MODID, "generation/slime_fruit"))
                .renderType("translucent")
                .texture("fruit", texture);
    }

    private void simpleItem(Item item) {
        withExistingParent(DataProvider.getRegistryName(item), "item/generated").texture("layer0", new ResourceLocation(this.modid, "item/" +
                DataProvider.getRawRegistryName(item)));
    }

}
