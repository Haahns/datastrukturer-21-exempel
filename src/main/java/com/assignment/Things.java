package com.assignment;

// Abstrakt klass tänkt att fungera som superklass för Cars
abstract class Things {

    private String name;

    /**
     * Vi behöver inte ange åtkomst för konstruktorn eftersom
     * det inte går att instansiera en abstrakt klass.
     * I normala fall skulle vi antagligen ha public här.
     *
     */
    Things(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
