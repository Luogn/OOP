public class Circle {
    protected static final double  PI  = 3.14;
    private double radius;
    private String color;

    public Circle() {
        this.radius = 0;
        this.color = null;
    }

    public Circle(double r) {
        this.radius = r;
    }

    public Circle(double r, String c) {
        this.radius = r;
        this.color = c;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public double getArea() {
        return this.radius * this.radius * PI;
    }

    public String toString() {
        return  "Circle[radius=" + this.radius + ",color=" + this.color + "]";
    }

}
