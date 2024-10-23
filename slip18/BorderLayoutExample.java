import java.awt.*;

import java.awt.event.*;



public class BorderLayoutExample 

{



  public static void main(String[] args) 

{

  Frame frame= new Frame("BorderLayout Frame");

  

  

  frame.setLayout(new BorderLayout(10,10));

	Button b1=new Button("NORTH");

  frame.add(b1, BorderLayout.NORTH);

  frame.add(new Button("SOUTH"), BorderLayout.SOUTH);

  frame.add(new Button("EAST"), BorderLayout.EAST);

  frame.add(new Button("WEST"), BorderLayout.WEST);

  frame.add(new Button("CENTER"), BorderLayout.CENTER);

  frame.setSize(300,300);

  frame.setVisible(true);

  }

}