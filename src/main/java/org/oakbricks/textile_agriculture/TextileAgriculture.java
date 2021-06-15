package org.oakbricks.textile_agriculture;

import net.fabricmc.api.ModInitializer;
import org.oakbricks.textile_agriculture.items.TAItems;

public class TextileAgriculture implements ModInitializer {
	public static final String MOD_ID = "textile_agriculture";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

        TAItems.registerTAItems();
	}
}
