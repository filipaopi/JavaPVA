package PraxeCt.game;

import javax.swing.*;

public class Game extends JFrame {
    public Game() {
        setTitle("Game OP");
        setSize(1200, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        GameFrame gameFrame = new GameFrame();
        add(gameFrame);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Game().setVisible(true);
        });
    }
}
