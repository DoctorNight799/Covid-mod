package dev.covid;


import dev.covid.effects.CovidEffects;
import dev.covid.items.CovidItems;
import dev.covid.util.CovidRegister;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class CovidMain implements ModInitializer {

    public static final String MODID ="covid";

    public static final ItemGroup COVID_ITEMS_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MODID, "items"),
            () -> new ItemStack(CovidItems.VACCINE));

    @Override
    public void onInitialize() {
        CovidRegister.registerItems();
        CovidEffects.register();
    }
}
