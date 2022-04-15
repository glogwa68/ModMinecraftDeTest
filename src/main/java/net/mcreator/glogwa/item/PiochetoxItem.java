
package net.mcreator.glogwa.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class PiochetoxItem extends PickaxeItem {
	public PiochetoxItem() {
		super(new Tier() {
			public int getUses() {
				return 499;
			}

			public float getSpeed() {
				return 11f;
			}

			public float getAttackDamageBonus() {
				return -1f;
			}

			public int getLevel() {
				return 1;
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
