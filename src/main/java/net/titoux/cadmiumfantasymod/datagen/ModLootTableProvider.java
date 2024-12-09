package net.titoux.cadmiumfantasymod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.titoux.cadmiumfantasymod.block.ModBlocks;
import net.titoux.cadmiumfantasymod.item.ModItems;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.CADMIUM_BLOCK);
        addDrop(ModBlocks.SOUND_BLOCK);

        addDrop(ModBlocks.CADMIUM_ORE, copperLikeOreDrops(ModBlocks.CADMIUM_ORE, ModItems.RAW_CADMIUM));
        addDrop(ModBlocks.DEEPSLATE_CADMIUM_ORE, copperLikeOreDrops(ModBlocks.DEEPSLATE_CADMIUM_ORE, ModItems.RAW_CADMIUM));
        addDrop(ModBlocks.NETHER_CADMIUM_ORE, copperLikeOreDrops(ModBlocks.NETHER_CADMIUM_ORE, ModItems.RAW_CADMIUM));
        addDrop(ModBlocks.END_CADMIUM_ORE, copperLikeOreDrops(ModBlocks.END_CADMIUM_ORE, ModItems.RAW_CADMIUM));
    }

    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder) this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(2.0F, 5.0F))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}
