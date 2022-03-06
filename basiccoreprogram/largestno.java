package basiccoreprogram;
import java.util.Scanner;

public class largestno {

	public static void main(String[] args) {


        // input no 1 to 3
        
        Scanner input = new Scanner( System.in);
        System.out.println("Enter no1:");
        double no1 = input.nextDouble();
        System.out.println("Enter no2:");
        double no2 = input.nextDouble();
        System.out.println("Enter no3:");
        double no3 = input.nextDouble();
        input.close();

        // logic
        if( no1 >= no2 && no1 >= no3)
            System.out.println(no1 + " is the largest number.");

        else if (no2 >= no1 && no2 >= no3)
            System.out.println(no2 + " is the largest number.");

        else
            System.out.println(no3 + " is the largest number.");
    }

}
