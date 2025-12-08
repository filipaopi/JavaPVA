package hw1;

public class Main {
    public static void main(String[] args) {

        Zvire cat = new Zvire("Pebble", 4);


        Zvire dog = new Zvire("Tiny", 4);

        System.out.println(cat.getName());
        System.out.println(cat.getLegCount());
        cat.setName("Spiderman");
        cat.setLegCount(8);
        System.out.println(dog.getName());
        System.out.println(dog.getLegCount());
        System.out.println(cat.getName());
        System.out.println(cat.getLegCount());

    }
}
