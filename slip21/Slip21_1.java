import java.io.*;

class InvalidDateException extends Exception {
    public InvalidDateException(String message) {
        super(message);
    }
}

class MyDate {
    int day, month, year;

    public MyDate(int day, int month, int year) {
        try {
            if (isValidDate(day, month, year)) {
                this.day = day;
                this.month = month;
                this.year = year;
                System.out.println("Valid Date: " + day + "/" + month + "/" + year);
            } else {
                throw new InvalidDateException("Given Date is Invalid: " + day + "/" + month + "/" + year);
            }
        } catch (InvalidDateException e) {
            System.out.println(e.getMessage());
        }
    }

    boolean isValidDate(int day, int month, int year) {
        if (month < 1 || month > 12)
            return false;
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            daysInMonth[1] = 29; 
        }
        return day > 0 && day <= daysInMonth[month - 1];
    }

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please provide the date in format: dd mm yyyy");
            return;
        }
        try {
            int d = Integer.parseInt(args[0]);
            int m = Integer.parseInt(args[1]);
            int y = Integer.parseInt(args[2]);

            MyDate date1 = new MyDate(d, m, y);
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integer values for day, month, and year.");
        }
    }
}
