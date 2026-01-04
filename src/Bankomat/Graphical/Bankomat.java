package Bankomat.Graphical;


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
                FileWriter writer = new FileWriter(AccountFile);
                writer.write(String.valueOf(accountBalance));
                writer.close();
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
                    throw new RuntimeException("Insufficient funds");
                }
                else {
                    accountBalance = accountBalance - castka;
                    FileWriter writer = new FileWriter(AccountFile);
                    writer.write(String.valueOf(accountBalance));
                    writer.close();
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
            accountBalance = Account.nextDouble();
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

