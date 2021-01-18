package com.assignment;

import java.util.Random;

public class Player implements Actions {

    private String name;
    String currency = "EUR";
    private double money = 100.0;

    Thing latestPurchase;


    /** Överlagring av konstruktor
     * - objekt kan initieras både av Player("Foo") och Player("Foo", 100)
     */
    public Player(String name, double money) {
        this(name);
        setMoney(money);

    }
    public Player(String name) {
        setName(name);
    }


    /** Överlagring av vanliga metoder
     * - Fungerar som default-parametrar så
     * - Man kan köra både player.setMoney(100) och player.setMoney(100, "USD")
     */
    public void setMoney(double money) {
        setMoney(money, this.currency);
    }
    public void setMoney(double money, String currency) {
        this.money = money;
        this.currency = currency;
    }
    // Överlagring kan också betyda att metoden kan ta emot parametrar av annan typ
    // Vi kan t.ex. överlagra setMoney() så att den kan ta emot String,
    // Alltså t.ex. player.setMoney("100")
    public void setMoney(String money) {
        this.money = Integer.parseInt(money); // parseInt() gör om ett heltal i form av sträng till riktigt heltal
    }

    public void buyThing(Thing thing) {
        money = money - thing.getPrice();
        latestPurchase = thing;
        //return String.format("Du köpte %s för %.2f", thing.getName(), thing.getPrice());
    }

    public Thing getLatestPurchase() {
        return latestPurchase;
    }



    /** GRÄNSSNITT och ÖVERSKUGGNING
     *
     *Överskuggning av gränssnittsmetoden buyThings().
     * Metoden måste finnas med eftersom den finns i ett gränssnitt som implementeras
     * av den här klassen
     * Annoteras med @Override både för kompilerarens och programmerarens skull
     *
     */
    @Override
    public double buyThings() {
        double thingPrice;

        thingPrice = new Random().nextInt(50)+1;

        setMoney(money - thingPrice);

        return thingPrice;
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
