/* Q2) Write a program that creates a user interface to perform integer divisions. 
The user enters two numbers in the text fields, Number1 and Number2. 
The division of Number1 and Number2 is displayed in the Result field when the Divide button is clicked. 
If Number1 or Number2 were not an integer, the program would throw a NumberFormatException. If Number2 were Zero, 
the program would throw an Arithmetic Exception Display the exception in a message dialog box. [20 marks]*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Slip30_2 extends JFrame 
{
    JTextField tn1,tn2,res;
    JButton b1;
    public Slip30_2() 
    {
        setTitle("Integer Division");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    JPanel p1=new JPanel();
	    setLayout(new FlowLayout());
        p1.setLayout(new GridLayout(3,2,5,5));
        
        tn1= new JTextField(10);
        tn2= new JTextField(10);
        res= new JTextField(10);
        
        res.setEditable(false); 
        b1= new JButton("Divide");
        p1.add(new JLabel("Number 1:"));
        p1.add(tn1);
        p1.add(new JLabel("Number 2:"));
        p1.add(tn2);
        p1.add(new JLabel("Result:"));
        p1.add(res);
	    add(p1);
	    add(b1);
        b1.addActionListener(new ActionListener()
        {
	        public void actionPerformed(ActionEvent e) 
            {
            try {
                int number1 = Integer.parseInt(tn1.getText());
                int number2 = Integer.parseInt(tn2.getText());
                int result = number1 / number2;
                res.setText(String.valueOf(result));
            } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null,
                        "Please enter valid integers.",
                  "Input Error",JOptionPane.ERROR_MESSAGE);
            } catch (ArithmeticException ex) {
                JOptionPane.showMessageDialog(null,
                        "Division by zero is not allowed.",
               "Arithmetic Error",JOptionPane.ERROR_MESSAGE);
            }
        }
	});
    setVisible(true);
    }
        public static void main(String[] args) 
    {
        new Slip30_2();
    }
}