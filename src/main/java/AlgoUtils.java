public class AlgoUtils {


    // Bubbelsortering
    // Vi sorterar arrayn ett elementpar i taget tills hela listan är sorterad
    public static String[] bubbleSort(String[] list) {
        int operations = 0;

        // Hur många element har vi kvar att sortera?
        int remaining = list.length;

        for (int i = 0; i < remaining - 1; i++) { // Omgångar

            for (int j = 0; j < list.length-1; j++) { // elementpar

                if (list[j].compareTo(list[j+1]) > 0) {

                    operations++;

                    // Byt plats på nuvarande element och nästa:
                    String temp = list[j]; // Spara nuvarande temporärt
                    list[j] = list[j + 1]; // Sätt nästas värde till nuvarande
                    list[j + 1] = temp; // Sätt temporära värdet till nästa
                }
            }
            remaining--;
        }

        System.out.println("bubbleSort-OPERATIONS: "+ operations);
        return list;
    }

    // Binärsökning, kolla på vilken sida av mitten elementet finns,
    // dela listan i två halvor, repetera.
    public static int arrayFindBin(String needle, String[] haystack) {
        int operations = 0;

        int left = 0;
        int right = haystack.length-1;

        while (left <= right) {
            operations++;

            // Räkna ut mittersta elementet på basis av nuvarande left och right
            int mid = left + (right - left) / 2;

            //Kolla om needle är det mittersta elementet
            if (haystack[mid].equals(needle)) {
                System.out.println("arrayFindBin-OPERATIONS: "+ operations);
                // Sökningen klar, returnera mid
                return mid;

            // Om mittersta elementet är mindre än needle
            } else if (haystack[mid].compareTo(needle) < 0 ) {
                // Mitten + 1 blir nya vänstra
                left = mid + 1;

            // Om needle är mindre än mittersta
            } else {
                // Mitten - 1 blir nya högra
                right = mid -1;
            }
        }
        return -1;
    }

    // sekventiell sökning O(n)
    // Loopa igenom arrayn tills elementet vi söker hittas
    public static int arrayFind(String needle, String[] haystack) {
        int operations = 0;

        for (int i = 0; i < haystack.length; i++) {
            operations++;

            if (needle.equals(haystack[i])) {
                System.out.println("arrayFind-OPERATIONS: "+ operations);
                return i;
            }
        }
        return -1;
    }

}
