// source code for Triangle Class
// name: Benjamin Vredenburg
// last modified: 11/19/2021
// course: CIT-260

package week10;

public class Triangle extends GeometricObject {
    // Define data members.
    private double side1;
    private double side2;
    private double side3;

    /**
     * The no-arg constructor.
     */
    public Triangle() {
        side1 = 1;
        side2 = 1;
        side3 = 1;
    }

    /**
     * The parameterized constructor.
     * @param side1 double
     * @param side2 double
     * @param side3 double
     * @param color String
     * @param filled boolean
     */
    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color,filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    /**
     * Getter method for side1.
     * @return double
     */
    public double getSide1() {return side1;}

    /**
     * Getter method for side2.
     * @return double
     */
    public double getSide2() {return side2;}

    /**
     * Getter method for side3.
     * @return double
     */
    public double getSide3() {return side3;}

    /**
     * Setter method for side1
     * @param side1 double
     */
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    /**
     * Setter method for side2.
     * @param side2 double
     */
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    /**
     * Setter method for side3.
     * @param side3 double
     */
    public void setSide3(double side3) {
        this.side3 = side3;
    }

    /**
     * Method for getArea
     * @return double
     */
    public double getArea() {
        double sP = (side1 + side2 + side3) / 2;
        return Math.sqrt(sP * (sP - side1) * (sP - side2) * (sP - side3));
    }

    /**
     * Method for toString
     * @return String
     */
    @Override
    public String toString() {

        return "Triangle Output: \nside1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3 +
                super.toString();
    }

}
