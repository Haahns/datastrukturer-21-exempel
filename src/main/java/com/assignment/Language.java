package com.assignment;

import java.util.HashMap;

/** Exempelklass för projektet.
 */
public class Language {

    private String content; // Språkets textinnehåll
    private LangLabel langLabel; // enum

    // HashMaps för olika slags statistik
    private HashMap<String,Integer> charCount = new HashMap<>();
    private HashMap<String,Double> charDistribution = new HashMap<>();

    // Konstruktor som tar emot textinnehåll och språk-label (enum)
    // Fundera ännu på hur vi ska göra med att instansiera ett objekt
    // för ett okänt språk.
    public Language(String content, LangLabel langLabel) {
        // Regex för att plocka bort allt som inte är bokstäver:
        // ( \\p{L} matchar alla unicode-bokstäver, ^ betyder "inte")
        this.content = content.replaceAll("[^\\p{L}]", "");
        this.langLabel = langLabel;

        calculateCharDistribution();
    }

    private void calculateCharDistribution() {

        for (int i = 0; i < content.length(); i++) {
            // Vi använder Character.toString för att typecasta char som
            // vi får från charAt() till Strings som är nyckeln i charCount
            String letter = Character.toString(content.charAt(i));

            // HashMap.getOrDefault() kan användas också på element som
            // eventuellt inte ännu har något värde
            charCount.put(letter, charCount.getOrDefault(letter, 0)+1);
        }

        for (String key : charCount.keySet()) {
            // Vi räknar ut procentuell andel av varje tecken
            double distr = (double) charCount.getOrDefault(key, 0) / (double) content.length() *100;
            charDistribution.put(key, distr);
        }

    }

    public String getContent() {
        return content;
    }

    public HashMap<String, Integer> getCharCount() {
        return charCount;
    }

    public HashMap<String, Double> getCharDistribution() {
        return charDistribution;
    }
}
