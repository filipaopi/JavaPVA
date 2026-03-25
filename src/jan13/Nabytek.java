package jan13;

public class Nabytek {
    private String nazev;
    private String id;

    public Nabytek(String nazev, String id) {
        this.nazev = nazev;
        this.id = id;
    }

    @Override
    public String toString() {
        return nazev + " " + id;
    }
}
