package com.j3ff97.pneumaticpopcorn.item;

import com.j3ff97.pneumaticpopcorn.handler.CreativeTab;
import com.j3ff97.pneumaticpopcorn.reference.Names;
import com.j3ff97.pneumaticpopcorn.reference.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemFood;

public class ItemPopCorn extends ItemFood
{
    public ItemPopCorn(int hunger, float saturation, boolean isWolfFood)
    {
        super(hunger, saturation, isWolfFood);
        this.setUnlocalizedName(Names.itemPopCornName);
        this.setCreativeTab(CreativeTab.tabPneuPopcorn);

    }


    public void registerIcons(IIconRegister icon)
    {
        itemIcon = icon.registerIcon(Reference.ID.toLowerCase() + ":" + this.getUnlocalizedName());
    }
}
