
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mysticrunestones.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.mysticrunestones.client.gui.Recipes2Screen;
import net.mcreator.mysticrunestones.client.gui.FecipsScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MysticRunestonesModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(MysticRunestonesModMenus.RECIPES_2.get(), Recipes2Screen::new);
			MenuScreens.register(MysticRunestonesModMenus.FECIPS.get(), FecipsScreen::new);
		});
	}
}
