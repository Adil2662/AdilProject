// Adil Ali Project 2 Solutions.
package Driver;      //Package Driver to run the solutions of All Questions
import Questions.Q1; //Imported Class Q1
import Questions.Q2; //Imported Class Q2
import Questions.Q3; //Imported Class Q3
import Questions.Q4; //Imported Class Q4
import Questions.Q5; //Imported Class Q5
import Questions.Q6; //Imported Class Q6
import Questions.Q7; //Imported Class Q7
import Questions.Q8; //Imported Class Q8
import Questions.Q9; //Imported Class Q9
import Questions.Q10; //Imported Class Q10
import Questions.Q11; //Imported Class Q11
import Package11.*;   //Imported Package11
import Questions.Q12; //Imported Class Q12
import Questions.Q13; //Imported Class Q13
import Questions.Q14; //Imported Class Q14
import Questions.Q15; //Imported Class Q15
import Questions.Q16; //Imported Class Q16
import Questions.Q17; //Imported Class Q17
import Questions.Q18_Subclass; //Imported Class Q18
import Questions.Q19; //Imported Class Q19
import Questions.Q20; //Imported Class Q20

import java.util.Scanner;
import java.io.IOException;
import java.util.*;

public class Driver {
	
	public static void main(String args[]) throws IOException {
		{
			// Q1 Solution
			Q1 ob = new Q1();                                  // Created object of class Q1
			int arr[] = {1,0,5,6,3,2,3,7,9,8,4};               //Initialize array as given in the question
			ob.bubbleSort(arr);                                //Called bubblesort method from the imported class
			System.out.println("Q1 is Sorted and array is");   //Printing a message
			ob.printArray(arr);                                //Printing sorted array.
		
			Q2 fibonacci= new Q2();                            //Creating new object fibonacci
			System.out.println("First 25 Fibonacci Number is");
			fibonacci.printFibonacciNumbers(25);               //Printing first 25 fiboacci series numbers
			
			Q3 reverse= new Q3();                              //New object reverse of class Q3
			String a = "AdilJavaQuestion";                     //Initializing string to reverse
			System.out.println("Reverse String is");
			System.out.println(reverse.reversingString(a.toCharArray(), 0, 15));  //Printing Reversed String
			
			Q4 f=new Q4();                                    //New object f of class Q4
			Scanner in = new Scanner(System.in);              //Asking user to enter number
	        System.out.print("Enter number: ");  
	        String number = in.nextLine();                    
	        System.out.println("Number is: " + number);       //Printing user given num   
	        in.close(); 
	        int num=Integer.parseInt(number);
			System.out.println("Factorial of " + num + " is " + f.factorial(num));  //Factorial of user give num
			
			Q5.TestSubstring(10);                            //Solution of Question 5
			
			Q6.TestEven(15);                                 //Solution of Question 6
			
			
			Q7 q7 = new Q7();                                //Solution of Question7
			q7.Compare();
			
			Q8 q8 = new Q8();                                //Solution of Q8
			q8.Palindrome();
			
			
			Q9 q9= new Q9();                                //Creating new object q9 of Class Q9
			q9.question9();                                 //Calling method using object q9
			
			Q10.test(100,90);                               // Testing which number is smaller of the two
			
			Q11 q11= new Q11();                              //Printing Floats
			q11.main(args);
			
			Q12 q12= new Q12();                             //Object of class 12
			q12.main(args);
			
			Q13 q13= new Q13();                             //Object of class13
			q13.PrintTriangle(4);                           //Print Triangle as described
			
			Q14 q14= new Q14();                             //Object of class 14 to initiate switch case method
			q14.SwitchCases(2);
			
			Q15 q15= new Q15();                            //Object of class 15 to initiate interface method
			q15.Interface();
			
			Q16 q16= new Q16();                            //Q16 Answer
			q16.main(args);
			
			//Q17 q17 = new Q17();                         //I can run this question alone but not if i run question 20, it throws an error
			//q17.CalculateInterest();
			 
			Q18_Subclass q18= new Q18_Subclass();          //Initiating the object of subclass
			
			
			Q19 q19= new Q19();                           //Q19 solution
			extracted(args, q19);
			
			Q20 q20=new Q20();                            //Q20 Solution
			Q20.main(args);
			
		}
	}

	private static void extracted(String[] args, Q19 q19) {
		q19.main(args);
	}
}
