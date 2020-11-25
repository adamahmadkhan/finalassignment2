package assignmen2;
public class Movelist {
	 Move[] moves; //A constructor to create an empty list of moves.
	    private int in=-1;
	      
	    public void MoveList(){
	    moves = new Move[32];
	    }
	      
	   public void addMove(Move m) // add a Move to the list. 
	   {
	       in++;
	       if(in<=31){ //it a maximum capacity of 32 moves. 
	           moves[in] = m;
	       }
	    }
}
