package test5;

import java.util.ArrayList;

public class Prvocisla {

    static ArrayList<Integer> primes;

    static void main() {
        int min = 2;
        int max = 20;
        primes = naplnPole(min, max);

        tiskPole(primes);

    }

    private static ArrayList<Integer> naplnPole(int min, int max) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            if (isPrime(i)) list.add(i);
        }
        return list;
    }


        private static void tiskPole (ArrayList < Integer > p) {
            for (int i = 0; i < p.size(); i++) {
                System.out.print(p.get(i) + " ");
            }
        }

        private static boolean isPrime ( int n){
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
    }
}
