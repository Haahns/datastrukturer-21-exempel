public class LinkedThings {

    Thing hat = new Thing("Hatt", null);
    Thing shirt = new Thing("Skjorta", hat);
    Thing pants = new Thing("Byxor", shirt);
    Thing shoes = new Thing("Skor", pants);

    Thing firstThing = shoes;


    // Rekursiv size-loop (se nedan för iterativ version)
    public int sizeR() {
        return sizeR(firstThing);
    }
    private int sizeR(Thing thing) {
        if (thing == null) {
            return 0;
        } else {
            return 1 + sizeR(thing.getNext());
        }

    }

    // Få storleken genom "vanlig" iterativ loop
    public int size() {
        int count = 0;
        Thing t = firstThing;
        while (t != null) {
            count++;
            t = t.getNext();
        }
        return count;
    }




}
