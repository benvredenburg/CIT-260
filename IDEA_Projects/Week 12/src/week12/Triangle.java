// source code for Triangle
// name: Benjamin Vredenburg
// last modified: 12/09/2021
// course: CIT-260

package week12;

public class Triangle extends GeometricObject {
    // Define data members
    private double height;
    private double base;
    private String shape = "Triangle";

    /**
     * The no-arg constructor
     */
    public Triangle() {
        height = 0;
        base = 0;
        shape = "Triangle";
    }

    /**
     * The parameterized constructor
     * @param ID int
     * @param height double
     * @param base double
     */
    public Triangle(int ID, int x, int y, double height, double base, String shape) {
        super(ID, x, y);
        this.height = height;
        this.base = base;
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
     * The getter method for height
     * @return double
     */
    public double getHeight() {
        return height;
    }

    /**
     * The getter method for base
     * @return double
     */
    public double getBase() {
        return base;
    }

    /**
     * Method for getArea
     * @return double
     */
    @Override
    public double getArea() {
        return (height * base) / 2;
    }
}
