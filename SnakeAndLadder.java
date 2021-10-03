import java.lang.*;
public class SnakeAndLadder {
	static final int noPlay=0;
	static final int Ladder=1;
	static final int Snake=2;
	public static void main(String[] args) {
	int Position = 0;		
	int Throw=(int)(Math.floor(Math.random() *10 ) %6)+1 ;
	System.out.println("outcome is "+Throw);
	int DiceThrow=(int)Math.floor(Math.random() *10 ) % 3;
	System.out.println("dice throw "+DiceThrow);
	switch(DiceThrow) {
	case noPlay:
		Position=Position;
	    break;
	case Ladder:
		Position=Position+Throw;
		break;
	case Snake:
		if(Position >= Throw) {
			Position=Position - Throw ; 
		}
		else {
		    Position=Position;
		}
	    break;
	}
	System.out.println("position is "+Position);	
	}
}
