package day6logicalprograms;

import java.util.Scanner;

public class primenumber {
    
    public static void main(String[] args)
    {
        // variables
        int n,
        i = 2;
        boolean flag = true;

        //scanning input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number=");
        n = input.nextInt();
        input.close();

        // logic
        // since 0 and 1 are not counted as prime number
        // n has to be greater than 2.
        while (n > i)
        {
            if (n % 2 == 0)
            {
                flag = false;
                break;
            }
            i++;
        }
        if (flag)
        {
            System.out.println("Number is prime.");
        }
        else
        {
            System.out.println("Number is not prime.");
        }
    }
}