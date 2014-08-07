package com.j3ff97.pneumaticpopcorn.item;

import com.j3ff97.pneumaticpopcorn.handler.CreativeTab;
import com.j3ff97.pneumaticpopcorn.init.ModItems;
import com.j3ff97.pneumaticpopcorn.reference.Names;
import com.j3ff97.pneumaticpopcorn.reference.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemPopCorn extends ItemFood
{
    public ItemPopCorn(int hunger, float saturation, boolean isWolfFood)
    {
        super(hunger, saturation, isWolfFood);
        this.setUnlocalizedName(Names.itemPopCornName);
        this.setCreativeTab(CreativeTab.tabPneuPopcorn);
        this.setTextureName(Reference.ID.toLowerCase() +  ":popcorn");

    }

    public ItemStack oneaten(ItemStack itemStack, World world, EntityPlayer player)
    {
        super.onEaten(itemStack, world, player);
        return new ItemStack(ModItems.itemBag);
    }
}
