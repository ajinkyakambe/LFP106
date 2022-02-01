package day4problem;
import java.util.Scanner;

public class UC3day4problemEmployeeAttendanceUC {
	

    private static int hours;
    private static String employeeName;
    private static double rate = 20;
    private static double pay;
    
    public static double calculatePay ( int hours ) {
      pay = hours * rate;
      return pay;
    }
    

	public static void main(String[] args) {
		// TODO  calling the calculatePay and terminal input calling
		
		Scanner input = new Scanner( System.in);

        System.out.print( "Enter Part time Employee name: " );
        employeeName = input.nextLine();
        System.out.print( " Employee name: " );
        System.out.print( employeeName );
        

        System.out.print( " \nEnter how many hours worked: " );
        hours = input.nextInt();
        input.close();
        
        System.out.println("Hours entered " + hours);
        
        double calculatedPay = calculatePay(hours);
        
        System.out.println("\n Calculated Salary is: " );
        System.out.println(calculatedPay);
		
	}

}
