// source code for W08dot1
// name: Benjamin Vredenburg
// last modified: 11/05/2021
// course: CIT-260

package week08;

public class Main {

    public static void main(String[] args) {
        // Tell user what the program does
        System.out.println("\nThis program creates two rectangle objects and displays their width, " +
                "height, area, and perimeter.\n");

        // Creates two Rectangle objects, the first with a height of 4 and a width of 40, the second
        // with a height of 3.5 and a width of 5.
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 5);

        // Call the methods in your Rectangle class to output the width, height, area, and perimeter
        // of each rectangle, with 2 digits after the decimal point.
        System.out.println("Rectangle 1:");
        System.out.format("height = %.2f%n", r1.getHeight());
        System.out.format("width = %.2f%n", r1.getWidth());
        System.out.format("area = %.2f%n", r1.getArea());
        System.out.format("perimeter = %.2f%n%n", r1.getPerimeter());

        System.out.println("Rectangle 2:");
        System.out.format("height = %.2f%n", r2.getHeight());
        System.out.format("width = %.2f%n", r2.getWidth());
        System.out.format("area = %.2f%n", r2.getArea());
        System.out.format("perimeter = %.2f%n%n", r2.getPerimeter());

        // Output a goodbye message.
        System.out.println("Have a wonderful day!");
    }
}

