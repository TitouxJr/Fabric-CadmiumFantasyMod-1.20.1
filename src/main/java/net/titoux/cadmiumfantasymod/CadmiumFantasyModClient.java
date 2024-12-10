package net.titoux.cadmiumfantasymod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.titoux.cadmiumfantasymod.block.ModBlocks;

public class CadmiumFantasyModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CADMIUM_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CADMIUM_TRAPDOOR, RenderLayer.getCutout());

    }
}
