package PraxePa.materialy;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Chytani extends JPanel {

    private final int SIRKA_PANELU = 400;
    private final int VYSKA_PANELU = 300;
    private final int POCET_CTVERCU = 10;
    private ChytaniCtverec[] poleCtvercu;
    private ChytaniDeska chytacDeska;

    public Chytani() {
        this.poleCtvercu = new ChytaniCtverec[POCET_CTVERCU];
        this.chytacDeska = new ChytaniDeska(this);

        this.setPreferredSize(new Dimension(SIRKA_PANELU, VYSKA_PANELU));
        this.setBackground(Color.black);

        this.addKeyListener(chytacDeska);
        this.setFocusable(true);

        Random generator = new Random();
        for (int i = 0; i < poleCtvercu.length; i++) {
            int x = generator.nextInt(SIRKA_PANELU - 50);
            int y = generator.nextInt(VYSKA_PANELU - 50);

            ChytaniCtverec c = new ChytaniCtverec(x, y);
            poleCtvercu[i] = c;
        }

        Timer casovac = new Timer(10, new PosluchacCasovace());
        casovac.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < poleCtvercu.length; i++) {
            if (poleCtvercu[i] != null) {
                poleCtvercu[i].vykresliSe(g);
            }
        }

        chytacDeska.vykresliSe(g);
    }

    private class PosluchacCasovace implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            chytacDeska.move();

            for (int i = 0; i < poleCtvercu.length; i++) {
                if (poleCtvercu[i] != null) {
                    // if (chytac.getOkraje().intersects(poleCtvercu[i].getOkraje()))
                    Rectangle okrajeChytace = chytacDeska.getOkraje();
                    Rectangle okrajeCtverce = poleCtvercu[i].getOkraje();
                    if (okrajeChytace.intersects(okrajeCtverce)) {
                        poleCtvercu[i] = null;
                    }
                }
            }

            repaint();
        }
    }

    public int getSIRKA_PANELU() {
        return this.getWidth();
    }

    public int getVYSKA_PANELU() {
        return this.getHeight();
    }
}
