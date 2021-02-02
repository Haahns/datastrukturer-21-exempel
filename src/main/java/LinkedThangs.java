public class LinkedThangs {

    Node firstNode = null;
    Node lastNode = null;

    private static class Node {
        Thang thing;
        Node next;

        Node(Thang thing, Node next) {
            this.thing = thing;
            this.next = next;
        }
        Node getNext() {
            return next;
        }
        public void setNext(Node next) {
            this.next = next;
        }
        String getName() {
            return thing.getName();
        }
    }


    public void add(Thang newThing) {

        Node newNode;

        /* 1. Listan är tom */
        if (firstNode == null) {

            newNode = new Node(newThing, null);
            //newThing.setNext(null);
            firstNode = newNode;
            lastNode = newNode;

        /* 2. Om newThing hamnar efter sista elementet */
        } else if (newThing.getName().compareTo(lastNode.getName()) > 0) {

            newNode = new Node(newThing, null);
            lastNode.setNext(newNode);
            lastNode = newNode;

        /* 3. Om newThing hamnar före det första elementet */
        } else if (newThing.getName().compareTo(firstNode.getName()) < 0) {

            newNode = new Node(newThing, firstNode);
            firstNode = newNode;

        /* 4. Om newThing hamnar någonstans i mitten av listan */
        } else {

            for (Node t = firstNode; t.getNext() != null; t = t.getNext()) {

                String newName = newThing.getName();
                String nextName = t.getNext().getName();

                if (newName.compareTo(t.getName()) >= 0 && newName.compareTo(nextName) <= 0) {

                    newNode = new Node(newThing, t.getNext());
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
