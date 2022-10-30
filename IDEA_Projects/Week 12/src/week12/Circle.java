// source code for Circle
// name: Benjamin Vredenburg
// last modified: 12/09/2021
// course: CIT-260

package week12;

public class Circle extends GeometricObject {
    // Define data members
    private double radius = 0;
    private String shape = "Circle";

    /**
     * The no-arg constructor for Circle
     */
    public Circle() {
        radius = 0;
        shape = "Circle";
    }

    /**
     * the parameterized constructor for Circle
     * @param ID int
     * @param radius double
     */
    public Circle(int ID, int x, int y, double radius, String shape) {
        super(ID, x, y);
        this.radius = radius;
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
     * The getter method for radius
     * @return double
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Method for getArea
     * @return double
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
