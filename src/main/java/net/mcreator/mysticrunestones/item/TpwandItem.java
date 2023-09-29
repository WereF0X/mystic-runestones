
package net.mcreator.mysticrunestones.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.mysticrunestones.procedures.TpwandRightclickedProcedure;

public class TpwandItem extends Item {
	public TpwandItem() {
		super(new Item.Properties().durability(700).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		TpwandRightclickedProcedure.execute(world, x, y, z, entity, itemstack);
		return ar;
	}
}
