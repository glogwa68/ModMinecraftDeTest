package net.mcreator.glogwa.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class ChefUiChefEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos((int) x, (int) (y - 1), (int) z), Blocks.POWDER_SNOW_CAULDRON.defaultBlockState(), 3);
	}
}
