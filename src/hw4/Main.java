package hw4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args)
    {
        Main.ulozNahodPole("src/hw4/file.txt", 200);

    }

    public static void ulozNahodPole(String filename, int n)
    {
        boolean printCommas = false;
        n++;
        ArrayList<Integer> pole = new ArrayList<>();
        for (int i = 0; i < n; i++)
        {
            int randomNum = (int)(Math.random() * 101 + 100);
            pole.add(randomNum);
        }

        Collections.sort(pole);

        try
        {
            FileWriter writer = new FileWriter(filename);
            for (int i = 1; i < n; i++) {
                if (i % 10 == 0)
                {
                    if (printCommas)
                    {
                        // podmínka pro tištění čárky na konci řádku protože
                        // nevím jestli tam má být.
                        writer.write(pole.get(i).toString() + ",\n");
                    }
                    else
                    {
                        writer.write(pole.get(i).toString() + "\n");
                    }
                }
                else
                {
                    writer.write(pole.get(i).toString() + ", ");
                }
            }
            writer.close();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }

    }

}