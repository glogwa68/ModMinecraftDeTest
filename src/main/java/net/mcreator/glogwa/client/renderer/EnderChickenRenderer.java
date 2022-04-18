
package net.mcreator.glogwa.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

import net.mcreator.glogwa.entity.EnderChickenEntity;

public class EnderChickenRenderer extends MobRenderer<EnderChickenEntity, ChickenModel<EnderChickenEntity>> {
	public EnderChickenRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 5f);
		this.addLayer(new EyesLayer<EnderChickenEntity, ChickenModel<EnderChickenEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("glogwa68:textures/pollo2.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(EnderChickenEntity entity) {
		return new ResourceLocation("glogwa68:textures/pollo2.png");
	}
}
