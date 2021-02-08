public class AlgoUtils {


    // Loopa igenom arrayn iterativt tills elementet vi söker hittas
    public static int arrayFind(String needle, String[] haystack) {

        for (int i = 0; i < haystack.length; i++) {
            if (needle.equals(haystack[i])) {
                return i;
            }
        }
        return -1;
    }

    // Samma sökning i rekursiv form
    public static int arrayFindR(String needle, String[] haystack) {
        return arrayFindR(needle, haystack, 0);
    }
    private static int arrayFindR(String needle, String[] haystack, int i) {
        if (i >= haystack.length) {
            return haystack.length*-1;
        } else if (needle.equals(haystack[i])) {
            return 0;
        } else {
            return 1 + arrayFindR(needle, haystack, i+1);
        }

    }


}
