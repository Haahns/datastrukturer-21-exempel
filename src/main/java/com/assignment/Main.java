package com.assignment;

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

		/** Player-klassen instansieras enligt formeln
		 *  Datatyp objektnamn = new Konstruktor();
		 */
		Player player = new Player("Foo");
		Player player2 = new Player("Bar");

		player.setMoney(0);
		player2.setMoney(50);

		// Skriv ut på kommandoraden
		System.out.println("Hello " + player.getName());

		if (player.isBroke()) {
			System.out.println(player.getName() + " är pank.");
		}
		if (player2.isBroke()) {
			System.out.println(player2.getName() + " är pank.");
		}


	}
}

