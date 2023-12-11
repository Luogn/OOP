public class Rectangle extends Shape {
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

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public double getPerimeter() {
        return (this.width + this.length) * 2;
    }

    public String toString() {
        return "Rectangle[width=" + this.width + ",length=" + this.length + ",color="
                + super.getColor() + ",filled=" + super.isFilled() + "]";
    }
}
