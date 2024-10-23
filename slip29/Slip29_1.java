/*Q1) Write a program to create a class Customer(custno,custname,contactnumber,custaddr). 
Write a method to search the customer name with given contact number and display the details. [10 marks] */

import java.util.*;

class Customer 

{

    int custno;

    String custname,contactnumber,custaddr;

    public Customer(int custno, String custname, String contactnumber, String custaddr) 
    {

        this.custno = custno;

        this.custname = custname;

        this.contactnumber = contactnumber;

        this.custaddr = custaddr;

    }

    public void displayDetails() 

    {

        System.out.println("Customer Number: " +  custno);

        System.out.println("Customer Name: " + custname);

        System.out.println("Contact Number: " + contactnumber);

        System.out.println("Customer Address: " + custaddr);

    }

    public static void searchCustomer(Customer[] c,String cno) 

    {

	boolean flag=false;

        for (Customer ctemp : c) 
        {

            if (ctemp.contactnumber.equals(cno))

	    { 

		flag=true;

                ctemp.displayDetails();

		break;

	    }

            }

	if(!flag)

        System.out.println("Customer Not Found");

        }

        

    }

class Slip29_1

{

    public static void main(String[] args) 

    {

        Customer[] cList = new Customer[3];     

        cList[0] = new Customer(1, "aaaa", "1234567890", "123 Elm St");

        cList[1] = new Customer(2, "bbbb", "0987654321", "456 Oak St");

        cList[2] = new Customer(3, "cccc", "5555555555", "789 Pine St");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter contact number to search for customer: ");

        String contactnumber = scanner.nextLine();

        Customer.searchCustomer(cList,contactnumber);

        scanner.close();

    }

}