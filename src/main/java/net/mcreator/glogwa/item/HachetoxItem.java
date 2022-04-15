
package net.mcreator.glogwa.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class HachetoxItem extends AxeItem {
	public HachetoxItem() {
		super(new Tier() {
			public int getUses() {
				return 499;
			}

			public float getSpeed() {
				return 11f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 11;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		},

				1, -3f,

				new Item.Properties().tab(Glogwa68ModTabs.TAB_MODCHEF));
	}

}
