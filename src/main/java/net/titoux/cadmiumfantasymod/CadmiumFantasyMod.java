package net.titoux.cadmiumfantasymod;

import net.fabricmc.api.ModInitializer;

import net.titoux.cadmiumfantasymod.item.ModItemGroups;
import net.titoux.cadmiumfantasymod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CadmiumFantasyMod implements ModInitializer {
	public static final String MOD_ID = "cadmiumfantasymod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerModItemGroups();
		ModItems.registerModItems();
	}
}