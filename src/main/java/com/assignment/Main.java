package com.assignment;

public class Main {

    public static void main(String[] args) {

        /** All programlogik flyttad till App-klassen
        *  Man kan ha viss logik kvar i main(), t.ex. behandling av args[], eller annat som
         *  har med hur programmet ska starta upp eller avslutas att göra.
         *
         *  Som exempel matar jag här in namnet på save-filen, så om man vill byta save
         *  kan man göra det enkelt härifrån, men det är fritt fram att själv fundera ut
         *  hur mycket grejer (om alls någonting) man vill ha i main().
         *
         */
        new App("player.save");

    }
}

