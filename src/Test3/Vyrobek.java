package Test3;

public class Vyrobek {
    private String nazev;
    private double price;
    private int amount;

    public Vyrobek(String nazev, double price, int amount) {
        this.nazev = nazev;
        this.price = price;
        this.amount = amount;
    }

    public double getPrice() {
        if (amount >= 10) return price * 0.8 * amount;
        if (amount >= 4) return price * 0.9 * amount;
        else return price * amount;
    }

    @Override
    public String toString() {
        return "Vyrobek{" +
                "nazev='" + nazev + '\'' +
                ", price=" + getPrice() * amount +
                '}';
    }
}
