package com.assignment;

abstract class Thing {

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
