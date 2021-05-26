public class Knight extends standardChessPiece implements ChessPiece {

    public Knight(int r, int c, String color) {
        super(r, c, color);

    }

    public boolean canMove(int row, int col) {
        //check is it isL shaped
        //have to check relative to the space they are at
        //use get methods for current place
        if (super.canMove(row, col)){
            return (row == getRow()+1 && col == getColumn()+2 ) || (col == getColumn()+1 && row == getRow()+2 );
        }else {
            return false;
        }
    }


}
