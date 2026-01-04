package swing;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int gameHeight   = 600;
        int gameWidth = 600;
        JFrame frame=new JFrame();
        frame.setTitle("flappy");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(gameWidth,gameHeight);
        frame.setVisible(true);
        frame.setResizable(false);

        Panel panel = new Panel(gameWidth, gameHeight);
        frame.add(panel);

        frame.setVisible(true);
        panel.requestFocusInWindow();
    }
}
