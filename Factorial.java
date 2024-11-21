package javafreshup;

import java.util.Scanner;

public class Factorial {
	static int factorial=1;
	
	public static int factorialMethod(int num)
	{
		
		 for (int i = 1; i <= num; i++) 
		 {
	           factorial =factorial*i;
	     }
	        return factorial;
	}

	public static void main(String[] args)
	{
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter a number to find its factorial: ");
	     int num = scanner.nextInt();
	     factorialMethod(num);
	     System.out.println("The factorial of the given number is " + num + " is: " +factorial);
	}

}
