
package net.mcreator.glogwa.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.glogwa.init.Glogwa68ModTabs;

public class ToxingotItem extends Item {
	public ToxingotItem() {
		super(new Item.Properties().tab(Glogwa68ModTabs.TAB_MODCHEF).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
