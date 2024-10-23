/*Q1) Design a Super class Customer (name, phone-number). Derive a class Depositor(accno , balance) from Customer. 
Again, derive a class Borrower (loan-no, loan-amt) from Depositor. Write necessary member functions to read and display 
the details of ‘n’customers. [10 marks] */

import java.util.*;

class Customer {
    String cname;
    int pno;

    Customer(String cname, int pno) {
        this.cname = cname;
        this.pno = pno;
    }

    void display() {
        System.out.println("Customer Name: " + cname + "\nPhone No: " + pno);
    }
}

class Depositor extends Customer {
    int accno, balance;

    Depositor(String cname, int pno, int accno, int balance) {
        super(cname, pno);
        this.accno = accno;
        this.balance = balance;
    }

    void display() {
        super.display();
        System.out.println("Account No: " + accno + "\nBalance: " + balance);
    }
}

class Borrower extends Depositor {
    int loanno, loanamt;

    Borrower(String cname, int pno, int accno, int balance, int loanno, int loanamt) {
        super(cname, pno, accno, balance);
        this.loanno = loanno;
        this.loanamt = loanamt;
    }

    void display() {
        super.display();
        System.out.println("Loan No: " + loanno + "\nLoan Amount: " + loanamt);
    }
}

class Slip17_1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of customers: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        Borrower[] customers = new Borrower[n]; 

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for customer " + (i + 1) + ":");
            
            System.out.print("Customer Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Phone Number: ");
            int phone = scanner.nextInt();
            
            System.out.print("Account Number: ");
            int accNo = scanner.nextInt();
            
            System.out.print("Balance: ");
            int balance = scanner.nextInt();
            
            System.out.print("Loan Number: ");
            int loanNo = scanner.nextInt();
            
            System.out.print("Loan Amount: ");
            int loanAmt = scanner.nextInt();
            scanner.nextLine(); 

            customers[i] = new Borrower(name, phone, accNo, balance, loanNo, loanAmt);
        }


        System.out.println("\nCustomer Details:");
        for (Borrower customer : customers) {
            customer.display();
            System.out.println(); 
        }

        scanner.close(); 
    }
}
