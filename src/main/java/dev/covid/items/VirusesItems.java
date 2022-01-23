package dev.covid.items;

import dev.covid.VirusesMain;
import net.minecraft.item.Item;

public class VirusesItems {
    public static final Item IRON_STICK = new IronStickItem((new Item.Settings().group(VirusesMain.COVID_ITEMS_GROUP)));
    public static final Item ZOMBIE_HEART = new ZombieHeartItem(new Item.Settings().group(VirusesMain.COVID_ITEMS_GROUP));
    public static final Item VACCINE_EMPTY = new VaccineEmptyItem(new Item.Settings().group(VirusesMain.COVID_ITEMS_GROUP));
    public static final Item VACCINE = new VaccineItem(new Item.Settings().group(VirusesMain.COVID_ITEMS_GROUP));
}
