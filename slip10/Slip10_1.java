/*Q1) Write a program to find the cube of given number using functional interface. [10 marks] */

//@FunctionalInterface

interface PrintNumber

{

public void print(int num1);

}

public class Slip10_1

{

public static void main(String[] a)

{

PrintNumber p = n -> System.out.println("Cube is: "+ n*n*n);

p.print(5);

}

}