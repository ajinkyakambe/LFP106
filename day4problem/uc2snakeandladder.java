package day4problem;

public class uc2snakeandladder {

	// Main initialization of game 
	  public static void main(String[] args){

	    Player player1 = new Player();
	    System.out.println("1st Player Position ");
	    System.out.println(player1.playerPosition);

	    System.out.println("Die rolling... ");
	    System.out.println("Rolled Die:");
	    
	    int rolledDie = dieRolling.rolling();
	    System.out.println(rolledDie);
	    

	    }
}


/*----------------------------------------------------------------
old
UC 1 Snake and Ladder
game played with
single player at start
position 0

*/

 class Player {
   
    int startingPosition;
    int endingPosition = 100;
    int playerPosition ;
    String playerName;

     int getCurrentPosition() {
        playerPosition = 0;
        return playerPosition;
    }
    
}

/*----------------------------------------------------------------
UC 2
The Player rolls the die
to get a number
between 1 to 6.
- Use ((RANDOM)) to get the number between
1 to 6


*/

class dieRolling{

    static int rolling(){
        int rolledDie = (int)(Math.random() * 6) + 1;
        return rolledDie;
    }

}


