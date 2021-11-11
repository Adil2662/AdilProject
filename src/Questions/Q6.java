package Questions;

public class Q6 {
	     
		// Returns true if n
		// is even, else odd
		public static boolean isEven(int n)
		{
		     
		    // Return true if
		    // n/2 does not result
		    // in a float value.
		    return ((n / 2) * 2 == n);
		    
		}
		public static void TestEven(int n){
		
	    if(isEven(n) != false)
	        System.out.print( "Even" );
	    else
	        System.out.print( "Odd" );
		}
		

}
