package com.kreezcraft.dirtdeco.blocks;

import com.kreezcraft.dirtdeco.DirtDeco;
import com.kreezcraft.dirtdeco.DirtDecoConfig;
import com.kreezcraft.dirtdeco.client.IHasModel;
import com.kreezcraft.dirtdeco.items.InitItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class ModTrapDoor extends BlockTrapDoor implements IHasModel{

	private String name;

	public ModTrapDoor(String name, Material materialIn) {
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

}
