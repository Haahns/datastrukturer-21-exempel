package com.assignment;

import java.util.ArrayList;
import java.util.HashMap;

public class Shop {

    // ArrayList för våra produkter
    ArrayList<Thing> items = new ArrayList<>();

    // HashMap för mera produkter
    HashMap<String,Thing> products = new HashMap<>();

    public Shop() {

        // Lägg till produkter i ArrayList
        items.add(new Clothing("Kragskjorta", 20));
        items.add(new Clothing("Chinos", 50));
        items.add(new Clothing("Bandana", 10));

        // Lägg till produkter i HashMap
        products.put("tee", new Clothing("T-skjorta", 20));
        products.put("jns", new Clothing("Jeans", 50));
        products.put("pip", new Clothing("Pipo", 10));
        // Vi kan också sätta Car-objekt hit eftersom
        // HashMappen kan ta emot allt av typen Thing
        products.put("car", new Car("VW", "Beetle"));
    }

    // Getter för Arraylist
    public ArrayList<Thing> getItems() {
        return items;
    }

    // Getter för HashMap
    public HashMap<String,Thing> getProducts() {
        return products;
    }
}
