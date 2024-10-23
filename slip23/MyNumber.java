/*Q1) Define a class MyNumber having one private int data member. Write a default constructor to initialize it 
 0 and another constructor to initialize it to a value (Use this). Write methods isNegative, isPositive, isZero, 
 isOdd, isEven. Create an object in main.Use command line arguments to pass a value to the Object. [10 marks]*/

class MyNumber 
{
    private int no;
    MyNumber() 
    {
        no = 5;
    }

    MyNumber(int no) 
    {
        this.no = no;
    }

    public void isNegative() 
    {
        if (no < 0) 
        {
            System.out.println("Given number is Negative");
        }
    }

    public void isPositive() 
    {
        if (no > 0) 
        {
            System.out.println("Given number is Positive");
        }
    }

    public void isZero() 
    {
        if (no == 0) 
        {
            System.out.println("Given number is Zero");
        }
    }

    public void isOdd() 
    {
        if (no % 2 != 0) 
        {
            System.out.println("Given number is Odd");
        }
    }

    public void isEven() 
    {
        if (no % 2 == 0) 
        {
            System.out.println("Given number is Even");
        }
    }

    public static void main(String args[]) 
    {
        MyNumber n1 = new MyNumber();
        System.out.println(n1.no + " Details:");
        n1.isNegative();
        n1.isPositive();
        n1.isZero();
        n1.isOdd();
        n1.isEven();

        if (args.length > 0) 
        {
            try 
            {
                int n = Integer.parseInt(args[0]);
                MyNumber n2 = new MyNumber(n);
                System.out.println(n2.no + " Details:");
                n2.isNegative();
                n2.isPositive();
                n2.isZero();
                n2.isOdd();
                n2.isEven();
            } 
            catch (NumberFormatException e) 
            {
                System.out.println("Invalid input: Please enter a valid integer.");
            }
        } 
        else 
        {
            System.out.println("No command-line argument provided.");
        }
    }
}
