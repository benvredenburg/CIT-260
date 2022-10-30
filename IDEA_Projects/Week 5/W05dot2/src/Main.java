// source code for W05dot2
// name: Benjamin Vredenburg
// last modified: 10/16/2021
// course: CIT-260

public class Main {

    public static void main(String[] args) {
	// Tell the user what this program does
        System.out.println("\nThis program displays all of the numbers from 100 to 1000 \n" +
                "that are divisible by both 5 and 6\n");

    // Create a loop to show all numbers between 100 - 1000 that are divisible by 5 and 6
    // numbers should be spaced by exactly 1 space and have 10 numbers per line.

    // Define variables for use in loop.
    // **Change made from original submission: removed redundancy in check1 and check2**
        int number = 100;
        int count = 0;
        double check1;
        double check2;

    // Loop through every number between 100 and 1000 and check to see if each number is
    // divisible by both 5 and 6
        while(number < 1000) {
            check1 = number % 5.0;
            check2 = number % 6.0;

    // If a number in the loop is divisible by both 5 and 6, print that number, followed by a space.
    // Every time a number is printed, add 1 to the count variable
            if(check1 == 0.0 && check2 == 0.0) {
                System.out.print(number + " ");
                count ++;
            }

    // When the count variable reaches 10, it is reset to zero and begins a new line so no line
    // will have more than 10 printed numbers in it
            number ++;
            if(count > 9) {
                System.out.println();
                count = 0;
            }
        }
        
    // Display a goodbye message
        System.out.println("\n\nGoodbye");
    }
}

// source code for W05dot1
// name: Benjamin Vredenburg
// last modified: 10/13/2021
// course: CIT-260

//public class Main {
//
//    public static void main(String[] args) {
//        // Create variable baseline for loop to use
//        double kilo = 1;
//
//        // Tell the user what the program does
//        System.out.println("\nThis program creates a table that shows the conversion or kilograms to pounds" +
//                " in intervals of 2 kilograms from 1 - 15");
//
//        // Create headers for the table
//        System.out.println("\nkilograms   pounds");
//        System.out.println("---------   ------");
//
//        // Use a loop to calculate pounds per kilogram (1 kilogram = 2.2 pounds) and display the following table
//        while(kilo < 17) {
//            System.out.format("%2.0f", kilo);
//            System.out.print("           ");
//            System.out.format("%4.1f", kilo * 2.2);
//            kilo = kilo + 2;
//            System.out.println();
//        }
//
//        // Outputs a goodbye message
//        System.out.println("\nHave a wonderful day");
//
//
//    }
//}
