package day3problem;

public class UC3day3problemLineComparisonProblemUC {


	  // Function to calculate distance
	static double distancecount(int x1, int y1, int x2, int y2)
	{
	    // Calculating distance
	    return Math.sqrt(Math.pow(x2 - x1, 2) +
	                Math.pow(y2 - y1, 2) * 1.0);
	}

		public static void main(String[] args) {
			// TODO Calculating distance calling
			
		 System.out.println(distancecount(5, 7, 3, 3));

		}

	
}
