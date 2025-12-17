package Bankomat;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        Bankomat atm = new Bankomat("src/Bankomat/Account.txt");
        System.out.println(atm.GetBalance());
        atm.vyber(0);
        System.out.println(atm.GetBalance());
    }
}
