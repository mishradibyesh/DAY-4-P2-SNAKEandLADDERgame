import java.lang.*;
public class SnakeAndLadder {
	static final int noPlay=0;
	static final int Ladder=1;
	static final int Snake=2;
	public static void main(String[] args) {
	int Position = 0;	
	int counter  = 0;
	while(Position!=100) {
		// getting six random numbers from 1 to 6 for dice throw
	int Throw=(int)(Math.floor(Math.random() *10 ) %6)+1 ;
	counter++;
	System.out.println("Dice outcome is "+Throw);
	    // checking whether position is noplay , ladder or snake with the help of random method
	int DiceThrow=(int)Math.floor(Math.random() *10 ) % 3;
	switch(DiceThrow) {
	case noPlay:
		Position=Position;
		System.out.println("its a no play position");
	        break;
	case Ladder:
		Position=Position+Throw;
		System.out.println("its a ladder position");
	//Ensuring the player gets to exact winning position i.e 100
		if(Position>100 ) {
		Position=Position-Throw;
		}
		break;
	case Snake:
		if(Position >= Throw) {
			System.out.println("Its a Snake position");
			Position=Position - Throw ; 
		}
		else {
		    Position=Position;
		}
	        break;
	}
	System.out.println("position is "+Position);
	System.out.println("");
	}
       // printing the number of times dice is thrown
	System.out.println("In this Game Dice is thrown "+counter+" times");
	}
}

