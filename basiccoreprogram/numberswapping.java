package basiccoreprogram;
import java.util.Scanner;

public class numberswapping {

	public static void main(String[] args) {


        // input numbers
        
        Scanner input = new Scanner( System.in);
        System.out.println("Enter first no:");
        float firstNo = input.nextFloat();
        System.out.println("Enter second no:");
        float secondNo = input.nextFloat();
        input.close();



        System.out.println("--Before swap--");
        System.out.println("First number = " + firstNo);
        System.out.println("Second number = " + secondNo);

        // Value of first is assigned to temporaryVar
        float temporaryVar = firstNo;

        // Value of second is assigned to first
        firstNo = secondNo;

        // Value of temporary is assigned to second No
        secondNo = temporaryVar;

        System.out.println("--After swap--");
        System.out.println("First number = " + firstNo);
        System.out.println("Second number = " + secondNo);
    }

}




    
