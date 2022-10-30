// source code for W08dot1 Rectangle class
// name: Benjamin Vredenburg
// last modified: 11/05/2021
// course: CIT-260

package week08;

public class Rectangle {
    // define data members
    private double height;
    private double width;

    /**
     * The no-arg constructor
     *
     */
    public Rectangle() {
        height = 1;
        width = 1;
    }

    /**
     * the parameterized constructor
     * @param height
     * @param width
     */
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    /**
     * the getHeight method
     * @return
     */
    public double getHeight() {
        return height;
    }

    /**
     * the getWidth method
     * @return
     */
    public double getWidth() {
        return width;
    }

    /**
     * the setHeight method
     * @param width
     */
    public void setHeight(double width) {
        this.width = width;
    }

    /**
     * the setWidth method
     * @param height
     */
    public void setWidth(double height) {
        this.height = height;
    }

    /**
     * the getArea method
     * @return
     */
    public double getArea() {
        double area = height * width;
        return area;
    }

    /**
     * the getPerimeter method
     * @return
     */
    public double getPerimeter() {
        double perimeter = (width * 2) + (height * 2);
        return perimeter;
    }
}
