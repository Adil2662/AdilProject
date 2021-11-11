package Questions;

public class Q10 {
	public static void test (int n1, int n2)
	{
	    // variable declaration
		int min;
	     
	    // Largest among n1 and n2
	    min = (n1 < n2) ? n1 : n2;
	     
	    // Print the largest number
	    System.out.println("Minimum number between " + n1 +
	                  " and " + n2 + " is " + min + ". " );
	}
}
