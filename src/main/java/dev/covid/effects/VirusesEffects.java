package dev.covid.effects;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.LinkedHashMap;
import java.util.Map;

import static dev.covid.VirusesMain.MODID;


public class VirusesEffects {

    private static final Map<Identifier, StatusEffect> EFFECTS = new LinkedHashMap<>();

    public static final StatusEffect COVID = add("covid_effect", new CovidVirusEffect(StatusEffectCategory.HARMFUL, 0x008000));

    private static <S extends StatusEffect> S add(String name, S effect) {
        EFFECTS.put(new Identifier(MODID, name), effect);
        return effect;
    }

    public static void register(){
        EFFECTS.forEach((id, effect) -> Registry.register(Registry.STATUS_EFFECT, id, EFFECTS.get(id)));
    }
}