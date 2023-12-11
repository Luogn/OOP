package Chess;

import java.util.ArrayList;

public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;
    private ArrayList<Piece> pieces = new ArrayList<>();

    public Board(){}

    /**
     * Check valid value of the board.
     */
    public boolean validate(int x, int y) {
        if ((x >= 1 && x <= 8) && (y >= 1 && y <= 8)) {
            return true;
        }
        return false;
    }

    /**
     * Add distinctive.
     */
    public void addPiece(Piece p) {
        for (Piece pe : pieces) {
            if (pe.equals(p)) {
                return;
            }
        }
        pieces.add(p);
    }

    /**
     * Get piece at particular postition.
     */
    public Piece getAt(int x, int y) {
        Piece rand = null;
        for (int i = 0; i < pieces.size(); i++) {
            if (pieces.get(i).getCoordinatesX() == x
            && pieces.get(i).getCoordinatesY() == y) {
                rand = pieces.get(i);
            }
        }
        return rand;
    }

    /**
     * Remove piece at particular postition.
     */
    public void removeAt(int x, int y) {
        for (int i = 0; i < pieces.size(); i++) {
            if (pieces.get(i).getCoordinatesX() == x
            && pieces.get(i).getCoordinatesY() == y) {
                pieces.remove(i);
                i--;
            }
        }
    }

    public ArrayList<Piece> getPieces() {
        return this.pieces;
    }

    public void setPieces(ArrayList<Piece> list) {
        this.pieces = list;
    }
}
