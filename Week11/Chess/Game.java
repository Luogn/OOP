package Chess;

import java.util.ArrayList;

public class Game {
    private Board board;
    private ArrayList<Move> moveHistory = new ArrayList<>();

    public Game(Board b) {
        this.board = b;
    }

    /**
     * Move piece at particular postition.
     */
    public void movePiece(Piece p, int x, int y) {
        if (p.canMove(board, x, y)) {
            if (board.getAt(x, y) == null) {
                Move move = new Move(p.getCoordinatesX(), 
                x, p.getCoordinatesY(), y, p);
                moveHistory.add(move);
            } else {
                Move move = new Move(p.getCoordinatesX(), 
                x, p.getCoordinatesY(), y, p, board.getAt(x, y));
                moveHistory.add(move);
                board.removeAt(x, y);
            }
            p.setCoordinatesX(x);
            p.setCoordinatesY(y);
        } 
    }

    public Board getBoard() {
        return this.board;
    }

    public void setBoard(Board b) {
        this.board = b;
    }

    public ArrayList<Move> getMoveHistory() {
        return this.moveHistory;
    }
}
