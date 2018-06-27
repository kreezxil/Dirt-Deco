package com.kreezcraft.dirtdeco.blocks;

import com.kreezcraft.dirtdeco.DirtDeco;
import com.kreezcraft.dirtdeco.client.IHasModel;
import com.kreezcraft.dirtdeco.items.InitItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

	protected String name;

	public BlockBase(Material material, String name) {
		super(material);
		this.name = name;
		setUnlocalizedName(DirtDeco.MODID + "." + name);
		setCreativeTab(DirtDeco.creativeTab);
		setRegistryName(name);
		InitBlocks.BLOCKS.add(this);
		InitItems.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));
	}

	@Override
	public void registerModels() {
		DirtDeco.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

}