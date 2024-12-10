package net.titoux.cadmiumfantasymod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.titoux.cadmiumfantasymod.CadmiumFantasyMod;
import net.titoux.cadmiumfantasymod.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup CADMIUM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CadmiumFantasyMod.MOD_ID, "cadmium"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.cadmium"))
                    .icon(() -> new ItemStack(ModItems.CADMIUM_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.CADMIUM_INGOT);
                        entries.add(ModItems.RAW_CADMIUM);

                        entries.add(ModItems.METAL_DETECTOR);

                        entries.add(ModItems.TOMATO);

                        entries.add(ModItems.CADMIUM_STAFF);

                        entries.add(ModItems.CADMIUM_PICKAXE);
                        entries.add(ModItems.CADMIUM_AXE);
                        entries.add(ModItems.CADMIUM_SHOVEL);
                        entries.add(ModItems.CADMIUM_SWORD);
                        entries.add(ModItems.CADMIUM_HOE);

                        entries.add(ModBlocks.SOUND_BLOCK);

                        entries.add(ModBlocks.CADMIUM_BLOCK);
                        entries.add(ModBlocks.CADMIUM_ORE);

                        entries.add(ModBlocks.DEEPSLATE_CADMIUM_ORE);
                        entries.add(ModBlocks.NETHER_CADMIUM_ORE);
                        entries.add(ModBlocks.END_CADMIUM_ORE);

                        entries.add(ModBlocks.CADMIUM_STAIRS);
                        entries.add(ModBlocks.CADMIUM_SLAB);
                        entries.add(ModBlocks.CADMIUM_WALL);
                        entries.add(ModBlocks.CADMIUM_FENCE);
                        entries.add(ModBlocks.CADMIUM_FENCE_GATE);
                        entries.add(ModBlocks.CADMIUM_BUTTON);
                        entries.add(ModBlocks.CADMIUM_PRESSURE_PLATE);
                        entries.add(ModBlocks.CADMIUM_DOOR);
                        entries.add(ModBlocks.CADMIUM_TRAPDOOR);

                    }).build());

    public static void registerModItemGroups() {
        CadmiumFantasyMod.LOGGER.info("Registering Mod Item Groups for " + CadmiumFantasyMod.MOD_ID);
    }
}
