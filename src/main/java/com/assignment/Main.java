package com.assignment;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 *  Olika exempel för Projekt 2. Observera att dessa inte får vara i main()-metoden i
 *  själva projektet :)
 */
public class Main {

	public static void main(String[] args) {

		ArrayList<Language> languages = new ArrayList<>();
		HashMap<LangLabel,Language> languagesMap = new HashMap<>();

		/** 1. Exempel på hur vi kan sortera en lista med objekt
		 * på basis av ett fält i objektet. I det här fallet
		 * vill vi ordna things enligt pris
		 *
		 */
		System.out.println("\n1. ------------");
		ArrayList<Thing> things = new ArrayList<>();
		things.add(new Thing("Skjorta", 30.5));
		things.add(new Thing("Byxor", 40));
		things.add(new Thing("Mössa", 10));
		things.add(new Thing("Strumpor", 5.9));
		//
		// Collections.sort() använder komparatorn vi skapade i Thing
		// Och ordnar things i stigande prisordning
		Collections.sort(things);
		// reverse() gör ordningen omvänd (dyrast först i det här fallet)
		Collections.reverse(things);
		// Skriv ut nya ordningen
		for (Thing thing : things) {
			System.out.format("%s %.2f\n",
					thing.getName(),
					thing.getPrice());
		}

		// 2. Loopa en sträng ord för ord
		System.out.println("\n2. ------------");
		String words = "You will rejoice to      hear that no disaster";
		// replace ett eller flera mellanslag till ett mellanslag, splitta sedan till array
		String[] wordsArr = words.replaceAll("\\s+", " ").split(" ");
		for (String word : wordsArr) {
			System.out.println(word);
		}

		// 3. Loopa enum
		System.out.println("\n3. ------------");
		for (LangLabel lang : LangLabel.values()) {
			// Skriv ut enumens namn
			System.out.println(lang.getName());
			// Exempel: sätt in instanser av Language i en HashMap med enum som nyckel
			languagesMap.put(
					lang,
					new Language(FileUtils.readFile("assets/lang-samples/" + lang + ".txt"), lang)
			);
		}


		/**4. Exempeloperationer på Language-objekt
		*
		* Plocka ut ett språk som vi instansierat tidigare
		 */
		System.out.println("\n4. ------------");
		LangLabel curLabel = LangLabel.EN;
		Language curLang = languagesMap.get(curLabel);
		// Slriv ut totalt antal tecken
		System.out.println(curLabel.getName());
		System.out.println("charCount: "+ curLang.getContent().length());
		// Loopa ut charDistribution

		for (String key : curLang.getCharDistribution().keySet()) {
			System.out.format("%s: %.2f,\n", key, curLang.getCharDistribution().get(key));

		}
	}
}

