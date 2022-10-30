// source code for Employee class
// name: Benjamin Vredenburg
// last modified: 11/23/2021
// course: CIT-260

package week11;

public class Employee {
    // Define data members.
    private String empName = "";
    private int serialNumber = 0;

    /**
     * No-Arg constructor for Employee
     */
    public Employee() {
        empName = "none";
        serialNumber = 0;
    }

    /**
     * Parameterized constructor for Employee
     * @param empName String
     * @param serialNumber int
     */
    public Employee(String empName, int serialNumber) {
        this.empName = empName;
        this.serialNumber = serialNumber;
    }

    /**
     * Getter method for empName
     * @return String
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * Getter method for serialNumber
     * @return int
     */
    public int getSerialNumber() {
        return serialNumber;
    }

    /**
     * Method for getGrossPay
     * @return double
     */
    public double getGrossPay() {
        return 0;
    }

    /**
     * Method for getFedWithholding
     * @return double
     */
    public double getFedWithholding() {
        return 0;
    }

    /**
     * Method for getStateWithholding
     * @return double
     */
    public double getStateWithholding() {
        return 0;
    }

}
