package com.assignment;

public class Clothing extends Thing {

    private String size;

    public Clothing(String name, double price) {
        super(name);

        /*
         price är inte privat i superklassen, alltså kommer vi
         åt den direkt med nyckelordet super
         Normalt ska man ju undvika publika attribut, men den abstrakta klassen
         Things kan ändå inte instansieras, så man kommer inte åt variabeln direkt utifrån
        */
        super.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

}
