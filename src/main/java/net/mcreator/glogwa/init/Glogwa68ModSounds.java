
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.glogwa.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Glogwa68ModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("glogwa68", "enderchicken"), new SoundEvent(new ResourceLocation("glogwa68", "enderchicken")));
		REGISTRY.put(new ResourceLocation("glogwa68", "enderchickenmarche"), new SoundEvent(new ResourceLocation("glogwa68", "enderchickenmarche")));
		REGISTRY.put(new ResourceLocation("glogwa68", "enderchickenhurt"), new SoundEvent(new ResourceLocation("glogwa68", "enderchickenhurt")));
		REGISTRY.put(new ResourceLocation("glogwa68", "enderchickendeath"), new SoundEvent(new ResourceLocation("glogwa68", "enderchickendeath")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
