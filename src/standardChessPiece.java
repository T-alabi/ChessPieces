public class standardChessPiece {
    private int row;
    private int col;
    private String color;

    public standardChessPiece ( int r, int c, String lor){
    row = r;
    col= c;
    color = lor;
    }

    public int getRow( ){
        return row;
    }
    public int getColumn ( ){
        return col;
    }
    public boolean canMove(int row, int col){
        return row > 7 || col > 7;

    }
    public boolean canKill(ChessPiece piece){
        return canMove(row, col);
    }

    }

