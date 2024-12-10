package net.titoux.cadmiumfantasymod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.titoux.cadmiumfantasymod.CadmiumFantasyMod;
import net.titoux.cadmiumfantasymod.item.custom.MetalDetectorItem;

public class ModItems {
    public static final Item CADMIUM_INGOT = registerItem("cadmium_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_CADMIUM = registerItem("raw_cadmium", new Item(new FabricItemSettings()));

    public static final Item METAL_DETECTOR = registerItem("metal_detector",
            new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));

    public static final Item TOMATO = registerItem("tomato", new Item(new FabricItemSettings().food(ModFoodComponents.TOMATO)));

    public static final Item CADMIUM_STAFF = registerItem("cadmium_staff",
            new Item(new FabricItemSettings().maxCount(1)));

    public static final Item CADMIUM_PICKAXE = registerItem("cadmium_pickaxe",
            new PickaxeItem(ModToolMaterial.CADMIUM, 2, 2f, new FabricItemSettings()));
    public static final Item CADMIUM_AXE = registerItem("cadmium_axe",
            new AxeItem(ModToolMaterial.CADMIUM, 3, 1f, new FabricItemSettings()));
    public static final Item CADMIUM_SHOVEL = registerItem("cadmium_shovel",
            new ShovelItem(ModToolMaterial.CADMIUM, 0.5f, 1f, new FabricItemSettings()));
    public static final Item CADMIUM_SWORD = registerItem("cadmium_sword",
            new SwordItem(ModToolMaterial.CADMIUM, 5, 3f, new FabricItemSettings()));
    public static final Item CADMIUM_HOE = registerItem("cadmium_hoe",
            new HoeItem(ModToolMaterial.CADMIUM, 0, 0f, new FabricItemSettings()));

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
