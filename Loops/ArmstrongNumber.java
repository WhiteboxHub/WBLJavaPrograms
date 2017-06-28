package Loops;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int number2;
		int count = 0;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check:");
		int number = scan.nextInt();
		int temp = number;
		// ************//
		// checking for the number of digits
		while (temp != 0) {
			temp = temp / 10;
			count++;
		}
		System.out.println("digit count is:" + count);
		// now separating the digits
		temp = number;
		while (temp > 0) {
			number2 = temp % 10;
			sum = sum + pow(number2, count);
			// System.out.println(sum);
			temp = temp / 10;
		}
		// checking for equality
		if (number == sum) {
			System.out.println("number is an armstrong number");
		} else {
			System.out.println("number is not an armstrong");
		}

		scan.close();
	}

	// finding the exponential
	private static int pow(int number, int count) {
		int result = 1;
		for (int i = 1; i <= count; i++) {
			result = number * result;
		}
		// System.out.println("result is"+result);
		return result;
	}

}
