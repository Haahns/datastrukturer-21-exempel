package com.assignment;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileUtils {

    public static void writeTextFile(String saveStr, String fileName) {

        try {

            FileOutputStream outStream = new FileOutputStream(fileName);
            OutputStreamWriter writer = new OutputStreamWriter(outStream, StandardCharsets.UTF_8);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            /*for (int i = 0; i < saveStr.length(); i++) {
                writer.write(saveStr.charAt(i));
            }*/

            bufferedWriter.write(saveStr);
            //writer.close();

            bufferedWriter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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
