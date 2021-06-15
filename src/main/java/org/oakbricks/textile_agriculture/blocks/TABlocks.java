package org.oakbricks.textile_agriculture.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.oakbricks.textile_agriculture.blocks.customblocks.AvocadoPlantOld;
import org.oakbricks.textile_agriculture.blocks.customblocks.CustomTallGrassBlock;

import static org.oakbricks.textile_agriculture.TextileAgriculture.MOD_ID;

public class TABlocks {
    public static final AvocadoPlantOld RYE_PLANT = Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "avocado_plant"), new AvocadoPlantOld(FabricBlockSettings.of(Material.PLANT).noCollision().ticksRandomly().strength(0.0f, 0.0f).sounds(BlockSoundGroup.CROP).nonOpaque()));
    public static final Block AVOCADO_PLANT = new CustomTallGrassBlock(28, FabricBlockSettings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
    //public static final Block TOMATO_PLANT = new CustomTallGrassBlock(64, FabricBlockSettings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "avocado_plant"), AVOCADO_PLANT);
//        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "tomato_plant"), TOMATO_PLANT);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "rye_plant"), RYE_PLANT);
    }
}

