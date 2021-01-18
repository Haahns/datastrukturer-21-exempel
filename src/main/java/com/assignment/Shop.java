package com.assignment;

import java.util.ArrayList;
import java.util.HashMap;

public class Shop {

    ArrayList<Thing> items = new ArrayList<>();

    HashMap<String,Thing> products = new HashMap<>();

    public Shop() {

        items.add(new Clothing("T-skjorta", 20));
        items.add(new Clothing("Kragskjorta", 30));
        items.add(new Clothing("Jeans", 50));
        items.add(new Clothing("Pipo", 10));


        products.put("tee", new Clothing("T-skjorta", 20));
        products.put("jn", new Clothing("Jeans", 50));
        products.put("pi", new Clothing("Pipo", 10));


    }

    public ArrayList<Thing> getItems() {
        return items;
    }

    public HashMap<String,Thing> getProducts() {
        return products;
    }
}
