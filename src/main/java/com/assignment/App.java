package com.assignment;

/**
 *  En klass för själva spellogiken, för att städa upp Main lite.
 */

public class App {

    public App(Player player) {

        Shop shop = new Shop();

        while (true) {

            System.out.format("Du har %s på dig\n", player.getEquippedName());

            Thing currentThing;

            System.out.println("--- Till salu (ArrayList):");
            for (int i = 0; i < shop.getItems().size(); i++) {

                currentThing = shop.getItems().get(i);
                System.out.format("[%d] %s - %s %.2f €\n",
                        i + 1,
                        currentThing.getThingType(),
                        currentThing.getName(),
                        currentThing.getPrice());
            }

            String shopAction;
            System.out.format("\nDu har %.2f €\n", player.getMoney());
            String prompt = String.format(
                    "Köp från ArrayList, välj [1-%d], [i] kolla inventory, eller [q] för att spara och avsluta\n",
                    shop.getItems().size());
            shopAction = Utils.getUserInput(prompt);


            if (Utils.isInteger(shopAction)) {

                int itemIdx = Integer.parseInt(shopAction) - 1;
                if (itemIdx < shop.getItems().size()) {
                    player.buyThing(shop.getItems().get(itemIdx));

                } else {
                    System.out.println("Ogiltigt produktnummer för ArrayList!\n");
                }
            } else if (shopAction.equalsIgnoreCase("i")) {

                System.out.println("--- Du har följande saker:");
                for (int i = 0; i < player.getInventory().getItems().size(); i++) {

                    currentThing = player.getInventory().getItems().get(i);

                    System.out.format("[%d] %s - %s\n",
                            i + 1,
                            currentThing.getThingType(),
                            currentThing.getName());
                }


                String inventoryAction = Utils.getUserInput(
                        String.format(
                            "Välj [1-%d], eller [q] för att gå tillbaka\n",
                            player.getInventory().getItems().size()
                        )
                );

                if (Utils.isInteger(inventoryAction)) {
                    Thing currentItem = player.getInventory().getItems().get(Integer.parseInt(inventoryAction)-1);

                    switch (currentItem.getThingType()) {
                        case CLOTHING:
                            player.equipItem(currentItem);
                            break;
                        case CAR:
                            System.out.println("Du kör omkring i din " + currentItem.getName());
                            break;
                        default:
                            break;
                    }

                }

            } else {

                break;
            }
        }
    }
}