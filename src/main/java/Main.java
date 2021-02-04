import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        String[] haystack = {
               // "A", "B", "C", "D", "E", "F", "G", "H","I", "J", "K", "L", "M", "N", "O", "P","Q", "R", "S", "T", "U", "V", "X", "Y", "Z"
               "R", "S", "U", "T", "O", "B", "N", "H", "Z",
                "I", "Y", "X", "K", "L", "E", "F", "M", "J",
                "P", "W", "G", "A", "Q", "D", "C", "V",
                "Ra",  "Sa",  "Ua",  "Ta",  "Oa",  "Ba",
                "Na",  "Ha",  "Za",  "Ia",  "Ya",  "Xa",
                "Ka",  "La",  "Ea",  "Fa",  "Ma",  "Ja",
                "Pa",  "Wa",  "Ga",  "Aa",  "Qa",  "Da",
                "Ca",  "Va",
        };

        System.out.println("arrayFind: " + AlgoUtils.arrayFind("X", haystack));

        System.out.println("unsorted: " + Arrays.toString(haystack));

        // Sortera haystack med bubbleSort och spara i skild variabel
        String[] sorted_list = AlgoUtils.bubbleSort(haystack);

        System.out.println("bubbleSort: " + Arrays.toString(sorted_list));

        System.out.println("arrayFindBin: " + AlgoUtils.arrayFindBin("X", haystack));

    }
}

