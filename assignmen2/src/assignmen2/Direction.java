package assignmen2;
public class Direction {
	 private int row;
	 private int col; 
public Direction (int r, int c) {
	 row = r; //  use scanner for effective inputs
	 col = c;
	 toString(); // calling the function
}
public String toString(){
	
	        
			if(row==-1&&col==0)
	            return "<up>";
	        else if(row==1&&col==0)
	            return "<down>";
	        else if(row==0&&col==-1)
	            return "<left>";
	        else if(row==0&&col==1)
	            return "<right>";
	        else if(row==-1&&col==1)
	            return "<up right>";
	        else if(row==-1&&col==-1)
	            return "<up left>";
	       else if(row==1&&col==1)
	            return "<down right>";
	        else if(row==1&&col==-1)
	            return "<down left>";
	         return null;
	      } // end of class
	    }
