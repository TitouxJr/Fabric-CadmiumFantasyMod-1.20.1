package net.titoux.cadmiumfantasymod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.titoux.cadmiumfantasymod.block.ModBlocks;
import net.titoux.cadmiumfantasymod.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool cadmiumPool = blockStateModelGenerator.registerCubeAllModelTexturePool((ModBlocks.CADMIUM_BLOCK));
        blockStateModelGenerator.registerSimpleCubeAll((ModBlocks.CADMIUM_ORE));
        blockStateModelGenerator.registerSimpleCubeAll((ModBlocks.DEEPSLATE_CADMIUM_ORE));
        blockStateModelGenerator.registerSimpleCubeAll((ModBlocks.NETHER_CADMIUM_ORE));
        blockStateModelGenerator.registerSimpleCubeAll((ModBlocks.END_CADMIUM_ORE));
        blockStateModelGenerator.registerSimpleCubeAll((ModBlocks.SOUND_BLOCK));

        cadmiumPool.stairs((ModBlocks.CADMIUM_STAIRS));
        cadmiumPool.slab((ModBlocks.CADMIUM_SLAB));
        cadmiumPool.wall((ModBlocks.CADMIUM_WALL));
        cadmiumPool.fence((ModBlocks.CADMIUM_FENCE));
        cadmiumPool.fenceGate((ModBlocks.CADMIUM_FENCE_GATE));
        cadmiumPool.button((ModBlocks.CADMIUM_BUTTON));
        cadmiumPool.pressurePlate((ModBlocks.CADMIUM_PRESSURE_PLATE));

        blockStateModelGenerator.registerDoor(ModBlocks.CADMIUM_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.CADMIUM_TRAPDOOR);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.CADMIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_CADMIUM, Models.GENERATED);

        itemModelGenerator.register(ModItems.METAL_DETECTOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOMATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.CADMIUM_STAFF, Models.GENERATED);
    }
}
