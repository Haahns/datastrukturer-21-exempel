import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /**
         * Länkad lista med metadata i objekten
         */
        LinkedThings linkedThings = new LinkedThings();

        linkedThings.add(new Thing("skjorta"));
        linkedThings.add(new Thing("byxor"));
        linkedThings.add(new Thing("pipo"));
        linkedThings.add(new Thing("shorts"));

        System.out.println("-----\nThings:");
        System.out.println(linkedThings.listThings());

        /**
         * Länkad lista med metadata i skilda noder
         */
        LinkedThangs linkedThangs = new LinkedThangs();

        linkedThangs.add(new Thang("skjorta"));
        linkedThangs.add(new Thang("byxor"));
        linkedThangs.add(new Thang("pipo"));
        linkedThangs.add(new Thang("bandana"));

        System.out.println("-----\nThangs with nodes:");
        System.out.println(linkedThangs.listThings());

        /**
         * Grafstruktur med relationer i själva objekten
         */
        System.out.println("-----\nGrafstruktur:");
        ArrayList<Thing> outfits = new GraphThings().createGraph();

        // Loopa igenom alla element
        for (int i = 0; i < outfits.size(); i++) {

            System.out.println(outfits.get(i).getName() + " passar med:");

            // Loopa igenom nuvarande elementets relationer
            // (traditionellt "j" som index för inre loopar)
            for (int j = 0; j < outfits.get(i).getRelations().size(); j++) {
                System.out.println(outfits.get(i).getRelations().get(j).getName());
            }


        }

    }
}

