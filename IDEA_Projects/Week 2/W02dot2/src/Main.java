// source code for W02_2
// name: Benjamin Vredenburg
// last modified: 09/23/2021
// course: CIT-260

// Import scanner
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Create a constant variable for Tax Rate
        double TAX_RATE = 0.032;

        // Tell user about the program
        // Line break at beginning for  ease of reading
        System.out.println("\nGiven the price of a meal and a percentage to use for the tip, \n" +
                "this program calculates the tip, the tax, and the total amount of the bill. ");

        // Prompt the use for the cost of the meal
        System.out.print("Enter the cost of the meal: ");

        // Read and store user's meal cost  input
        double subtotal = input.nextDouble();

        // Prompts the user for the tip percentage
        System.out.print("Enter the tip percentage: ");

        // Read and store user's tip percentage input
        double tipPercent = input.nextDouble() / 100;

        // Just a line break to match the example
        System.out.print("\n");

        // Calculate the value of the tip
        double tipAmount = subtotal * tipPercent;

        // Calculate tax
        double tax = subtotal * TAX_RATE;

        // Calculate the total cost of the meal, including tip
        double total = subtotal + tax + tipAmount;

        // Output the tip amount, tax amount, and grand total to user
        System.out.format("The tip is $%.2f%n", tipAmount);
        System.out.format("The tax is $%.2f%n", tax);
        System.out.format("The total bill is $%.2f%n", total);
        System.out.print("Goodbye.");

        // Just a line break to match the example
        System.out.print("\n");
    }
}