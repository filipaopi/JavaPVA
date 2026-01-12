package PraxePa.materialy;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Udalosti extends JPanel {
    private JButton tlacitko;
    private JLabel navesti;

    public Udalosti() {
        this.setPreferredSize(new Dimension(500, 140));

        Font font=new Font(Font.SANS_SERIF, Font.BOLD, 28);

        tlacitko = new JButton("Tlačítko");
        tlacitko.setFont(font);
        this.add(tlacitko);

        PosluchacTlacitka posluchac = new PosluchacTlacitka();
        tlacitko.addActionListener(posluchac);

        navesti = new JLabel("Tady je návěstí");
        navesti.setFont(font);
        this.add(navesti);
    }

    private class PosluchacTlacitka implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            navesti.setText("Stisknul jsi tlačítko.");
        }
    }

}