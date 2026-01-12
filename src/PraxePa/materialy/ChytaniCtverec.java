package PraxePa.materialy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class ChytaniCtverec {

    private final int DELKA_STRANY = 50;
    private int x, y;
    private Color barva;

    public ChytaniCtverec(int x, int y) {
        this.x = x;
        this.y = y;

        vyberBarvu();
    }

    public void vykresliSe(Graphics g) {
        g.setColor(barva);
        g.drawRect(x, y, DELKA_STRANY, DELKA_STRANY);
    }

    private void vyberBarvu() {
        Random generator = new Random();
        int nahodneCislo = generator.nextInt(4);

        switch (nahodneCislo) {
            case 0:
                barva = Color.blue;
                break;
            case 1:
                barva = Color.red;
                break;
            case 2:
                barva = Color.yellow;
                break;
            default:
                barva = Color.green;
                break;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getBarva() {
        return barva;
    }

    public Rectangle getOkraje() {
        return new Rectangle(x, y, DELKA_STRANY, DELKA_STRANY);
    }
}