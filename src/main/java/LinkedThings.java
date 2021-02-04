/**
 * Klass för att hantera en enkel länkad lista
 */
public class LinkedThings {

    Thing firstThing = null;
    Thing lastThing = null;

    /**
     * I likhet med add()-metoden i en ArrayList skapar vi här en egen
     * metod för att lägga till element till vår länkade lista
     */
    public void add(Thing newThing) {

        /* 1. Listan är tom */
        if (firstThing == null) {

            newThing.setNext(null);
            firstThing = newThing;
            lastThing = newThing;

        /* 2. Om newThing hamnar efter sista elementet */
        } else if (newThing.getName().compareTo(lastThing.getName()) > 0) {

            lastThing.setNext(newThing);
            newThing.setNext(null);
            lastThing = newThing;

        /* 3. Om newThing hamnar före det första elementet */
        } else if (newThing.getName().compareTo(firstThing.getName()) < 0) {

            newThing.setNext(firstThing);
            firstThing = newThing;

        /* 4. Om newThing hamnar någonstans i mitten av listan */
        } else {

            for (Thing t = firstThing; t.getNext() != null; t = t.getNext()) {

                String newName = newThing.getName();
                String nextName = t.getNext().getName();

                if (newName.compareTo(t.getName()) >= 0 && newName.compareTo(nextName) <= 0) {
                    newThing.setNext(t.getNext());
                    t.setNext(newThing);
                    break;
                }
            }
        }
    }


    /* Kolla om ett element existserar */
    public int thingSearch(String name) {
        int count = 0;
        Thing t = firstThing;
        while (t != null) {
            if (t.getName().equals(name)) {
                return count;
            }
            t = t.getNext();
            count++;
        }
        return -1;
    }





    /* räkna hur många element */
    public int size() {
        int count = 0;
        Thing t = firstThing;
        while (t != null) {
            t = t.getNext();
            count++;
        }
        return count;
    }

    /* loopa igenom listan (genom att kolla vilket element som
     * är nästa) och returnera elementens namn som String
     */
    public String listThings() {
        String ret = "";
        Thing t = firstThing;
        while (t != null) {
            ret = String.format("%s\n%s", ret, t.getName());
            t = t.getNext();
        }
        return ret;
    }

}
