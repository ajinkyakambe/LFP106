package day8problem.linecomparisonproblem;
import java.util.Scanner;

public class UC1day8problemLineComparisonProblemUC {
	
	public static double x1,x2,y1,y2;
	
	public static void main(String[] args) {
		Distance.distance(5, 7, 3, 3);
	}

}

class Distance{
public static void distance( double x1, double x2, double y1, double y2) {

	int distance, i=2;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter First Coordinate First point");
	x1=input.nextDouble();
	System.out.println("Enter First Coordinate Second point");
	x2=input.nextDouble();
	System.out.println("Enter Second Coordinate First point");
	y1=input.nextDouble();
	System.out.println("Enter Second Coordinate Second point");
	y2=input.nextDouble();
	input.close();		
		
	distance=(int)Math.sqrt((x2 - x1) * i + (y2 - y1) * i);
	System.out.println("Distance between two points = "+distance);
	}
	
}
