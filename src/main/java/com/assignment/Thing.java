package com.assignment;

import java.io.Serializable;

abstract class Thing implements Serializable {

    private String name;
    double price;

    Thing(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract double getPrice();

}
