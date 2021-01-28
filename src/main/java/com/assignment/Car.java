package com.assignment;

// Subklassen Cars ärver superklassen Things
public class Car extends Thing {

    // Vi vill ha en skild variabel för bilmodell
    private String model;
    public Car(String name, String model, double price) {
        super(name); // kör konstruktorn Things()
        this.model = model;
        this.price = price;

        // Definiera ThingType (enum) för Car
        thingType = ThingType.CAR;
    }
    @Override
    public String getName() {
        return super.getName() + " " + model;
    }

    @Override
    double getPrice() {
        return price;
    }


}
