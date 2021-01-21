package com.assignment;

import java.util.ArrayList;
import java.util.HashMap;

public class Shop {

    // ArrayList för våra produkter
    ArrayList<Thing> items = new ArrayList<>();

    public Shop() {
        // Lägg till produkter i ArrayList
        items.add(new Clothing("Kragskjorta", 20, ClothingCategory.DEMO_PRODUCT));
        items.add(new Clothing("Chinos", 50, ClothingCategory.CUSTOMIZED));
        items.add(new Clothing("Bandana", 10));

    }

    // Getter för Arraylist
    public ArrayList<Thing> getItems() {
        return items;
    }


    // HashMap för mera produkter
    HashMap<String,Thing> products = new HashMap<>();

    // Getter för HashMap
    public HashMap<String,Thing> getProducts() {
        return products;
    }
}
