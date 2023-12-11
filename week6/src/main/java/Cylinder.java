public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 0;
    }

    public Cylinder(double h) {
        super();
        this.height = h;
    }

    public Cylinder(double r, double h) {
        super(r);
        this.height = h;
    }

    public Cylinder(double r, double h, String c) {
        super(r, c);
        this.height = h;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        this.height = h;
    }

    public double getArea() {
        double circlePerimeter = Circle.PI * super.getRadius() * 2;
        return circlePerimeter * this.height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    public String toString() {
        return "Cylinder[" + super.toString() + ",height=" + this.height + "]";
    }
}
