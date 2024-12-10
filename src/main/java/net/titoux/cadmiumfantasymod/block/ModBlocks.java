package net.titoux.cadmiumfantasymod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.titoux.cadmiumfantasymod.CadmiumFantasyMod;
import net.titoux.cadmiumfantasymod.block.custom.SoundBlock;

public class ModBlocks {
    public static final Block CADMIUM_BLOCK = registerBlock("cadmium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block CADMIUM_ORE = registerBlock("cadmium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE).strength(2f)));

    public static final Block DEEPSLATE_CADMIUM_ORE = registerBlock("deepslate_cadmium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(2f), UniformIntProvider.create(2, 5)));
    public static final Block NETHER_CADMIUM_ORE = registerBlock("nether_cadmium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.NETHER_GOLD_ORE).strength(1.5f), UniformIntProvider.create(2, 5)));
    public static final Block END_CADMIUM_ORE = registerBlock("end_cadmium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(2f), UniformIntProvider.create(2, 5)));

    public static final Block SOUND_BLOCK = registerBlock("sound_block",
            new SoundBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block CADMIUM_STAIRS = registerBlock("cadmium_stairs",
            new StairsBlock(ModBlocks.CADMIUM_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block CADMIUM_SLAB = registerBlock("cadmium_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block CADMIUM_BUTTON = registerBlock("cadmium_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block CADMIUM_PRESSURE_PLATE = registerBlock("cadmium_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), BlockSetType.IRON));

    public static final Block CADMIUM_FENCE = registerBlock("cadmium_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block CADMIUM_FENCE_GATE = registerBlock("cadmium_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), WoodType.ACACIA));
    public static final Block CADMIUM_WALL = registerBlock("cadmium_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block CADMIUM_DOOR = registerBlock("cadmium_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque(), BlockSetType.IRON));
    public static final Block CADMIUM_TRAPDOOR = registerBlock("cadmium_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque(), BlockSetType.IRON));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(CadmiumFantasyMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(CadmiumFantasyMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        CadmiumFantasyMod.LOGGER.info("Registering Mod Blocks for " + CadmiumFantasyMod.MOD_ID);
    }
}
