package day8problem.employewageproblem;

import java.util.Scanner;

 class day8problemEmployeeAttendanceUC {
	
	public static int isfullTime= 1, ispartTime=2, workParHrRate, workFullTime, workPartTime, wages, notWork, numOfDays=20;
  
	public static void main(String[] args) {

		System.out.println("employee is present or absent");
	
		    
	for( int day=1; day<=numOfDays; day++) 
	{
		System.out.println("Enter a day number " +day);
		
		 int newrandom = randomFunctionC.randomFunction();
		 switch((int)newrandom)
			{    
	
			 case 1:
				 FullTimeWages.fullTimeWages(workFullTime, workParHrRate);
			    break;    
			    case 2:
			    	PartTimeWages.partTimeWages(workPartTime, workParHrRate);	   	 
			    break;    
			    default: NoPresent.noPresent(workParHrRate);  
		    }    
	   
	}
	   
	}
}
class randomFunctionC {
	public static int randomFunction() {
		double checkEmp=(Math.random()*10)%2;
		int newcheck =(int) checkEmp;
		return newcheck;
	}
}
class PartTimeWages {
   public static void partTimeWages(int workPartTime, int workParHrRate) {
		
        try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter value of PartTime employee has done");
			workPartTime =  input.nextInt();
			
			System.out.println("Enter value of employee has done work as rate per hours ");
			workParHrRate =  input.nextInt();
		}
		
		int wages= workPartTime*workParHrRate;
		System.out.println("employee work part time  and wages is " + wages);
		
	}
	
}
class FullTimeWages {
	public static void fullTimeWages(int workFullTime, int workParHrRate) {
		
   	 try (Scanner input = new Scanner(System.in)) {
		System.out.println("Enter value of full time employee has done");
		workFullTime =  input.nextInt();
		
		System.out.println("Enter value of employee has done work as rate per hours ");
		workParHrRate =  input.nextInt();
	}
		
		int wages= workFullTime*workParHrRate;
   	    System.out.println("employee is presnt full time and wages is " + wages);	
	}
}
class  NoPresent{
	 public static void noPresent(int workParHrRate) {
	    	
	    	Scanner input = new Scanner(System.in);
				System.out.println("Enter value of employee has done work as rate per hours ");
				workParHrRate = input.nextInt();
				input.close();
			
	    	int wages= 0*workParHrRate;
	    	System.out.println("Employee is present and wages is " + wages);	
		}
}

