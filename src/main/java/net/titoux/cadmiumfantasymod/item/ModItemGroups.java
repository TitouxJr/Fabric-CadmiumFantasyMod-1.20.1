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

                        entries.add(ModBlocks.SOUND_BLOCK);

                        entries.add(ModBlocks.CADMIUM_BLOCK);
                        entries.add(ModBlocks.CADMIUM_ORE);

                        entries.add(ModBlocks.DEEPSLATE_CADMIUM_ORE);
                        entries.add(ModBlocks.NETHER_CADMIUM_ORE);
                        entries.add(ModBlocks.END_CADMIUM_ORE);

                    }).build());

    public static void registerModItemGroups() {
        CadmiumFantasyMod.LOGGER.info("Registering Mod Item Groups for " + CadmiumFantasyMod.MOD_ID);
    }
}
