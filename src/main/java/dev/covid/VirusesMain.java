package dev.covid;


import dev.covid.effects.VirusesEffects;
import dev.covid.items.VirusesItems;
import dev.covid.util.VirusesRegister;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class VirusesMain implements ModInitializer {

    public static final String MODID ="viruses";

    public static final ItemGroup COVID_ITEMS_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MODID, "items"),
            () -> new ItemStack(VirusesItems.VACCINE));

    @Override
    public void onInitialize() {
        VirusesRegister.registerItems();
        VirusesEffects.register();
    }
}
