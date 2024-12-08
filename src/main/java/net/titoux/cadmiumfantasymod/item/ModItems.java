package net.titoux.cadmiumfantasymod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.titoux.cadmiumfantasymod.CadmiumFantasyMod;

public class ModItems {
    public static  final Item CADMIUM_INGOT = registerItem("cadmium_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_CADMIUM = registerItem("raw_cadmium", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(CADMIUM_INGOT);
        entries.add(RAW_CADMIUM);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CadmiumFantasyMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CadmiumFantasyMod.LOGGER.info("Registering Mod Items for " + CadmiumFantasyMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}