package dev.covid.items;

import dev.covid.CovidMain;
import net.minecraft.item.Item;

public class CovidItems {
    public static final Item IRON_STICK = new IronStickItem((new Item.Settings().group(CovidMain.COVID_ITEMS_GROUP)));
    public static final Item ZOMBIE_HEART = new ZombieHeartItem(new Item.Settings().group(CovidMain.COVID_ITEMS_GROUP));
    public static final Item VACCINE_EMPTY = new VaccineEmptyItem(new Item.Settings().group(CovidMain.COVID_ITEMS_GROUP));
    public static final Item VACCINE = new VaccineItem(new Item.Settings().group(CovidMain.COVID_ITEMS_GROUP));
}
