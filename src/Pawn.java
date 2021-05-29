public class Pawn extends standardChessPiece implements ChessPiece{
    public Pawn(int r, int c, String color) {
        super(r, c, color);
    }


    public boolean canMove(int row, int col) {
        if ( super.canMove(row, col)){
           // return  (col = getColumn()) && row == getRow()  );
            return col == getColumn() && (row == getRow() + 1);
        } else{
            return false;
        }
    }

    @Override
    public boolean canKill(ChessPiece piece) {
        if (piece.getColumn() == this.getColumn() + 1 && ((piece.getRow() == this.getRow() +1 ) || piece.getRow() == this.getRow() - 1 )){
            //+ 1 and - 1 is for left and right. column will ALWAYS be + 1 bc pawns cannot go backwards
            return true;
        } else{
            return false;
        }
    }
}
