package basiccoreprogram;
import java.util.Scanner;

//Java Program to Compute Quotient and Remainder

public class quotientandremainder {

    static void getquotientandremainder(int dividend, int divisor){

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);

    }

	public static void main(String[] args) {
		// Driving code

         // input n 
         
         Scanner input = new Scanner( System.in);
         System.out.println("Enter Quotient:");
         int quotient = input.nextInt();
         System.out.println("Enter Remainder:");
         int remainder = input.nextInt();
         input.close();

         // calling method
         getquotientandremainder(quotient,remainder);

	}

}
