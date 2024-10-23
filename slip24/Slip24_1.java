/*Q1) Create an abstract class 'Bank' with an abstract method 'getBalance'. Rs.100, Rs.150 and Rs.200 
are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', 
each having a method named 'getBalance'. Call this method by creating an object of each of the three classes. [10 marks]*/ 

abstract class Bank

{

     abstract int getBalance();

}



class BankA extends Bank 

{

 private int balance;

 void deposit(int money)

 {

	balance += money;

 } 

 int getBalance() 

 {

     return balance;

 }

}



class BankB extends Bank

{

	private int balance;

	void deposit(int money) 

        {

	balance += money;

      }

       int getBalance() 

       {

         return balance;

        }

}

class BankC extends Bank 

{

   private int balance;

   void deposit(int money)

   {

      balance += money;

   }

  int getBalance() 

   {

     return balance;

   }

}



public class Slip24_1

 {

   public static void main(String[] args)

   {

	BankA bankA = new BankA();  

	BankB bankB = new BankB();

	BankC bankC = new BankC();

	bankA.deposit(100);

	bankB.deposit(150);

	bankC.deposit(200);

	System.out.println("Balance of Bank A = "+bankA.getBalance());

	System.out.println("Balance of Bank B = "+bankB.getBalance());

	System.out.println("Balance of Bank C = "+bankC.getBalance());

   }

}