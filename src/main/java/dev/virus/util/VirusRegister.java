package dev.virus.util;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static dev.virus.VirusMain.MODID;
import static dev.virus.items.VirusItems.*;

public class VirusRegister {

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(MODID, "vaccine_empty"), VACCINE_EMPTY);
        Registry.register(Registry.ITEM, new Identifier(MODID, "zombie_heart"), ZOMBIE_HEART);
        Registry.register(Registry.ITEM, new Identifier(MODID, "vaccine"), VACCINE);
        Registry.register(Registry.ITEM, new Identifier(MODID, "iron_stick"), IRON_STICK);
    }
}
