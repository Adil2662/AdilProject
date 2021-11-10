package Q18;
import java.util.Scanner;

	public class Q18 extends Q18AbstractSub{

	    public Q18(String myString) {
	        super(myString);
	    }

	    public static void main(String[] args) {
	        String input;
	        Q18AbstractSub userInput;
	        Scanner one = new Scanner(System.in);
	        System.out.println("Enter String: " );
	        while (true) {
	            try {
	                input = one.nextLine();
	                userInput = new Q18AbstractSub(input);
	                break;
	            } catch (NumberFormatException ignore) {
	                System.out.println("Invalid input, Please enter numeric value");
	            }
	        }

	        boolean checkUpper = userInput.isUpperCase();
	        if(checkUpper){
	            System.out.println("1.)" + input + " Does have uppercase Letters");
	        }else{
	            System.out.println("1.)" +input+" Does NOT have uppercase Letters");
	        }

	        String toUpper = userInput.convertToUpper();
	        System.out.println("2.)" + input + " -> Converted to UpperCase: " + toUpper);

	        int addTen = userInput.convertToInt();
	        System.out.println("3.)" + input + " + 10 = " + addTen);
	    }
	}
