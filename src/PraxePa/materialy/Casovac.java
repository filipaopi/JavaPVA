package PraxePa.materialy;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Casovac extends JPanel {
    private JLabel navesti;
    private long citac;

    public Casovac() {
        this.citac = 0;
        this.setPreferredSize(new Dimension(280, 130));
        Font font=new Font(Font.SANS_SERIF, Font.BOLD, 28);

        navesti = new JLabel();
        navesti.setFont(font);
        this.add(navesti);
        navesti.setText(String.valueOf(citac));

        PosluchacCasovace posluchac = new PosluchacCasovace();
        Timer casovac = new Timer(10, posluchac);
        casovac.start();
    }

    private class PosluchacCasovace implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            citac++;
            navesti.setText(String.valueOf(citac));
        }
    }
}
