
package net.mcreator.glogwa.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class ToxingotItem extends Item {

	public ToxingotItem() {
		super(new Item.Properties().tab(Glogwa68ModTabs.TAB_MODCHEF).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

}
