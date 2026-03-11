package Test2;

public class Sklad extends Zbozi{

    private String placement;

    public Sklad(String name, String code, double price, String placement) {
        super(name, code, price);
        this.placement = placement;
    }

    @Override
    public String toString() {
        return "Pozice:" + placement + " Kod:" + code + " Nazev:" + name + " Cena za ks:" + price;
    }
}
