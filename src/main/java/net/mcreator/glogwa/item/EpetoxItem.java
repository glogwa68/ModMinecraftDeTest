
package net.mcreator.glogwa.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

import net.mcreator.glogwa.init.Glogwa68ModTabs;

public class EpetoxItem extends SwordItem {
	public EpetoxItem() {
		super(new Tier() {
			public int getUses() {
				return 499;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -3f, new Item.Properties().tab(Glogwa68ModTabs.TAB_MODCHEF));
	}
}
