package com.j3ff97.pneumaticpopcorn.item;

import com.j3ff97.pneumaticpopcorn.handler.CreativeTab;
import com.j3ff97.pneumaticpopcorn.reference.Names;
import com.j3ff97.pneumaticpopcorn.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
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
