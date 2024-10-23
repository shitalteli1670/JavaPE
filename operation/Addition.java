/*Q2) Write a package for Operation, which has two classes, Addition and Maximum. 
Addition has two methods add () and subtract (), which are used to add two integers 
and subtract two, float values respectively. Maximum has a method max () to display the maximum of two integers*/


//Addition.java

package operation;

public class Addition {
    public void add(int a, int b) {
        int c = a + b;
        System.out.println("Addition of 2 integers is: " + c);
    }

    public void sub(float a, float b) {
        float s = a - b;
        System.out.println("Subtraction of 2 float values is: " + s);
    }
}
