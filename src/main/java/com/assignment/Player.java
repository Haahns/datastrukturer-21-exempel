package com.assignment;

import java.io.Serializable;

// Eftersom objekt av den här klassen ska sparas i en fil måste vi implementera Serializable
public class Player implements Serializable {

    private String name;
    private double money;

    Inventory inventory;

    Thing equippedItem = null;

    public Player(String name, double money) {
        this(name);
        this.money = money;
    }
    public Player(String name) {
        setName(name);

        // Vi instansierar inventory här eftersom
        // Den här konstruktorn körs också av den överlagrade varianten ovan
        inventory = new Inventory();
    }

    public void buyThing(Thing thing) {
        if (thing.getPrice() <= money) {
            // Minska players pengar
            money = money - thing.getPrice();
            // Lägg till saken i players inventory
            inventory.addItem(thing);

        } else {
            System.out.format("Du har inte råd med %s!\n", thing.getName());
        }
    }

    // Getter för spelarens inventory-objekt
    // Ingen egen setter behövs eftersom man kan köra
    //  player.getInventory().addItem();
    public Inventory getInventory() {
        return inventory;
    }

    // körs när vi väljer någonting ur inventory
    public void equipItem(Thing thing) {
        equippedItem = thing;
    }
    // Returnerar namnet på det vi har equipped
    public String getEquippedName() {
        if (equippedItem != null) {
            return equippedItem.getName();
        } else {
            return "ingenting";
        }
    }
    // Returnerar hela objektet vi har equipped
    public Thing getEquipped() {
        return equippedItem;
    }


    // Övriga getters/setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getMoney() {
        return money;
    }

}
