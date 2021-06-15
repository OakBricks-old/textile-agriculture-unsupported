package org.oakbricks.textile_agriculture;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.render.RenderLayer;
import org.oakbricks.textile_agriculture.blocks.TABlocks;

public class TextileAgricultureClient implements ClientModInitializer {

    /**
     * Runs the mod initializer on the client environment.
     */
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(TABlocks.AVOCADO_PLANT, RenderLayer.getCutout());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) ->
                view != null && pos != null
                    ? BiomeColors.getFoliageColor(view, pos)
                    : FoliageColors.getDefaultColor(), TABlocks.AVOCADO_PLANT);
    }
}
