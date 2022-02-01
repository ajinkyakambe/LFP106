package day4problem;

public class UC1day4problemEmployeeAttendanceUC {

	public static void main (String[] args) {
		int IS_FULL_TIME = 1;
		double empcheck = Math.floor(Math.random()*10)%2;
		if(empcheck == IS_FULL_TIME) {
			System.out.println("Emplyoee is present");
			
		} else {
			System.out.println("Emplyoee is absent");
		}
	}
}
