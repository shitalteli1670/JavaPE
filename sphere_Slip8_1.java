/*Q1) Create a class Sphere, to calculate the volume and surface area of sphere. (Hint : Surface area=4*3.14(r*r), 
Volume=(4/3)3.14(r*r*r))*/

import java.util.*;

public class sphere_Slip8_1

{  

        public static void main(String args[])  

    	{  

    	int radius;  

    	//double pie=3.14285714286;  

	Scanner s=new Scanner(System.in);

	System.out.println("Enter the Radious");

	radius=s.nextInt();

	double area=4*(Math.PI)*radius*radius;

 	System.out.println("Area of the sphere="+area);

    	double volume=(4.0/3.0)*Math.PI*(radius*radius*radius);  

    	System.out.println("Volume of the sphere="+volume);  

     }  

}  