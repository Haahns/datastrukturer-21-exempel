package com.assignment;

import java.util.ArrayList;

public class Inventory {

    ArrayList<Thing> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Thing thing) {
        items.add(thing);
    }

    public ArrayList<Thing> getItems() {
        return items;
    }
}


/*
Så här skulle vår struktur ungefär se ut i JSON:
{
    "CLOTHING": [
        { "name": "shirt" },
        { "name": "jeans" },
        { "name": "bandana" }
    ],
    "CARS": [
        { "name": "fiat" },
        { "name": "tesla" }
    ]
}

*/
