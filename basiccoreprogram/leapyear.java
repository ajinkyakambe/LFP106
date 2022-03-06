package basiccoreprogram;

import java.util.Scanner;

class LeapYear{

    public static void main(String[] args) {
  
      // year to be checked input
      System.out.println(" Enter th year:");
      Scanner input = new Scanner( System.in);
      int year = input.nextInt();
      int length = String.valueOf(year).length();
       if(length < 4){
         System.out.println("Please enter the correct year:");
         year = input.nextInt();
       }
      input.close();

      boolean leap = false;
  
      // if the year is divided by 4
      if (year % 4 == 0) {
  
        // if the year is century
        if (year % 100 == 0) {
  
          // if year is divided by 400
          // then it is a leap year
          if (year % 400 == 0)
            leap = true;
          else
            leap = false;
        }
        
        // if the year is not century
        else
          leap = true;
      }
      
      else
        leap = false;
  
      if (leap)
        System.out.println(year + " is a leap year.");
      else
        System.out.println(year + " is not a leap year.");
    }
  }
