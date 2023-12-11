import java.util.Objects;

public class Circle extends Shape {
    protected Point center = new Point(0, 0);
    protected double radius;

    public Circle() {
        
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Javadoc.
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Javadoc.
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        this(radius, color, filled);
        this.center = center;
    }

    public Point getCenter() {
        return this.center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }

    /**
     * Javadoc.
     */
    public String toString() {
        return "Circle[center=(" + this.center.getPointX() 
        + "," + this.center.getPointY() + "),radius=" + Math.round(radius * 10) / 10.0
        + ",color=" + this.color + ",filled=" + this.filled + "]";
    }

    /**
     * Javadoc.
     */
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o instanceof Circle) {
            Circle tmp = (Circle) o;
            if (this.center.equals(tmp.center) && this.radius == tmp.getRadius()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(center, radius);
    }
}
