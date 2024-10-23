/*Q2) Write a program that handles all mouse events and shows the event name at the center of the Window, 
red in color when a mouse event is fired. (Use adapter classes).*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Slip22_2 extends JFrame 
{
    String msg= "";
    public Slip22_2() 
    {
        setTitle("Mouse Event Demo");
        setSize(400, 400);
	    setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(new MyMouseAdapter());
        addMouseMotionListener(new MyMouseAdapter());
    }
    public void paint(Graphics g) 
    {
        super.paint(g);
        g.setColor(Color.RED);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString(msg, getWidth() / 2 - 50, getHeight() / 2);
    }
    class MyMouseAdapter extends MouseAdapter 
    {
        public void mouseClicked(MouseEvent e) 
        {
            msg= "Mouse Clicked";
            repaint();
        }
        public void mouseEntered(MouseEvent e) 
        {
            msg= "Mouse Entered";
            repaint();
        }
        public void mouseExited(MouseEvent e) 
        {
            msg= "Mouse Exited";
            repaint();
        }
        public void mousePressed(MouseEvent e) 
        {
            msg= "Mouse Pressed";
            repaint();
        }
        public void mouseReleased(MouseEvent e) 
        {
            msg= "Mouse Released";
            repaint();
        }
        public void mouseDragged(MouseEvent e) 
        {
            msg= "Mouse Dragged";
            repaint();
        }
        public void mouseMoved(MouseEvent e) 
        {
            msg= "Mouse Moved";
            repaint();
        }
    }
    public static void main(String[] args) 
    {
        new Slip22_2();   
    }
}