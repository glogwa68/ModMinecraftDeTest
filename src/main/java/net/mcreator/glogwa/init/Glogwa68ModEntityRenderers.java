
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.glogwa.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.glogwa.client.renderer.ChefUiChefRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class Glogwa68ModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(Glogwa68ModEntities.CHEF_UI_CHEF.get(), ChefUiChefRenderer::new);
	}
}
