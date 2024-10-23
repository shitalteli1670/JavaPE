/*Q2) Write a simple currency converter, as shown in the figure. User can enter the amount of 
"Singapore Dollars", "US Dollars", or "Euros", in floating-point number. The converted values shall be displayed to 2 decimal places. 
Assume that 1 USD = 1.41 SGD, 1 USD = 0.92 Euro, 1 SGD = 0.65 Euro*/

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.DecimalFormat;

public class Slip23_2 extends JFrame {
    double USD_TO_SGD = 1.41;
    double USD_TO_EUR = 0.92;
    double SGD_TO_EUR = 0.65;

    JLabel sgdLabel, usdLabel, eurLabel;
    JTextField usdField, sgdField, eurField;

    public static void main(String[] args) {
        new Slip23_2();
    }

    Slip23_2() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);       
        sgdLabel = new JLabel("Singapore Dollars");
        sgdField = new JTextField();       
        usdLabel = new JLabel("US Dollars");
        usdField = new JTextField();
        eurLabel = new JLabel("Euros");  
        eurField = new JTextField();

        // Set layout and add components
        setLayout(new GridLayout(3, 2, 5, 5)); 
        add(sgdLabel);
        add(sgdField);
        add(usdLabel);
        add(usdField);
        add(eurLabel);
        add(eurField);

        // Add ActionListener for SGD input
        sgdField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertFromSGD();
            }
        });

        // Add ActionListener for USD input
        usdField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertFromUSD();
            }
        });

        // Add ActionListener for EUR input
        eurField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertFromEUR();
            }
        });

        setVisible(true);
    }

    // Method to convert from SGD
    private void convertFromSGD() {
        try {
            double sgdAmount = Double.parseDouble(sgdField.getText());
            double usdAmount = sgdAmount / USD_TO_SGD;
            double eurAmount = sgdAmount * SGD_TO_EUR;

            DecimalFormat df = new DecimalFormat("#.00");
            usdField.setText(df.format(usdAmount));
            eurField.setText(df.format(eurAmount));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number for SGD.");
        }
    }

    // Method to convert from USD
    private void convertFromUSD() {
        try {
            double usdAmount = Double.parseDouble(usdField.getText());
            double sgdAmount = usdAmount * USD_TO_SGD;
            double eurAmount = usdAmount * USD_TO_EUR;

            DecimalFormat df = new DecimalFormat("#.00");
            sgdField.setText(df.format(sgdAmount));
            eurField.setText(df.format(eurAmount));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number for USD.");
        }
    }

    // Method to convert from EUR
    private void convertFromEUR() {
        try {
            double eurAmount = Double.parseDouble(eurField.getText());
            double usdAmount = eurAmount / USD_TO_EUR;
            double sgdAmount = eurAmount / SGD_TO_EUR;

            DecimalFormat df = new DecimalFormat("#.00");
            usdField.setText(df.format(usdAmount));
            sgdField.setText(df.format(sgdAmount));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number for EUR.");
        }
    }
}
