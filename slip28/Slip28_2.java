/* Q2) Write a program to create a super class Vehicle having members Company and price. 
Derive two different classes LightMotorVehicle(mileage) and HeavyMotorVehicle (capacity_in_tons). 
Accept the information for "n" vehicles and display the information in appropriate form. While taking data, 
ask user about the type of vehicle first. [20 marks]*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Slip28_2 extends JFrame 
{
    JTextField ctext;
    JTextField ftext;

    public Slip28_2() {
        setTitle("Temperature Converter");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 2));

        JLabel l1 = new JLabel("Caelsius:");
        JLabel l2 = new JLabel("Fahrenheit:");

        ctext = new JTextField();
        ftext = new JTextField();

        add(l1);
        add(ctext );
        add(l2);
        add(ftext);
	setVisible(true);
        ftext.addActionListener(new ActionListener() {
           
            public void actionPerformed(ActionEvent e) {
                try {
                double fahrenheit = Double.parseDouble(ftext.getText());
                double celsius = (fahrenheit - 32) * 5 / 9;
                ctext.setText(String.format("%.1f", celsius));
            } catch (NumberFormatException ex) {       }     
            }
        });
	ctext.addActionListener(new ActionListener() {
                       public void actionPerformed(ActionEvent e) {
                try {
                double celsius = Double.parseDouble(ctext.getText());
                double fahrenheit = (celsius * 9 / 5) + 32;
                ftext.setText(String.format("%.1f", fahrenheit ));
            } catch (NumberFormatException ex) {       }     
            }
        });
    
    }

    public static void main(String[] args) 
    {
        new Slip28_2();
    }
}