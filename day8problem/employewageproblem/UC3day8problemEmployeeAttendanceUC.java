package day8problem.employewageproblem;

import java.util.Scanner;

 class day8problemEmployeeAttendanceUC {
	
	public static int isfullTime= 1, ispartTime=2, workParHrRate, workFullTime, workPartTime, wages,notWork;
	
	public static void main(String[] args) {
		
	 	System.out.println("employee is present or absent");
		 int newrandom = Random1.random1();
		
		switch(newrandom){    
	    
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
class Random1 {
	public static int random1() {
		double checkEmp=(Math.random()*10)%2;
		int newcheck =(int) checkEmp;
		return newcheck;
	}
}
class PartTimeWages {
   public static void partTimeWages(int workPartTime, int workParHrRate) {
		
        Scanner input = new Scanner(System.in)
			System.out.println("Enter value of PartTime employee has done");
			workPartTime =  input.nextInt();
			
			System.out.println("Enter value of employee has done work as rate per hours");
			workParHrRate =  input.nextInt();
			input.close();
		
		
		int wages= workPartTime*workParHrRate;
		System.out.println("employee work part time  and wages is " + wages);
		
	}
	
}
class FullTimeWages {
	public static void fullTimeWages(int workFullTime, int workParHrRate) {
		
   	 Scanner input = new Scanner(System.in);
		System.out.println("Enter value of full time employee has done");
		workFullTime =  input.nextInt();
		
		System.out.println("Enter value of employee has done work as rate per hours ");
		workParHrRate =  input.nextInt();
		input.close();

		
		int wages= workFullTime*workParHrRate;
   	    System.out.println("Employee is present full time and wages is " + wages);	
	}
}
class  NoPresent{
	 public static void noPresent(int workParHrRate) {
	    	
	    	try (Scanner input = new Scanner(System.in)) {
				System.out.println("Enter value of employee has done work as rate per hours ");
				workParHrRate =  input.nextInt();
			}
	    	int wages= 0*workParHrRate;
	    	System.out.println("Employee is presnt and wages is " + wages);	
		}
}
