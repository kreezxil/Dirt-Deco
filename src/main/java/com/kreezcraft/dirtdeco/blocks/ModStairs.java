package com.kreezcraft.dirtdeco.blocks;

import com.kreezcraft.dirtdeco.DirtDeco;
import com.kreezcraft.dirtdeco.DirtDecoConfig;
import com.kreezcraft.dirtdeco.client.IHasModel;
import com.kreezcraft.dirtdeco.init.InitBlocks;
import com.kreezcraft.dirtdeco.init.InitItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class ModStairs extends BlockStairs implements IHasModel {

	protected String name;

	public ModStairs(String name, Block block) {
		super(block.getDefaultState());
		this.name = name;
		setCreativeTab(DirtDeco.creativeTab);
		setUnlocalizedName(DirtDeco.MODID + "." + name);
		setRegistryName(name);
		setHardness(DirtDecoConfig.nondiamondLevel.standardHardness);
		setResistance(DirtDecoConfig.nondiamondLevel.standardResistance);
		useNeighborBrightness = true;
		InitBlocks.BLOCKS.add(this);
		InitItems.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));
	}

	@Override
	public void registerModels() {
		DirtDeco.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

}
