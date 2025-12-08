package hw3;

import java.util.ArrayList;
import java.util.Random;

public class PoleCisel {

    private ArrayList<Integer> pole = new ArrayList<>();
    private Random rnd = new Random();

    public void poleInit(int pocet) {
        for (int i = 0; i < pocet; i++) {
            pole.add(rnd.nextInt(100) + 1);
        }
    }

    public void polePrint() {
        System.out.println(pole);
    }

    public double average() {
        if (pole.isEmpty()) return 0;

        int soucet = 0;
        for (int cislo : pole) {
            soucet += cislo;
        }
        return (double) soucet / pole.size();
    }
}
