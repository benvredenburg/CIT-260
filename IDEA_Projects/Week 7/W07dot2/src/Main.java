// source code for W07dot2
// name: Benjamin Vredenburg
// last modified: 10/28/2021
// course: CIT-260

public class Main {

    public static void main(String[] args) {
    // Declare constant variable for size of array.
        final int EMPLOYEES = 5;

    // Tell user what the program does.
        System.out.println("\nThis program computes the number of hours worked for a " +
                "set of hourly employees.");

    // Create a one-dimensional array of Strings and store the employee
        // names from the table in that array.
        String[] names = {"Tara Teamlead", "Harry Hacker", "Carl Coder", "Paula Programmer", "Darrin Debugger"};

    // Create a two-dimensional array and stores the hourly data from the
        // table in that array.
        double [][] dailyHours = {
                {0.0, 8.0, 8.0, 8.5, 8.0, 9.0, 0.0},
                {0.0, 9.0, 9.0, 8.5, 8.0, 7.5, 0.0},
                {0.0, 8.5, 8.0, 8.6, 8.6, 9.5, 2.0},
                {0.0, 4.75, 6.0, 6.25, 6.5, 0.0, 0.0},
                {0.0, 0.0, 0.0, 0.0, 5.25, 5.25, 6.0}
        };

    // Adds up the number of hours for each employee and stores the results
        // in a one-dimensional array.
        double[] weeklyHours = new double[EMPLOYEES];
        weeklyHours[0] = dailyHours[0][0] + dailyHours[0][1] + dailyHours[0][2] + dailyHours[0][3]
                + dailyHours[0][4] + dailyHours[0][5] + dailyHours[0][6];
        weeklyHours[1] = dailyHours[1][0] + dailyHours[1][1] + dailyHours[1][2] + dailyHours[1][3]
                + dailyHours[1][4] + dailyHours[1][5] + dailyHours[1][6];
        weeklyHours[2] = dailyHours[2][0] + dailyHours[2][1] + dailyHours[2][2] + dailyHours[2][3]
                + dailyHours[2][4] + dailyHours[2][5] + dailyHours[2][6];
        weeklyHours[3] = dailyHours[3][0] + dailyHours[3][1] + dailyHours[3][2] + dailyHours[3][3]
                + dailyHours[3][4] + dailyHours[3][5] + dailyHours[3][6];
        weeklyHours[4] = dailyHours[4][0] + dailyHours[4][1] + dailyHours[4][2] + dailyHours[4][3]
                + dailyHours[4][4] + dailyHours[4][5] + dailyHours[4][6];

    // Create table header.
        System.out.format("\n%-21s", "Employee Name");
        System.out.println("Total Hours");

    // Displays the names and hours worked for that week as shown in the example.
        System.out.format("%-21s", names[0]);
        System.out.format("%.2f%n", weeklyHours[0]);
        System.out.format("%-21s", names[1]);
        System.out.format("%.2f%n", weeklyHours[1]);
        System.out.format("%-21s", names[2]);
        System.out.format("%.2f%n", weeklyHours[2]);
        System.out.format("%-21s", names[3]);
        System.out.format("%.2f%n", weeklyHours[3]);
        System.out.format("%-21s", names[4]);
        System.out.format("%.2f%n", weeklyHours[4]);

    // Display a goodbye message.
        System.out.println("\nHave a wonderful day!");
    }
}
