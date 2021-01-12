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

		// Vi använder util-klassen Scanner för att läsa input från konsolen
		String playerName;
		// Skapa Scanner-objektet console
		Scanner console = new Scanner(System.in);
		System.out.println("Ditt namn:");
		// definiera variabeln playerName med raden som skrivs i konsolen
		playerName = console.nextLine();
		// objektet instansieras med det namn som Scannern läst in
		Player player = new Player(playerName);

		// Vi instansierar objetet car med av typen Things, som en instans av klassen Cars
		Things car = new Cars("Fiat", "500");

		// Kör loopen så länge som inte player är pank
		while (!player.isBroke()) {
			// Använd gettern getMoney()
			System.out.println("Du har " + player.getMoney());
			// Metoden buyThings() returnerar priset vi betalar
			System.out.println("Du köper en sak för  " + player.buyThings());
		}

		// Eftersom loopen tagit slut är player pank, och vi går vidare i programmet
		System.out.println(player.getName() + " är pank och kör hem i sin " + car.getName());


	}
}

