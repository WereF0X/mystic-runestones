
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mysticrunestones.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.mysticrunestones.world.inventory.Recipes2Menu;
import net.mcreator.mysticrunestones.world.inventory.FecipsMenu;
import net.mcreator.mysticrunestones.MysticRunestonesMod;

public class MysticRunestonesModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MysticRunestonesMod.MODID);
	public static final RegistryObject<MenuType<Recipes2Menu>> RECIPES_2 = REGISTRY.register("recipes_2", () -> IForgeMenuType.create(Recipes2Menu::new));
	public static final RegistryObject<MenuType<FecipsMenu>> FECIPS = REGISTRY.register("fecips", () -> IForgeMenuType.create(FecipsMenu::new));
}
