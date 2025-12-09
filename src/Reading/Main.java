package Reading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ctiNejmensiZeSouboru("src/Reading/cisla.txt");
    }

    public static void ctiNejmensiZeSouboru(String soubor){
        int minimum = Integer.MAX_VALUE;
        try {

            File file = new File(soubor);
            System.out.println(file.toString());
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextInt()) {
                int cislo = scanner.nextInt();

                if (minimum > cislo){
                    minimum = cislo;
                }
            }

            System.out.println("Nejmenší hodnota je: " + minimum);

            scanner.close();
        } catch ( FileNotFoundException e) {
            System.out.println("Soubor nenalezen: " + e.getMessage());

        }

    }

}
