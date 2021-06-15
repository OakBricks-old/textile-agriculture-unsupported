package org.oakbricks.textile_agriculture.items.customitems;

import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class AvocadoSeed extends BlockItem {

    public AvocadoSeed(Block crop, Settings builder) {
        super(crop, builder);
    }

    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        tooltip.add((new TranslatableText("item.ta.avocado_seed").formatted(Formatting.GREEN)));
    }

}
