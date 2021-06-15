package org.oakbricks.textile_agriculture.blocks.customblocks;

import net.minecraft.block.Block;
import net.minecraft.block.CropBlock;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class AvocadoPlantOld extends CropBlock {

    public AvocadoPlantOld(Block.Settings builder) {
        super(builder);
    }

    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        tooltip.add((new TranslatableText("block.ta.rye_plant").formatted(Formatting.GREEN)));
    }

}
