package Loops;

import java.util.Scanner;

public class FactorialwithRecursion {

	public static void main(String[] args) {
		
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter number for factorial:"); 
		 int number=scan.nextInt(); 
		 
		int fact = 1;
		fact = factorial(number);
		System.out.println("Factorial of " + number + " is: " + fact);
		scan.close();
	}

	public static int factorial(int number) {

		if (number == 0) {
			return 1;
		} else {
			return (number * factorial(number - 1));
		}
	}

}
