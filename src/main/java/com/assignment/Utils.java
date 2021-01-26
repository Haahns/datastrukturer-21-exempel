package com.assignment;

import java.util.Scanner;

/** En utility-klass för statiska metoder som inte har någon
 * annan naturlig plats.
 *
 */
public class Utils {

    // Testa om en sträng är ett heltal
    public static boolean isInteger(String str) {
        return str.matches("\\d+");
    }

    // Be användaren svara på en fråga och returnera svaret
    public static String getUserInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextLine().trim();
    }
}
