package com.kreezcraft.dirtdeco.blocks;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class InitBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();

//	public static final Block DIAMOND_SANDSTONE = new BlockStandard("diamond_sandstone");
//	public static final Block DIAMOND_SMOOTH_SANDSTONE = new BlockStandard("diamond_smooth_sandstone");
//	public static final Block DIAMOND_CHISELED_SANDSTONE = new BlockStandard("diamond_chiseled_sandstone");

	
	public static final Block DIRT_SLAB = new ModSlab("dirt_slab",Blocks.DIRT);
	public static final Block DIRT_STAIRS = new ModStairs("dirt_stores",Blocks.DIRT);
	
	public static final Block GRASS_SLAB = new ModSlab("grass_slab",Blocks.GRASS);
	public static final Block GRASS_STAIRS = new ModStairs("grass_stairs",Blocks.GRASS);
}