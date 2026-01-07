package PraxeSt.Game;

import javax.swing.*;

public class Game extends JFrame {

    public Game(){

        setTitle("Game");
        setSize(900,900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        GameFrame gameFrame = new GameFrame();
        add(gameFrame);


        setVisible(true);
    }

    public static void main(String[] args) {

            SwingUtilities.invokeLater(() -> {
                new Game();
            });
    }
}
