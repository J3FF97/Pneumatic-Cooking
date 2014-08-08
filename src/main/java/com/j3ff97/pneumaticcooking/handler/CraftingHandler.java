package com.j3ff97.pneumaticcooking.handler;

import com.j3ff97.pneumaticcooking.handler.config.ConfigurationHandler;
import com.j3ff97.pneumaticcooking.init.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import pneumaticCraft.api.recipe.PressureChamberRecipe;

public class CraftingHandler
{
    public static void init()
    {
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemCornKernel, ConfigurationHandler.amountOfKernelFromCorn), ModItems.itemCorn);

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemBag, 3), "X X", " X ", 'X', Items.paper);

        GameRegistry.addShapedRecipe(new ItemStack(Blocks.hay_block), "XXX", "XXX", "XXX", 'X', ModItems.itemCorn);

        PressureChamberRecipe.chamberRecipes.add(new PressureChamberRecipe(new ItemStack[]{new ItemStack(ModItems.itemCornKernel), new ItemStack(ModItems.itemBag, 3)}, ConfigurationHandler.requiredPressure, new ItemStack[]{new ItemStack(ModItems.itemPopCorn, 3)}, false));
    }
}
