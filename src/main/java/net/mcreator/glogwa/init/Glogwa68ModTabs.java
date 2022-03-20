
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.glogwa.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class Glogwa68ModTabs {
	public static CreativeModeTab TAB_MODCHEF;

	public static void load() {
		TAB_MODCHEF = new CreativeModeTab("tabmodchef") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.LIGHT_BLUE_CANDLE_CAKE);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
