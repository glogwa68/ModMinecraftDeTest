package net.mcreator.glogwa.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class ChefUiChefEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y - 1, z), Blocks.POWDER_SNOW_CAULDRON.defaultBlockState(), 3);
	}
}
