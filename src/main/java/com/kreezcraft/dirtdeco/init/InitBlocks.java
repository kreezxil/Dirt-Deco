package com.kreezcraft.dirtdeco.init;

import java.util.ArrayList;
import java.util.List;

import com.kreezcraft.dirtdeco.blocks.ModDoor;
import com.kreezcraft.dirtdeco.blocks.ModFence;
import com.kreezcraft.dirtdeco.blocks.ModSlab;
import com.kreezcraft.dirtdeco.blocks.ModStairs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class InitBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block SLAB_DIRT = new ModSlab("slab_dirt",Blocks.DIRT);
	public static final Block SLAB_GRASS = new ModSlab("slab_grass",Blocks.DIRT);
	public static final Block SLAB_GRAVEL = new ModSlab("slab_gravel",Blocks.GRAVEL);
	public static final Block SLAB_PATH = new ModSlab("slab_path",Blocks.GRASS_PATH);
	public static final Block SLAB_RED_SAND = new ModSlab("slab_red_sand",Blocks.SAND);
	public static final Block SLAB_SAND = new ModSlab("slab_sand",Blocks.SAND);
	public static final Block SLAB_STONE = new ModSlab("slab_stone",Blocks.STONE);
	
	public static final BlockFence FENCE_DIRT = new ModFence("fence_dirt",Blocks.DIRT);
	public static final BlockFence FENCE_GRASS = new ModFence("fence_grass",Blocks.DIRT);
	public static final BlockFence FENCE_GRAVEL = new ModFence("fence_gravel",Blocks.GRAVEL);
	public static final BlockFence FENCE_RED_SAND = new ModFence("fence_red_sand",Blocks.SAND);
	public static final BlockFence FENCE_SAND = new ModFence("fence_sand",Blocks.SAND);
	public static final BlockFence FENCE_STONE = new ModFence("fence_stone",Blocks.STONE);
	
	public static final BlockStairs STAIRS_DIRT = new ModStairs("stairs_dirt",Blocks.DIRT);
	public static final BlockStairs STAIRS_GRASS = new ModStairs("stairs_grass",Blocks.DIRT);
	public static final BlockStairs STAIRS_GRAVEL = new ModStairs("stairs_gravel",Blocks.GRAVEL);
	public static final BlockStairs STAIRS_PATH = new ModStairs("stairs_path",Blocks.GRASS_PATH);
	public static final BlockStairs STAIRS_RED_SAND = new ModStairs("stairs_red_sand",Blocks.SAND);
	public static final BlockStairs STAIRS_SAND = new ModStairs("stairs_sand",Blocks.SAND);
	public static final BlockStairs STAIRS_STONE = new ModStairs("stairs_stone",Blocks.STONE);
	
	//public static final BlockDoor DOOR_DIRT = new ModDoor("door_dirt",Material.GROUND);
}