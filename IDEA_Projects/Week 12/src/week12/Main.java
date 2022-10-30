// source code for W12 & 13
// name: Benjamin Vredenburg
// last modified: 12/09/2021
// course: CIT-260

package week12;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        // Tell user what this program does.
        System.out.println("\nThis program creates an array of geometric objects, writes \nthe data " +
                "from those objects to a txt file, reads the txt file, \nand displays the name, " +
                "ID, position, and the areas of each of \nthe objects to the user\n");

        //Create an ArrayList<GeometricObject>
        ArrayList<GeometricObject> shapes = new ArrayList<>();

        // Create the following objects and store the references to them in a single ArrayList.
            // A Circle object with a radius of 10 inches and an ID of 156.
            // A Square object with a side of 2 inches and an ID of 237.
            // a Right Triangle with a height of 3 inches, a base of 4 inches, and an ID of 212.
        shapes.add(new Circle(156, 1, 1, 10, "Circle"));
        shapes.add(new Square(237, 1, 3, 2, "Square"));
        shapes.add(new Triangle(212, 3, 3,  3, 4, "Triangle"));

        // Create a PrintWriter object via try block.
        try (PrintWriter output = new PrintWriter(new File("shapeData.txt"))) {

            // Create header for output to txt file.
            output.println("Shape      ID  Position  Area");

            // Iterate through the ArrayList and write the type, ID, position, and area of the three
            // different shape objects to the txt file.
            for (GeometricObject shape : shapes) {
                output.print(shape.getShape());

                // If statement to account for length difference in shapes types in formatting.
                if (Objects.equals(shape.getShape(), "Circle") ||
                        Objects.equals(shape.getShape(), "Square")) {
                    output.printf("%7d", shape.getID());
                }
                else {
                    output.printf("%5d", shape.getID());
                }

                // Continue after if statement.
                output.print("  (" + shape.getX() + "," + shape.getY() + ")");
                output.printf("%11.2f%n", shape.getArea());
            }

        }
        // Catch block for file creation via PrintWriter.
        catch(FileNotFoundException ex) {
            System.out.println("Error: There was an error creating the file");
            System.exit(1);
        }

        // Create Scanner object via try block.
        try(Scanner fileIn = new Scanner(new File("shapeData.txt"))) {

            // Loop to read each line separately and print each line in a new line to user.
            while(fileIn.hasNext()) {
                String data = fileIn.nextLine();
                System.out.println(data);
            }
        }

        // Catch blocks for reading txt file.
        catch(IOException ex) {
            System.out.println("Error: cannot open file for reading.");
        }
        catch(InputMismatchException ex) {
            System.out.println("Error: bad data in the file, cannot continue.");
        }

    // Display a goodbye message
        System.out.println("\nHave a wonderful day.");
    }
}
