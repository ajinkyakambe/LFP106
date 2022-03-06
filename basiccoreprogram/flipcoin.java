package basiccoreprogram;


import java.util.Scanner;

class FlipCoin { 

    static double flipCoinRunning(){    // No of time to flip coin
        
     double flipped = Math.random(); // Random method calling from java class       
     return flipped;

     }

     static double calculatePercentage(double obtained, double total) {
        return obtained * 100 / total;
    }


	public static void main(String[] args) {
		
        // scanning and feeding input 
        Scanner input = new Scanner( System.in);
        System.out.print( "Enter the number of time to flip coin: " );
        int coinFlipInput = input.nextInt();
        if(coinFlipInput < 0){
         System.out.print( "Entered no is not valid, enter positive integer: " );
          coinFlipInput = input.nextInt();  
        }
        input.close();

        //Calling method from Other *class*
        double allFlipped[]=new double[coinFlipInput]; 
        for( int i = 0; i < coinFlipInput; i++){
             allFlipped[i] =FlipCoin.flipCoinRunning(); 
        }


        // Percentage of Head vs Tails
        
        int allHead=0;
        int allTail=0;
        for(int i=0;i<allFlipped.length;i++) {
            
            if(allFlipped[i]<0.5){
                    allTail++;
                } else {
                    allHead++;
                }
        }

        // Calling % calculation method
        System.out.println( "" );
        System.out.print( "%Head: " );
        double perHead = FlipCoin.calculatePercentage(allHead ,coinFlipInput);
        System.out.print( perHead );

        System.out.println( "" );

        System.out.print( "%Tail: " );
        double perTail = FlipCoin.calculatePercentage(allTail ,coinFlipInput);
        System.out.print( perTail );



 }
}


