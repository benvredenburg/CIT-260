// source code for W05dot1
// name: Benjamin Vredenburg
// last modified: 10/16/2021
// course: CIT-260

public class Main {

    public static void main(String[] args) {
    // Create variable baseline for loop to use
        double kilo = 1;

    // Tell the user what the program does
        System.out.println("\nThis program creates a table that shows the conversion or kilograms to pounds" +
            " in intervals of 2 kilograms from 1 - 15");

    // Create headers for the table
        System.out.println("\nkilograms   pounds");
        System.out.println("---------   ------");

    // Use a loop to calculate pounds per kilogram (1 kilogram = 2.2 pounds) and display the following table
        while(kilo < 17) {
            System.out.format("%2.0f", kilo);
            System.out.print("           ");
            System.out.format("%4.1f", kilo * 2.2);
            kilo = kilo + 2;
            System.out.println();
    }

    // Outputs a goodbye message
        System.out.println("\nHave a wonderful day");
    }
}
