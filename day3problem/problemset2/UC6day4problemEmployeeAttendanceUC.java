
package day4problem;
import java.util.Scanner;

public class UC6day4problemEmployeeAttendanceUC {
  
    private static String employeeName;
    private static double rate = 20;
    private static int totalworkinghours ;
    private static int workingdayspermonth ;
    private static double pay;
    
    public static double calculatePay ( int totalworkinghours, int workingdayspermonth) {

          pay = totalworkinghours * rate * workingdayspermonth;
          return pay;

    }
    

  public static void main(String[] args) {
    // TODO  calling the calculatePay and terminal input calling
    
    Scanner input = new Scanner( System.in);

        System.out.print( "Enter Part time Employee name: " );
        employeeName = input.nextLine();
        System.out.print( " Employee name: " );
        System.out.print( employeeName );
        
        System.out.print( "\n\nEnter how many hours worked: " );
        totalworkinghours = input.nextInt();
        
        System.out.println("Working hours entered " + totalworkinghours);

        System.out.print( " \nEnter how many working days per month worked: " );
        workingdayspermonth = input.nextInt();
                
        System.out.println("Working days per month entered " + workingdayspermonth);
        input.close();
                        
        System.out.println("\nCalculated Salary is: " );
        
        if(totalworkinghours<101 && workingdayspermonth <21) {
        	double calculatedPay = calculatePay(totalworkinghours,workingdayspermonth);
        	 System.out.println(calculatedPay);
        } else {
        	System.out.print( "Over worked \n" );
        }
    
  }

}
