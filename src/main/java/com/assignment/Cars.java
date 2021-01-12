package com.assignment;

// Subklass
public class Cars extends Things {

    private String model;

    public Cars(String name, String model) {
        super(name);
        this.model = model;
    }

    @Override
    public String getName() {
        return super.getName() + " " + model;
        //return String.format("%s %s", super.getName(), model);
    }

}
