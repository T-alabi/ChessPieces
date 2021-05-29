public class Queen extends standardChessPiece implements ChessPiece {
    public Queen(int r, int c, String color) {
        super(r, c, color);
    }

    public boolean canMove(int row, int col) {
        if (super.canMove(row, col)){    // if within bounds
            // if row and col are horizontal, move horizontal
            if (super.HorizontalMove(row, col)){
                return true;
                //if row and col hor vertical, move vertical
            }else if (super.VerticalMove(row, col)){
                return true;
            }
          }
        return false;
    }
}
