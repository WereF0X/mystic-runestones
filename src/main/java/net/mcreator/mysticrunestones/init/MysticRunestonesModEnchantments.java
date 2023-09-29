
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mysticrunestones.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.mysticrunestones.enchantment.WithercurseEnchantment;
import net.mcreator.mysticrunestones.MysticRunestonesMod;

public class MysticRunestonesModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, MysticRunestonesMod.MODID);
	public static final RegistryObject<Enchantment> WITHERCURSE = REGISTRY.register("withercurse", () -> new WithercurseEnchantment());
}
