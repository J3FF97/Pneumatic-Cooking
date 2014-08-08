package com.j3ff97.pneumaticcooking.item;

import com.j3ff97.pneumaticcooking.handler.CreativeTab;
import com.j3ff97.pneumaticcooking.reference.Names;
import com.j3ff97.pneumaticcooking.reference.Reference;
import net.minecraft.item.ItemFood;

public class ItemCorn extends ItemFood
{
    public ItemCorn(int hunger, float saturation, boolean isWolfFood)
    {
        super(hunger, saturation, isWolfFood);
        this.setUnlocalizedName(Names.itemCornName);
        this.setCreativeTab(CreativeTab.tabPneuPopcorn);
        this.setTextureName(Reference.ID.toLowerCase() + ":cornCob");
    }
}
