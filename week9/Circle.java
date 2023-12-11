public class Circle implements GeometricObject {
    public static final double PI = 3.14;
    private Point center;
    private double radius;

    /**
     * Constructor.
     */
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Area.
     * @return
     */
    public double getArea() {
        return radius * radius * PI;
    }

    /**
     * Perimeter.
     * @return
     */
    public double getPerimeter() {
        return 2 * radius * PI;
    }

    /**
     * Print format.
     */
    public String getInfo() {
        return "Circle[(" 
        + String.format("%.2f", center.getPointX()) + ","
        + String.format("%.2f", center.getPointY()) + "),r="
        + String.format("%.2f", radius) + "]";
    }
}
