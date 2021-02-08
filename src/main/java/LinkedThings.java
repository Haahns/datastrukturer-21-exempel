public class LinkedThings {

    Thing hat = new Thing("Hatt", null);
    Thing shirt = new Thing("Skjorta", hat);
    Thing pants = new Thing("Byxor", shirt);
    Thing shoes = new Thing("Skor", pants);

    Thing firstThing = shoes;



    /** få storleken genom simpel loop
    public int size() {
        int count = 0;
        Thing t = firstThing;
        while (t != null) {
            count++;
            t = t.getNext();
        }
        return count;
    }
     */

    public int size() {
        return size(firstThing);
    }
    private int size(Thing thing) {
        if (thing == null) {
            return 0;
        } else {
            return 1 + size(thing.getNext());
        }

    }
}
