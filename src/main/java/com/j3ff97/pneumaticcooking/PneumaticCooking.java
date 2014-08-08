package com.j3ff97.pneumaticcooking;

import com.j3ff97.pneumaticcooking.handler.CraftingHandler;
import com.j3ff97.pneumaticcooking.handler.config.ConfigurationHandler;
import com.j3ff97.pneumaticcooking.init.ModBlocks;
import com.j3ff97.pneumaticcooking.init.ModItems;
import com.j3ff97.pneumaticcooking.proxy.IProxy;
import com.j3ff97.pneumaticcooking.reference.Reference;
import com.j3ff97.pneumaticcooking.util.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = Reference.ID, name = Reference.NAME, version = Reference.VERSION, guiFactory = Reference.GUIFACTORY ,dependencies =  "required-after:PneumaticCraft")
public class PneumaticCooking
{
    @Mod.Instance(Reference.ID)
    public static PneumaticCooking instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModBlocks.init();
        ModItems.init();

        MinecraftForge.addGrassSeed(new ItemStack(ModItems.itemCornKernel), 8);

        LogHelper.info("Pneumatic Cooking: Successful PreInit");
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event)
    {
        CraftingHandler.init();

        LogHelper.info("Pneumatic Cooking: Successful Init");
    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event)
    {


        LogHelper.info("Pneumatic Cooking: Successful PostInit");
    }

}
