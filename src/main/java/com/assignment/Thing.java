package com.assignment;

/** Abstrakt klass tänkt att fungera som superklass för Cars
 *
* Gränssnittet IThings implementeras här men dess metoder måste inte överskuggas här eftersom
* Things är abstrakt. Däremot måste de överskuggas i Cars som ärver Things.
 */
abstract class Thing {

    private String name;
    double price;

    Thing(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // En abstrakt metod måste finnas med i subklasserna
    // Det garanterar att alla objekt av typen Thing har den här metoden
    abstract double getPrice();

}
