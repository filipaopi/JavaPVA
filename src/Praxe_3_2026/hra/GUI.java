package Praxe_3_2026.hra;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    private JButton verifyBtn = new JButton("Verify");

    private JLabel num1lbl = new JLabel();
    private JLabel num2lbl = new JLabel();
    private JLabel isCorrectLbl = new JLabel();
    private JLabel correctLbl = new JLabel();
    private JLabel incorrectLbl = new JLabel();

    private JTextField userInputBox = new JTextField();

    private JMenuBar menuBar = new JMenuBar();
    private JMenu menu = new JMenu("Menu");
    private JMenuItem newItem = new JMenuItem("New game");
    private JMenuItem exitItem = new JMenuItem("Exit");

    private int correctAmount = 0;
    private int incorrectAmount = 0;


    public GUI() {
        setLayout(null);
        setTitle("Hra");
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        initializeComponents();
        setVisible(true);



    }

    private void initializeComponents() {
        menu.add(newItem);
        menu.add(exitItem);
        menuBar.add(menu);
        newItem.addActionListener(e -> {newGame();});
        exitItem.addActionListener(e -> System.exit(0));
        setJMenuBar(menuBar);

        verifyBtn.setBounds(500,400,100,50);
        verifyBtn.addActionListener(e -> {verify();});
        add(verifyBtn);

        num1lbl.setBounds(250,300,100,50);
        num2lbl.setBounds(500,300,100,50);
        isCorrectLbl.setBounds(400,500,300,50);
        correctLbl.setBounds(620,100,200,50);
        incorrectLbl.setBounds(620,200,200,50);

        num2lbl.setFont(new Font("Times New Roman",Font.BOLD,25));
        num1lbl.setFont(new Font("Times New Roman",Font.BOLD,25));
        isCorrectLbl.setFont(new Font("Times New Roman",Font.BOLD,25));
        correctLbl.setFont(new Font("Times New Roman",Font.BOLD,25));
        incorrectLbl.setFont(new Font("Times New Roman",Font.BOLD,25));

        userInputBox.setBounds(200,400,200,50);

        add(num1lbl);
        add(num2lbl);
        add(correctLbl);
        add(isCorrectLbl);
        add(incorrectLbl);
        add(userInputBox);

        num1lbl.setText("0");
        num2lbl.setText("1");
        isCorrectLbl.setText("2");
        correctLbl.setText("3");
        incorrectLbl.setText("4");

        newGame();
        verify();
    }

    private void newGame() {
        Logic.generateNumbers();
        correctAmount = 0;
        incorrectAmount = 0;

    }

    private void verify() {
        if (!userInputBox.getText().equals("")) {
            if (Logic.getResult() == Integer.parseInt(userInputBox.getText())) {++correctAmount;
            isCorrectLbl.setText("Correct");}
            else {++incorrectAmount;
            isCorrectLbl.setText("Incorrect");}
        }
        correctLbl.setText("Správně: "+ correctAmount);
        incorrectLbl.setText("Špatně: " + incorrectAmount);
        Logic.generateNumbers();
        num1lbl.setText(String.valueOf(Logic.getFirstNum()));
        num2lbl.setText(String.valueOf(Logic.getSecondNum()));

    }
}
