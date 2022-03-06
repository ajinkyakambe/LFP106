package basiccoreprogram;

import java.util.Scanner;

class PowersOfTwo {

    static int i = 0; // count from 0 to N
    static int powerOfTwo = 1; // the ith power of two
   
    static void printPowerOfTwo(int n){
         // repeat until i equals n
         while (i <= n) {
            System.out.println(i + " " + powerOfTwo); // print out the power of two
            powerOfTwo = 2 * powerOfTwo; // double to get the next one
            i = i + 1;
            }
    
        }
    
    

    public static void main(String[] args) {
    
    // input n 
    System.out.println("Enter n:");
    Scanner input = new Scanner( System.in);
    int n = input.nextInt();
    input.close();

    PowersOfTwo.printPowerOfTwo(n);
    
    
    }
    
}
    
