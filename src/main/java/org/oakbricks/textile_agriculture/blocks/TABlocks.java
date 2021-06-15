package org.oakbricks.textile_agriculture.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.oakbricks.textile_agriculture.blocks.customblocks.AvocadoPlant;

import static org.oakbricks.textile_agriculture.TextileAgriculture.MOD_ID;

public class TABlocks {
    public static final AvocadoPlant AVOCADO_PLANT = Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "avocado_plant"), new AvocadoPlant(FabricBlockSettings.of(Material.PLANT).noCollision().ticksRandomly().strength(0.0f, 0.0f).sounds(BlockSoundGroup.CROP).nonOpaque()));
}
