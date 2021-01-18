package com.assignment;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String playerName;
		Scanner console = new Scanner(System.in);
		//System.out.println("Ditt namn:");
		//playerName = console.nextLine().toUpperCase();

		Player player = new Player("Fredrik");

		Shop shop = new Shop();

		while (true) {

			System.out.println("--- Till salu:");

			Thing currentThing;
			for (int i = 0; i < shop.getItems().size(); i++) {

				currentThing = shop.getItems().get(i);
				System.out.format("%d - %s %.2f €\n",
						i+1,
						currentThing.getName(),
						currentThing.getPrice());
			}

			System.out.format("Köp någonting, välj [1-%d] skriv [q] för att lämna butiken",
					shop.getItems().size());

			String shopAction = console.nextLine();

			if (shopAction.matches("\\d+")) {
				int itemIdx = Integer.parseInt(shopAction)-1;


				if (itemIdx < shop.getItems().size()) {

					Thing tng = shop.getItems().get(itemIdx);
					player.buyThing(tng);

					System.out.format("Ditt senaste inköp var %s, du har %.2f €\n",
							player.getLatestPurchase().getName(),
							player.getMoney());

				} else {
					System.out.println("Felaktigt val");
				}

			} else {
				System.out.println("Hej då!");
				break;
			}

		}


	}
}

