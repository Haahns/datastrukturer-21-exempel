package com.assignment;

import java.util.ArrayList;
import java.util.HashMap;

public class Shop {

    ArrayList<Thing> items = new ArrayList<>();

    public Shop() {
        // Lägg till produkter i ArrayList, ClothingCategory-enum kan sättas med vid behov
        items.add(new Clothing("Kragskjorta", 20, ClothingCategory.DEMO_PRODUCT));
        items.add(new Clothing("Chinos", 50, ClothingCategory.CUSTOMIZED));
        items.add(new Clothing("Bandana", 10));
        items.add(new Car("Fiat", "500"));
    }

    // Getter för Arraylist
    public ArrayList<Thing> getItems() {
        return items;
    }

}
