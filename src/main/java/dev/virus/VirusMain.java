package dev.virus;


import dev.virus.effects.VirusEffects;
import dev.virus.items.VirusItems;
import dev.virus.util.VirusRegister;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class VirusMain implements ModInitializer {

    public static final String MODID ="virus";

    public static final ItemGroup COVID_ITEMS_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MODID, "items"),
            () -> new ItemStack(VirusItems.VACCINE));

    @Override
    public void onInitialize() {
        VirusRegister.registerItems();
        VirusEffects.register();
    }
}
