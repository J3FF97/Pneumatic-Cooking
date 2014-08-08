package com.j3ff97.pneumaticcooking.item;

import com.j3ff97.pneumaticcooking.handler.CreativeTab;
import com.j3ff97.pneumaticcooking.reference.Names;
import com.j3ff97.pneumaticcooking.reference.Reference;
import net.minecraft.item.Item;

public class ItemBag extends Item
{
    public ItemBag()
    {
        super();
        this.setCreativeTab(CreativeTab.tabPneuPopcorn);
        this.setUnlocalizedName(Names.itemBagName);
        this.setTextureName(Reference.ID.toLowerCase() + ":itemBag");
    }
}
