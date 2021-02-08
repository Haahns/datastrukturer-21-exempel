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

        // Iterativ sökning
        System.out.println("arrayFind(unsorted): " + AlgoUtils.arrayFind(needle, haystack));
        // Rekursiv sökning
        System.out.println("arrayFindR(unsorted): " + AlgoUtils.arrayFindR(needle, haystack));

        // Iterativ storlek
        System.out.println("size(): " + new LinkedThings().size());
        // Rekursiv storlek
        System.out.println("sizeR(): " + new LinkedThings().sizeR());







    }
}

