package Test2;

public class Zbozi {
    public String name;
    public String code;
    public double price;

    public Zbozi(String name, String code, double price) {
        this.name = name;
        this.code = code;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Kod:" + code + " " + "Nazev:" + name + " Cena za ks:" + price;

    }
}
