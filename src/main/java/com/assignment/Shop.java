package com.assignment;

import java.util.ArrayList;
import java.util.HashMap;

public class Shop {

    ArrayList<Thing> items = new ArrayList<>();

    public Shop() {
        // Lägg till produkter av olika typ i ArrayList
        items.add(new Clothing("Kragskjorta", 20));
        items.add(new Clothing("Chinos", 50));
        items.add(new Car("Fiat", "500", 1000));
        items.add(new Car("Tesla", "S", 50000));
        items.add(new Clothing("Bandana", 10));
    }

    // Getter för Arraylist
    public ArrayList<Thing> getItems() {
        return items;
    }

}
