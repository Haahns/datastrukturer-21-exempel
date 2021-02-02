import java.util.ArrayList;

public class Thing {

    private String name;

    // Graph: lista över objektets relationer
    private ArrayList<Thing> relations;


    // LinkedList: referens till nästa element i länkade listan
    private Thing next;

    Thing(String name) {
        // Graph: initialisera relations
        relations = new ArrayList<>();
        this.name = name;
    }

    // LinkedList: Getter för nästa element
    public Thing getNext() {
        return next;
    }
    // LinkedList:  Setter för nästa element
    public void setNext(Thing next) {
        this.next = next;
    }

    public String getName() {
        return name;
    }

    // Graph: setter
    public void addRelation(Thing thing) {
        relations.add(thing);
    }
    // Graph: getter
    public ArrayList<Thing> getRelations() {
        return relations;
    }

}
