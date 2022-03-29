
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.glogwa.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.glogwa.block.MineraitoxBlock;
import net.mcreator.glogwa.Glogwa68Mod;

public class Glogwa68ModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, Glogwa68Mod.MODID);
	public static final RegistryObject<Block> MINERAITOX = REGISTRY.register("mineraitox", () -> new MineraitoxBlock());
}
