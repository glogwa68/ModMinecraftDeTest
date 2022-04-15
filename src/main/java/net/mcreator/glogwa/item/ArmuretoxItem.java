
package net.mcreator.glogwa.item;

import net.minecraft.sounds.SoundEvent;

public abstract class ArmuretoxItem extends ArmorItem {

	public ArmuretoxItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{5, 8, 10, 5}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}

			@Override
			public String getName() {
				return "armuretox";
			}

			@Override
			public float getToughness() {
				return 3f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends ArmuretoxItem {

		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(Glogwa68ModTabs.TAB_MODCHEF));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "glogwa68:textures/models/armor/armure_tox_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			ArmuretoxEvenementDeTickDuCasqueProcedure.execute(entity);
		}
	}

	public static class Chestplate extends ArmuretoxItem {

		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(Glogwa68ModTabs.TAB_MODCHEF));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "glogwa68:textures/models/armor/armure_tox_layer_1.png";
		}

	}

	public static class Leggings extends ArmuretoxItem {

		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(Glogwa68ModTabs.TAB_MODCHEF));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "glogwa68:textures/models/armor/armure_tox_layer_2.png";
		}

	}

	public static class Boots extends ArmuretoxItem {

		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(Glogwa68ModTabs.TAB_MODCHEF));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "glogwa68:textures/models/armor/armure_tox_layer_1.png";
		}

	}

}
