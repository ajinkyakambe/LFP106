package basiccoreprogram;
import java.util.Scanner;


 class harmonicnumber {

    //Q = Prints the Nth harmonic number:
    static double generateHarmonicNo(int n){

        double i, harmonicSum = 0.0;
        for ( i = 1; i <= n; i++) {
           
            harmonicSum = harmonicSum + 1/i;
            
        }  
        return harmonicSum;
    
    }


	public static void main(String[] args) {
        
		// Driving code

        // input n 
        System.out.println("Enter n:");
        Scanner input = new Scanner( System.in);
        int n = input.nextInt();
        input.close();
        

        // calling the method to cal sum
        double harmonicSum = generateHarmonicNo(n);
        System.out.println(harmonicSum);

    

	}

}
