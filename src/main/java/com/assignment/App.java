package com.assignment;

/**
 *  En klass för själva spellogiken, för att städa upp Main lite.
 */

public class App {

    public App(Player player) {

        Shop shop = new Shop();

        while (true) {
            if (player.getLatestPurchase() != null) {
                System.out.format("----------\nDitt senaste inköp var %s, du har %.2f €\n",
                        player.getLatestPurchase().getName(),
                        player.getMoney());
            }

            Thing currentThing;

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


            if (Utils.isInteger(shopAction)) {

                int itemIdx = Integer.parseInt(shopAction) - 1;
                if (itemIdx < shop.getItems().size()) {
                    player.buyThing(shop.getItems().get(itemIdx));

                } else {
                    System.out.println("Ogiltigt produktnummer för ArrayList!\n");
                }


            } else {

                break;
            }
        }
    }
}