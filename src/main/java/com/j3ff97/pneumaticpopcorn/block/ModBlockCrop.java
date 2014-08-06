package com.j3ff97.pneumaticpopcorn.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import java.util.Random;

public class ModBlockCrop extends BlockBush implements IGrowable
{
    @SideOnly(Side.CLIENT)
    protected IIcon[] icon;

    public ModBlockCrop()
    {
        this.setTickRandomly(true);
        float f = 0.5F;
        this.setBlockBounds(0.5F - f,0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f );
        this.setCreativeTab((CreativeTabs)null);
        this.setHardness(0.0F);
        this.setStepSound(soundTypeSand);
        this.disableStats();
    }

    @Override
    protected boolean canPlaceBlockOn(Block parBlock)
    {
        return parBlock == Blocks.farmland;
    }

    public void incrementGrowStage(World world, int x, int y, int z)
    {
        int growStage = world.getBlockMetadata(x, y, z) + MathHelper.getRandomIntegerInRange(world.rand, 2, 5);

        if (growStage > 7)
        {
            growStage = 7;
        }

        world.setBlockMetadataWithNotify(x, y, z, growStage, 2);
    }

    @Override
    public Item getItemDropped(int p_149650_1_, Random parRand, int parFortune)
    {
        return Item.getItemFromBlock(this);
    }

    @Override
    public int getRenderType()
    {
        return 6;
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int growthStage)
    {
        return icon[growthStage];
    }

    @Override
    public boolean func_149851_a(World world, int x, int y, int z, boolean par5Bool)
    {
        return world.getBlockMetadata(x, y, z) != 7;
    }

    @Override
    public boolean func_149852_a(World world, Random random, int x, int y, int z)
    {
        return true;
    }

    @Override
    public void func_149853_b(World world, Random random, int x, int y, int z)
    {
        incrementGrowStage(world, x, y, z);
    }

}
