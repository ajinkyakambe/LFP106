package day6logicalprograms;

import java.util.Scanner;

public class reverseanumber {
    
    public static void main(String[] args)
    {
        // variables
        int n, num, r,
        rev = 0;

        // scanning input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number=");
        n = input.nextInt();
        input.close();


       //logic
        num = n;
        while (num > 0) //repeat steps until the number becomes 0.
        {
            r = num % 10;  // getting modulo
            rev = (rev * 10) + r;  // After that, we need to multiply the variable reverse by 10 and add the remainder into it.
            num = num / 10; // We then divide the number by 10
        }

        System.out.println("Reverse of Number=" + rev);
    }
}
