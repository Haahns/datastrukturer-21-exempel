public class LinkedThings {

    Thing firstThing = null;
    Thing lastThing = null;

    public void add(Thing newThing) {

        /* 1. Listan är tom */
        if (firstThing == null) {

            System.out.println("1." + newThing.getName());

            newThing.setNext(null);
            firstThing = newThing;
            lastThing = newThing;

        /* 2. Om newThing hamnar efter sista elementet */
        } else if (newThing.getName().compareTo(lastThing.getName()) > 0) {

            System.out.println("2." + newThing.getName());

            lastThing.setNext(newThing);
            newThing.setNext(null);
            lastThing = newThing;

        /* 3. Om newThing hamnar före det första elementet */
        } else if (newThing.getName().compareTo(firstThing.getName()) < 0) {

            System.out.println("3." + newThing.getName());

            newThing.setNext(firstThing);
            firstThing = newThing;

        /* 4. Om newThing hamnar någonstans i mitten av listan */
        } else {

            System.out.println("4." + newThing.getName());

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
