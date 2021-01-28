package com.assignment;

import java.io.Serializable;

// Eftersom objekt av den här klassen används i Player
// som ska sparas i en fil måste vi implementera Serializable
abstract class Thing implements Serializable {

    String name;
    double price;

    // enum för typ av Thing
    ThingType thingType;

    Thing(String name) {
        this.name = name;
    }

    // Getter för enum
    public ThingType getThingType() {
        return thingType;
    }

    public String getName() {
        return name;
    }

    abstract double getPrice();

}
