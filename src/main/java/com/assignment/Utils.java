package com.assignment;

import java.util.Scanner;

public class Utils {

    public static boolean isInteger(String str) {
        return str.matches("\\d+");
    }

    public static String getUserInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextLine().trim();
    }
}
