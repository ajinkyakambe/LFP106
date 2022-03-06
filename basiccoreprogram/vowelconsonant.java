package basiccoreprogram;
import java.util.Scanner;

public class vowelconsonant {

	public static void main(String[] args) {
		
		// input alphabet
        System.out.println("Enter alphabet:");
        Scanner input = new Scanner( System.in);
        char ch = input.next().charAt(0); 
        input.close();
        

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

    }

}
