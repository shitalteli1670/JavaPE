 /*Q1) Define an Employee class with suitable attributes having getSalary() method, which returns salary 
 withdrawn by a particular employee. Write a class Manager which extends a class Employee, override the getSalary() method, 
 which will return salary of manager by adding traveling allowance, house rent allowance etc. [10 marks]*/

class Employee 
{

    String name;

    double salary;



    public Employee(String name, double salary) {

        this.name = name;

        this.salary = salary;

    }



    public double getSalary() {

        return salary;

    }

}



class Manager extends Employee {

    double ta,ha;

    

    public Manager(String name, double salary, double ta,double ha){

        super(name, salary);

        this.ta = ta;

        this.ha = ha;

    }



    @Override

    public double getSalary() {

        return super.getSalary() + ta + ha;

    }

}



public class Slip27_1{

    public static void main(String[] args) {

        Employee e1 = new Employee("Aaaaa", 5000.0);

        System.out.println("Employee Name = "+e1.name+" Salary: " + e1.getSalary());



        Manager m = new Manager("Bbbb", 8000.0, 1000.0, 2000.0);

        System.out.println("Manager Name = "+m.name+" Salary: " + m.getSalary());

    }

}