package Test3;

import java.util.ArrayList;
import java.util.Scanner;

public class Objednavka {

    public Objednavka() {
    }

    private ArrayList<Vyrobek> vyrobky =  new ArrayList<>();
    double celkovaCenaObjednavky = 0;

    public void naplneniObjednavky(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            String[] data = input.split(";");

            String nazev = data[0];
            double cena = Double.parseDouble(data[1]);
            int mnozstvi = Integer.parseInt(data[2]);

            vyrobky.add(new Vyrobek(nazev, cena, mnozstvi));
        }
    }

    public void tiskObjednavky(){
        for(Vyrobek v : vyrobky){
            System.out.println(v);
            celkovaCenaObjednavky += v.getPrice();
        }
        System.out.println(celkovaCenaObjednavky);
    }
}
