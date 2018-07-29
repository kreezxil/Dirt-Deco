package com.kreezcraft.dirtdeco;

import com.kreezcraft.dirtdeco.init.InitBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class DirtDecoTab extends CreativeTabs {

	public DirtDecoTab(String label) {
		super(DirtDeco.MODID);
		setBackgroundImageName("item_search.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(InitBlocks.GRASS_STAIRS);
	}
	
	@Override
	public boolean hasSearchBar() {
		return true;
	}

	
}