package com.assignment;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *  Inventory-klass, tänkt att instansieras i Player
 *
 *  Eftersom objekt av den här klassen används i Player
 * som ska sparas i en fil måste vi implementera Serializable
 */
public class Inventory implements Serializable {

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


