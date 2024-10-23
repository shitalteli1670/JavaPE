/*Q.1 Write program to define class Person with data member as Personname,Aadharno, Panno. 
Accept information for 5 objects and display appropriate information (use this keyword).*/

import java.util.Scanner;

class Person 
{
    String personName, aadharNo, panNo;

    public Person(String personName, String aadharNo, String panNo) 
    {
        this.personName = personName;
        this.aadharNo = aadharNo;
        this.panNo = panNo;
    }

    public String toString() 
    {
        return "Person Name: " + this.personName + "\n" +
                "Aadhar Number: " + this.aadharNo + "\n" +
               "PAN Number: " + this.panNo;
    }
}

public class Slip30_1 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        Person[] p = new Person[2];

        for (int i = 0; i < 2; i++) 
        {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Aadhar Number: ");
            String aadhar = scanner.nextLine();

            System.out.print("PAN Number: ");
            String pan = scanner.nextLine();

            p[i] = new Person(name, aadhar, pan);
        }

        System.out.println("\nDisplaying Information of Persons:");

        for (int i = 0; i < 2; i++) 
        {
            System.out.println(p[i].toString());
        }

        scanner.close();
    }
}
