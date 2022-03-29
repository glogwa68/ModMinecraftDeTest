
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.glogwa.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.glogwa.item.ToxingotItem;
import net.mcreator.glogwa.item.PiochetoxItem;
import net.mcreator.glogwa.item.PelltoxItem;
import net.mcreator.glogwa.item.HouetoxItem;
import net.mcreator.glogwa.item.HachetoxItem;
import net.mcreator.glogwa.item.EpetoxItem;
import net.mcreator.glogwa.item.ArmuretoxItem;
import net.mcreator.glogwa.Glogwa68Mod;

public class Glogwa68ModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, Glogwa68Mod.MODID);
	public static final RegistryObject<Item> CHEF_UI_CHEF = REGISTRY.register("chef_ui_chef_spawn_egg",
			() -> new ForgeSpawnEggItem(Glogwa68ModEntities.CHEF_UI_CHEF, -1, -1, new Item.Properties().tab(Glogwa68ModTabs.TAB_MODCHEF)));
	public static final RegistryObject<Item> ENDER_CHICKEN = REGISTRY.register("ender_chicken_spawn_egg",
			() -> new ForgeSpawnEggItem(Glogwa68ModEntities.ENDER_CHICKEN, -52225, -6710785, new Item.Properties().tab(Glogwa68ModTabs.TAB_MODCHEF)));
	public static final RegistryObject<Item> TOXINGOT = REGISTRY.register("toxingot", () -> new ToxingotItem());
	public static final RegistryObject<Item> MINERAITOX = block(Glogwa68ModBlocks.MINERAITOX, Glogwa68ModTabs.TAB_MODCHEF);
	public static final RegistryObject<Item> EPETOX = REGISTRY.register("epetox", () -> new EpetoxItem());
	public static final RegistryObject<Item> PIOCHETOX = REGISTRY.register("piochetox", () -> new PiochetoxItem());
	public static final RegistryObject<Item> PELLTOX = REGISTRY.register("pelltox", () -> new PelltoxItem());
	public static final RegistryObject<Item> HACHETOX = REGISTRY.register("hachetox", () -> new HachetoxItem());
	public static final RegistryObject<Item> HOUETOX = REGISTRY.register("houetox", () -> new HouetoxItem());
	public static final RegistryObject<Item> ARMURETOX_HELMET = REGISTRY.register("armuretox_helmet", () -> new ArmuretoxItem.Helmet());
	public static final RegistryObject<Item> ARMURETOX_CHESTPLATE = REGISTRY.register("armuretox_chestplate", () -> new ArmuretoxItem.Chestplate());
	public static final RegistryObject<Item> ARMURETOX_LEGGINGS = REGISTRY.register("armuretox_leggings", () -> new ArmuretoxItem.Leggings());
	public static final RegistryObject<Item> ARMURETOX_BOOTS = REGISTRY.register("armuretox_boots", () -> new ArmuretoxItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
