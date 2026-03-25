package jan13;

public class Chair extends Nabytek {
    private final int legCount;

    public Chair(String nazev, String id, int legCount) {
        super(nazev, id);
        this.legCount = legCount;
    }
    @Override
    public String toString() {

        return super.toString() + " " + legCount;
    }
}
