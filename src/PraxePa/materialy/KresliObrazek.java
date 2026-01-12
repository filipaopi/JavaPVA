package PraxePa.materialy;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Objects;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class KresliObrazek extends JPanel {
    private Image obrazek;
    private int obrazekSirka;
    private int obrazekVyska;

    public KresliObrazek() {
        this.setPreferredSize(new Dimension(400, 300));
        this.setBackground(Color.white);

        ImageIcon ii = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("resources/obrazek1.JPG")));
        // lomeno a nazev souboru, ktery je ve slozce resources
        obrazek = ii.getImage();

        obrazekSirka = obrazek.getWidth(this);
        obrazekVyska = obrazek.getHeight(this);

        int x = 20 + obrazekSirka + 20;
        int y = 20 + obrazekVyska + 20;
        Dimension rozmerPanelu = new Dimension(x, y);

        this.setPreferredSize(rozmerPanelu);
        this.setBackground(Color.WHITE);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(obrazek, 20, 20, this);
    }
}
