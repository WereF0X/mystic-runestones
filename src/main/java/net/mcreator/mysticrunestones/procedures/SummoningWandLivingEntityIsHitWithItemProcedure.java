package net.mcreator.mysticrunestones.procedures;

import net.minecraft.world.entity.Entity;

public class SummoningWandLivingEntityIsHitWithItemProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		sourceentity.startRiding(entity);
	}
}
