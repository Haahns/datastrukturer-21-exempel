/**
 * Klass för att hantera en mer avancerad länkad lista med noder
 */
public class LinkedThangs {

    Node firstNode = null;
    Node lastNode = null;

    /**
     * Vi skapar Node som en inre (nästlad / nested) klass
     * eftersom den aldrig kommer att användas utanför LinkedThangs
     *
     * static är inte nödvändigt, men det gör det klarare att den
     * inte hör till enskilda objekt av LinkedThangs utan till klassen
     * som helhet.
     */
    private static class Node {
        Thang thang;
        Node next;

        Node(Thang thang, Node next) {
            this.thang = thang;
            this.next = next;
        }
        Node getNext() {
            return next;
        }
        public void setNext(Node next) {
            this.next = next;
        }
        String getName() {
            return thang.getName();
        }
    }


    /**
     * I likhet med add()-metoden i en ArrayList skapar vi här en egen
     * metod för att lägga till element till vår länkade lista
     */
    public void add(Thang newThing) {

        // Deklarera ett nyt Node-objekt
        Node newNode;

        /* 1. Listan är tom */
        if (firstNode == null) {

            // instansiera en ny nod (next=null)
            newNode = new Node(newThing, null);
            firstNode = newNode;
            lastNode = newNode;

        /* 2. Om newThing alfabetiskt hamnar efter sista elementet */
        } else if (newThing.getName().compareTo(lastNode.getName()) > 0) {

            // instansiera en ny nod (next=null)
            newNode = new Node(newThing, null);
            lastNode.setNext(newNode);
            lastNode = newNode;

        /* 3. Om newThing alfabetiskt hamnar före det första elementet */
        } else if (newThing.getName().compareTo(firstNode.getName()) < 0) {

            // instansiera en ny nod (next=firstNode)
            newNode = new Node(newThing, firstNode);
            firstNode = newNode;

        /* 4. Om newThing hamnar någonstans i mitten av listan */
        } else {

            for (Node t = firstNode; t.getNext() != null; t = t.getNext()) {

                String newName = newThing.getName();
                String nextName = t.getNext().getName();

                if (newName.compareTo(t.getName()) >= 0 && newName.compareTo(nextName) <= 0) {

                    // instansiera en ny nod (next=nuvarande elementets next)
                    newNode = new Node(newThing, t.getNext());
                    // ändra nuvarande elementets next till den nya nod vi addar
                    t.setNext(newNode);
                    break;
                }
            }
        }
    }

    /* räkna hur många element */
    public int size() {
        int count = 0;
        Node t = firstNode;
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
        Node t = firstNode;
        while (t != null) {
            ret = String.format("%s\n%s", ret, t.getName());
            t = t.getNext();
        }
        return ret;
    }

}
