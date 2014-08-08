package com.j3ff97.pneumaticcooking.item;

import com.j3ff97.pneumaticcooking.handler.CreativeTab;
import com.j3ff97.pneumaticcooking.reference.Names;
import com.j3ff97.pneumaticcooking.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;

public class ItemCornKernel extends ItemSeeds
{
    public ItemCornKernel(Block crop, Block soil)
    {
        super(crop, soil);
        this.setUnlocalizedName(Names.itemCornKernelName);
        this.setCreativeTab(CreativeTab.tabPneuPopcorn);
        this.setTextureName(Reference.ID.toLowerCase() + ":cornKernel");
    }
}
