// source code for W03dot2
// name: Benjamin Vredenburg
// last modified: 09/30/2021
// course: CIT-260


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    // Create Scanner Object
    Scanner input = new Scanner(System.in);

	// Tell user what this program does
    System.out.println("Given a year and month in that year, this program will tell you " +
            "the number of days in that month.");

    // Prompt user to enter a year
    System.out.print("Enter a year: ");

    // Get user input and save it in year variable
    int year = input.nextInt();

    // Prompt user to enter a value for the month(1 = Jan, 2 = Feb, etc...)
    System.out.print("Enter a value for the month(1 = Jan, 2 = Feb, etc...): ");

    // Get user input and save in month variable. If the value is not between 1 - 12 inclusive, tell
    // user and terminate program.
    int numberOfMonth = input.nextInt();
    if(numberOfMonth < 1 || numberOfMonth > 12) {
        System.out.println("");
        System.out.println(numberOfMonth + " is invalid. Month values must be between 1 and 12, inclusive.");
        System.out.println("Program is terminating ...");
        System.out.println("Goodbye.");
        System.exit(1);
    }

    // Check if the year is a variable
    boolean isLeapYear =
            (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

    // Calculates the number of days in that month. Program should correctly handle leaps years.
    int days = 0;
    String month = "";

    switch(numberOfMonth) {
        case 1:
            month = "January";
            days = 31;
            break;
        case 2:
            month = "February";
            if(isLeapYear) {
                days = 29;
            }
            else {
                days = 28;
            }
            break;
        case 3:
            month = "March";
            days = 31;
            break;
        case 4:
            month = "April";
            days = 30;
            break;
        case 5:
            month = "May";
            days = 31;
            break;
        case 6:
            month = "June";
            days = 30;
            break;
        case 7:
            month = "July";
            days = 31;
            break;
        case 8:
            month = "August";
            days = 31;
            break;
        case 9:
            month = "September";
            days = 30;
            break;
        case 10:
            month = "October";
            days = 31;
            break;
        case 11:
            month = "November";
            days = 30;
            break;
        case 12:
            month = "December";
            days = 31;
            break;
    }

    // Display the number of days in that month
    System.out.println("");
    System.out.println(month + " of " + year + " has " + days + " days in it.");

    // Output a goodbye message
    System.out.println("Goodbye");

    }
}
