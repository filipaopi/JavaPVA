package Test2.Preparations;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Input input = new Input();
        for (int i = 0; i < 10; i++) {
            System.out.println(rand.randomInt(input.inputInt(), input.inputInt()));
        }
    }
}