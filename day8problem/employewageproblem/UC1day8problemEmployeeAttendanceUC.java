
package day8problem.employewageproblem;

public class UC1day8problemEmployeeAttendanceUC {
	
	public static void main(String[] args) {
		
		int isPresent=1;
		
		System.out.println("Check weather employee is present or absent::");
		
		Random rand = new Random();
		 int newrandom = rand.random();
		
		if (isPresent == newrandom) {
			System.out.println("Employee is present");
		}else {
			System.out.println("Employee is absent");
		}
	}
		

	
}

class Random{
	public int random() {
		double checkEmp=(Math.random()*10)%2;
		int newcheck =(int) checkEmp;
		return newcheck;
	}
}


		
	



