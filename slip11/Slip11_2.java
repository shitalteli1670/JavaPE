/*Q2) Write a program to accept the username and password from user if username and password are not same 
then raise "Invalid Password" with appropriate msg.*/

//Slip11_2

import java.util.Scanner;

class InvalidIDPasswordException extends Exception

{

        InvalidIDPasswordException() 

        {

           System.out.println("You Have entered Wrong Userid or Password");

        }

}



class InvalidEmailException extends Exception

{

        InvalidEmailException() 

        {

           System.out.println("The given Email id is invalid ");

        }

}

public class Slip11_2

{   

String UserName,password;

Slip11_2()

{

UserName=" ";

password=" ";

}

Slip11_2(String id,String pass)

{

UserName=id;

password=pass;

}

   public static void main(String args[])

   {  

       	try

	{

		Scanner sc = new Scanner(System.in);

 		System.out.println("Enter your Email id");

 		String uname = sc.next();

		System.out.println("Password");

 		String pass = sc.next();

		 Slip11_2 u1=new Slip11_2(uname,pass);

       	 	if(u1.UserName.indexOf("@")>0 && u1.UserName.indexOf(".")>0)

     System.out.println("You have entered Valid Email Id");    

 		else

			throw new InvalidEmailException();

		if((u1.UserName.equals("abc@gmail.com"))&& (u1.password.equals("123")))

			

System.out.println("Successful Login");    

 		else

			throw new InvalidIDPasswordException();

	}

	catch(InvalidEmailException e){}

	catch(InvalidIDPasswordException e){}

    }    

}