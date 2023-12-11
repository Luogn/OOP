import java.util.Objects;
import java.awt.Graphics;

public class Rectangle extends Shape {
    protected Point topLeft = new Point(0, 0);
    protected double width;
    protected double length;

    public Rectangle() {
        
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Javadoc.
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * Javadoc.
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        this(width, length, color, filled);
        this.topLeft = topLeft;
    }

    public Point getTopLeft() {
        return this.topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return (this.length +  this.width) * 2;
    }

    /**
     * Javadoc.
     */
    public String toString() {
        return "Rectangle[topLeft=(" + this.topLeft.getPointX() 
        + "," + this.topLeft.getPointY() + "),width=" + Math.round(this.width * 10) / 10.0 
        + ",length=" + Math.round(this.length * 10) / 10.0 + ",color=" + this.color 
        + ",filled=" + this.filled + "]";
    }

    /**
     * Javadoc.
     */
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o instanceof Rectangle) {
            Rectangle tmp = (Rectangle) o;
            if (this.length == tmp.getLength() && this.width == tmp.getWidth() 
            && this.topLeft.equals(tmp.topLeft)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.topLeft, this.length, this.width);
    }
}
