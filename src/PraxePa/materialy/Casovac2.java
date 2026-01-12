package PraxePa.materialy;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Casovac2 extends JPanel {
    private String text = "TEXT";
    private int x, y;
    private int smerX, smerY;

    public Casovac2() {
        this.x = 0;
        this.y = 0;
        this.smerX = 1;
        this.smerY = 1;
        this.setPreferredSize(new Dimension(400, 300));
        this.setBackground(Color.green);

        Font font = new Font("Monospaced", Font.BOLD, 40);
        this.setFont(font);

        Timer casovac = new Timer(20, new PosluchacCasovace());
        casovac.start();

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawString(text, x, y);
    }

    private void move() {
        x += smerX;
        y += smerY;

        if (x >= this.getWidth() || x <= 0) {
            smerX = -smerX;
        }
        if ((y >= this.getHeight()) || (y <= 0)) {
            smerY = -smerY;
        }
    }

    private class PosluchacCasovace implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            move();
            repaint();
        }
    }
}