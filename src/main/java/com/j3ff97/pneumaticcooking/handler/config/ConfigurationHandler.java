package com.j3ff97.pneumaticcooking.handler.config;


import com.j3ff97.pneumaticcooking.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;

    public static float   requiredPressure       = 0.5F;
    public static int     amountOfKernelFromCorn = 4;
    public static int     amountOfCornFromCrop   = 1;

    public static void init(File configFile)
    {
        // Create the configuration object from the given configuration file
        if(configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        String desc;

        desc = "How much pressure is required to make Popcorn. Default 0.5F. Max 6.0F due to Pressure Chamber restrictions";
        requiredPressure = configuration.getFloat("requiredPressure", Configuration.CATEGORY_GENERAL, requiredPressure, 0.0F, 6.0F, desc );

        desc = "How many Kernels you get from one corn cob. Default is 4.";
        amountOfKernelFromCorn = getInt("amountOfKernelFromCornName", amountOfKernelFromCorn, desc);

        desc = "How many Corn you get from the plant. Default is 1";
        amountOfCornFromCrop = getInt("amountOfCornFromCropName", amountOfCornFromCrop, desc);


        if(configuration.hasChanged())
        {
            configuration.save();
        }
    }

    public static int getInt(String propName, int default_, String desc)
    {
        Property property = configuration.get(Configuration.CATEGORY_GENERAL, propName, default_);
        property.comment = desc;
        return property.getInt(default_);
    }

    public static boolean getBool(String propName, boolean default_, String desc)
    {
        Property property = configuration.get(Configuration.CATEGORY_GENERAL, propName, default_);
        property.comment = desc;
        return property.getBoolean(default_);
    }



    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.modID.equalsIgnoreCase(Reference.ID))
        {
            loadConfiguration();
        }
    }
}
