package Test2.Preparations;

import java.util.Scanner;

public class Input {
    public String inputString()
    {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine().toString();
        return s;
    }

    public int inputInt()
    {
        Scanner input = new Scanner(System.in);
        int s = (int)input.nextInt();
        return s;
    }

}