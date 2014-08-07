package com.j3ff97.pneumaticpopcorn.block;


import com.j3ff97.pneumaticpopcorn.handler.config.ConfigurationHandler;
import com.j3ff97.pneumaticpopcorn.init.ModItems;
import com.j3ff97.pneumaticpopcorn.reference.Names;
import com.j3ff97.pneumaticpopcorn.reference.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

import java.util.Random;

public class CropCorn extends ModBlockCrop
{
        public CropCorn()
        {
            super();
            this.setBlockName(Names.cropCornName);
        }

    protected Item cornDrop()
    {
        return ModItems.itemCorn;
    }

    protected Item kernelDrop()
    {
        return ModItems.itemCornKernel;
    }



    @Override
    public Item getItemDropped(int par1, Random random, int par2)
    {
        return par1 == 7 ? cornDrop(): kernelDrop();
    }

    @Override
    public int quantityDropped(Random random)
    {
        return ConfigurationHandler.amountOfCornFromCrop;
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        icon = new IIcon[8];

        icon[0] = iconRegister.registerIcon(Reference.ID.toLowerCase()+ ":corn_stage_0");
        icon[1] = iconRegister.registerIcon(Reference.ID.toLowerCase()+ ":corn_stage_0");
        icon[2] = iconRegister.registerIcon(Reference.ID.toLowerCase()+ ":corn_stage_1");
        icon[3] = iconRegister.registerIcon(Reference.ID.toLowerCase()+ ":corn_stage_1");
        icon[4] = iconRegister.registerIcon(Reference.ID.toLowerCase()+ ":corn_stage_2");
        icon[5] = iconRegister.registerIcon(Reference.ID.toLowerCase()+ ":corn_stage_3");
        icon[6] = iconRegister.registerIcon(Reference.ID.toLowerCase()+ ":corn_stage_4");
        icon[7] = iconRegister.registerIcon(Reference.ID.toLowerCase()+ ":corn_stage_5");
    }

}

