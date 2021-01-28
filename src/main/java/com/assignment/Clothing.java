package com.assignment;

public class Clothing extends Thing {

    private String size;

    public Clothing(String name, double price) {
        super(name);
        super.price = price;

        // Definiera ThingType (enum) för Clothing
        thingType = ThingType.CLOTHING;
    }

    @Override
    public double getPrice() {
        return price;
    }

}
