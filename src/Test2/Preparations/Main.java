package Test2.Preparations;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.println(rand.randomInt(1, 3));
        }
    }
}