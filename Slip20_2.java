/*Q2) Write a package for Operation, which has two classes, Addition and Maximum. 
Addition has two methods add () and subtract (), which are used to add two integers 
and subtract two, float values respectively. Maximum has a method max () to display the maximum of two integers*/

//main program
import operation.*;

class Slip20_2 {
    public static void main(String args[]) {
        Addition a = new Addition();
        a.add(2, 6);  // Adding two integers
        a.sub(20.40f, 10.70f);  // Subtracting two float values

        Maximum m = new Maximum();
        m.max(25, 30);  // Finding maximum of two integers
    }
}
