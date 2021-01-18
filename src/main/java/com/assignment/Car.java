package com.assignment;

// Subklassen Cars ärver superklassen Things
public class Car extends Thing {

    // Vi vill ha en skild variabel för bilmodell
    private String model;
    public Car(String name, String model) {
        super(name); // kör konstruktorn Things()
        this.model = model;
    }

    /** Överskuggning:
     * Eftersom vi vill att getName() ska fungera på annat sätt här än i Things,
     * överskuggar vi superklassens metod med en med samma namn.
     * För att klargöra att det är en överskuggning annoterar vi med @Override
     *
     * Vi har nu uppnått polymorfism: Metoden getName() i ett objekt av typen Things beter sig
     * på olika sätt beroende på vilken subklass som används.
     */
    @Override
    public String getName() {
        return super.getName() + " " + model;
    }

    @Override
    double getPrice() {
        return 0;
    }


}
