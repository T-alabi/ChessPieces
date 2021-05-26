public class Bishop extends standardChessPiece implements ChessPiece{


    public Bishop(int r, int c, String color) {
        super(r, c, color);
        //so now i have all of the stuff
        //minus the private vars but  can use super r c and colour to get it
    }

    public boolean canMove(int row, int col){

        if (super.canMove(row, col)){ // if the first is true
            return row == col;// if true this mean its moving diagonally
        }else{
            return false;// if it fails either one, them this
        }
    }


}
