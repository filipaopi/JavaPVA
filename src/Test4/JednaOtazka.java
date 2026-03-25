package Test4;

import java.util.ArrayList;

public class JednaOtazka {
    String otázka;
    ArrayList<String>moznosti = new ArrayList<>();
    int cisloOdpovedi;

    public JednaOtazka() {
        this.otázka = otázka;
        this.moznosti.clear();
        this.cisloOdpovedi = 0;
    }
    public void RozdeleníTextu(String text){
        String casti[]=text.split(";");

        String prvni[] = casti[0].split("\\|");
        String druhy[] = casti[1].split("\\|");

        otázka = prvni[0];
        cisloOdpovedi=Integer.parseInt(prvni[1].trim());

        for(String s: druhy){
            moznosti.add(s);
        }


    }public void pomocnyTextu(String text){
        System.out.println(otázka);
        System.out.println(String.valueOf(cisloOdpovedi));
        System.out.println(moznosti);
    }
    public void vzhled(){
        System.out.println(otázka);
        System.out.println("_________________________");

        for (String s: moznosti) {
            System.out.println(s);
        }
    }
}
