package com.kreezcraft.dirtdeco.items;

import com.kreezcraft.dirtdeco.DirtDeco;
import com.kreezcraft.dirtdeco.client.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	protected String name;

	public ItemBase(String name) {
		this.name = name;
		setUnlocalizedName(DirtDeco.MODID + "." + name);
		setRegistryName(name);
		InitItems.ITEMS.add(this);
		setCreativeTab(DirtDeco.creativeTab);
		}

	public void registerItemModel() {
		DirtDeco.proxy.registerItemRenderer(this, 0, name);
	}

	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

	@Override
	public void registerModels() {
		DirtDeco.proxy.registerItemRenderer(this, 0, "inventory");
	}

}