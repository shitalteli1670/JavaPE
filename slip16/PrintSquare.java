/*Q1) Write a program to find the Square of given number using function interface. [10 marks] */

//slip16_1

//@FunctionalInterface

interface PrintNumber
{
public void print(int num1);
}
public class PrintSquare
{
public static void main(String[] a)
{
PrintNumber p = n -> System.out.println("Square is: "+ n*n);
p.print(25);
}
}