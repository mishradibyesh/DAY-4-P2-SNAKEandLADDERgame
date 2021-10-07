import java.lang.*;
public class SnakeAndLadder {
	static final int noPlay=0;
	static final int Ladder=1;
	static final int Snake=2;
	public static void main(String[] args) {
	       int Position1 = 0;	
	       int Position2 = 0;	
	       int counter  = 0;
	       int Player=1;
	       while(Position1!=100 && Position2 != 100) {
	    	        // getting six random numbers from 1 to 6 for dice throw
	    	   int Throw=(int)(Math.floor(Math.random() *10 ) %6 ) + 1 ;
	    	   counter++;
	    	   if (Player == 1) {
	    		    System.out.println("Its player 1 turn ");
		   			System.out.println("Dice outcome is "+Throw);
	    	   // checking whether position is noplay , ladder or snake with the help of random method
	    		   			int DiceThrow = (int)Math.floor(Math.random() *10 ) % 3;
	    		   			if(DiceThrow == Ladder) {
	    		   				Player = 1;
	    		   			}
	    		   			else {
	    		   				Player = 2;
	    		   			}
	    		   			switch(DiceThrow) {
	    		   				case noPlay:
	    		   					System.out.println("its a no play position");
	    		   					break;
	    		   				case Ladder:
	    		   					Position1 = Position1 + Throw;
	    		   					System.out.println("its a ladder position");
		//Ensuring the player gets to exact winning position i.e 100
	    		   					if(Position1 > 100 ) {
	    		   						Position1 = Position1 - Throw;
	    		   					}
	    		   					break;
	    		   				case Snake:
	    		   					if(Position1 >= Throw) {
	    		   						System.out.println("Its a Snake position");
	    		   						Position1 = Position1 - Throw ; 
	    		   					}
	    		   					else {
	    		   						Position1 = Position1;
	    		   					}
	    		   					break;
	    		   			}
	    		   			System.out.println("");
	    	   }
		//code for second player
	    	   else if(Player == 2) {
	    		    System.out.println("Its player 2 turn ");
		   			System.out.println("Dice outcome is "+Throw);
	    		   // checking whether position is noplay , ladder or snake with the help of random method
		   			int DiceThrow = (int)Math.floor(Math.random() *10 ) % 3;
		   			if(DiceThrow == Ladder) {
		   				Player = 2;
		   			}
		   			else {
		   				Player = 1;
		   			}
		   			switch(DiceThrow) {
		   				case noPlay:
		   					System.out.println("its a no play position");
		   					break;
		   				case Ladder:
		   					Position2 = Position2+Throw;
		   					System.out.println("its a ladder position");
		   				//Ensuring the player gets to exact winning position i.e 100
		   					if(Position2 > 100 ) {
		   						Position2 = Position2-Throw;
		   					}
		   					break;
		   				case Snake:
		   					if(Position2 >= Throw) {
		   						System.out.println("Its a Snake position");
		   						Position2 = Position2 - Throw ; 
		   					}
		   					else {
		   						Position2 = Position2;
		   					}
		   					break;
		   			}
		   			System.out.println("");
	    	   }
	    	   	    
	       }
	       //printing the positions
	       System.out.println("Player 1 position is "+Position1);
    	   System.out.println("Player 2 position is "+Position2);
    	   // checking for winner
    	   if(Position1>Position2) {
    		   System.out.println("greetings! Player 1 won this Game ");
    	   }
    	   else
    	   {
    		   System.out.println("greetings! Player 2 won this Game ");

    	   }
    	   	System.out.println("In this Game Dice is thrown "+counter+" times");
	}
}

