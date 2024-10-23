/*Q1) Accept the names of two files and copy the contents of the first to the second. 
First file having Book name and Author name in file. [10 marks] */

import java.io.*;

public class Slip15_1

{

public static void main(String[] args) throws IOException

{

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter Source file name");

String f1=br.readLine();

System.out.println("Enter Destination file name");

String f2=br.readLine();

FileReader in = new FileReader(f1);

FileWriter out = new FileWriter(f2);

int c;

while ((c=in.read()) != -1)

out.write(c);

out.write("\nEnd of file");

in.close();

out.close();

FileReader fr = new FileReader(f2);

while ((c=fr.read()) != -1)

System.out.print((char)c);

}

}

