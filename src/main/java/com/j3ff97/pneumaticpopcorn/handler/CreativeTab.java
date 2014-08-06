package com.j3ff97.pneumaticpopcorn.handler;

import com.j3ff97.pneumaticpopcorn.init.ModItems;
import com.j3ff97.pneumaticpopcorn.reference.Reference;
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
