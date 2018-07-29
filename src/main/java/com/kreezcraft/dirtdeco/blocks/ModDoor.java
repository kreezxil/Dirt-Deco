package com.kreezcraft.dirtdeco.blocks;

import java.util.Random;

import com.kreezcraft.dirtdeco.DirtDeco;
import com.kreezcraft.dirtdeco.DirtDecoConfig;
import com.kreezcraft.dirtdeco.client.IHasModel;
import com.kreezcraft.dirtdeco.init.InitBlocks;
import com.kreezcraft.dirtdeco.init.InitItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class ModDoor extends BlockDoor implements IHasModel {

	private String name;

	public ModDoor(String name, Material materialIn) {
		super(materialIn);
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
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return state.getValue(HALF) == BlockDoor.EnumDoorHalf.UPPER ? Items.AIR : Item.getItemFromBlock(this);
	}
}
