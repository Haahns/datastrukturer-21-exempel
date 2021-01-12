package com.assignment;

public class Player {

    // åtkomst datatyp variabelnamn = "värde"
    private String name;
    private double money = 100.0;
    // https://en.wikipedia.org/wiki/Floating-point_arithmetic#Accuracy_problems
    static int playerCounter = 0;

    /**
     * Konstruktormetoden körs när klassen instansieras och har alltid
     * samma namn (med stor begynnelsebokstav) som klassen
     */
    public Player(String name) {
        setName(name);
        playerCounter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public boolean isBroke() {
        /*boolean ret = false;
        if (money <= 0) {
            ret = true;
        }
        return ret;*/
        return money <= 0;
    }

}
