package day4problem;

import java.util.Scanner;

public class UC2day4problemEmployeeAttendanceUC {
	      
       private static int hours;
       private static double rate = 20;
	   private static double pay;
	   
	   public static double calculatePay ( int hours ) {
		   pay = hours * rate;
		   return pay;
	   }

        public static void main( String[] args) {
           
        	System.out.println("Enter hours");
        	Scanner in = new Scanner(System.in);
            hours = in.nextInt();
            in.close();
            System.out.println("Hours entered " + hours);
        	
            double calculatedPay = calculatePay(hours);
            
            System.out.println(  "\n Calculated Salary is: " );
            System.out.println(calculatedPay);
 
        }

}
