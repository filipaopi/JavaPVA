package swing;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setTitle("Ovladani");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280,720);
        frame.setVisible(true);
        JButton button=new JButton("close");
        frame.add(button);
        frame.setResizable(false);
        button.setMinimumSize(new Dimension(100,100));
    }
}
