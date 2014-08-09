package com.j3ff97.pneumaticcooking.item;

import com.j3ff97.pneumaticcooking.handler.CreativeTab;
import com.j3ff97.pneumaticcooking.init.ModItems;
import com.j3ff97.pneumaticcooking.reference.Names;
import com.j3ff97.pneumaticcooking.reference.Reference;
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
        this.setTextureName(Reference.ID.toLowerCase() +  ":popCorn");

    }

    public ItemStack onEaten(ItemStack itemStack, World world, EntityPlayer player)
    {
        super.onEaten(itemStack, world, player);
        return new ItemStack(ModItems.itemBag);
    }
}
