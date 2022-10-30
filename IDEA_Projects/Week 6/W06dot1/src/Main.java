// source code for W06dot1
// name: Benjamin Vredenburg
// last modified: 10/22/2021
// course: CIT-260

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner kbd = new Scanner(System.in);

        // Tell the user what the program does
        System.out.println("\nGiven an investment amount and an annual" +
                " interest rate, this program\nwill calculate the future" +
                " value of the investment for a period of\nten years.\n");

        // Define baseline variables for loops
        double investmentAmount;
        double annualInterestRate;
        int years = 1;

        // Prompt the user for an investment amount, for example, 1000
        do {
            System.out.print("Enter a positive, non-zero value for the investment: ");

        // Get the user's input and save it to a variable.
             investmentAmount = kbd.nextDouble();

        // If the user's input is not a positive, non-zero value, display
        // an error message, then loop back and prompt for a new value.
            if (investmentAmount < 1)
                System.out.println("\n" + investmentAmount + " is not a positive, non-zero value: ");
        }
        // Stay in the loop until you have a valid value.
        while(investmentAmount < 1);

        // Prompts the user to enter an annual interest rate between 0 and 100.
        // Example: 9 would be 9%
        do {
            System.out.print("Enter an annual interest rate, between 0 and 100: ");

        // Get the user's input and save it to a variable.
            annualInterestRate = kbd.nextDouble();

        // If the user's input is not positive or if it is greater than 100, display
        // an error message, then loop back and prompt for a new value.
            if (annualInterestRate < 0 || annualInterestRate > 100)
                System.out.print("\n" + annualInterestRate + " is not a positive number between" +
                        "\n0 and 100: ");
        }

        // Stay in the loop until you have a valid value.
        while (annualInterestRate < 0.0 || annualInterestRate > 100);

        // Calculate monthly interest rate and store as monthlyInterestRate variable
        double monthlyInterestRate = (annualInterestRate / 100) / 12;

        // Create header for table
        System.out.println("\nYears     Future Value");


        // Using a method, calculate and display the future value of the investment
        // for a period of 10 years.
        while(years < 11){
            System.out.format("%2d", years);
            System.out.print("         ");
            System.out.printf("$%.2f", futureValue(investmentAmount, monthlyInterestRate, years));
            years++;
            System.out.println();
        }


        // Display a goodbye message
        System.out.print("\nHave a wonderful day.\n");

    }
    // Create method to be used in program.
    /**
     * This method calculates the future value of an investment using the following parameters
     * @param investmentAmount
     * @param monthlyInterestRate
     * @param years
     * @return
     */
    public static double futureValue(double investmentAmount, double monthlyInterestRate, int years){
        double result = 0.0;
        double fV = investmentAmount * Math.pow((1 + monthlyInterestRate), years * 12);
        result += fV;

        return result;
    }

}
