/*Q2) Write a program to define a class Account having members custname, accno. 
Define default and parameterized constructor. Create a subclass called SavingAccount 
with member savingbal, minbal. Create a derived class AccountDetail that extends the class 
SavingAccount with members, depositamt and withdrawalamt. Write a appropriate method to display customer details.*/



import java.util.*;

class Account 

{

   String cname;

   int ano;

   Account(int ano, String cname) 

 {

       this.ano=ano;  

	this.cname=cname;

 }

void display() 

 {

       System.out.println("Customer Name: "+cname+"\nAccount No: "+ano);        

 }

}

class SavingAccount extends Account 

{

   int savingbal, minbal;

   SavingAccount(int ano, String cname,int savingbal, int  minbal) 

 {

       super(ano,cname);

	this.savingbal=savingbal;  

	this.minbal=minbal;

	

 }

void display() 

 {

	super.display();

       System.out.println("Saving bal : "+savingbal+"\nMinimum bal: "+minbal);        

 }

}

class AccountDetail extends SavingAccount 

{

   int depositamt ,withdrawalamt;

   AccountDetail(int ano, String cname,int savingbal, int  minbal, int depositamt ,int withdrawalamt) 

 {

       super(ano,cname, savingbal,minbal);

	this.depositamt=depositamt ;  

	this.withdrawalamt=withdrawalamt;

	

 }

void display() 

 {

	super.display();

       System.out.println("Deposit amt  : "+depositamt +"\nWithdrawalamt: "+withdrawalamt);        

 }

}



 class Slip15_2

{

 public static void main( String args[] )

 {	

  	AccountDetail acc=new AccountDetail(101,"abc",5000,1000,2000,1000);

	acc.display();

 }  	

}