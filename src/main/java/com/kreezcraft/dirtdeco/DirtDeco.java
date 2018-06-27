package com.kreezcraft.dirtdeco;

import com.kreezcraft.dirtdeco.proxy.CommonProxy;
import com.kreezcraft.dirtdeco.recipes.ModRecipes;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = DirtDeco.MODID, name = DirtDeco.NAME, version = DirtDeco.VERSION)
public class DirtDeco {

	public static final String MODID = "dirtdeco";
	public static final String NAME = "Dirt Deco";
	public static final String VERSION = "@VERSION@";

	@Mod.Instance(MODID)
	public static DirtDeco instance;

	public static final DirtDecoTab creativeTab = new DirtDecoTab("Dirt Deco");

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		ModRecipes.init();

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

	@SidedProxy(serverSide = "com.kreezcraft.dirtdeco.proxy.CommonProxy", clientSide = "com.kreezcraft.dirtdeco.proxy.ClientProxy")
	public static CommonProxy proxy;

}