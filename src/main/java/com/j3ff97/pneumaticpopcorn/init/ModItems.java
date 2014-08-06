package com.j3ff97.pneumaticpopcorn.init;

import com.j3ff97.pneumaticpopcorn.item.ItemCorn;
import com.j3ff97.pneumaticpopcorn.item.ItemCornKernel;
import com.j3ff97.pneumaticpopcorn.item.ItemPopCorn;
import com.j3ff97.pneumaticpopcorn.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;

public class ModItems
{
    public static ItemSeeds itemCornKernel;
    public static ItemFood  itemCorn;
    public static ItemFood  itemPopCorn;

    public static void init()
    {
        itemCornKernel = new ItemCornKernel(ModBlocks.cropCorn, Blocks.farmland);
        itemCorn = new ItemCorn(2, 10F, false);
        itemPopCorn = new ItemPopCorn(4, 5F, false);

        GameRegistry.registerItem(itemCornKernel, Names.itemCornKernelName);
        GameRegistry.registerItem(itemCorn, Names.itemCornName);
        GameRegistry.registerItem(itemPopCorn, Names.itemPopCornName);

    }
}
