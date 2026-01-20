//package Test2.Preparations;
//
//public class Main {
//    public static void main(String[] args) {
//        Rand rand = new Rand();
//        Input input = new Input();
//        for (int i = 0; i < 10; i++) {
//            System.out.println(rand.randomInt(input.inputInt(), input.inputInt()));
//        }
//    }
//}
//
//

import Test2.Cenotvorba;
import Test2.Sklad;
import Test2.Zbozi;

////

public class Main {
    public static void main(String[] args) {

        Zbozi zbozi1 = new Zbozi("LCD-monitor", "A123", 2990);
        Sklad zbozi2 = new Sklad("Tiskárna", "X987", 4290, "K2B3");
        Sklad zbozi3 = new Sklad("Notebook", "N111", 19990, "M1C5");

        System.out.println(zbozi1);
        System.out.println(zbozi2);
        System.out.println(zbozi3);

        Cenotvorba cenotvorba = new Cenotvorba();

        double notebooky = cenotvorba.MnozstevniSleva(2, 19990);
        double monitory = cenotvorba.MnozstevniSleva(5, 2990);
        double tiskarny = cenotvorba.MnozstevniSleva(15, 4290);

        double celkem = notebooky + monitory + tiskarny;

        System.out.println("Celkem zaplaceno: " + (int)celkem + ",-");
    }
}
