package PraxeSt.Main1;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    static ArrayList<Integer> list;


    public static void main(String[] args) {
        int[]list=new int[10];
        Random rand=new Random();
        int soucet = 0;

        for (int i = 0; i < list.length; i++) {
            list[i]=rand.nextInt(20, 101);
        }

        for (int j : list) {
            System.out.println(j);

        }

        int min = list[0];

        for (int j : list) {
            soucet = soucet + j;
            if (j < min) min = j;

        }
        System.out.println();
        System.out.println(soucet);
        System.out.println(min);
    }
}
