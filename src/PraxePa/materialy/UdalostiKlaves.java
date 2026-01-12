package PraxePa.materialy;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UdalostiKlaves extends JPanel {
    private JLabel navesti;

    public UdalostiKlaves() {
        this.setPreferredSize(new Dimension(600, 130));

        Font font=new Font(Font.SANS_SERIF, Font.BOLD, 28);

        navesti = new JLabel("Tady je návěstí");
        navesti.setFont(font);
        this.add(navesti);

        PosluchacPanelu posluchacPanelu = new PosluchacPanelu();
        this.addKeyListener(posluchacPanelu);

        // komponenta získá fokus
        this.setFocusable(true);
    }


    private class PosluchacPanelu implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            navesti.setText("Stisknul jsi klávesu: " + e.getKeyChar());
        }

        @Override
        public void keyReleased(KeyEvent e) {
            navesti.setText("Pustil jsi klávesu jejíž číselný kód je: " + e.getKeyCode());
        }
    }
}
