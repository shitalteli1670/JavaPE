/*Q2) Write a program to display the system date and time in various formats shown below: Current date is : 31/08/2021 Current date is : 08-31-2021 Current date is : Tuesday August 31 2021 Current date and time is : Fri August 31 15:25:59 IST 2021 Current date and time is : 31/08/21 15:25:59 PM +0530 [20 marks]



Letter 	Date or Time Component 	Presentation 	Examples

G 	Era designator 	Text 	AD

y 	Year 	Year 	1996; 96

Y 	Week year 	Year 	2009; 09

M 	Month in year 	Month 	July; Jul; 07

w 	Week in year 	Number 	27

W 	Week in month 	Number 	2

D 	Day in year 	Number 	189

d 	Day in month 	Number 	10

F 	Day of week in month 	Number 	2

E 	Day name in week 	Text 	Tuesday; Tue

u 	Day number of week (1 = Monday, ..., 7 = Sunday) 	Number 	1

a 	Am/pm marker 	Text 	PM

H 	Hour in day (0-23) 	Number 	0

k 	Hour in day (1-24) 	Number 	24

K 	Hour in am/pm (0-11) 	Number 	0

h 	Hour in am/pm (1-12) 	Number 	12

m 	Minute in hour 	Number 	30

s 	Second in minute 	Number 	55

S 	Millisecond 	Number 	978

z 	Time zone 	General time zone 	Pacific Standard Time; PST; GMT-08:00

Z 	Time zone 	RFC 822 time zone 	-0800

X 	Time zone 	ISO 8601 time zone 	-08; -0800; -08:00





Date and Time Pattern 	Result

"yyyy.MM.dd G 'at' HH:mm:ss z" 	2001.07.04 AD at 12:08:56 PDT

"EEE, MMM d, ''yy" 	Wed, Jul 4, '01

"h:mm a" 	12:08 PM

"hh 'o''clock' a, zzzz" 	12 o'clock PM, Pacific Daylight Time

"K:mm a, z" 	0:08 PM, PDT

"yyyyy.MMMMM.dd GGG hh:mm aaa" 	02001.July.04 AD 12:08 PM

"EEE, d MMM yyyy HH:mm:ss Z" 	Wed, 4 Jul 2001 12:08:56 -0700

"yyMMddHHmmssZ" 	010704120856-0700

"yyyy-MM-dd'T'HH:mm:ss.SSSZ" 	2001-07-04T12:08:56.235-0700

"yyyy-MM-dd'T'HH:mm:ss.SSSXXX" 	2001-07-04T12:08:56.235-07:00

"YYYY-'W'ww-u" 	2001-W27-3



*/

import java.text.SimpleDateFormat;

import java.util.Date;

public class DateFormatExample 

{



    public static void main(String args[]) 

{

     

        // This is how to get today's date in Java

        Date today = new Date();

            

      SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

       String date = df.format(today);

       System.out.println ("\nCurrent Date is : " + date);

     

  //Another Example of formatting Date in Java using SimpleDateFormat

        df = new SimpleDateFormat("MM-dd-yyyy");

        date = df.format(today);

        System.out.println("\nCurrent Date is : " + date);



             

     //formatting Date with time information

        df = new SimpleDateFormat("EEEEE d MMM yyyy");

        date = df.format(today);

        System.out.println("\nCurrent Date is : " + date);



 //If you print Date, you will get un formatted output

        System.out.println("\nCurrent Date and Time is: " + today);



        //formatting Date with time information

        df = new SimpleDateFormat("dd/MM/yy HH:mm:ss aaaZ");

        date = df.format(today);

        System.out.println("\nCurrent Date and Time is : " + date);

     

        //SimpleDateFormat example - Date with timezone information

        df = new SimpleDateFormat("HH:mm:SS");

        date = df.format(today);

        System.out.println("\nCurrent Time is : " + date);



     df = new SimpleDateFormat("w");

        date = df.format(today);

        System.out.println("\nCurrent week of year is : " + date);



df = new SimpleDateFormat("W");

        date = df.format(today);

        System.out.println("\nCurrent week of month : " + date);

 

df = new SimpleDateFormat("D");

        date = df.format(today);

        System.out.println("\nCurrent day of the year is : " + date);



df = new SimpleDateFormat("d");

        date = df.format(today);

        System.out.println("\nCurrent day of the month is : " + date);

    }

}

