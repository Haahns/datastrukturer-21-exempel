import java.util.ArrayList;
import java.util.Random;

public class Thing {
    String name;

    // Ska peka på nästa Thing i listan
    private Thing next;

    Thing(String name, Thing next) {
        this.name = name;
        this.next = next;
    }


    public Thing getNext() { return next; }

    public String getName() {
        return name;
    }

}
