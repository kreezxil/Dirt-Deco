package com.kreezcraft.dirtdeco;

import net.minecraft.block.Block;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
@Config(modid = DirtDeco.MODID, category = "")
public class DirtDecoConfig {

	@Config.Comment({ "Block Settings" })
	@Config.Name("Dirt & Grass")
	@Config.RequiresMcRestart
	public static NondiamondLevel nondiamondLevel = new NondiamondLevel();

	public static class NondiamondLevel {
		@Config.Comment({ "Set the hardness of the blocks in the mod" })
		@Config.Name("Standard Hardness")
		public float standardHardness = 3f;

		@Config.Comment({ "Set the explosion resistance of the blocks in the mod" })
		@Config.Name("Standard Resistance")
		public float standardResistance = 5f;
	}

	@SubscribeEvent
	public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
		if (event.getModID().equals(DirtDeco.MODID)) {
			ConfigManager.sync(DirtDeco.MODID, Config.Type.INSTANCE);
		}
	}

}
