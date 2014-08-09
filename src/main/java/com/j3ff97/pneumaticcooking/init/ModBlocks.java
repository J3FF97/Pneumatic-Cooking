package com.j3ff97.pneumaticcooking.init;

import com.j3ff97.pneumaticcooking.block.CropCorn;
import com.j3ff97.pneumaticcooking.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockCrops;

public class ModBlocks
{
    public static BlockCrops cropCorn;

    public static void init()
    {
        cropCorn = new CropCorn();

        GameRegistry.registerBlock(cropCorn, Names.cropCornName);
    }
}
