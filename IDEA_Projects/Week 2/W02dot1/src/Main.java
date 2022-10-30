// source code for W02_1
// name: Benjamin Vredenburg
// last modified: 09/21/2021
// course: CIT-260

// Import scanner
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    // Create a Scanner object
        Scanner input = new Scanner(System.in);

    // Tell user about the program and request a temperature in Celsius
    // Line break at beginning for  ease of reading
        System.out.print("\nThis program converts a temperature in degrees Celsius \n" +
                "into a temperature in degrees Fahrenheit. Enter a temperature in \n" +
                "degrees Celsius: ");

    // Read and store user's Celsius temperature input.
        double celsius = input.nextDouble();

    // Just a line break to match the example
        System.out.print("\n");

	// Calculate the temperature in Fahrenheit
        double fahrenheit = 9.0 / 5 * celsius + 32;

    // Output Celsius and Fahrenheit temperatures to user.
    // Outputs goodbye message.
    // Additional line break once again for ease of reading.
    System.out.print(String.format("%.2f", celsius) + " degrees Celsius is equal to " + String.format("%.2f", fahrenheit)
            + " degrees Fahrenheit. \nGoodbye.\n");

    }
}
