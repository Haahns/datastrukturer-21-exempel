package com.assignment;

/** Abstrakt klass tänkt att fungera som superklass för Cars
 *
* Gränssnittet IThings implementeras här men dess metoder måste inte överskuggas här eftersom
* Things är abstrakt. Däremot måste de överskuggas i Cars som ärver Things.
 */
abstract class Things {

    private String name;

    Things(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
