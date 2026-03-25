package Praxe_3_2026;

import javax.swing.*;
import java.awt.*;
import java.time.DateTimeException;
import java.time.LocalDate;

public class Game extends JFrame {
    JFrame frame = new JFrame();

    public Game() {
        frame.setSize(1350, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(new Panel5());
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Game();
        });
    }


    public static class Panel extends JPanel {

        public Panel() {
            setLayout(null);

            setBackground(Color.GRAY);

            JTextField firstName = new JTextField();
            JTextField lastName = new JTextField();
            JLabel nameLbl = new JLabel("Name: ");
            JButton submitBtn = new JButton("Submit");

            nameLbl.setBounds(10, 10, 100, 30);
            submitBtn.setBounds(10, 120, 100, 30);

            firstName.setBounds(10, 40, 100, 30);
            lastName.setBounds(10, 80, 100, 30);

            firstName.setToolTipText("First Name");
            lastName.setToolTipText("Last Name");


            add(firstName);
            add(nameLbl);
            add(submitBtn);
            add(lastName);


            submitBtn.addActionListener(e -> {
                String name = firstName.getText() + " " + lastName.getText();
                nameLbl.setText(name);
            });


        }

    }


    public class PanelDatum extends JPanel {
        private JLabel lb;
        private JTextField tfDen;
        private JTextField tfMesic;
        private JTextField tfRok;
        private JButton btn;

        public PanelDatum() {
            initializace();
        }

        private void initializace() {
            this.setLayout(new FlowLayout());
            this.setBackground(new Color(3, 71, 211));

            add(new JLabel("Den"));
            tfDen = new JTextField(5);
            add(tfDen);

            add(new JLabel("Mesic"));
            tfMesic = new JTextField(5);
            add(tfMesic);

            add(new JLabel("Rok"));
            tfRok = new JTextField(5);
            add(tfRok);

            btn = new JButton("Ukaz");
            add(btn);

            lb = new JLabel(" ");
            add(lb);

            btn.addActionListener(e -> {
                lb.setText(tfDen.getText() + "-" + tfMesic.getText() + "-" + tfRok.getText());
            });
        }
    }

    public class Panel5 extends JPanel {
        public Panel5() {
            setLayout(new GridLayout(2,2));
            JButton lb = new JButton("xxxxx ");
            add(lb);
            JButton btn = new JButton("volani");
            add(btn);
            JLabel lb1 = new JLabel("vysledek");
            add(lb1);

            btn.addActionListener(e -> {new Frame2();});
            lb.addActionListener(e -> {
                System.out.println(JOptionPane.showInputDialog(this,"Vysledek"));});
        }

        private class Frame2 extends JFrame {
        public Frame2() {
                JButton btn = new JButton("Ukaz");
                add(btn);
                btn.addActionListener(e -> {});
                setLayout(new GridLayout(2,2));
                setTitle("nove okno");
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                setSize(600,400);
                setLayout(new BorderLayout(10,2));
                setVisible(true);
            }
        }
    }
}