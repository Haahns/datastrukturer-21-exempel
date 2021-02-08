import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Randomiserad String-array som testdata
        String[] haystack = {
                "R", "S", "U", "T", "O", "B", "N", "H",
                "Z", "I", "Y", "X", "K", "L", "E", "F",
                "M", "J", "P", "W", "G", "A", "Q", "D",
                "C", "V", "Ra", "Sa", "Ua", "Ta", "Oa",
                "Ba", "Na", "Ha", "Za", "Ia", "Ya", "Xa",
                "Ka", "La", "Ea", "Fa", "Ma", "Ja", "Pa",
                "Wa", "Ga", "Aa", "Qa", "Da", "Ca", "Va",
        };


        String needle = "Fa";

        // Sekventiell sökning av den sorterade listan, tidskomplexitet O(n)
        System.out.println("arrayFind(unsorted): " + AlgoUtils.arrayFind(needle, haystack));

        System.out.println("arrayFind(unsorted): " + AlgoUtils.arrayFindR(needle, haystack));

        System.out.println(new LinkedThings().size());







    }
}

