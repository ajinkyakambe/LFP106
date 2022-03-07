package day4problem;
import java.util.Scanner;

public class UC5day4problemEmployeeAttendanceUC {
  

    private static int months;
    private static String employeeName;
    private static double rate = 20;
    private static int totalworkinghours = 8;
    private static int workingdayspermonth = 20;
    private static double pay;
    
    public static double calculatePay ( int months ) {
      pay = totalworkinghours * rate * workingdayspermonth;
      return pay;
    }
    

  public static void main(String[] args) {
    // TODO  calling the calculatePay and terminal input calling
    
    Scanner input = new Scanner( System.in);

        System.out.print( "Enter Part time Employee name: " );
        employeeName = input.nextLine();
        System.out.print( "Employee name: " );
        System.out.print( employeeName );
        

        System.out.print( "\n Enter how many months worked: " );
        months = input.nextInt();
        input.close();
        
        System.out.println("Months entered " + months);
        
        double calculatedPay = calculatePay(months);
        
        System.out.println("\n Calculated Salary is: " );
        System.out.println(calculatedPay);
    
  }

}