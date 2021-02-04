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

        String needle = "Ja";

        // Sortera haystack med bubbleSort och spara i skild variabel, tidskomplexitet O(n²)
        // (Vi använder här Arrays.copyOf() för att få en ny kopia av arrayn. Annars kommer
        // den ursprungliga haystack att sorteras.)
        String[] sorted_list = AlgoUtils.bubbleSort(Arrays.copyOf(haystack, haystack.length));
        // Skriv ut den sorterade listan
        System.out.println("bubbleSort: " + Arrays.toString(sorted_list));

        // Sekventiell sökning av den sorterade listan, tidskomplexitet O(n)
        System.out.println("arrayFind(unsorted): " + AlgoUtils.arrayFind(needle, haystack));
        // Sekventiell sökning av den osorterade listan, tidskomplexitet O(n)
        System.out.println("arrayFind(sorted): " + AlgoUtils.arrayFind(needle, sorted_list));

        // Binärsökning av den sorterade listan (kan inte göras på en osorterad!), tidskomplexitet O(log n)
        System.out.println("arrayFindBin: " + AlgoUtils.arrayFindBin(needle, haystack));

    }
}

