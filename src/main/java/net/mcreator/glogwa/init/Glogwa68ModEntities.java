
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.glogwa.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.glogwa.entity.EnderChickenEntity;
import net.mcreator.glogwa.entity.ChefUiChefEntity;
import net.mcreator.glogwa.Glogwa68Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Glogwa68ModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, Glogwa68Mod.MODID);
	public static final RegistryObject<EntityType<ChefUiChefEntity>> CHEF_UI_CHEF = register("chef_ui_chef",
			EntityType.Builder.<ChefUiChefEntity>of(ChefUiChefEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChefUiChefEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnderChickenEntity>> ENDER_CHICKEN = register("ender_chicken",
			EntityType.Builder.<EnderChickenEntity>of(EnderChickenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnderChickenEntity::new).fireImmune().sized(4f, 7f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ChefUiChefEntity.init();
			EnderChickenEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CHEF_UI_CHEF.get(), ChefUiChefEntity.createAttributes().build());
		event.put(ENDER_CHICKEN.get(), EnderChickenEntity.createAttributes().build());
	}
}
