import java.util.ArrayList;

public class GraphThings {

    ArrayList<Thing> graph;

    public ArrayList<Thing> createGraph() {
        graph = new ArrayList<>();

        // Instansiera plagg
        Thing shirt = new Thing("Skjorta");
        Thing tie = new Thing("Slips");
        Thing chinos = new Thing("Chinos");
        Thing tee = new Thing("T-skjorta");
        Thing sneakers = new Thing("Löpskor");

        // Skapa relationer
        shirt.addRelation(tie);
        shirt.addRelation(chinos);
        tie.addRelation(shirt);
        chinos.addRelation(shirt);
        chinos.addRelation(sneakers);
        tee.addRelation(sneakers);

        // Lägg till grafstrukturen
        graph.add(shirt);
        graph.add(tie);
        graph.add(chinos);
        graph.add(tee);
        graph.add(sneakers);


        return graph;

    }
}

