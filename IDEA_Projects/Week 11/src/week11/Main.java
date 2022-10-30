// source code for W11
// name: Benjamin Vredenburg
// last modified: 11/23/2021
// course: CIT-260

package week11;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// Tell user what the program does
        System.out.println("\nThis program creates a payroll report for your employees\n");

    // Create an ArrayList<Employee>.
        ArrayList<Employee> employees = new ArrayList<>();

    // Create instances for the following employees and add them to the ArrayList:
        // * Hourly employee Harry Hacker, serial number 123. Harry earns $15.00 an hour and works 30 hours a week.
        // * Hourly employee Isabel Intern, serial number 233. Isabel earns $12.50 an hour and works 20 hours a week.
        // * Salaried employee Cathy Coder, serial number 611. Cather earns $80,000 a year.
        employees.add(new Hourly("Harry Hacker", 123, 15.00, 30));
        employees.add(new Hourly("Isabel Intern", 233, 12.50, 20));
        employees.add(new Salaried("Cathy Coder", 611, 80000));

    // Using an appropriate loop to go through the Employees in the ArrayList, print out a payroll report for
        // the employees.
        System.out.println("Payroll Report");
        for(int i = 0; i < employees.size(); i++) {
            System.out.println("Employee: " + employees.get(i).getEmpName() + " - Serial: " +
                    employees.get(i).getSerialNumber());
            System.out.format("Gross Pay: $" + "%.2f%n", employees.get(i).getGrossPay());
            System.out.format("Federal Withholding: $" + "%.2f%n", employees.get(i).getFedWithholding());
            System.out.format("Federal Withholding: $" + "%.2f%n", employees.get(i).getStateWithholding());
            System.out.format("Net Pay: $" + "%,.2f%n", (employees.get(i).getGrossPay() -
                    employees.get(i).getFedWithholding() - employees.get(i).getStateWithholding()));
            System.out.println();
        }

    // Display goodbye message.
        System.out.println("\nHave a wonderful day.");
    }
}
