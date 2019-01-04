package com.kreezcraft.dirtdeco.recipes;

import com.kreezcraft.dirtdeco.init.InitBlocks;
import com.kreezcraft.dirtdeco.init.InitItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	Item temp = null;

	public static void init() {
		GameRegistry.addSmelting(InitBlocks.SLAB_GRASS, new ItemStack(InitBlocks.SLAB_PATH), 0.01f);
		GameRegistry.addSmelting(InitBlocks.STAIRS_GRASS, new ItemStack(InitBlocks.STAIRS_PATH), 0.01f);
	}

}
