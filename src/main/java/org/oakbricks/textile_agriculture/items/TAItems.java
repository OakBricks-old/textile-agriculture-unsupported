package org.oakbricks.textile_agriculture.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.oakbricks.textile_agriculture.TextileAgriculture;
import org.oakbricks.textile_agriculture.blocks.TABlocks;
import org.oakbricks.textile_agriculture.items.customitems.AvocadoSeed;

public class TAItems {

    public static final Item SLICED_AVOCADO_PITTED = new Item(new FabricItemSettings().group(ItemGroup.MISC).food(new FoodComponent.Builder().hunger(5).saturationModifier(7).build()));
    public static final Item SLICED_AVOCADO = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item WHOLE_AVOCADO = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item AVOCADO_PIT = new AliasedBlockItem(TABlocks.AVOCADO_PLANT_TALL, new FabricItemSettings().group(TextileAgriculture.ITEM_GROUP));
    //public static final AvocadoSeed AVOCADO_PIT = Registry.register(Registry.ITEM, new Identifier(TextileAgriculture.MOD_ID, "avocado_pit"), new AvocadoSeed(TABlocks.AVOCADO_PLANT, (new Item.Settings().group(ItemGroup.MISC))));


    public static void registerTAItems() {
        Registry.register(Registry.ITEM, new Identifier(TextileAgriculture.MOD_ID, "sliced_avocado"), SLICED_AVOCADO);
        Registry.register(Registry.ITEM, new Identifier(TextileAgriculture.MOD_ID, "whole_avocado"), WHOLE_AVOCADO);
        Registry.register(Registry.ITEM, new Identifier(TextileAgriculture.MOD_ID, "pitted_sliced_avocado"), SLICED_AVOCADO_PITTED);
        //public static final AvocadoSeed AVOCADO_PIT = Registry.register(Registry.ITEM, new Identifier(TextileAgriculture.MOD_ID, 'avocado_pit'), new AvocadoSeed(TABlocks.AVOCADO_PLANT, (new Item.Settings().group(ItemGroup.MISC))));
        Registry.register(Registry.ITEM, new Identifier(TextileAgriculture.MOD_ID, "pitted_sliced_avocado"), SLICED_AVOCADO_PITTED);
        Registry.register(Registry.ITEM, new Identifier(TextileAgriculture.MOD_ID, "avocado_seed"), AVOCADO_PIT);
    }
}
