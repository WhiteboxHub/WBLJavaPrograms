package Loops;

import java.util.Scanner;

public class FibonacciOne {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		//int limit = 10;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number up to which the series to be printed: ");
		int limit=scan.nextInt();
		
		System.out.print(num1 + " " + num2);
		for (int i = 2; i <= limit; i++) {
			int temp = num1 + num2;
			System.out.print(" " + temp + " ");
			num1 = num2;
			num2 = temp;
		}
		scan.close();
	}

}
