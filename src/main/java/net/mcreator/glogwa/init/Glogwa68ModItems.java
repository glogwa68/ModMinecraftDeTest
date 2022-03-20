
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.glogwa.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.glogwa.Glogwa68Mod;

public class Glogwa68ModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, Glogwa68Mod.MODID);
	public static final RegistryObject<Item> CHEF_UI_CHEF = REGISTRY.register("chef_ui_chef_spawn_egg",
			() -> new ForgeSpawnEggItem(Glogwa68ModEntities.CHEF_UI_CHEF, -1, -1, new Item.Properties().tab(Glogwa68ModTabs.TAB_MODCHEF)));
}
