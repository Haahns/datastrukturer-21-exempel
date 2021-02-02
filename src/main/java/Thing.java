
public class Thing {

    private String name;

    private Thing next;

    Thing(String name) {
        this.name = name;
    }

    public Thing getNext() {
        return next;
    }

    public void setNext(Thing next) {
        this.next = next;
    }

    public String getName() {
        return name;
    }
}
