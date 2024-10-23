/*Q2) Write a package for Operation, which has two classes, Addition and Maximum. 
Addition has two methods add () and subtract (), which are used to add two integers 
and subtract two, float values respectively. Maximum has a method max () to display the maximum of two integers*/

//Maximum.java
package operation;

public class Maximum {
    public void max(int a, int b) {
        if (a > b) {
            System.out.println(a + " is the maximum number between " + a + " and " + b);
        } else {
            System.out.println(b + " is the maximum number between " + a + " and " + b);
        }
    }
}
