package Bankomat.Graphical.Panels;

import Bankomat.Graphical.Bankomat;

import javax.swing.*;
import java.awt.*;


public class MainPanel extends JPanel {

    Bankomat atm;


    JLabel BalanceLabel = new JLabel();

    JTextField DepositInputBox = new JTextField();
    JLabel DepositText = new JLabel("Deposit Amount");
    JButton DepositSubmitButton = new JButton("Submit");

    JTextField WithdrawInputBox = new JTextField();
    JLabel WithdrawText = new JLabel("Withdraw Amount");
    JButton WithdrawSubmitButton = new JButton("Submit");

    public MainPanel() {
        atm = new Bankomat("src/Bankomat/Graphical/Account.txt");
        setLayout(null);
        this.createAndShowGUI();

        BalanceLabel = new JLabel();
        BalanceLabel.setBounds(400, 200, 200, 200);
        BalanceLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
        BalanceLabel.setVisible(false);
        add(BalanceLabel);

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


    }

    private void AccountButtonClick() {
        BalanceLabel.setText(String.valueOf(atm.GetBalance()));
        BalanceLabel.setVisible(true);
        revalidate();
        repaint();
    }

    private void DepositButtonClick() {

        BalanceLabel.setVisible(false);

        DepositText.setBounds(400, 200, 260, 50);
        Font times = new Font("Times New Roman", Font.BOLD, 30);
        DepositText.setFont(times);
        DepositText.setText("Deposit Amount");
        add(DepositText);

        DepositInputBox.setBounds(400, 300, 100, 30);
        add(DepositInputBox);

        DepositSubmitButton.setBounds(520, 300, 100, 30);
        DepositSubmitButton.addActionListener(_ -> DepositSubmitButtonClick(DepositInputBox.getText()));
        add(DepositSubmitButton);

        validate();
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

            JOptionPane.showMessageDialog(this, "Successfully deposited " + amount);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number (e.g., 123.45)");
        }
    }

    private void WithdrawButtonClick() {

        BalanceLabel.setVisible(false);

        WithdrawText.setBounds(400, 200, 260, 50);
        Font times = new Font("Times New Roman", Font.BOLD, 30);
        WithdrawText.setFont(times);
        WithdrawText.setText("Withdraw Amount");
        add(WithdrawText);

        WithdrawInputBox.setBounds(400, 300, 100, 30);
        add(WithdrawInputBox);

        WithdrawSubmitButton.setBounds(520, 300, 100, 30);
        WithdrawSubmitButton.addActionListener(_ -> WithdrawSubmitButtonClick(WithdrawInputBox.getText()));
        add(WithdrawSubmitButton);

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
                JOptionPane.showMessageDialog(this, "Successfully Withdrew " + amount);

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
