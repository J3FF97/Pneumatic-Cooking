package com.j3ff97.pneumaticcooking.handler;

import com.j3ff97.pneumaticcooking.init.ModItems;
import com.j3ff97.pneumaticcooking.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTab
{
    public static CreativeTabs tabPneuPopcorn = new CreativeTabs(Reference.ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.itemPopCorn;
        }
    };
}
