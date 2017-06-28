package Loops;

import java.util.Scanner;

public class SwapingNumbersMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int number1 = scan.nextInt();
		System.out.println("Enter second number;");
		int number2 = scan.nextInt();
		System.out.println("Numbers before swappping are:" + number1 + " " + number2);
		swapWithVariable(number1, number2);
		swapWithoutVariable(number1, number2);
		scan.close();
	}

	public static void swapWithVariable(int number1, int number2) {
		int temp;
		temp = number1;
		number1 = number2;
		number2 = temp;
		System.out.println("Numbers after swapping with variable are:" + number1 + "  " + number2);
	}

	public static void swapWithoutVariable(int number1, int number2) {
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		System.out.println("Numbers after swapping without third variable:");
		System.out.println(number1 + " " + number2);
	}

}
