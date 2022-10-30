import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Declare constants for tip percentages
    final double AMAZING = 0.20;
    final double REALLY_GOOD = 0.15;
    final double GOOD = 0.10;

    // Create Scanner Object
    Scanner kbd = new Scanner(System.in);

    // Tell user what the program does, and prompt for a price of meal
    System.out.println("This program computes the tip for your meal.");
    System.out.print("Enter the cost of the meal: ");

    // Prompt user input and save variable mealCost
    double mealCost = kbd.nextDouble();

    // Prompt the user to enter level of service (1 = okay, 2 = good, 3 = amazing)
    System.out.println("What kind of service did you get: ");
    System.out.println("Enter 1 if your service was just okay.");
    System.out.println("Enter 2 if your service was just really good.");
    System.out.println("Enter 3 if your service was amazing.");
    System.out.print("> ");

    int service = kbd.nextInt();

    if(service < 1 || service > 3) {
        System.out.println("Error: input must be 1, 2, or 3");
        System.out.println("Program is terminating ...");
        System.exit(1);
    }

    // Compute tip
    double tip = 0.0;

    switch(service) {
        case 1:
            tip = mealCost * GOOD;
            break;
        case 2:
            tip = mealCost * REALLY_GOOD;
            break;
        case 3:
            tip = mealCost * AMAZING;
            break;
    }


    System.out.format("Tip amount = $%4.2f.%n", tip);

    System.out.println("Goodbye ... ");


    }
}
