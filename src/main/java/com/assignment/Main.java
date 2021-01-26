package com.assignment;

public class Main {

    public static void main(String[] args) {

        String saveFile = "player.save";
        Player player;

        if (FileUtils.loadObject(saveFile) != null) {
            player = (Player) FileUtils.loadObject("player.save");
        } else {
            player = new Player("New Me", 100);
        }


        Shop shop = new Shop();


        FileUtils.writeTextFile("Hello3!", "hello.txt");
        String readStr = FileUtils.readTextFile("hello.txt");
        System.out.println("Filen innehåller:" + readStr);

        // Loopa på tills det kommer en break
        while (true) {

            // Visa senaste inköp och pengar kvar.
            if (player.getLatestPurchase() != null) {
                System.out.format("----------\nDitt senaste inköp var %s, du har %.2f €\n",
                        player.getLatestPurchase().getName(),
                        player.getMoney());
            }

            // container-objekt för att snygga till looparna
            Thing currentThing;

            // 1. ArrayList-loop
            System.out.println("--- Till salu (ArrayList):");
            for (int i = 0; i < shop.getItems().size(); i++) {

                currentThing = shop.getItems().get(i);
                System.out.format("[%d] - %s %.2f €\n",
                        i + 1,
                        currentThing.getName(),
                        currentThing.getPrice());
            }

            String shopAction;

            String prompt = String.format("Köp från ArrayList, välj [1-%d] eller [q] för att spara och avsluta\n", shop.getItems().size());
            shopAction = Utils.getUserInput(prompt);

            // shopAction är ett heltal, vi köper från Arraylist
            if (Utils.isInteger(shopAction)) {

                // Skapa ett riktigt heltal av shopAction, minska med ett för array-index
                int itemIdx = Integer.parseInt(shopAction) - 1;

                // Är index inom ramarna för ArrayList?
                if (itemIdx < shop.getItems().size()) {

                    // Använd get() för att hämta rätt sak ur ArrayListen
                    // åkalla player.buyThing() för att köpa den
                    player.buyThing(shop.getItems().get(itemIdx));

                } else {
                    System.out.println("Ogiltigt produktnummer för ArrayList!\n");
                }


                // shopAction är "q" - lämna butiken
            } else {
                FileUtils.saveObject(player, saveFile); // gitignore!

                System.out.println("Game saved!");
                break;
            }


        }


    }
}

