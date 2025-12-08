package Test1;

public class Main {
    public static void main(String[] args) {
        Clovek clovek1 = new Clovek("Pepa", 23);
        Clovek clovek2 = new Clovek("Denis", 33);
        System.out.println(clovek1.getAge());
        System.out.println(clovek1.getName());
        System.out.println(clovek2.getAge());
        System.out.println(clovek2.getName());
        clovek2.setNameAndAge("Pavel", 26);
        System.out.println(clovek2.getAge());
        System.out.println(clovek2.getName());

        System.out.println();
        System.out.println();


        CetnostCisel c = new CetnostCisel();
        c.generovaniCisel(50);
        c.tiskCetnosti();
    }
}
