package Bankomat.Graphical.Panels;

import Bankomat.Graphical.Bankomat;

import javax.swing.*;
import java.awt.*;


public class MainPanel extends JPanel {

    Bankomat atm;
    Font times = new Font("Times New Roman", Font.BOLD, 30);

    JLabel AccountBalanceLabel;
    JLabel Balance;

    JTextField DepositInputBox;
    JLabel DepositText;
    JButton DepositSubmitButton;

    JTextField WithdrawInputBox = new JTextField();
    JLabel WithdrawText = new JLabel("Withdraw Amount");
    JButton WithdrawSubmitButton = new JButton("Submit");

    public MainPanel() {
        atm = new Bankomat("src/Bankomat/Graphical/Account.txt");
        setLayout(null);
        this.createAndShowGUI();
        setBackground(Color.lightGray);



        WithdrawSubmitButton.setVisible(false);
    }
    private void createAndShowGUI() {

        JButton AccountButton = new JButton("Get Balance");
        JButton DepositButton = new JButton("Deposit");
        JButton WithdrawButton = new JButton("Withdraw");

        AccountButton.setBounds(150, 200, 200, 60);
        DepositButton.setBounds(150, 300, 200, 60);
        WithdrawButton.setBounds(150, 400, 200, 60);

        AccountButton.addActionListener(_ -> AccountButtonClick());
        DepositButton.addActionListener(_ -> DepositButtonClick());
        WithdrawButton.addActionListener(_ -> WithdrawButtonClick());

        add(AccountButton);
        add(DepositButton);
        add(WithdrawButton);


        Balance = new JLabel();
        Balance.setBounds(400, 260, 300, 100);
        Balance.setFont(new Font("Times New Roman", Font.BOLD, 24));
        add(Balance);

        AccountBalanceLabel = new JLabel("Current Balance:");
        AccountBalanceLabel.setBounds(400, 200, 400, 50);
        AccountBalanceLabel.setFont(times);
        add(AccountBalanceLabel);

        DepositText = new JLabel("Deposit Amount:");
        DepositText.setBounds(400, 200, 260, 50);
        DepositText.setFont(times);
        //DepositText.setText("Deposit Amount");
        add(DepositText);

        DepositInputBox = new JTextField();
        DepositInputBox.setBounds(400, 300, 100, 30);
        add(DepositInputBox);

        DepositSubmitButton = new JButton("Submit");
        DepositSubmitButton.setBounds(520, 300, 100, 30);
        DepositSubmitButton.addActionListener(_ -> DepositSubmitButtonClick(DepositInputBox.getText()));
        add(DepositSubmitButton);



        WithdrawText.setBounds(400, 200, 300, 50);
        WithdrawText.setFont(times);
        WithdrawText.setText("Withdraw Amount:");
        add(WithdrawText);

        WithdrawInputBox.setBounds(400, 300, 100, 30);
        add(WithdrawInputBox);

        WithdrawSubmitButton.setBounds(520, 300, 100, 30);
        WithdrawSubmitButton.addActionListener(_ -> WithdrawSubmitButtonClick(WithdrawInputBox.getText()));
        add(WithdrawSubmitButton);

        Balance.setVisible(false);
        AccountBalanceLabel.setVisible(false);
        DepositText.setVisible(false);
        DepositInputBox.setVisible(false);
        DepositSubmitButton.setVisible(false);
        WithdrawText.setVisible(false);
        WithdrawSubmitButton.setVisible(false);
        WithdrawInputBox.setVisible(false);
        WithdrawSubmitButton.setVisible(false);


        AccountButton.setFocusPainted(false);
        AccountButton.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        AccountButton.setBackground(new Color(66, 133, 244));
        AccountButton.setForeground(Color.WHITE);
        AccountButton.setOpaque(true);
        AccountButton.setBorder(BorderFactory.createEmptyBorder(8, 16, 8, 16));
        AccountButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        DepositButton.setFocusPainted(false);
        DepositButton.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        DepositButton.setBackground(new Color(30, 98, 27));
        DepositButton.setForeground(Color.WHITE);
        DepositButton.setOpaque(true);
        DepositButton.setBorder(BorderFactory.createEmptyBorder(8, 16, 8, 16));
        DepositButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        WithdrawButton.setFocusPainted(false);
        WithdrawButton.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        WithdrawButton.setBackground(new Color(222, 26, 48));
        WithdrawButton.setForeground(Color.WHITE);
        WithdrawButton.setOpaque(true);
        WithdrawButton.setBorder(BorderFactory.createEmptyBorder(8, 16, 8, 16));
        WithdrawButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        DepositSubmitButton.setFocusPainted(false);
        DepositSubmitButton.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        DepositSubmitButton.setBackground(new Color(66, 133, 244));
        DepositSubmitButton.setForeground(Color.WHITE);
        DepositSubmitButton.setOpaque(true);
        DepositSubmitButton.setBorder(BorderFactory.createEmptyBorder(8, 16, 8, 16));
        DepositSubmitButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        WithdrawSubmitButton.setFocusPainted(false);
        WithdrawSubmitButton.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        WithdrawSubmitButton.setBackground(new Color(66, 133, 244));
        WithdrawSubmitButton.setForeground(Color.WHITE);
        WithdrawSubmitButton.setOpaque(true);
        WithdrawSubmitButton.setBorder(BorderFactory.createEmptyBorder(8, 16, 8, 16));
        WithdrawSubmitButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    private void AccountButtonClick() {

        DepositInputBox.setText("");
        DepositSubmitButton.setVisible(false);
        DepositText.setVisible(false);
        DepositInputBox.setVisible(false);
        WithdrawText.setVisible(false);
        WithdrawSubmitButton.setVisible(false);
        WithdrawInputBox.setVisible(false);

        if (atm.GetBalance() % 1 == 0){
            Balance.setText((int) atm.GetBalance() + " Kč");
        }
        else {
            Balance.setText(atm.GetBalance() + " Kč");
        }

        Balance.setVisible(true);
        AccountBalanceLabel.setVisible(true);


        revalidate();
        repaint();
    }

    private void DepositButtonClick() {

        Balance.setVisible(false);
        AccountBalanceLabel.setVisible(false);
        WithdrawText.setVisible(false);
        WithdrawSubmitButton.setVisible(false);
        WithdrawInputBox.setText("");
        WithdrawInputBox.setVisible(false);
        DepositSubmitButton.setVisible(true);

        DepositText.setVisible(true);
        DepositInputBox.setVisible(true);
        DepositSubmitButton.setVisible(true);

        revalidate();
        repaint();
    }

    private void DepositSubmitButtonClick(String TextField) {
        try {
            double amount = Double.parseDouble(TextField);
            atm.vklad(amount);
            DepositInputBox.setText("");
            DepositSubmitButton.setVisible(false);
            DepositText.setVisible(false);
            DepositInputBox.setVisible(false);

            if (amount % 1 == 0){
                JOptionPane.showMessageDialog(this, "Successfully deposited " + (int)amount + " Kč");
            }
            else {
                JOptionPane.showMessageDialog(this, "Successfully deposited " + amount + " Kč");

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number (e.g., 123.45)");
        }
    }

    private void WithdrawButtonClick() {

        Balance.setVisible(false);
        AccountBalanceLabel.setVisible(false);
        DepositInputBox.setText("");
        DepositSubmitButton.setVisible(false);
        DepositText.setVisible(false);
        DepositInputBox.setVisible(false);


        WithdrawText.setVisible(true);
        WithdrawInputBox.setVisible(true);
        WithdrawSubmitButton.setVisible(true);

        validate();
        repaint();
    }

    private void WithdrawSubmitButtonClick(String TextField) {
        try {
            double amount = Double.parseDouble(TextField);
            try {
                atm.vyber(amount);
                WithdrawText.setVisible(false);
                WithdrawInputBox.setText("");
                WithdrawInputBox.setVisible(false);
                WithdrawSubmitButton.setVisible(false);

                if (amount % 1 == 0){
                    JOptionPane.showMessageDialog(this, "Successfully Withdrew " + (int)amount + " Kč");
                }
                else {
                    JOptionPane.showMessageDialog(this, "Successfully Withdrew " + amount + " Kč");

                }
            }

            catch (RuntimeException e) {
                WithdrawText.setVisible(false);
                WithdrawInputBox.setText("");
                WithdrawInputBox.setVisible(false);
                WithdrawSubmitButton.setVisible(false);
                JOptionPane.showMessageDialog(this, "Insufficient funds");
            }
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number (e.g., 123.45)");
        }
    }

}

