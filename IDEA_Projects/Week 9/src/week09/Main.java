// source code for W09
// name: Benjamin Vredenburg
// last modified: 11/11/2021
// course: CIT-260

package week09;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    // Create Scanner object.
        Scanner kbd = new Scanner(System.in);

	// Tell user what the program does.
        System.out.println("\nThis program creates a point at (0,0) and a point at the coordinates\n" +
                "entered by you. It them computes and displays the distance from (0,0)\n" +
                "to the point defined by you, using three different methods.\n");

    // Uses the no-arg constructor to create a MyPoint object at (0,0).
        MyPoint p1 = new MyPoint();

    // Prompts user to enter x coordinate of a point.
        System.out.print("Enter the x coordinate of a point: ");

    // Record the x coordinate to variable x2.
        int x2 = kbd.nextInt();

    // Prompts user to enter y coordinate of a point.
        System.out.print("Enter the y coordinate of a point: ");

    // Record the x coordinate to variable y2.
        int y2 = kbd.nextInt();

    // Uses the first distance method to calculate and display the distance
        // between MyPoint object p1 and the point at the x and y coordinates
        // entered by the user. The distance is displayed with two digits after
        // the decimal point.
        System.out.format("Using method 1, the distance from " + "(%.0f", p1.getX());
        System.out.format(",%.0f", p1.getY());
        System.out.format(") to (" + x2 + "," + y2 + ") is %.2f%n", p1.distance(x2, y2));

        // Uses the parameterized constructor to create a MyPoint object p2
        // using the x-coordinate and y-coordinate entered by the user.
        MyPoint p2 = new MyPoint(x2, y2);

    // Uses the second and third distance methods to calculate and display
        // the distance between MyPoint object p1 and MyPoint object p2.
        // The distance is displayed with two digits after the decimal point.

        System.out.format("Using method 2, the distance from " + "(%.0f", p1.getX());
        System.out.format(",%.0f", p1.getY());
        System.out.format(") to (" + x2 + "," + y2 + ") is %.2f%n", p1.distance(p2));
        // space between method 2 and 3 calls
        System.out.format("Using method 3, the distance from " + "(%.0f", p1.getX());
        System.out.format(",%.0f", p1.getY());
        System.out.format(") to (" + x2 + "," + y2 + ") is %.2f%n", MyPoint.distance(p1, p2));

        // Display a goodbye message.
        System.out.println("\nHave a wonderful day.");

    }
}
