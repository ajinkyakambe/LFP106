package day6logicalprograms;
import java.util.Scanner;


public interface perfectnumber {

    public static void main(String[] args)
    {
        
        int n,
        mul = 1,
        sum = 0;

        //scanning input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number=");
        n = input.nextInt();
        input.close();

        // logic
        for (int i = 1; i < n; i++)
        {
            if (n % i == 0)
            {
                sum = sum + i;
                mul = mul * i;
            }
        }
        if (mul == sum)
        {
            System.out.println("Perfect Number");
        }
        else
        {
            System.out.println("Not Perfect Number");
        }
    }
}

