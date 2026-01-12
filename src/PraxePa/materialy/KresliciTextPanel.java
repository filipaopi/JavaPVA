package PraxePa.materialy;

import javax.swing.*;
import java.awt.*;

public class KresliciTextPanel extends JPanel {
    String text = "GAME OVER";

    public KresliciTextPanel() {
        this.setPreferredSize(new Dimension(400, 300));
        this.setBackground(Color.BLUE);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 28));
        g.setColor(Color.RED);
        g.drawString(text, 120, 50);

        // druhy
        //nastavení typu a velikosti písma
        Font pismo = new Font(Font.SANS_SERIF, Font.BOLD, 28);
        g.setFont(pismo);

        //nastavení barvy
        g.setColor(Color.RED);

        //získání šířky a výšky panelu
        int sirkaPanelu = this.getWidth();
        int vyskaPanelu = this.getHeight();

        //objekt FontMetrics pro daný typ písma
        FontMetrics fm = g.getFontMetrics(pismo);

        //získání šířky a výšky textu v daném grafickém kontextu
        int sirkaTextu = fm.stringWidth(text);

        //nakreslení textu na dané umístění
        g.drawString(text, ((sirkaPanelu - sirkaTextu) / 2), (vyskaPanelu / 2));
    }
}
