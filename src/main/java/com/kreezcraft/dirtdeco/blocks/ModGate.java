package com.kreezcraft.dirtdeco.blocks;

import javax.annotation.Nullable;

import com.kreezcraft.dirtdeco.DirtDeco;
import com.kreezcraft.dirtdeco.DirtDecoConfig;
import com.kreezcraft.dirtdeco.client.IHasModel;
import com.kreezcraft.dirtdeco.init.InitBlocks;
import com.kreezcraft.dirtdeco.init.InitItems;

import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class ModGate extends BlockFenceGate implements IHasModel {

	private String name;

	public ModGate(String name, EnumType p_i46394_1_) {
		super(p_i46394_1_);
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

	@Nullable
	@Override
	public String getHarvestTool(final IBlockState state) {
		return super.getHarvestTool(state);
	}

	@Override
	public boolean isToolEffective(final String type, final IBlockState state) {
		return super.isToolEffective(type, state);
	}
}
