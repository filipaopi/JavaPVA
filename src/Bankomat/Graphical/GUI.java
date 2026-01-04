package Bankomat.Graphical;

import Bankomat.Graphical.Panels.MainPanel;

import javax.swing.*;

public class GUI {
    public GUI() {
        JFrame frame = new JFrame("Bankomat");
        MainPanel panel = new MainPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setResizable(false);
        frame.add(panel);
        frame.setVisible(true);

    }
}
