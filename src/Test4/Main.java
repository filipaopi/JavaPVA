package Test4;

public class Main {
    public static void main(String[] args) {
        VsechnyOtazky vsechny = new VsechnyOtazky();

        vsechny.naplneniPole("kviz_ZEM_1.txt");
        System.out.println("aa");

        JednaOtazka jednaOtazka = new JednaOtazka();
        jednaOtazka.RozdeleníTextu("Na kterém kontinentu se nachází Egypt?|3 ; Evropa | Asie | Afrika | Jižní Amerika");
        jednaOtazka.vzhled();
    }
}
