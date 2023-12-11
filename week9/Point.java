public class Point {
    private double pointX;
    private double pointY;

    /**
     * Constructor.
     */
    public Point(double x, double y) {
        this.pointX = x;
        this.pointY = y;
    }

    public double getPointX() {
        return pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointX(double x) {
        this.pointX = x;
    }

    public void setPointY(double y) {
        this.pointX = y;
    }

    /**
     * Distance.
     */
    public double distance(Point other) {
        double res = Math.pow((this.pointX - other.pointX), 2) 
        + Math.pow((this.pointY - other.pointY), 2);
        return Math.sqrt(res);
    }
}
