// source code for W03dot1
// name: Benjamin Vredenburg
// last modified: 09/30/2021
// course: CIT-260

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    // Create Scanner Object
    Scanner input = new Scanner(System.in);

    // Tells the user what this program does
    System.out.println("Given today's day of the week and some number of days in the future\n" +
            "this program will tell you the day of the week for the future day.");

    // Prompts user for today's day of the week (0 for Sunday - 6 for Saturday)
    System.out.print("Enter today's day of the week (0 for Sunday, 1 for Monday, etc): ");

    // Retrieves and saves user input into dayOfWeek variable. If value is less than 0 or
    // greater than 6, tell user that input is invalid, and terminate program
    int dayOfWeek = input.nextInt();

    if(dayOfWeek < 0 || dayOfWeek > 6) {
        System.out.println("");
        System.out.println("Error: input must be a number between 0 and 6");
        System.out.println("Program is terminating ...");
        System.out.println("Goodbye");
        System.exit(1);
    }

    // Prompt user to enter some number of days in the future. Can be any positive value
    System.out.print("Enter the number of days in the future: ");

    // Retrieves and saves user input into futureDays variable. If value is negative, tell user
    // that their input is invalid and terminate the program
    int futureDays = input.nextInt();

    if(futureDays < 0) {
        System.out.println();
        System.out.println(futureDays + " is invalid. You must enter a positive number.");
        System.out.println("Goodbye.");
        System.exit(2);
    }

    // Calculate the day of the week for the future day
    int dayCounter = dayOfWeek;
    for(int x = futureDays; x > 0; x--) {
        dayCounter++;
        if(dayCounter == 7) {
            dayCounter = 0;
        }
    }

    // Display the day of the week for today and the day of the week for the future day.
    String nameOfToday = "";
    String nameOfFutureDay = "";

    switch(dayOfWeek) {
        case 0:
            nameOfToday = "Sunday";
            break;
        case 1:
            nameOfToday = "Monday";
            break;
        case 2:
            nameOfToday = "Tuesday";
            break;
        case 3:
            nameOfToday = "Wednesday";
            break;
        case 4:
            nameOfToday = "Thursday";
            break;
        case 5:
            nameOfToday = "Friday";
            break;
        case 6:
            nameOfToday = "Saturday";
            break;
    }

    switch(dayCounter) {
        case 0:
            nameOfFutureDay = "Sunday";
            break;
        case 1:
            nameOfFutureDay = "Monday";
            break;
        case 2:
            nameOfFutureDay = "Tuesday";
            break;
        case 3:
            nameOfFutureDay = "Wednesday";
            break;
        case 4:
            nameOfFutureDay = "Thursday";
            break;
        case 5:
            nameOfFutureDay = "Friday";
            break;
        case 6:
            nameOfFutureDay = "Saturday";
            break;
    }


    // Output a goodbye message
    System.out.println("");
    System.out.println("Today is " + nameOfToday + " and the future day is " + nameOfFutureDay + ".");
    System.out.print("Goodbye.");
    }
}
