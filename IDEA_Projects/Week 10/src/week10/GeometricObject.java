// source code for GeometricObject Class
// name: Benjamin Vredenburg
// last modified: 11/19/2021
// course: CIT-260

package week10;

public class GeometricObject {
    // Define data members.
    private String color = "White";
    private boolean filled;
    private java.util.Date dateCreated;

    /**
     * The no-arg constructor
     */
    public GeometricObject() {
        dateCreated = new java.util.Date();
    }

    /**
     * The parameterized constructor
     * @param color String
     * @param filled boolean
     */
    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /**
     * The getter method for color
     * @return String
     */
    public String getColor() {
        return color;
    }

    /**
     * The setter method for color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * The getter method for filled
     * @return boolean
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * The setter method for filled
     * @param filled boolean
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * The getter method for dateCreated
     * @return dateCreated
     */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "\nCreated on " + dateCreated + "\ncolor: " + color + " and filled = " + filled;
    }
}
