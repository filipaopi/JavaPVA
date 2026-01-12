package PraxePa.materialy;

import javax.swing.JFrame;

public class MujOkna extends JFrame {

    public MujOkna() {
        this.setTitle("Můj Program");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        MujPanel panel = new MujPanel();

        KresliciPanel panel = new KresliciPanel();

//        KresliciTextPanel panel = new KresliciTextPanel();

//        KresliObrazek panel =new KresliObrazek();

//        Udalosti panel = new Udalosti();
//        UdalostiKlaves panel = new UdalostiKlaves();

//        Casovac panel=new Casovac();

//        Casovac2 panel=new Casovac2();
//        Casovac3 panel=new Casovac3();
//        Chytani panel = new Chytani();
        this.add(panel);

        this.setResizable(false);
        this.pack();


    }

    public static void main(String[] args) {
        MujOkna okna = new MujOkna();
        okna.setVisible(true);
    }
}