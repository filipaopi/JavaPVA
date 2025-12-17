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
                    System.out.println("Zůstatek: = " + (atm.GetBalance()));
                    System.out.println("Pro pokračování stiskněte 1, pro ukončení stiskněte 0.");
                    switch (Input.nextInt()) {
                        case 0:
                            Continue = false;
                            System.out.println("bye");
                            break;
                        case 1:
                            Continue = true ;
                            break;
                        default:
                            throw new RuntimeException("unexpected input, terminating");
                    }
                    break;
                case 2:
                    System.out.print("Vlož: ");
                    atm.vklad(Input.nextDouble());
                    System.out.println("balance = " + (atm.GetBalance()));
                    System.out.println("Pro pokračování stiskněte 1, pro ukončení stiskněte 0.");
                    switch (Input.nextInt()) {
                        case 0:
                            Continue = false;
                            System.out.println("bye");
                            break;
                        case 1:
                            Continue = true ;
                            break;
                        default:
                            throw new RuntimeException("unexpected input, terminating");
                    }
                    break;
                case 3:
                    System.out.print("Vyber: ");
                    atm.vyber(Input.nextDouble());
                    System.out.println("balance = " + (atm.GetBalance()));
                    System.out.println("Pro pokračování stiskněte 1, pro ukončení stiskněte 0.");
                    switch (Input.nextInt()) {
                        case 0:
                            Continue = false;
                            System.out.println("bye");
                            break;
                       case 1:
                           Continue = true ;
                           break;
                       default:
                           throw new RuntimeException("unexpected input, terminating");}
                    break;
                default:
                    throw new RuntimeException("unexpected input, terminating");
            }

        } while (Continue);
    }
}
