package com.assignment;

import java.util.Scanner;

public class Main {

	/** main()-metoden körs när man startar programmet
	 *  public = Kan köras från andra klasser, och av java runtime
	 * 	static = kan köras utan att instansiera klassen
	 * 	void = returtyp, void = returnerar ingenting
	 * 	main() = metodens namn
	 * 	String[] args = en array av argument som kan tas emot av programmet
	 * 		(kommandoradsargument, t.ex. i "git status" är "status" ett kommandoradsargument.)
 	 */
	public static void main(String[] args) {

		String playerName;

		Scanner console = new Scanner(System.in);
		System.out.println("Ditt namn:");
		playerName = console.nextLine();

		Player player = new Player(playerName);

		Things car = new Cars("Fiat", "500");

		// Skriv ut på kommandoraden
		while (!player.isBroke()) {
			System.out.println("Du har " + player.getMoney());
			System.out.println("Du köper en sak för  " + player.buyThings());
		}

		System.out.println(player.getName() + " är pank och kör hem i sin " + car.getName());


	}
}

