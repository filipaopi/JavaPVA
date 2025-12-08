package hw2;

public class Prvocisla {
    private final int POSL_HODN = 40;
    private boolean[] pole = new boolean[POSL_HODN + 1];

    public void poleInit() {
        for (int i = 0; i < pole.length; i++) {
            pole[i] = true;
        }

        pole[0] = false;
        pole[1] = false;
    }

    public void filtering() {
        for (int x = 2; x < POSL_HODN; x++) {
            for (int y = x + 1; y <= POSL_HODN; y++) {
                if (pole[y] && y % x == 0) {
                    pole[y] = false;
                }
            }
        }
    }


    public void printPrimes() {
        for (int i = 0; i <= POSL_HODN; i++) {
            if (pole[i]) {
                System.out.print(i + " ");
            }
        }

    }
}
