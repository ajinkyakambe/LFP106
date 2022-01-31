package day3problem;

public class UC2day3problemLineComparisonProblemUC {

	// Method to check if they are identical
	static void lineequality(double a1, double b1,
						double c1, double a2,
						double b2, double c2)
	{
		
		// Converison from float to string
		String co1 = Double.toString(a1 / a2);  
		String co2 = Double.toString(b1 / b2); 
		String co3 = Double.toString(c1 / c2); 
		
				
     // Equality check based on formula
		if (( co1.equals(co2))
			&& (co1.equals(co3))
			&& (co2.equals(co3)))
			System.out.println( "The given straight"
			+" lines are identical");

		else
			System.out.println("The given straight"
				+ " lines are not identical");
	}

	// Calling Code
	public static void main(String[] args)
	{
		double a1 = -2, b1 = 4,
				c1 = 3, a2 = -6,
				b2 = 12, c2 = 9;
		lineequality(a1, b1, c1, a2, b2, c2);
	}
	
	
}
