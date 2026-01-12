package PraxePa.materialy;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Casovac3 extends JPanel {
    private final int SIRKA_OBDELNIKA = 80;
    private final int VYSKA_OBDELNIKA = 50;
    private int x, y;
    private int smerX, smerY;
    private int rychlost;
    private Rectangle obdelnik;

    public Casovac3() {

        this.x = 0;
        this.y = 0;
        this.smerX = 0;
        this.smerY = 0;
        this.rychlost = 2;
        this.obdelnik = new Rectangle(x, y, SIRKA_OBDELNIKA, VYSKA_OBDELNIKA);

        this.setPreferredSize(new Dimension(400, 300));
        this.setBackground(Color.blue);
        this.setFocusable(true);

        //PosluchacKlavesnice posKla = new PosluchacKlavesnice();
        //this.addKeyListener(posKla);
        this.addKeyListener(new PosluchacKlavesnice());

        Timer casovac = new Timer(10, new PosluchacCasovace());
        casovac.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.red);
        g.drawRect(x, y, SIRKA_OBDELNIKA, VYSKA_OBDELNIKA);
    }

    private void move() {
        x += smerX;
        y += smerY;

        if (x >= this.getWidth() - (SIRKA_OBDELNIKA + 1)) {
            x = this.getWidth() - (SIRKA_OBDELNIKA + 1);
        }
        if (x <= 0) {
            x = 0;
        }
        if (y >= this.getHeight() - (VYSKA_OBDELNIKA + 1)) {
            y = this.getHeight() - (VYSKA_OBDELNIKA + 1);
        }
        if (y <= 0) {
            y = 0;
        }
    }

    private class PosluchacCasovace implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            move();
            repaint();
        }
    }

    private class PosluchacKlavesnice implements KeyListener {

        @Override
        public void keyPressed(KeyEvent e) {
            int klavesa = e.getKeyCode();
            if (klavesa == KeyEvent.VK_LEFT) {
                smerX = -rychlost;
            }
            else if (klavesa == KeyEvent.VK_UP) {
                smerY = -rychlost;
            }
            else if (klavesa == KeyEvent.VK_RIGHT) {
                smerX = rychlost;
            }
            else if (klavesa == KeyEvent.VK_DOWN) {
                smerY = rychlost;
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            int klavesa = e.getKeyCode();
            if (klavesa == KeyEvent.VK_LEFT) {
                smerX = 0;
            }
            else if (klavesa == KeyEvent.VK_UP) {
                smerY = 0;
            }
            else if (klavesa == KeyEvent.VK_RIGHT) {
                smerX = 0;
            }
            else if (klavesa == KeyEvent.VK_DOWN) {
                smerY = 0;
            }
        }

        @Override
        public void keyTyped(KeyEvent e) {

        }
    }
}