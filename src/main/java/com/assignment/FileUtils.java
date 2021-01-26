package com.assignment;

import java.io.*;
import java.nio.charset.StandardCharsets;


/**
 *  En utility-klass där alla metoder för att behandla filer finns samlade
 *
 */
public class FileUtils {




    /** saveObject serialiserar ett objekt och sparar i en fil.
     *
     * @param objectToSave
     * @param fileName
     */
    public static void saveObject(Object objectToSave, String fileName) {

        try {
            FileOutputStream outStream = new FileOutputStream(fileName);
            ObjectOutputStream obj = new ObjectOutputStream(outStream);

            obj.writeObject(objectToSave);


            obj.close();
            outStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /** loadObject läser ett serialiserat objekt och returnerar
     * ett användbart java-objekt.
     *
     * @param fileName
     * @return Object
     */
    public static Object loadObject(String fileName) {

        Object retObj = null;

        try {

            // Man kan nästla FileInputStream i ObjectInputStream om man inte vill
            // instansiera dem i skilda objekt (som vi gör ovan i saveObject())
            ObjectInputStream obj = new ObjectInputStream(new FileInputStream(fileName));

            retObj = obj.readObject();

            obj.close();

        } catch (FileNotFoundException e) {
            System.out.println("No savefile found.");
        } catch (InvalidClassException e) {
            System.out.println("Invalid class, save file unusable.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found!");

        }

        return retObj;

    }

    /** Omvandlar en String-variabel till en dataström
     * och sparar den i en fil
     *
     * @param saveStr
     * @param fileName
     */
    public static void writeTextFile(String saveStr, String fileName) {

        try {

            FileOutputStream outStream = new FileOutputStream(fileName);
            OutputStreamWriter writer = new OutputStreamWriter(outStream, StandardCharsets.UTF_8);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write(saveStr);
            bufferedWriter.close();

            /* Utan BufferedWriter måste vi skriva strömmen tecken för tecken.
            * BufferedWriter rekommenderas.

            for (int i = 0; i < saveStr.length(); i++) {
                writer.write(saveStr.charAt(i));
            }

            writer.close();

            */


        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /** readTextFile() läser en dataström från en fil och returnerar String
     *
     * @param fileName
     * @return String
     */
    public static String readTextFile(String fileName) {

        StringBuilder retStr = new StringBuilder();

        try {
            FileInputStream inputStream = new FileInputStream(fileName);
            InputStreamReader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(reader);

            // Då vi använder bufferedReader kan vi ta en hel rad i gången
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                retStr.append(line);
            }

            reader.close();

        } catch (FileNotFoundException e) {
            return fileName + " not found";
        } catch (IOException e) {
            e.printStackTrace();
        }

        return retStr.toString();

    }
}
