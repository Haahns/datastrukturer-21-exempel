package com.assignment;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/** Shoppen listar varor både som Arraylist och HashMmap
		 *  för att demonstrera båda teknikerna.
		 *
		 *  I dessa exempel borde allt som behövs för uppgift 3 finnas!
		 */

		// Scanner-objekt för att läsa input
		Scanner console = new Scanner(System.in);
		// Skapa spelare som har 100 €
		Player player = new Player("Fredrik", 100);
		// Instansiera själva shoppen
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


			// 2. HashMap-loop
			System.out.println("--- Till salu (HashMap):");
			for (String key : shop.getProducts().keySet()) {
				currentThing = shop.getProducts().get(key);

				System.out.format("[%s] - %s %.2f €\n",
						key,
						currentThing.getName(),
						currentThing.getPrice());
			}
			// Skriv ut menyn
			System.out.format("Köp från HashMap, skriv produktkod eller [q] för att lämna butiken\n");

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

			// shopAction är vad som helst utom q, vi köper från HashMap
			} else if (!shopAction.equalsIgnoreCase("q")) {  // Vi köper från HashMap

				// Finns nyckeln i HashMap?
				if (shop.getProducts().containsKey(shopAction)) {

					// Använd get() för att hämta rätt sak ur HashMappen,
					// åkalla player.buyThing() för att köpa den
					player.buyThing(shop.getProducts().get(shopAction));

				} else {
					System.out.println("Ogiltig produktkod för HashMap!\n");
				}

			// shopAction är "q" - lämna butiken
			} else {
				System.out.println("Hej då!");
				break;
			}



		}


	}
}

