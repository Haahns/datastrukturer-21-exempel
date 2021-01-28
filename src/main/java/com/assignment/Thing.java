package com.assignment;

import java.io.Serializable;

abstract class Thing implements Serializable {

    private String name;
    double price;

    ThingType thingType;

    Thing(String name) {
        this.name = name;
    }

    public ThingType getThingType() {
        return thingType;
    }

    public String getName() {
        return name;
    }

    abstract double getPrice();

}
