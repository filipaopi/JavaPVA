package jan13;

public class Main {
    public static void main(String[] args) {
        Nabytek skrin = new Nabytek("Brimnes", "005.761.39");
        Nabytek stul = new Nabytek("Malm", "994.319.82");
        Chair zidle = new Chair("VEDBO", "604.942.49", 4);

        System.out.println(stul);
        System.out.println(skrin);
        System.out.println(zidle);

    }
}
