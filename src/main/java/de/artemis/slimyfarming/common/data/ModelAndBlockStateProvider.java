package de.artemis.slimyfarming.common.data;

import de.artemis.slimyfarming.SlimyFarming;
import de.artemis.slimyfarming.common.blocks.SlimeCropBlock;
import de.artemis.slimyfarming.common.registration.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModelAndBlockStateProvider extends BlockStateProvider {
    public ModelAndBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, SlimyFarming.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        simpleBlock(ModBlocks.SLIME_FABRICATOR.get());

        slimeBlock(ModBlocks.PINK_SLIME_BLOCK.get(), new ResourceLocation(SlimyFarming.MODID, "block/pink_slime_block"));
        slimeBlock(ModBlocks.ROCK_SLIME_BLOCK.get(), new ResourceLocation(SlimyFarming.MODID, "block/rock_slime_block"));
        slimeBlock(ModBlocks.PHOSPHOR_SLIME_BLOCK.get(), new ResourceLocation(SlimyFarming.MODID, "block/phosphor_slime_block"));
        slimeBlock(ModBlocks.TABBY_SLIME_BLOCK.get(), new ResourceLocation(SlimyFarming.MODID, "block/tabby_slime_block"));
        slimeBlock(ModBlocks.RAD_SLIME_BLOCK.get(), new ResourceLocation(SlimyFarming.MODID, "block/rad_slime_block"));
        slimeBlock(ModBlocks.HONEY_SLIME_BLOCK.get(), new ResourceLocation(SlimyFarming.MODID, "block/honey_slime_block"));
        slimeBlock(ModBlocks.BOOM_SLIME_BLOCK.get(), new ResourceLocation(SlimyFarming.MODID, "block/boom_slime_block"));
        slimeBlock(ModBlocks.PUDDLE_SLIME_BLOCK.get(), new ResourceLocation(SlimyFarming.MODID, "block/puddle_slime_block"));
        slimeBlock(ModBlocks.FIRE_SLIME_BLOCK.get(), new ResourceLocation(SlimyFarming.MODID, "block/fire_slime_block"));
        slimeBlock(ModBlocks.CRYSTAL_SLIME_BLOCK.get(), new ResourceLocation(SlimyFarming.MODID, "block/crystal_slime_block"));
        slimeBlock(ModBlocks.QUANTUM_SLIME_BLOCK.get(), new ResourceLocation(SlimyFarming.MODID, "block/quantum_slime_block"));
        slimeBlock(ModBlocks.DERVISH_SLIME_BLOCK.get(), new ResourceLocation(SlimyFarming.MODID, "block/dervish_slime_block"));
        slimeBlock(ModBlocks.HUNTER_SLIME_BLOCK.get(), new ResourceLocation(SlimyFarming.MODID, "block/hunter_slime_block"));
        slimeBlock(ModBlocks.MOSAIC_SLIME_BLOCK.get(), new ResourceLocation(SlimyFarming.MODID, "block/mosaic_slime_block"));
        slimeBlock(ModBlocks.TANGLE_SLIME_BLOCK.get(), new ResourceLocation(SlimyFarming.MODID, "block/tangle_slime_block"));
        slimeBlock(ModBlocks.SABER_SLIME_BLOCK.get(), new ResourceLocation(SlimyFarming.MODID, "block/saber_slime_block"));
        slimeBlock(ModBlocks.GOLD_SLIME_BLOCK.get(), new ResourceLocation(SlimyFarming.MODID, "block/gold_slime_block"));
        slimeBlock(ModBlocks.QUICKSILVER_SLIME_BLOCK.get(), new ResourceLocation(SlimyFarming.MODID, "block/quicksilver_slime_block"));

        slimeCropBlock(ModBlocks.PINK_SLIME_CROP.get(), new ResourceLocation(SlimyFarming.MODID, "block/pink_slime_fruit"));
        slimeCropBlock(ModBlocks.ROCK_SLIME_CROP.get(), new ResourceLocation(SlimyFarming.MODID, "block/rock_slime_fruit"));
        slimeCropBlock(ModBlocks.PHOSPHOR_SLIME_CROP.get(), new ResourceLocation(SlimyFarming.MODID, "block/phosphor_slime_fruit"));
        slimeCropBlock(ModBlocks.TABBY_SLIME_CROP.get(), new ResourceLocation(SlimyFarming.MODID, "block/tabby_slime_fruit"));
        slimeCropBlock(ModBlocks.RAD_SLIME_CROP.get(), new ResourceLocation(SlimyFarming.MODID, "block/rad_slime_fruit"));
        slimeCropBlock(ModBlocks.HONEY_SLIME_CROP.get(), new ResourceLocation(SlimyFarming.MODID, "block/honey_slime_fruit"));
        slimeCropBlock(ModBlocks.BOOM_SLIME_CROP.get(), new ResourceLocation(SlimyFarming.MODID, "block/boom_slime_fruit"));
        slimeCropBlock(ModBlocks.PUDDLE_SLIME_CROP.get(), new ResourceLocation(SlimyFarming.MODID, "block/puddle_slime_fruit"));
        slimeCropBlock(ModBlocks.FIRE_SLIME_CROP.get(), new ResourceLocation(SlimyFarming.MODID, "block/fire_slime_fruit"));
        slimeCropBlock(ModBlocks.CRYSTAL_SLIME_CROP.get(), new ResourceLocation(SlimyFarming.MODID, "block/crystal_slime_fruit"));
        slimeCropBlock(ModBlocks.QUANTUM_SLIME_CROP.get(), new ResourceLocation(SlimyFarming.MODID, "block/quantum_slime_fruit"));
        slimeCropBlock(ModBlocks.DERVISH_SLIME_CROP.get(), new ResourceLocation(SlimyFarming.MODID, "block/dervish_slime_fruit"));
        slimeCropBlock(ModBlocks.HUNTER_SLIME_CROP.get(), new ResourceLocation(SlimyFarming.MODID, "block/hunter_slime_fruit"));
        slimeCropBlock(ModBlocks.MOSAIC_SLIME_CROP.get(), new ResourceLocation(SlimyFarming.MODID, "block/mosaic_slime_fruit"));
        slimeCropBlock(ModBlocks.TANGLE_SLIME_CROP.get(), new ResourceLocation(SlimyFarming.MODID, "block/tangle_slime_fruit"));
        slimeCropBlock(ModBlocks.SABER_SLIME_CROP.get(), new ResourceLocation(SlimyFarming.MODID, "block/saber_slime_fruit"));
        slimeCropBlock(ModBlocks.GOLD_SLIME_CROP.get(), new ResourceLocation(SlimyFarming.MODID, "block/gold_slime_fruit"));
        slimeCropBlock(ModBlocks.QUICKSILVER_SLIME_CROP.get(), new ResourceLocation(SlimyFarming.MODID, "block/quicksilver_slime_fruit"));
    }

    public void slimeBlock(Block block, ResourceLocation texture) {
        ModelFile slime_block = models().withExistingParent(DataProvider.getRegistryName(block.asItem()),
                        new ResourceLocation(SlimyFarming.MODID, "generation/slime_block"))
                .renderType("translucent")
                .texture("block", texture)
                .texture("particle", texture);

        slimeBlock(block, slime_block);
    }

    public void slimeBlock(Block block, ModelFile slime_block) {
        getVariantBuilder(block).forAllStates(state -> {
            ModelFile finalModel = slime_block;
            return ConfiguredModel.builder()
                    .modelFile(finalModel)
                    .build();
        });
    }

    public void slimeCropBlock(SlimeCropBlock block, ResourceLocation texture) {
        ModelFile crop_stage0 = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_stage0",
                        new ResourceLocation(SlimyFarming.MODID, "generation/slime_crop_stage0"))
                .renderType("cutout")
                .texture("cross", new ResourceLocation(SlimyFarming.MODID, "block/slime_crop_stage0"))
                .texture("particle", new ResourceLocation(SlimyFarming.MODID, "block/slime_crop_stage0"));
        ModelFile crop_stage1 = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_stage1",
                        new ResourceLocation(SlimyFarming.MODID, "generation/slime_crop_stage1"))
                .renderType("cutout")
                .texture("cross", new ResourceLocation(SlimyFarming.MODID, "block/slime_crop_stage1"))
                .texture("particle", new ResourceLocation(SlimyFarming.MODID, "block/slime_crop_stage1"));
        ModelFile crop_stage2 = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_stage2",
                        new ResourceLocation(SlimyFarming.MODID, "generation/slime_crop_stage2"))
                .renderType("translucent")
                .texture("cross", new ResourceLocation(SlimyFarming.MODID, "block/slime_crop_stage2"))
                .texture("fruit", texture)
                .texture("particle", new ResourceLocation(SlimyFarming.MODID, "block/slime_crop_stage2"));
        ModelFile crop_stage3 = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_stage3",
                        new ResourceLocation(SlimyFarming.MODID, "generation/slime_crop_stage3"))
                .renderType("translucent")
                .texture("cross", new ResourceLocation(SlimyFarming.MODID, "block/slime_crop_stage3"))
                .texture("fruit", texture)
                .texture("particle", new ResourceLocation(SlimyFarming.MODID, "block/slime_crop_stage3"));
        ModelFile crop_stage4 = models().withExistingParent(DataProvider.getRegistryName(block.asItem()) + "_stage4",
                        new ResourceLocation(SlimyFarming.MODID, "generation/slime_crop_stage4"))
                .renderType("translucent")
                .texture("cross", new ResourceLocation(SlimyFarming.MODID, "block/slime_crop_stage4"))
                .texture("fruit", texture)
                .texture("particle", new ResourceLocation(SlimyFarming.MODID, "block/slime_crop_stage4"));

        slimeCropBlock(block, crop_stage0, crop_stage1, crop_stage2, crop_stage3, crop_stage4);

    }

    public void slimeCropBlock(SlimeCropBlock block, ModelFile crop_stage0, ModelFile crop_stage1, ModelFile crop_stage2,
                               ModelFile crop_stage3, ModelFile crop_stage4) {
        getVariantBuilder(block).forAllStates(state -> {
            int type = state.getValue(SlimeCropBlock.AGE);
            ModelFile finalModel = switch (type) {
                case 0 -> crop_stage0;
                case 1 -> crop_stage1;
                case 2 -> crop_stage2;
                case 3 -> crop_stage3;
                default -> crop_stage4;
            };
            return ConfiguredModel.builder()
                    .modelFile(finalModel)
                    .build();
        });
    }
}
