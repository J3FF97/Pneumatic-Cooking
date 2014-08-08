package com.j3ff97.pneumaticcooking.init;

import com.j3ff97.pneumaticcooking.item.ItemBag;
import com.j3ff97.pneumaticcooking.item.ItemCorn;
import com.j3ff97.pneumaticcooking.item.ItemCornKernel;
import com.j3ff97.pneumaticcooking.item.ItemPopCorn;
import com.j3ff97.pneumaticcooking.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;

public class ModItems
{
    public static ItemSeeds itemCornKernel;
    public static ItemFood  itemCorn;
    public static ItemFood  itemPopCorn;
    public static Item      itemBag;

    public static void init()
    {
        itemCornKernel = new ItemCornKernel(ModBlocks.cropCorn, Blocks.farmland);
        itemCorn = new ItemCorn(2, 10F, false);
        itemPopCorn = new ItemPopCorn(4, 5F, false);
        itemBag = new ItemBag();

        GameRegistry.registerItem(itemCornKernel, Names.itemCornKernelName);
        GameRegistry.registerItem(itemCorn, Names.itemCornName);
        GameRegistry.registerItem(itemPopCorn, Names.itemPopCornName);
        GameRegistry.registerItem(itemBag, Names.itemBagName);

    }
}
