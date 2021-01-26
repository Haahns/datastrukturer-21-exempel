package com.assignment;

public class Main {

    public static void main(String[] args) {

        Player player;

        /** Instansiera player från förra spelets save,
         * eller instansiera ett nytt Player-objekt om det inte finns
         * någon save.
         *
          */
        String saveFile = "player.save"; // Kom ihåg att lägga till i .gitignore!
        if (FileUtils.loadObject(saveFile) != null) {
            // loadObject() returnerar typen Object, så vi måste konvertera till Player
            // med en "type cast", alltså nya typen i parentes före värdet av gamla typen.
            player = (Player) FileUtils.loadObject(saveFile);
        } else {
            // Ingen användbar save hittas, instansiera ett nytt objekt
            player = new Player("New Me", 100);
        }

        // Vi använder vår writeTextFile()-metod för att skriva en fil
        FileUtils.writeTextFile("Hello textfile!", "hello.txt");
        // Vi läser in innehållet i filen till en String
        String readStr = FileUtils.readTextFile("hello.txt");
        System.out.println("Filen innehåller: " + readStr);


        /**OBS flyttar bara för att få bort det som inte
        * har med Själva spel-loopen till en egen klass.
         * Detta behövs inte för att få savegame att funka.
         */
        new App(player);

        // Vi sparar player-objektet i vår save-fil.
        FileUtils.saveObject(player, saveFile);
        System.out.println("Game saved to file: " + saveFile);

    }
}

