public class Square extends Rectangle {
    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    public double getSide() {
        return super.length;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    public void setWidth(double width) {
        this.setSide(width);
    }

    public void setLength(double length) {
        this.setSide(length);
    }

    /**
     * Javadoc.
     */
    public String toString() {
        return "Square[topLeft=(" + this.topLeft.getPointX() 
        + "," + this.topLeft.getPointY() + "),side=" + Math.round(this.getSide() * 10) / 10.0 
        + ",color=" + this.color + ",filled=" + this.filled + "]";
    }

    /**
     * Javadoc.
     */
    public boolean equals(Object o) {
        return super.equals(o);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
