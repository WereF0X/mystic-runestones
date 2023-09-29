
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mysticrunestones.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.mysticrunestones.item.TpwandItem;
import net.mcreator.mysticrunestones.item.SummoningWandItem;
import net.mcreator.mysticrunestones.item.LogoItem;
import net.mcreator.mysticrunestones.item.HealingWandItem;
import net.mcreator.mysticrunestones.item.FireWandItem;
import net.mcreator.mysticrunestones.MysticRunestonesMod;

public class MysticRunestonesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MysticRunestonesMod.MODID);
	public static final RegistryObject<Item> HEALING_WAND = REGISTRY.register("healing_wand", () -> new HealingWandItem());
	public static final RegistryObject<Item> TPWAND = REGISTRY.register("tpwand", () -> new TpwandItem());
	public static final RegistryObject<Item> FIRE_WAND = REGISTRY.register("fire_wand", () -> new FireWandItem());
	public static final RegistryObject<Item> SUMMONING_WAND = REGISTRY.register("summoning_wand", () -> new SummoningWandItem());
	public static final RegistryObject<Item> LOGO = REGISTRY.register("logo", () -> new LogoItem());
}
