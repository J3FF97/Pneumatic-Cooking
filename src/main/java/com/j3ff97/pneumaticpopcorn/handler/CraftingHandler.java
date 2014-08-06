package com.j3ff97.pneumaticpopcorn.handler;

import com.j3ff97.pneumaticpopcorn.handler.config.ConfigurationHandler;
import com.j3ff97.pneumaticpopcorn.init.ModItems;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import pneumaticCraft.api.recipe.PressureChamberRecipe;

import java.util.Random;

public class CraftingHandler
{
    public static void init()
    {
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemCornKernel, ConfigurationHandler.amountOfKernelFromCorn), ModItems.itemCorn);

        if(ConfigurationHandler.usePressureRecipe)
        {
            PressureChamberRecipe.chamberRecipes.add(new PressureChamberRecipe(new ItemStack[]{new ItemStack(ModItems.itemCornKernel)}, ConfigurationHandler.requiredPressure, new ItemStack[]{new ItemStack(ModItems.itemPopCorn)}, false));
        }
        else
        {
            GameRegistry.addSmelting(new ItemStack(ModItems.itemCornKernel), new ItemStack(ModItems.itemPopCorn), 0.5F);
        }
    }
}
