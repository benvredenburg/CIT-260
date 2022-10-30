// source code for Salaried class
// name: Benjamin Vredenburg
// last modified: 11/23/2021
// course: CIT-260

package week11;

public class Salaried extends Employee {
    // Define data members
    private double annualSalary = 0;

    /**
     * No-Arg constructor for Salaried
     */
    public Salaried() {
        annualSalary = 0;
    }

    /**
     * Parameterized constructor for Salaried
     * @param empName String
     * @param serialNumber int
     * @param annualSalary double
     */
    public Salaried(String empName, int serialNumber, double annualSalary) {
        super(empName, serialNumber);
        this.annualSalary = annualSalary;
    }

    /**
     * Getter method for annualSalary
     * @return double
     */
    public double getAnnualSalary() {
        return annualSalary;
    }

    /**
     * Method for getGrossPay
     * @return double
     */
    @Override
    public double getGrossPay() {
        return annualSalary / 52;
    }

    /**
     * Method for getFedWithHolding
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
