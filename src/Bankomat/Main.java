package Bankomat;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bankomat atm = new Bankomat("src/Bankomat/Account.txt");
        Scanner Input = new Scanner(System.in);

        boolean Continue;
        do {

            System.out.println("Pro zůstatek stiskni 1");
            System.out.println("Pro vklad stiskni 2");
            System.out.println("Pro výběr stiskni 3");
            System.out.println();

            switch (Input.nextInt()) {

                case 0:
                    System.out.println("bye");
                    Continue = false;
                    break;

                case 1:
                    System.out.println("Zůstatek: = " + (atm.GetBalance()) + "Kč");
                    System.out.println("Pro pokračování stiskněte 1, pro ukončení stiskněte 0.");
                    Continue = restart(Input.nextInt());
                    break;
                case 2:
                    System.out.print("Vlož: ");
                    atm.vklad(Input.nextDouble());
                    System.out.println("Zůstatek: = " + (atm.GetBalance()) + "Kč");
                    System.out.println("Pro pokračování stiskněte 1, pro ukončení stiskněte 0.");
                    Continue = restart(Input.nextInt());
                    break;
                case 3:
                    System.out.print("Vyber: ");
                    atm.vyber(Input.nextDouble());
                    System.out.println("Zůstatek: = " + (atm.GetBalance()) + "Kč");
                    System.out.println("Pro pokračování stiskněte 1, pro ukončení stiskněte 0.");
                    Continue = restart(Input.nextInt());
                    break;
                default:
                    throw new RuntimeException("unexpected input, terminating");
            }

        } while (Continue);
    }


     public static boolean restart(int input){
         return switch (input) {
             case 0 -> false;
             case 1 -> true;
             default -> throw new RuntimeException("unexpected input, terminating");
         };
    }

}