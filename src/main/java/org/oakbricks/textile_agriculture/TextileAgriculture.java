package org.oakbricks.textile_agriculture;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.oakbricks.textile_agriculture.blocks.TABlocks;
import org.oakbricks.textile_agriculture.items.TAItems;

public class TextileAgriculture implements ModInitializer {
	public static final String MOD_ID = "textile_agriculture";

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
			new Identifier(MOD_ID, "item_group"),
			() -> new ItemStack(TAItems.WHOLE_AVOCADO)
	);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		TABlocks.registerBlocks();
        TAItems.registerTAItems();
	}
}
