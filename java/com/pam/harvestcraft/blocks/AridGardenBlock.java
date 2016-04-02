package com.pam.harvestcraft.blocks;

import com.pam.harvestcraft.harvestcraft;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AridGardenBlock extends BlockBush
{
	private final String name = "aridgarden";
	public static List<ItemStack> drops;
	
	public AridGardenBlock()
	{	
		super(Material.grass);
		GameRegistry.registerBlock(this, name);
		setUnlocalizedName(name);
		setCreativeTab(harvestcraft.modTab);
	}
	
	//@SideOnly(Side.CLIENT)
    //public void initModel() {
    //    ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    //}

	public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
	{
	    List<ItemStack> newStack = new ArrayList<ItemStack>();
	    Collections.shuffle(drops);
	    for (int i = 0; i < Math.min(BlockRegistry.gardendropAmount, drops.size()); i++) {
	        newStack.add(drops.get(i).copy());
	    }
	    return newStack;
	}
	
	@Override
	protected boolean canPlaceBlockOn(Block ground)
    {
        return ground == Blocks.sand;
    }
	
	public String getName()
	{
		return name;
	}
	
	@Override
    public net.minecraftforge.common.EnumPlantType getPlantType(net.minecraft.world.IBlockAccess world, BlockPos pos)
    {
        return net.minecraftforge.common.EnumPlantType.Desert;
    }

    @Override
    public IBlockState getPlant(net.minecraft.world.IBlockAccess world, BlockPos pos)
    {
        IBlockState state = world.getBlockState(pos);
        if (state.getBlock() != this) return getDefaultState();
        return state;
    }
}