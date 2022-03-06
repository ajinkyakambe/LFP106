package day4problem;

public class uc1snakeandladder {

	// Main initialization of game 
	  public static void main(String[] args){

	    Player player1 = new Player();
	    System.out.println("1st Player Position ");
	    System.out.println(player1.playerPosition);
	    

	    }
}



/*----------------------------------------------------------------

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



