// source code for Square
// name: Benjamin Vredenburg
// last modified: 12/09/2021
// course: CIT-260

package week12;

public class Square extends GeometricObject {
    // Define data members
    private double sideSquare;
    private String shape = "Square";

    /**
     * The no-arg constructor
     */
    public Square() {
        sideSquare = 0;
        shape = "Square";
    }

    /**
     * The parameterized constructor
     * @param ID int
     * @param sideSquare double
     */
    public Square(int ID, int x, int y, double sideSquare, String shape) {
        super(ID, x, y);
        this.sideSquare = sideSquare;
        this.shape = shape;
    }

    /**
     * The getter method for shape
     * @return String
     */
    public String getShape() {
        return shape;
    }

    /**
     * The getter method for sideSquare
     * @return double
     */
    public double getSideSquare() {
        return sideSquare;
    }

    /**
     * Method for getArea
     * @return double
     */
    @Override
    public double getArea() {
        return sideSquare * sideSquare;
    }
}
