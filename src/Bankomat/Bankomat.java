package Bankomat;


import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Bankomat {

    String AccountFile;
    public Bankomat(String AccountFile) {
        this.AccountFile = AccountFile;
    }

    public void vklad(double castka){
        double accountBalance;
        try {
            Scanner Account = new Scanner(new File(AccountFile));
            if (Account.hasNextDouble()) {
                accountBalance = Account.nextDouble();
                accountBalance = accountBalance + castka;
                System.out.println(accountBalance);
                FileWriter writer = new FileWriter(AccountFile);
                writer.write(String.valueOf(accountBalance));
                writer.close();
                System.out.println("Ok");
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void vyber(double castka){
        double accountBalance;
        try {
            Scanner Account = new Scanner(new File(AccountFile));
            if (Account.hasNextDouble()) {
                accountBalance = Account.nextDouble();
                if (accountBalance < castka){
                    System.out.println("insufficient balance");
                }
                else {
                    accountBalance = accountBalance - castka;
                    System.out.println(accountBalance);
                    FileWriter writer = new FileWriter(AccountFile);
                    writer.write(String.valueOf(accountBalance));
                    writer.close();
                    System.out.println("Ok");
                }
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public double GetBalance() {
        double accountBalance;
        try {
            Scanner Account = new Scanner(new File(AccountFile));
            accountBalance = 1;
            if (Account.hasNextDouble()) {
                accountBalance = Account.nextDouble();
                return accountBalance;
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return accountBalance;
    }
}

