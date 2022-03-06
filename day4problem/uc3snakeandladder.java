package day4problem;

public class uc3snakeandladder {

	// Main initialization of game 
	  public static void main(String[] args){

	    Player player1 = new Player();
	    System.out.println("1st Player Position");
	    System.out.println(Player.playerPosition);

	    System.out.println("Die rolling... ");
	    System.out.println("Rolled Die:");
	    int rolledDie = DieRolling.rolling();
	    System.out.println(rolledDie);

        System.out.println("Option Value:");
        int optionValue = Playing.getOption();
	    System.out.println(optionValue);

        System.out.println("What to do next:");
        Playing.doAction(optionValue,Player.playerPosition,rolledDie);
        System.out.println("Changed player position:");
        System.out.println(Player.playerPosition);

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
    static int playerPosition ;
    String playerName;

        int getCurrentPosition() {
            playerPosition = 0;
            return Player.playerPosition;
        }

        static void currentPositionAddition(int oldPlayerPos, int currentDieValue){
            Player.playerPosition = oldPlayerPos + currentDieValue;
        }

        static void currentPositionDeletion(int oldPlayerPos, int currentDieValue){
            if(currentDieValue == 0){
              System.out.println("No position change");                
            } else {
              Player.playerPosition = currentDieValue - oldPlayerPos;
            }
            
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

class DieRolling{

    static int rolling(){
        int rolledDie = (int)(Math.random() * 6) + 1;
        return rolledDie;
    }

}


/*
uc3 
The Player then checks for
a Option. They are No Play,
Ladder or Snake. 

- Use ((RANDOM)) to check for Options 

- In Case of No Play the player stays in the same
position
- In Case of Ladder the player moves ahead by the
number of position received in the die
- In Case of Snake the player moves behind

*/

class Playing{

    //- Use ((RANDOM)) to check for Options 
    static int getOption(){
        int getOptionValue = (int)(Math.random() * 3) + 1;
        return getOptionValue;
    }

    static void doAction(int optionValue,int oldPlayerPos,int currentDieValue){

        if(optionValue == 1){
            System.out.println("No position change") ;
        } else if (optionValue == 2) {
            System.out.println("Ladder move - Add position by "+ currentDieValue); 
            Player.currentPositionAddition(oldPlayerPos,currentDieValue);            
        } else if (optionValue == 3){
            System.out.println("Snake Move - Reduced position by "+ currentDieValue); 
            Player.currentPositionDeletion(oldPlayerPos,currentDieValue); 
        }
    }
   
}


