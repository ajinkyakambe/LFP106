package day6logicalprograms;

import java.util.Scanner;

public class CouponNumbers {
    
        public static void main(String[] args) {


             //scanning input
            Scanner input = new Scanner(System.in);
            System.out.print("Enter number of card types");
            int n = input.nextInt(); // number of card types
            input.close();      


            boolean[] isCollected = new boolean[n];  
            int count = 0;                           // total number of cards collected
            int distinct = 0;                        // number of distinct cards
      
            // logic
            // repeatedly choose a random card and check whether it's a new one
            while (distinct < n) {
                int value = (int) (Math.random() * n);   // random card between 0 and n-1
                count++;                                 // we collected one more card
                if (!isCollected[value]) {
                    distinct++;
                    isCollected[value] = true;
                }
            }
    
            // print the total number of cards collected
            System.out.println(count);
        }
    }