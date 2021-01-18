package com.assignment;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String playerName;
		Scanner console = new Scanner(System.in);
		System.out.println("Ditt namn:");
		playerName = console.nextLine();

		// Man kan deklarera flera variabler/objekt av samma typ på en gång så här
		Player player, npc, currentPlayer, passivePlayer, tmpPlayer;

		player = new Player(playerName);
		npc = new Player("Datorn");

		player.setCar(new Cars("Fiat", "500"));

		// NY VERSION SOM LOOPAR TVÅ SPELARE

		// "player" får börja
		currentPlayer = player; // Den som köper
		passivePlayer = npc; // Den som väntar på sin tur

		// Yttre loop som håller på så länge inte den spelare som var aktiv senast är pank
		while (!passivePlayer.isBroke()) {

			// Inre loop som loopar två gånger, men avbryter i förtid om spelaren blir pank
			for (int i = 0; i < 2 && !passivePlayer.isBroke(); i++) {

				// Kör spelsekvensen för currentPlayer
				// Vi använder format för att formatera texten.
				// PLACEHOLDERS: %s = String, %d = int, %.2f = flyttal avrundat till två decimaler
				// Man kan byta rad mellan parametrarna så blir det inte så långa rader och bättre läslighet.
				System.out.format("%s har %.2f, köper för %.2f €, har %.2f € kvar\n",
						currentPlayer.getName(),
						currentPlayer.getMoney(),
						currentPlayer.buyThings(),
						currentPlayer.getMoney());

				// Byt roll sinsemellan för andra varvet av for-loopen
				tmpPlayer = passivePlayer;
				passivePlayer = currentPlayer;
				currentPlayer = tmpPlayer;
			}
		}

		// Vi vet att passivePlayer är pank eftersom det var den som var activePlayer i sista köpet
		System.out.format("%s är pank och kör hem i sin %s. %s har ännu %.0f € kvar\n",
				passivePlayer.getName(),
				passivePlayer.getCar().getName(),
				currentPlayer.getName(),
				currentPlayer.getMoney());

	}
}

