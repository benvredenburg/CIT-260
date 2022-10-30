// source code for GeometricObject
// name: Benjamin Vredenburg
// last modified: 12/09/2021
// course: CIT-260

package week12;

public abstract class GeometricObject {
    // Define data members
    private int ID = 0;
    private int x = 0;
    private int y = 0;

    /**
     * The no-arg constructor
     */
    public GeometricObject() {
        ID = 0;
        x = 0;
        y = 0;
    }

    /**
     * The parameterized constructor
     * @param ID int
     */
    public GeometricObject(int ID, int x, int y){
        this.ID = ID;
        this.x = x;
        this.y = y;
    }

    /**
     * The getter method for ID
     * @return int
     */
    public int getID() {
        return ID;
    }

    /**
     * The getter method for x
     * @return int
     */
    public int getX() {
        return x;
    }

    /**
     * The getter method for y
     * @return int
     */
    public int getY() {
        return y;
    }

    /**
     * Method for getArea
     * @return double
     */
    public abstract double getArea();

    /**
     * Method for getShape
     * @return String
     */
    public abstract String getShape();
}
