package com.assignment;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		Player player = new Player("Fredrik", 100);
		Shop shop = new Shop();

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
						i+1,
						currentThing.getName(),
						currentThing.getPrice());
			}
			// Skriv ut menyn
			System.out.format("Köp från ArrayList, välj [1-%d] eller [q] för att lämna butiken\n",
					shop.getItems().size());

			// Läs användarens input, String.trim() tar bort onödig whitespace
			String shopAction = console.nextLine().trim();

			// shopAction är ett heltal, vi köper från Arraylist
			if (shopAction.matches("\\d+")) {

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
				System.out.println("Hej då!");
				break;
			}



		}


	}
}

