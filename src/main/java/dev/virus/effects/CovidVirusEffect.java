package dev.virus.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;


public class CovidVirusEffect extends StatusEffect {

    public CovidVirusEffect(StatusEffectCategory type, int color) {
        super(StatusEffectCategory.HARMFUL, color);
    }

    @Override
    public void onRemoved(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        super.onRemoved(entity, attributes, amplifier);
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 350, 0));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 200, 0));
    }

    @Override
    public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        super.onApplied(entity, attributes, amplifier);
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 250, 0));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 300, 0));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 200, 0));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 200, 0));
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        super.applyUpdateEffect(entity, amplifier);
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 100, 0));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.UNLUCK, 100, 0));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 200, 0));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 200, 0));
    }
}
