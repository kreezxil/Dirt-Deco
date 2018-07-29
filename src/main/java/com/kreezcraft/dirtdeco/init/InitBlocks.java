package com.kreezcraft.dirtdeco.init;

import java.util.ArrayList;
import java.util.List;

import com.kreezcraft.dirtdeco.blocks.ModSlab;
import com.kreezcraft.dirtdeco.blocks.ModStairs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class InitBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block DIRT_SLAB = new ModSlab("dirt_slab",Blocks.DIRT);
	public static final Block DIRT_STAIRS = new ModStairs("dirt_stairs",Blocks.DIRT);

//	public static final Block DIRT_FENCE = new ModFence("dirt_fence",Material.GROUND);
//	public static final Block DIRT_DOOR = new ModDoor("dirt_door", Material.GROUND);
//	public static final Block DIRT_TRAP_DOOR = new ModTrapDoor("dirt_trap_door", Material.GROUND);
//	public static final Block DIRT_GATE = new ModGate("dirt_gate", EnumType.JUNGLE );
	
	public static final Block GRASS_SLAB = new ModSlab("grass_slab",Blocks.GRASS);
	public static final Block GRASS_STAIRS = new ModStairs("grass_stairs",Blocks.GRASS);
	
	public static final Block PATH_SLAB = new ModSlab("path_slab",Blocks.GRASS_PATH);
	//public static final Block PATH_STAIRS = new ModStairs("path_stairs",Blocks.GRASS_PATH);
	
//	public static final Block GRASS_FENCE = new ModFence("grass_fence",Material.GRASS);
//	public static final Block GRASS_DOOR = new ModDoor("grass_door", Material.GRASS);
//	public static final Block GRASS_TRAP_DOOR = new ModTrapDoor("grass_trap_door", Material.GRASS);
//	public static final Block GRASS_GATE = new ModGate("grass_gate", EnumType.JUNGLE);

	public static final Block GRAVEL_SLAB = new ModSlab("gravel_slab",Blocks.GRAVEL);
	public static final Block GRAVEL_STAIRS = new ModStairs("gravel_stairs",Blocks.GRAVEL);
	
	public static final Block SAND_SLAB = new ModSlab("sand_slab",Blocks.SAND);
	public static final Block SAND_STAIRS = new ModStairs("sand_stairs",Blocks.SAND);
	
	public static final Block RED_SAND_SLAB = new ModSlab("red_sand_slab",Blocks.SAND);
	public static final Block RED_SAND_STAIRS = new ModStairs("red_sand_stairs",Blocks.SAND);
	
	public static final Block STONE_SLAB = new ModSlab("stone_slab",Blocks.STONE);
	public static final Block STONE_STAIRS = new ModStairs("stone_stairs",Blocks.STONE);
	
	
	
}