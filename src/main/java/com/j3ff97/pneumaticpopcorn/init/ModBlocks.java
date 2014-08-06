package com.j3ff97.pneumaticpopcorn.init;

import com.j3ff97.pneumaticpopcorn.block.CropCorn;
import com.j3ff97.pneumaticpopcorn.block.ModBlockCrop;
import com.j3ff97.pneumaticpopcorn.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static ModBlockCrop cropCorn;

    public static void init()
    {
        cropCorn = new CropCorn();

        GameRegistry.registerBlock(cropCorn, Names.cropCornName);
    }
}
