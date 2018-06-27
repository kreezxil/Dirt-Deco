package com.kreezcraft.dirtdeco.blocks;

import com.kreezcraft.dirtdeco.DirtDecoConfig;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockStandard extends BlockBase {

	public BlockStandard(String name) {
		super(Material.ROCK, name);
		setHardness(DirtDecoConfig.nondiamondLevel.standardHardness);
		setResistance(DirtDecoConfig.nondiamondLevel.standardResistance);
	}

	public BlockStandard(Material material, String name) {
		super(material, name);
	}

	@Override
	public BlockStandard setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}