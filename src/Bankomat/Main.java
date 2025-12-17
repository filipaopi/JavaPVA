package Bankomat;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bankomat atm = new Bankomat("src/Bankomat/Account.txt");
        Scanner Input = new Scanner(System.in);

        int Continue = 0;
        do {

            System.out.println("Pro zůstatek stiskni 1");
            System.out.println("Pro vklad stiskni 2");
            System.out.println("Pro výběr stiskni 3");
            System.out.println();

            switch (Input.nextInt()) {

                case 0:
                    System.out.println("bye");
                    break;

                case 1:
                    System.out.println("Zůstatek: = " + (atm.GetBalance()));
                    System.out.println("Pro pokračování stiskněte 1, pro ukončení stiskněte 0.");
                    if (Input.nextInt() == 1) {
                        Continue = 1;
                    }
                    else {
                        Continue = 0;
                    }
                    break;

                case 2:
                    System.out.print("Vlož: ");
                    atm.vklad(Input.nextDouble());
                    System.out.println("balance = " + (atm.GetBalance()));
                    System.out.println("Pro pokračování stiskněte 1, pro ukončení stiskněte 0.");
                    if (Input.nextInt() == 1) {
                        Continue = 1;
                    }
                    else {
                        Continue = 0;
                    }
                    break;
                case 3:
                    System.out.print("Vyber: ");
                    atm.vyber(Input.nextDouble());
                    System.out.println("balance = " + (atm.GetBalance()));
                    System.out.println("Pro pokračování stiskněte 1, pro ukončení stiskněte 0.");
                    if (Input.nextInt() == 1) {
                        Continue = 1;
                    }
                    else {
                        Continue = 0;
                    }
                    break;
                default:
                    System.out.println("unexpected input, terminating");
                    break;
            }
        } while (Continue == 1);
    }
}
