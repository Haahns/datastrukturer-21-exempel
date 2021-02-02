
public class Main {

    public static void main(String[] args) {

        // Helper-array för att underlätta skapandet av flera objekt,
        // kan lika gärna ersättas med en linkList.add(new Thing("foo")) för varje
        String[] thingNames = { "byxor", "skjorta", "shorts", "bandana", "pipo" };


        for (String currentName: thingNames ) {

            System.out.println(new Thing(currentName).getName());
        }



    }
}

