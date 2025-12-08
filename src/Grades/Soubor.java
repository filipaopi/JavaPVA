package Grades;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Soubor {


    public void zapisSoubor(String Soubor) {
        try {
            FileWriter writer = new FileWriter(Soubor);


            String hodn;
            hodn = "Mat" + " " + String.valueOf(1) + "\n";
            writer.write(hodn);
            hodn = "Pva" + " " + String.valueOf(3) + "\n";
            writer.write(hodn);
            hodn = "Apc" + " " + String.valueOf(5) + "\n";
            writer.write(hodn);

            writer.close();
            System.out.println("Data byla zapsána do textového souboru.");
        } catch (IOException e) {
            System.out.println("Chyba při zápisu do souboru: " + e.getMessage());
        }
    }

    public void randomWrite(String file, int amount) {
        try {
            FileWriter writer = new FileWriter(file);
        }
        catch(IOException e){
            System.out.println("Chyba při zápisu do souboru: " + e.getMessage());

        }
    }
}