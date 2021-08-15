package dev.covid.effects;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static dev.covid.CovidMain.MODID;


public class CovidEffects {

    public static final StatusEffect COVID = new CovidVirusEffect(StatusEffectType.HARMFUL, 0x00AA00);

    public static void register() {
        Registry.register(Registry.STATUS_EFFECT, new Identifier(MODID,"covid_virus"), COVID);
    }
}