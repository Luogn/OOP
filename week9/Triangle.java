public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * Constructor.
     */
    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        if (p1.equals(p2) || p2.equals(p3) || p3.equals(p1)) {
            throw new RuntimeException();
        }

        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;

        if (checkInline()) {
            throw new RuntimeException();
        }
        
    }

    /**
     * To see if 3 point are in the same line.
     * @return
     */
    public boolean checkInline() {
        Point v1 = new Point(p1.getPointX() - p2.getPointX(), p1.getPointY() - p2.getPointY());
        Point v2 = new Point(p1.getPointX() - p3.getPointX(), p1.getPointY() - p3.getPointY());
        if (v1.getPointX() == 0 && v2.getPointX() == 0) {
            return true;
        }

        if (v1.getPointY() == 0 && v2.getPointY() == 0) {
            return true;
        }

        if (v1.getPointX() / v2.getPointX() == v1.getPointY() / v2.getPointY()) {
            return true;
        }

        return false;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    /**
     * Area.
     * @return
     */
    public double getArea() {
        double d1 = p1.distance(p2);
        double d2 = p2.distance(p3);
        double d3 = p3.distance(p1);
        double haftP = this.getPerimeter() / 2;
        double res = Math.sqrt(haftP * (haftP - d1) * (haftP - d2) * (haftP - d3)); 
        return res;
    }

    /**
     * Perimeter.
     * @return
     */
    public double getPerimeter() {
        double d1 = p1.distance(p2);
        double d2 = p2.distance(p3);
        double d3 = p3.distance(p1);
        return d1 + d2 + d3;
    }
    
    /**
     * Print format.
     */
    public String getInfo() {
        return "Triangle[(" 
        + String.format("%.2f", p1.getPointX()) + ","
        + String.format("%.2f", p1.getPointY()) + "),("
        + String.format("%.2f", p2.getPointX()) + ","
        + String.format("%.2f", p2.getPointY()) + "),("
        + String.format("%.2f", p3.getPointX()) + ","
        + String.format("%.2f", p3.getPointY()) + ")]";
    }
}
