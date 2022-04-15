package net.mcreator.glogwa.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ArmuretoxEvenementDeTickDuCasqueProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 60, 1));
	}
}
