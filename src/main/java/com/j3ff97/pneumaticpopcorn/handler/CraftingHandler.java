package com.j3ff97.pneumaticpopcorn.handler;

import com.j3ff97.pneumaticpopcorn.handler.config.ConfigurationHandler;
import com.j3ff97.pneumaticpopcorn.init.ModItems;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import pneumaticCraft.api.recipe.PressureChamberRecipe;

import java.util.Random;

public class CraftingHandler
{
    public static void init()
    {
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemCornKernel, ConfigurationHandler.amountOfKernelFromCorn), ModItems.itemCorn);

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemBag), "X X", " X ", 'X', Items.paper);

        GameRegistry.addShapedRecipe(new ItemStack(Blocks.hay_block), "XXX", "XXX", "XXX", 'X', ModItems.itemCorn);

        PressureChamberRecipe.chamberRecipes.add(new PressureChamberRecipe(new ItemStack[]{new ItemStack(ModItems.itemCornKernel), new ItemStack(ModItems.itemBag)}, ConfigurationHandler.requiredPressure, new ItemStack[]{new ItemStack(ModItems.itemPopCorn)}, false));
    }
}
