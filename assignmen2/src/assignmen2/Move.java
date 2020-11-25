package assignmen2;
public class Move {
    private final int row; // making private as require in question
    private final int col;
    private final DirectionList directionList;
    int r,c,d
    public Move(int row,int col,DirectionList directionList){
        this.row= row;
        this.col= col;
        this.directionList = directionList;
    }

    public int getRow() {
        return row; //accessor for row
    }

    public int getCol() {
        return col; // accessor for col
    }

    public DirectionList getDirectionList() {
        return directionList; // constructor which accepts a row number, a column number, and a DirectionList. 
    }
    
    public String toString(){
        return "(" +row + " , "+col+") directions "+directionList.toString();
    }
    
}
