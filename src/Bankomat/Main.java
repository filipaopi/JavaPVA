package Bankomat;


public class Main {
    public static void main(String[] args) {

        Bankomat atm = new Bankomat("src/Bankomat/Account.txt");
        System.out.println(atm.GetBalance());
        atm.vklad(200);
        System.out.println(atm.GetBalance());
        atm.vyber(30);
        System.out.println(atm.GetBalance());
    }
}
