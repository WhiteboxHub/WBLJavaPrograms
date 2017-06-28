package Loops;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int temp = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive number:");
		int number = scan.nextInt();

		for (int i = 2; i <= (number / 2); i++) {
			if ((number % i) == 0) {
				System.out.println("number is not prime");
				temp = 1;
				break;
			}
		}
		if (temp == 0) {
			System.out.println("number is prime");
		}

		scan.close();
	}

}
