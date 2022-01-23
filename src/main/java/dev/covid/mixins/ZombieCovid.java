package dev.covid.mixins;

import dev.covid.effects.VirusesEffects;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;

import net.minecraft.entity.mob.ZombieEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ZombieEntity.class)
public class ZombieCovid {
	@Inject(at = @At("INVOKE"), method = "tryAttack")
	private void init(Entity target, CallbackInfoReturnable<Boolean> cir) {
		((LivingEntity)target).addStatusEffect(new StatusEffectInstance(VirusesEffects.COVID, 99999 * 2, 0));
	}
}
