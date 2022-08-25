package de.artemis.slimyfarming;

import com.mojang.logging.LogUtils;
import de.artemis.slimyfarming.common.registration.ModBlocks;
import de.artemis.slimyfarming.common.registration.ModItems;
import de.artemis.slimyfarming.common.registration.Registration;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.Collections;

@Mod(SlimyFarming.MODID)
public class SlimyFarming {

    public static final String MODID = "slimyfarming";
    private static final Logger LOGGER = LogUtils.getLogger();

    public static final CreativeModeTab INVENTORY_TAB = new CreativeModeTab(MODID) {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(Blocks.HONEY_BLOCK);
        }

        @Override
        public void fillItemList(@NotNull NonNullList<ItemStack> items) {
            ArrayList<Item> blockList = new ArrayList<>();

            int run = 0;

            Collections.addAll(blockList, ModBlocks.SLIME_FABRICATOR.get().asItem(), ModItems.HEXA_COMB.get(), ModItems.BUZZ_WAX.get(), ModItems.WILD_HONEY.get(), ModItems.ROYAL_JELLY.get(),
                    ModItems.PEPPER_JAM.get(), ModItems.INDIGONIUM.get(), ModItems.JELLYSTONE.get(), ModItems.SLIME_FOSSIL.get(),
                    ModItems.GLASS_SHARD.get(), ModItems.STRANGE_DIAMOND.get(), ModItems.PRIMORDY_OIL.get(), ModItems.DEEP_BRINE.get(),
                    ModItems.SILKY_SAND.get(), ModItems.SPIRAL_STEAM.get(), ModItems.LAVA_DUST.get(), ModBlocks.PINK_SLIME_BLOCK.get().asItem(),
                    ModItems.PINK_SLIME_FRUIT.get(), ModItems.PINK_SLIME_SEEDS.get(), ModBlocks.ROCK_SLIME_BLOCK.get().asItem(),
                    ModItems.ROCK_SLIME_FRUIT.get(), ModItems.ROCK_SLIME_SEEDS.get(), ModBlocks.PHOSPHOR_SLIME_BLOCK.get().asItem(),
                    ModItems.PHOSPHOR_SLIME_FRUIT.get(), ModItems.PHOSPHOR_SLIME_SEEDS.get(), ModBlocks.TABBY_SLIME_BLOCK.get().asItem(),
                    ModItems.TABBY_SLIME_FRUIT.get(), ModItems.TABBY_SLIME_SEEDS.get(), ModBlocks.RAD_SLIME_BLOCK.get().asItem(),
                    ModItems.RAD_SLIME_FRUIT.get(), ModItems.RAD_SLIME_SEEDS.get(), ModBlocks.HONEY_SLIME_BLOCK.get().asItem(),
                    ModItems.HONEY_SLIME_FRUIT.get(), ModItems.HONEY_SLIME_SEEDS.get(), ModBlocks.BOOM_SLIME_BLOCK.get().asItem(),
                    ModItems.BOOM_SLIME_FRUIT.get(), ModItems.BOOM_SLIME_SEEDS.get(), ModBlocks.PUDDLE_SLIME_BLOCK.get().asItem(),
                    ModItems.PUDDLE_SLIME_FRUIT.get(), ModItems.PUDDLE_SLIME_SEEDS.get(), ModBlocks.FIRE_SLIME_BLOCK.get().asItem(),
                    ModItems.FIRE_SLIME_FRUIT.get(), ModItems.FIRE_SLIME_SEEDS.get(), ModBlocks.CRYSTAL_SLIME_BLOCK.get().asItem(),
                    ModItems.CRYSTAL_SLIME_FRUIT.get(), ModItems.CRYSTAL_SLIME_SEEDS.get(), ModBlocks.QUANTUM_SLIME_BLOCK.get().asItem(),
                    ModItems.QUANTUM_SLIME_FRUIT.get(), ModItems.QUANTUM_SLIME_SEEDS.get(), ModBlocks.DERVISH_SLIME_BLOCK.get().asItem(),
                    ModItems.DERVISH_SLIME_FRUIT.get(), ModItems.DERVISH_SLIME_SEEDS.get(), ModBlocks.HUNTER_SLIME_BLOCK.get().asItem(),
                    ModItems.HUNTER_SLIME_FRUIT.get(), ModItems.HUNTER_SLIME_SEEDS.get(), ModBlocks.MOSAIC_SLIME_BLOCK.get().asItem(),
                    ModItems.MOSAIC_SLIME_FRUIT.get(), ModItems.MOSAIC_SLIME_SEEDS.get(), ModBlocks.TANGLE_SLIME_BLOCK.get().asItem(),
                    ModItems.TANGLE_SLIME_FRUIT.get(), ModItems.TANGLE_SLIME_SEEDS.get(), ModBlocks.SABER_SLIME_BLOCK.get().asItem(),
                    ModItems.SABER_SLIME_FRUIT.get(), ModItems.SABER_SLIME_SEEDS.get(), ModBlocks.GOLD_SLIME_BLOCK.get().asItem(),
                    ModItems.GOLD_SLIME_FRUIT.get(), ModItems.GOLD_SLIME_SEEDS.get(), ModBlocks.QUICKSILVER_SLIME_BLOCK.get().asItem(),
                    ModItems.QUICKSILVER_SLIME_FRUIT.get(), ModItems.QUICKSILVER_SLIME_SEEDS.get());

            for (Item x : blockList) {
                items.add(run, new ItemStack(x));
                run++;
            }
        }
    };

    public SlimyFarming() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        Registration.register();
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }
}
