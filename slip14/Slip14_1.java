/*Q1) Write a program to accept a number from the user, if number is zero then throw user defined 
exception “Number is 0” otherwise check whether no is prime or not (Use static keyword). [10 marks] */

//Slip14_1

import java.util.*;

class NumberException extends Exception

{

   NumberException() 

 {

       System.out.println("Number is 0");

 }

}

class Slip14_1

{

 public static void main( String args[] )

 {	

  	Scanner sc=new Scanner(System.in);

	System.out.println("Enter Number ");

	int n=sc.nextInt();

	try

	{

		if(n==0)

		throw new NumberException();

		else

		{

		 int i,m=0,flag=0;      

  		 m=n/2;      

  		if(n==0||n==1)  

   		System.out.println(n+" is not prime number");      

  		else

		{  

   			for(i=2;i<=m;i++)

			{      

    			if(n%i==0)

			{      

     				System.out.println(n+" is not prime number");      

     				flag=1;      

     				break;      

    			}      

   			}   

		}   

   		if(flag==0)  

		System.out.println(n+" is prime number"); 

		}    

	}

	catch(NumberException e){}

	

}  	

}