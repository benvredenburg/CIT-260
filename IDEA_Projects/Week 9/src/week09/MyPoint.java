// source code for MyPoint
// name: Benjamin Vredenburg
// last modified: 11/11/2021
// course: CIT-260

package week09;

public class MyPoint {
    // Define data members
    private double x;
    private double y;

    /**
     * the no-arg constructor
     */
    public MyPoint() {
        x = 0;
        y = 0;
    }

    /**
     * the parameterized constructor
     * @param x double
     * @param y double
     */
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * the getX method
     * @return double
     */
    public double getX() {
        return x;
    }

    /**
     * the getY method
     * @return double
     */
    public double getY() {
        return y;
    }

    /**
     * the setX method
     * @param x double
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * the setY method
     * @param y double
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * The first distance method.
     * @param xCoord int
     * @param yCoord int
     * @return double
     */
    public double distance(int xCoord, int yCoord){
        return Math.sqrt(Math.pow(xCoord - getX(), 2) + Math.pow(yCoord - getY(), 2));
    }

    /**
     * The second distance method.
     * @param p double
     * @return double
     */
    public double distance(MyPoint p) {
        return Math.sqrt(Math.pow(p.getX() - getX(), 2) + Math.pow(p.getY() - getY(), 2));
    }

    /**
     * The third distance method
     * @param mp1 double
     * @param mp2 double
     * @return double
     */
    public static double distance(MyPoint mp1, MyPoint mp2) {
        return Math.sqrt(Math.pow(mp1.getX() - mp2.getX(), 2) + Math.pow(mp1.getY() - mp2.getY(), 2));
    }

}
