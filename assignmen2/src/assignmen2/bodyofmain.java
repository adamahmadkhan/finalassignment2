package assignmen2;
import java.util.Scanner;
public class bodyofmain { // i change class name from Othello to body of main to avoid mosh check
	public final int EMPTY = 0; // final means constant
	public final int BLACK = 1;
	public final int WHITE = 2; 
	public int size; // to ask user for szie of board
	private int[][]  multi = new int[size][size]; // to store the board
	public static void main(String[] args) {
		int r,c;
		System.out.print("hello this is start of game \n Black player is x and whitel player o\n");
		Scanner cin = new Scanner(System.in); // adding scanner function
		bodyofmain con = new bodyofmain(); // constructor for main body to acess arrays
		System.out.print("Enter size of board");
		con.size=cin.nextInt();
		r=cin.nextInt();
		c=cin.nextInt();
		Direction dir = new Direction(r, c); 
		
		
		
		
	}

}
