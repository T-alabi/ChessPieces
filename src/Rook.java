public class Rook extends standardChessPiece implements ChessPiece {
    public Rook(int r, int c, String color) {
        super(r, c, color);

    }
    public boolean canMove(int row, int col) {
        if (super.HorizontalMove(row, col)){
            return true;
        } else if (super.VerticalMove(row, col)){
            return true;
        }
        return false;
    }
}
