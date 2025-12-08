package Test1;

import java.util.Random;

public class CetnostCisel {
    private int[] pole;

    public CetnostCisel() {
        pole = new int[50];
        for (int i = 0; i < pole.length; i++) {
            pole[i] = 0;
        }
    }


    public void generovaniCisel(int kolik){
        Random rand = new Random();
        for (int i = 0; i < kolik; i++) {
            int cislo = rand.nextInt(50);
            pole[cislo] = pole[cislo] + 1;
        }
    }


    public void tiskCetnosti() {
        for (int i = 0; i < pole.length; i++) {
            System.out.println(i + " " + pole[i]);
        }
    }


}
