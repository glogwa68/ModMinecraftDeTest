package net.mcreator.glogwa.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class GlogwaTESTprocProcedure {
	public static void execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == (ItemStack.EMPTY).getItem()) {
			if (entity instanceof Player _player) {
				_player.getAbilities().mayBuild = (false);
				_player.onUpdateAbilities();
			}
		} else {
			if (entity instanceof Player _player) {
				_player.getAbilities().mayBuild = (true);
				_player.onUpdateAbilities();
			}
			if (entity instanceof Player _player) {
				BlockPos _bp = new BlockPos(x, y, z);
				_player.level.getBlockState(_bp).use(_player.level, _player, InteractionHand.MAIN_HAND,
						BlockHitResult.miss(new Vec3(_bp.getX(), _bp.getY(), _bp.getZ()), Direction.UP, _bp));
			}
		}
	}
}
