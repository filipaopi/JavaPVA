package mincovka;

import java.util.Scanner;

public class Mincovka {

    static int petTisicKorun;
    static int dvaTisiceKorun;
    static int tisicKorun;
    static int petSetKorun;
    static int dveSteKorun;
    static int stoKorun;
    static int padesatKorun;
    static int dvacetKorun;
    static int desetKorun;
    static int petKorun;
    static int dveKoruny;
    static int jednaKoruna;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        splitMoney(input.nextInt());
        printResult();
    }


    private static void splitMoney(int amount) {

        petTisicKorun = amount / 5000;
        amount = amount - 5000 * (amount / 5000);

        dvaTisiceKorun = amount / 2000;
        amount = amount - 2000 * (amount / 2000);

        tisicKorun = amount / 1000;
        amount = amount - 1000 * (amount / 1000);

        petSetKorun = amount / 500;
        amount = amount - 500 * (amount / 500);

        dveSteKorun = amount / 200;
        amount = amount - 200 * (amount / 200);

        stoKorun = amount / 100;
        amount = amount - 100 * (amount / 100);

        padesatKorun = amount / 50;
        amount = amount - 50 * (amount / 50);

        dvacetKorun = amount / 20;
        amount = amount - 20 * (amount / 20);

        desetKorun = amount / 10;
        amount = amount - 10 * (amount / 10);

        petKorun = amount / 5;
        amount = amount - 5 * (amount / 5);

        dveKoruny = amount / 2;
        amount = amount - 2 * (amount / 2);

        jednaKoruna = amount;
        amount = 0;



    }

    private static void printResult() {
        for (int i = 0; i < petTisicKorun; i++) {
            System.out.printf(5000 + " ");
        }
        for (int i = 0; i < dvaTisiceKorun; i++) {
            System.out.print("2000 ");
        }

        for (int i = 0; i < tisicKorun; i++) {
            System.out.print("1000 ");
        }

        for (int i = 0; i < petSetKorun; i++) {
            System.out.print("500 ");
        }

        for (int i = 0; i < dveSteKorun; i++) {
            System.out.print("200 ");
        }

        for (int i = 0; i < stoKorun; i++) {
            System.out.print("100 ");
        }

        for (int i = 0; i < padesatKorun; i++) {
            System.out.print("50 ");
        }

        for (int i = 0; i < dvacetKorun; i++) {
            System.out.print("20 ");
        }

        for (int i = 0; i < desetKorun; i++) {
            System.out.print("10 ");
        }

        for (int i = 0; i < petKorun; i++) {
            System.out.print("5 ");
        }

        for (int i = 0; i < dveKoruny; i++) {
            System.out.print("2 ");
        }

        for (int i = 0; i < jednaKoruna; i++) {
            System.out.print("1 ");
        }
    }
}
