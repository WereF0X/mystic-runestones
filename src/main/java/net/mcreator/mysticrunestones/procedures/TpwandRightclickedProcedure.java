package net.mcreator.mysticrunestones.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class TpwandRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.ENCHANT, x, y, z, 25, 3, 3, 3, 1);
		if (Math.random() < 0.7) {
			{
				Entity _ent = entity;
				_ent.teleportTo((x + 2), y, (z - 1));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((x + 2), y, (z - 1), _ent.getYRot(), _ent.getXRot());
			}
		}
		if (Math.random() > 0.7) {
			{
				Entity _ent = entity;
				_ent.teleportTo((x + 6), y, (z - 4));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((x + 6), y, (z - 4), _ent.getYRot(), _ent.getXRot());
			}
		}
		if (Math.random() > 0.9) {
			{
				Entity _ent = entity;
				_ent.teleportTo((x + 30), (y + 3), (z - 30));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((x + 30), (y + 3), (z - 30), _ent.getYRot(), _ent.getXRot());
			}
		}
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 2600);
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
						_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "/tellraw @p {\"text\":\"Wand is in cooldown for 2 minutes\",\"color\":\"dark_purple\"}");
			}
		}
		{
			ItemStack _ist = itemstack;
			if (_ist.hurt(4, RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
	}
}
