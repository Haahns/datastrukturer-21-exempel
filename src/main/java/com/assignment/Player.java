package com.assignment;

import java.io.Serializable;
import java.util.Random;

public class Player implements Serializable, Actions {

    private String name;
    private double money;

    private int number = 5;

    Thing latestPurchase;

    public Player(String name, double money) {
        this(name);
        this.money = money;

    }
    public Player(String name) {
        setName(name);
    }

    @Override
    // Köp en sak.
    // I den här demon sparar den bara det senast köpta, men
    // Här kunde man lika bra lägga in saken i en ny ArrayList för Inventory
    // Den här metoden påminner också om en setWeapon()-metod man kan använda i spelet...
    public void buyThing(Thing thing) {
        // Har vi råd med saken? Ingen kredit i den här butiken!
        if (thing.getPrice() <= money) {
            money = money - thing.getPrice();
            latestPurchase = thing;
        } else {
            System.out.format("Du har inte råd med %s!\n", thing.getName());
        }
    }

    // Visa vårt senaste uppköp
    public Thing getLatestPurchase() {
        return latestPurchase;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public boolean isBroke() {
        return money <= 0;
    }


}
