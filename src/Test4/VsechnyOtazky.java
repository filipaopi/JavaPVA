package Test4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class VsechnyOtazky {
    ArrayList<String> pole = new ArrayList<>();

    public void naplneniPole(String soubor) {
        try {

            File file = new File(soubor);
            System.out.println(file.toString());
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String a = scanner.nextLine();
                pole.add(a);

            }


            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Soubor nenalezen: " + e.getMessage());


        }
    }
}
