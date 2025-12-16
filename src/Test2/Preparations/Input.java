package Test2.Preparations;

import java.util.Scanner;

public class Input {
    public String inputString()
    {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public int inputInt()
    {
        Scanner input = new Scanner(System.in);
        return input.nextInt();

    }

}