package PraxePa.materialy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ChytaniDeska implements KeyListener {

    private Color barva = Color.white;
    private final int SIRKA = 50;
    private final int VYSKA = 10;
    private int x, y, smerX, smerY, rychlost;
    private Chytani panel;

    public ChytaniDeska(Chytani panel) {

        this.rychlost = 3;
        this.panel = panel;
        this.x = 175;
        this.y = 150;
    }

    public void vykresliSe(Graphics g) {
        g.setColor(barva);
        g.drawRect(x, y, SIRKA, VYSKA);
//        System.out.println(panel.getWidth());
    }

    public void move() {
        x += smerX;
        y += smerY;

        if ((x >= panel.getSIRKA_PANELU() - (SIRKA + 1)) && (panel.getSIRKA_PANELU() > 0)) {
            x = panel.getSIRKA_PANELU() - (SIRKA + 1);
        }
        if (x <= 0) {
            x = 0;
        }
        if ((y >= panel.getVYSKA_PANELU() - (VYSKA + 1)) && (panel.getVYSKA_PANELU() >0)) {
            y = panel.getVYSKA_PANELU() - (VYSKA + 1);
        }
        if (y <= 0) {
            y = 0;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int klavesa = e.getKeyCode();
        if (klavesa == KeyEvent.VK_LEFT) {
            smerX = -rychlost;
        } else if (klavesa == KeyEvent.VK_UP) {
            smerY = -rychlost;
        } else if (klavesa == KeyEvent.VK_RIGHT) {
            smerX = rychlost;
        } else if (klavesa == KeyEvent.VK_DOWN) {
            smerY = rychlost;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int klavesa = e.getKeyCode();
        if (klavesa == KeyEvent.VK_LEFT) {
            smerX = 0;
        } else if (klavesa == KeyEvent.VK_UP) {
            smerY = 0;
        } else if (klavesa == KeyEvent.VK_RIGHT) {
            smerX = 0;
        } else if (klavesa == KeyEvent.VK_DOWN) {
            smerY = 0;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    public Rectangle getOkraje() {
        return new Rectangle(x, y, SIRKA, VYSKA);
    }
}