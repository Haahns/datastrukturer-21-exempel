package com.assignment;

// Implementera Comparable-gränssnittet för att kunna skapa
// komparator med compareTo(). Vi ska i det här fallet jämföra
// Klassen med en annan instans av sig själv, därför <Thing>
public class Thing implements Comparable<Thing> {

    private String name;
    private double price;

    Thing(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    // Vi måste använda klasstypen Double i stället för primitiv double
    // för att få tillgång till datatypens metoder (compareTo() i det här fallet)
    public Double getPrice() {
        return price;
    }

    // Överskugga compareTo från Comparable
    @Override
    public int compareTo(Thing otherThing) {
        return getPrice().compareTo(otherThing.getPrice());
    }
}
