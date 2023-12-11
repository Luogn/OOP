import java.util.Objects;

public class Point {
    private double pointX;
    private double pointY;

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * Javadoc.
     */
    public double distance(Point newPoint) {
        double d = (this.pointX - newPoint.pointX) * (this.pointX - newPoint.pointX) 
        + (this.pointY - newPoint.pointY) * (this.pointY - newPoint.pointY);
        double res = Math.sqrt(d);
        return res;
    }

    /**
     * Javadoc.
     */
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o instanceof Point) {
            Point tmp = (Point) o;
            if (this.pointX == tmp.getPointX() && this.pointY == tmp.getPointY()) {
                return true;
            }
        }
        return false;
    }

    /**
     * Javadoc.
     */
    public String toString() {
        return "(" + this.pointX + "," + this.pointY + ")";
    }

    public int hashCode() {
        return Objects.hash(this.pointX, this.pointY);
    }
}