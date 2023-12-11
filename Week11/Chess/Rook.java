package Chess;

public class Rook extends Piece {
    public Rook(int x, int y) {
        super(x, y);
    }

    public Rook(int x, int y, String color) {
        super(x, y, color);
    }

    public String getSymbol() {
        return "R";
    }

    /**
     * Check if piece can move.
     */
    public boolean canMove(Board board, int x, int y) {
        if (x != this.getCoordinatesX() && y != this.getCoordinatesY()) {
            return false;
        }

        if (x > this.getCoordinatesX()) {
            for (int i = this.getCoordinatesX() + 1; i < x; i++) {
                if (board.getAt(i, y) != null) {
                    return false;
                }
            }
        }

        if (y > this.getCoordinatesY()) {
            for (int i = this.getCoordinatesY() + 1; i < y; i++) {
                if (board.getAt(x, i) != null) {
                    return false;
                }
            }
        }

        if (x < this.getCoordinatesX()) {
            for (int i = this.getCoordinatesX() - 1; i > x; i--) {
                if (board.getAt(i, y) != null) {
                    return false;
                }
            }
        }

        if (y < this.getCoordinatesY()) {
            for (int i = this.getCoordinatesY() - 1; i > y; i--) {
                if (board.getAt(x, i) != null) {
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