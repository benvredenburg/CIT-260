// source code for W07dot1
// name: Benjamin Vredenburg
// last modified: 10/27/2021
// course: CIT-260


import java.util.Scanner;

public class Main {

    // Define array size for calculations
    static int MAX = 5;

    public static void main(String[] args) {

        // Create Scanner object.
        Scanner kbd = new Scanner(System.in);

        // Tell the user what the program does.
        System.out.println("\nThis program computes the mean and the standard deviation " +
                "for a set of numbers.\n");

        // Prompt the user to enter five numbers and saves the user's input in an array of doubles
        // called nums.
        double[] nums = new double[MAX];
        System.out.print("Enter a number: ");
        nums[0] = kbd.nextDouble();
        System.out.print("Enter a number: ");
        nums[1] = kbd.nextDouble();
        System.out.print("Enter a number: ");
        nums[2] = kbd.nextDouble();
        System.out.print("Enter a number: ");
        nums[3] = kbd.nextDouble();
        System.out.print("Enter a number: ");
        nums[4] = kbd.nextDouble();

        // Output the mean and standard deviation with 2 digits after the decimal point.
        System.out.format("\nThe mean of the set of numbers is %.2f%n", mean(nums));
        System.out.format("The standard deviation is %.2f%n", deviation(nums));

        // Display goodbye message.
        System.out.println("\nHave a wonderful day!");
    }


    // Define methods to be used in program.

    /**
     *
     * @param myArray // a double array
     * @return
     */
    public static double mean(double[] myArray) {
        // Define default variable for loop.
        double sum = 0;
        // Loop through nums array and add the numbers together into sum variable.
        for(double num : myArray){
            sum += num;
        }
        // Calculate the mean from the sum of the numbers in the array
        double mean = sum / MAX;
        // Return the total to the call point.
        return mean;
    }

    /**
     *
     * @param myArray // a double array
     * @return
     */
    public static double deviation(double[] myArray){
        // Define default variables for loop.
        double sum = 0;
        double mean = mean(myArray);
        // Loop through the array, subtracting the mean from each number, squaring the result,
        // and adding the total of the new results to the sum variable.
        for(double num : myArray) {
            sum += Math.pow(num - mean, 2);
        }
        // Return the square root of the sum divided by the array length - 1 to the call point.
        return Math.sqrt(sum / (MAX - 1));
    }
}
