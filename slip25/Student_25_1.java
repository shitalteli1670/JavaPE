 /*Q1) Create a class Student(rollno, name ,class, per), to read student information from the console and 
 display them (Using BufferedReader class) [10 marks]*/

import java.io.*;

class Student_25_1 

{

    int rollno;

    String name,studentClass;

    double percentage;

    public Student_25_1(int rollno, String name, String studentClass, double percentage) 

    {

        this.rollno = rollno;

        this.name = name;

        this.studentClass = studentClass;

        this.percentage = percentage;

    }

    public String toString() 

    {

        System.out.println("Student Details:");

        System.out.println("Roll No: " + rollno);

        System.out.println("Name: " + name);

        System.out.println("Class: " + studentClass);

        System.out.println("Percentage: " + percentage + "%");

	return "";

    }



    public static void main(String[] args) throws IOException 

    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Roll No: ");

        int rollno = Integer.parseInt(reader.readLine());

        System.out.print("Enter Name: ");

        String name = reader.readLine();

        System.out.print("Enter Class: ");

        String cls= reader.readLine();

        System.out.print("Enter Percentage: ");

        double p= Double.parseDouble(reader.readLine());

        Student_25_1 s1= new Student_25_1(rollno, name, cls, p);

        System.out.print(s1);

    }

}