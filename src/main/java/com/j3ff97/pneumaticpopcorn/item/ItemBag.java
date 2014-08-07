package com.j3ff97.pneumaticpopcorn.item;

import com.j3ff97.pneumaticpopcorn.handler.CreativeTab;
import com.j3ff97.pneumaticpopcorn.reference.Names;
import com.j3ff97.pneumaticpopcorn.reference.Reference;
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
