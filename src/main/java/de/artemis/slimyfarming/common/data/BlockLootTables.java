package de.artemis.slimyfarming.common.data;

import de.artemis.slimyfarming.common.blocks.SlimeCropBlock;
import de.artemis.slimyfarming.common.blocks.SlimeFabricatorBlock;
import de.artemis.slimyfarming.common.registration.Registration;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.registries.RegistryObject;

public class BlockLootTables extends BlockLoot {

    @Override
    protected void addTables() {
        Registration.BLOCKS.getEntries().stream()
                .map(RegistryObject::get)
                .filter(block -> !(block instanceof SlimeCropBlock))
                .forEach(this::dropSelf);

        Registration.BLOCKS.getEntries().stream()
                .map(RegistryObject::get)
                .filter((block -> (block instanceof SlimeCropBlock)))
                .map(block -> (SlimeCropBlock) block)
                .forEach(block -> addCropTable(block, block.getFruit().asItem(), block.getBaseSeedId().asItem()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return Registration.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

    private void addCropTable(SlimeCropBlock crop, Item fruit, Item seed) {
        add(crop, createSlimeCropDrops(crop, fruit, seed, createCondition(crop)));

    }

    private LootItemCondition.Builder createCondition(SlimeCropBlock block) {
        return LootItemBlockStatePropertyCondition.hasBlockStateProperties(block).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SlimeCropBlock.AGE, 4));
    }

    private static LootTable.Builder createSlimeCropDrops(Block block, Item fruit, Item seed, LootItemCondition.Builder condition) {
        return applyExplosionDecay(block, LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(fruit).when(condition).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 1))))).withPool(LootPool.lootPool().when(condition).add(LootItem.lootTableItem(seed)));
    }
}
