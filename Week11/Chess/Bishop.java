package Chess;

public class Bishop extends Piece {
    public Bishop(int x, int y) {
        super(x, y);
    }

    public Bishop(int x, int y, String color) {
        super(x, y, color);
    }

    public String getSymbol() {
        return "B";
    }

    /**
     * Check if Bishop can be moved.
     */
    public boolean canMove(Board board, int x, int y) {
        // double ratioA = this.getCoordinatesX() / this.getCoordinatesY() * 1.0;
        // double ratioB = x / y * 1.0;
        // if (ratioA != ratioB || ratioA != 1/ratioB) {
        //     return false;
        // }

        int diffValue = Integer.min(Math.abs(this.getCoordinatesX() - x), 
        Math.abs(this.getCoordinatesY() - y));

        if (x > this.getCoordinatesX() && y > this.getCoordinatesY()) {
            for (int i = 1; i < diffValue; i++) {
                if (board.getAt(this.getCoordinatesX() + i, this.getCoordinatesY() + i) != null) {
                    return false;
                }
            }
        }

        if (x < this.getCoordinatesX() && y < this.getCoordinatesY()) {
            for (int i = 1; i < diffValue; i++) {
                if (board.getAt(this.getCoordinatesX() - i, this.getCoordinatesY() - i) != null) {
                    return false;
                }
            }
        }

        if (x > this.getCoordinatesX() && y < this.getCoordinatesY()) {
            for (int i = 1; i < diffValue; i++) {
                if (board.getAt(this.getCoordinatesX() + i, this.getCoordinatesY() - i) != null) {
                    return false;
                }
            }
        }

        if (x < this.getCoordinatesX() && y > this.getCoordinatesY()) {
            for (int i = 1; i < diffValue; i++) {
                if (board.getAt(this.getCoordinatesX() - i, this.getCoordinatesY() + i) != null) {
                    return false;
                }
            }
        }

        if (board.getAt(x, y) != null) {
            return !(this.getColor().equals(board.getAt(x, y).getColor()));
        }

        return board.validate(x, y);
    }
}
