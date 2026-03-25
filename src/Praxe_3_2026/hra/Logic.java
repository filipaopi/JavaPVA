package Praxe_3_2026.hra;

import java.util.Random;

public class Logic {

    private static Random rand = new Random();
    private static GUI gui;

    private static int firstNum;
    private static int secondNum;
    private static int result;


    public static void main(String[] args) {
        gui = new GUI();
    }

    public static void generateNumbers() {
        firstNum = rand.nextInt(1, 10);
        secondNum = rand.nextInt(1, 10);
        result = firstNum * secondNum;
    }

    public static int getFirstNum() {return firstNum;}
    public static int getSecondNum() {return secondNum;}
    public static int getResult() {return result;}
}
