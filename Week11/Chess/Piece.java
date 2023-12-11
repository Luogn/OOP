package Chess;

public abstract class Piece {
    private int coordinatesX;
    private int coordinatesY;
    private String color;

    /**
     * Constructor.
     */
    public Piece(int x, int y) {
        this.coordinatesX = x;
        this.coordinatesY = y;
        // if((x >= 1 && x <=8) && (y >= 1 && y <=8)) {
        //     this.coordinatesX = x;
        //     this.coordinatesY = y;
        // }
        this.color = "white";
    }

    /**
     * Constructor.
     */
    public Piece(int x, int y, String color) {
        this(x, y);
        if (color == "white" || color == "black") {
            this.color = color;
        }
    }

    public abstract String getSymbol();

    public abstract boolean canMove(Board board, int x, int y);

    /**
     * Check position.
     */
    public boolean checkPosition(Piece p) {
        if ((p.getCoordinatesX() >= 1 && p.getCoordinatesX() <= 8) 
        && (p.getCoordinatesY() >= 1 && p.coordinatesY <= 8)) {
            return true;
        }
        return false;
    }

    public int getCoordinatesX() {
        return this.coordinatesX;
    }

    public int getCoordinatesY() {
        return this.coordinatesY;
    }

    public String getColor() {
        return this.color;
    }

    public void setCoordinatesX(int x) {
        this.coordinatesX = x;
    }

    public void setCoordinatesY(int y) {
        this.coordinatesY = y;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
