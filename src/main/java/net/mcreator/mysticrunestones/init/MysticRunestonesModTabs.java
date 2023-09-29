
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mysticrunestones.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.mysticrunestones.MysticRunestonesMod;

public class MysticRunestonesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MysticRunestonesMod.MODID);
	public static final RegistryObject<CreativeModeTab> MYSTIC_RUNE_STONES = REGISTRY.register("mystic_rune_stones",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mystic_runestones.mystic_rune_stones")).icon(() -> new ItemStack(MysticRunestonesModItems.LOGO.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MysticRunestonesModItems.HEALING_WAND.get());
				tabData.accept(MysticRunestonesModItems.TPWAND.get());
				tabData.accept(MysticRunestonesModItems.FIRE_WAND.get());
				tabData.accept(MysticRunestonesModItems.SUMMONING_WAND.get());
			})

					.build());
}
