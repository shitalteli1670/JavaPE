//Q1) Write a program to read the First Name and Last Name of a person, his weight and height using command line arguments. Calculate the BMI Index which is defined as the individual's body mass divided by the square of their height. (Hint : BMI = Wts. In kgs / (ht)2) 

import java.util.Scanner;

public class Slip2_1

{

    public static void main(String[] args) 

    {

        double wt, ht;

	String fname,lname;

	fname=args[0];

	lname=args[1];

	wt=Double.parseDouble(args[2]);

	ht=Double.parseDouble(args[3]);

	double bmi=wt/(ht*ht);

        System.out.println("Person Name : "+fname+" "+lname);

        System.out.println("BMI : "+bmi);

    }

}