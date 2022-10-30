// source code for W04dot2
// name: Benjamin Vredenburg
// last modified: 10/08/2021
// course: CIT-260

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    // Create Constant variables for Tax Rates.
    final double FEDTAX = .20;
    final double STATETAX = .09;

    // Create Scanner object.
    Scanner input = new Scanner(System.in);

    // Tell the user what the program does.
    System.out.println("Given your name, hours worked, and hourly wage, this program calculates your\n" +
            "gross pay, state withholding tax, federal withholding tax, and your net pay.\n" +
            "It then displays your pay stub.");

    // Prompts the user to enter their first and last name.
    System.out.print("Enter your first and last name: ");

    // Gets the user's input and saves it as a String to variable fullName.
    String fullName = input.nextLine();

    // Prompts the user to enter the number of hours they worked this week.
    System.out.print("Enter the hours you worked this week: ");

    // Gets the user's input and saves it as a double to variable hoursWorked.
    double hoursWorked = input.nextDouble();

    // Prompts the user for their hourly wage.
    System.out.print("Enter your hourly wage: ");

    // Gets the user's input and saves it as a double to variable wage.
    double wage = input.nextDouble();

    // Calculates the gross pay and saves it as a double to variable grossPay.
    double grossPay = hoursWorked * wage;

    // Calculates the state withholding tax (9%) and the federal withholding tax (20%).
    double stateWithheld = grossPay * STATETAX;
    double fedWithheld = grossPay * FEDTAX;

    // Calculates the net pay after subtracting the withholding taxes and saves it as
    // a double to variable netPay.
    double netPay = grossPay - (stateWithheld + fedWithheld);

    // Outputs a pay statement.
    System.out.println("\nPay Stub for " + fullName);
    /* I am intentionally leaving the output for hours worked as a floating point number instead
    of an integer as shown in the example because in the real world, nobody only works an on integer time,
    and I feel this program should reflect the math necessary to deal with parts of an hour worked instead of
    rounding hours worked to an integer.*/
    System.out.format("Hours Worked: %.2f%n", hoursWorked);
    System.out.format("Hourly Wage: $%.2f%n", wage);
    System.out.format("Gross Pay: $%.2f%n", grossPay);
    System.out.format("State Tax Withheld: $%.2f%n", stateWithheld);
    System.out.format("Federal Tax Withheld: $%.2f%n", fedWithheld);
    System.out.format("Net Pay: $%.2f%n", netPay);

    // Outputs a goodbye message.

    System.out.println("Goodbye.");


    }
}
