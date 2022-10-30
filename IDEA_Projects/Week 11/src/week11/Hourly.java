// source code for Employee class
// name: Benjamin Vredenburg
// last modified: 11/23/2021
// course: CIT-260

package week11;

public class Hourly extends Employee {
    // Define data members
    private double hourlyWage = 0;
    private double hoursWorked = 0;

    /**
     * No-Arg constructor for hourly
     */
    public Hourly() {
        hourlyWage = 0;
        hoursWorked = 0;
    }

    /**
     * Parameterized constructor for hourly
     * @param empName String
     * @param serialNumber int
     * @param hourlyWage double
     * @param hoursWorked double
     */
    public Hourly(String empName, int serialNumber, double hourlyWage, double hoursWorked) {
        super(empName, serialNumber);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    /**
     * Getter method for hourlyWage
     * @return double
     */
    public double getHourlyWage() {
        return hourlyWage;
    }

    /**
     * Getter method for hoursWorked
     * @return double
     */
    public double getHoursWorked() {
        return hoursWorked;
    }

    /**
     * Method for getGrossPay
     * @return double
     */
    @Override
    public double getGrossPay() {
        return hoursWorked * hourlyWage;
    }

    /**
     * Method for getFedWithholding
     * @return double
     */
    @Override
    public double getFedWithholding() {
        return getGrossPay() * 0.15;
    }

    /**
     * Method for getStateWithholding
     * @return double
     */
    @Override
    public double getStateWithholding() {
        return getGrossPay() * 0.07;
    }
}
