package net.titoux.cadmiumfantasymod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.titoux.cadmiumfantasymod.block.ModBlocks;
import net.titoux.cadmiumfantasymod.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> CADMIUM_SMELTABLES = List.of(ModItems.RAW_CADMIUM,
            ModBlocks.CADMIUM_ORE, ModBlocks.DEEPSLATE_CADMIUM_ORE, ModBlocks.NETHER_CADMIUM_ORE, ModBlocks.END_CADMIUM_ORE);


    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, CADMIUM_SMELTABLES, RecipeCategory.MISC, ModItems.CADMIUM_INGOT,
                0.7F, 200, "cadmium_ingot");
        offerBlasting(exporter, CADMIUM_SMELTABLES, RecipeCategory.MISC, ModItems.CADMIUM_INGOT,
                0.7F, 100, "cadmium_ingot");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.CADMIUM_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.CADMIUM_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_CADMIUM, 1)
                .pattern("SSS")
                .pattern("SRS")
                .pattern("SSS")
                .input('S', Items.STONE)
                .input('R', ModItems.CADMIUM_INGOT)
                .criterion(hasItem(Items.STONE), conditionsFromItem(Items.STONE))
                .criterion(hasItem(ModItems.CADMIUM_INGOT), conditionsFromItem(ModItems.CADMIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RAW_CADMIUM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CADMIUM_PICKAXE, 1)
                .pattern("CCC")
                .pattern(" S ")
                .pattern(" S ")
                .input('C', ModItems.CADMIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.CADMIUM_INGOT), conditionsFromItem(ModItems.CADMIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CADMIUM_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CADMIUM_SWORD, 1)
                .pattern(" C ")
                .pattern(" C ")
                .pattern(" S ")
                .input('C', ModItems.CADMIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.CADMIUM_INGOT), conditionsFromItem(ModItems.CADMIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CADMIUM_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CADMIUM_AXE, 1)
                .pattern("CC ")
                .pattern("CS ")
                .pattern(" S ")
                .input('C', ModItems.CADMIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.CADMIUM_INGOT), conditionsFromItem(ModItems.CADMIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CADMIUM_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CADMIUM_SHOVEL, 1)
                .pattern(" C ")
                .pattern(" S ")
                .pattern(" S ")
                .input('C', ModItems.CADMIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.CADMIUM_INGOT), conditionsFromItem(ModItems.CADMIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CADMIUM_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CADMIUM_HOE, 1)
                .pattern("CC ")
                .pattern(" S ")
                .pattern(" S ")
                .input('C', ModItems.CADMIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.CADMIUM_INGOT), conditionsFromItem(ModItems.CADMIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CADMIUM_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.METAL_DETECTOR, 1)
                .pattern(" I ")
                .pattern("RIR")
                .pattern(" S ")
                .input('I', ModItems.CADMIUM_INGOT)
                .input('R', Items.REDSTONE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.CADMIUM_INGOT), conditionsFromItem(ModItems.CADMIUM_INGOT))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.METAL_DETECTOR)));
    }
}
