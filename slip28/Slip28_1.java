/* Q1) Write a program that reads on file name from the user, then displays information about whether the file exists, 
whether the file is readable, whether the file is writable, the type of file and the length of the file in bytes. [10 marks] */


import java.io.File;

import java.util.Scanner;



public class Slip28_1

{

    public static void main(String[] args) 

    {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file name (with full path): ");

        String fileName = scanner.nextLine();

        File file = new File(fileName);

        if (file.exists()) 

	{

            System.out.println("File exists.");

            System.out.println("Readable: " + file.canRead());

            System.out.println("Writable: " + file.canWrite());

	    System.out.println(file.isFile() ? "is normal file" : "might be a named pipe");

            System.out.println("It is " + (file.isDirectory() ? "" : "not" + " a directory"));

            System.out.println("File Length: " + file.length() + " bytes");      

        }

        scanner.close();

    }

}