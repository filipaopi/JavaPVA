package hw3;

public class Main {
    public static void main(String[] args) {

        PoleCisel pc = new PoleCisel();

        pc.poleInit(10);
        pc.polePrint();

        double prumer = pc.average();
        System.out.println("array average: " + prumer);
    }
}
