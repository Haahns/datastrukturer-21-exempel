package com.assignment;

import java.util.Random;

public class Player {

    private String name;

    private double money = 100.0;
    // https://en.wikipedia.org/wiki/Floating-point_arithmetic#Accuracy_problems

    /**
     * En klassvariabel har samma värde i alla instanser av klassen,
     * nyckelordet static gör variabeln till en klassvariabel.
     */
    static int playerCounter = 0;


    /**
     * Konstruktormetoden körs när klassen instansieras och har alltid
     * samma namn (med stor begynnelsebokstav) som klassen
     */
    public Player(String name) {
        setName(name);
        playerCounter++; // räknaren ökar med 1 varje gång klassen instansieras
    }


    /**
     * Getters och setters
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double buyThings() {
        double thingPrice;
        // Vi skapar ett slumptal mellan 1 och 50.
        // Här är två sätt att göra samma sak:

        // 1. Math.random() är det traditionella sättet att generera slumptal
        // Formeln för en range är Math.random()*(max-min+1)+min, alltså:
        thingPrice = Math.random() * (50) + 1;

        // 2. Random-klassen har metoder för slumptalsgenerering av olika datatyp,
        // är snabbare, och genererar bättre slumptal (mindre förutsägbara).
        thingPrice = new Random().nextInt(50)+1;

        setMoney(money - thingPrice);

        return thingPrice;
    }

    // Man brukar namnge boolean-metoder med "is" eller "has" som förled, t.ex. isBroke() eller hasMoney()
    public boolean isBroke() {
        return money <= 0; // Returnerar true om money är <= 0
    }

}
