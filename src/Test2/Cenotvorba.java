package Test2;

public class Cenotvorba {

    public double MnozstevniSleva(int amount, double price) {
        double sleva = 0;

        if (amount >= 3 && amount <= 9) {
            sleva = 0.10;
        } else if (amount >= 10) {
            sleva = 0.20;
        }

        return amount * price * (1 - sleva);
    }
}
