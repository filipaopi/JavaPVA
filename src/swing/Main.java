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
        frame.setResizable(false);

       // while(true) {
            Panel panel = new Panel();

            frame.add(panel);
       // }
    }
}
