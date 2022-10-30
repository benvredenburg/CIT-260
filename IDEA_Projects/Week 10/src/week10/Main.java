// source code for W10
// name: Benjamin Vredenburg
// last modified: 11/19/2021
// course: CIT-260

package week10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    // Create a Scanner object.
        Scanner kbd = new Scanner(System.in);

	// Tell user what the program does.
        System.out.println("This program gets input for a triangle from the user.\n" +
                "It then creates a Triangle object and displays its description.");

    // Use the no-arg constructor to create a default triangle object.
        Triangle t1 = new Triangle();

    // Prompt the user to enter values for the color for a triangle object.
        System.out.println("Enter the color of the triangle (e.g. \"red\"): ");

    // Save user input for color.
        String color = kbd.next();

    // Prompt the user to enter values for the filled attribute for a triangle object.
        System.out.println("Is the triangle filled (y or n): ");

    // Save user input for filled attribute.
        char filledInput = kbd.next().charAt(0);
        boolean filled = (filledInput == 'y');

    // Prompt the user to enter values for the sides for a triangle object.
        System.out.println("Enter the non-zero, positive lengths of the three sides of the triangle: ");

    // Save user input for triangle side lengths.
        double side1 = kbd.nextDouble();
        double side2 = kbd.nextDouble();
        double side3 = kbd.nextDouble();

    // Create a Triangle object from the user input.
        Triangle t2 = new Triangle(side1, side2, side3, color, filled);

    // Displays the string representation of the Triangle object by calling its toString() method.
        System.out.println(t2);

    // Display the area of the Triangle object.
        System.out.format("Area = %.2f%n", t2.getArea());

    // Display a goodbye message.
        System.out.println("\nHave a wonderful day.");
    }
}
