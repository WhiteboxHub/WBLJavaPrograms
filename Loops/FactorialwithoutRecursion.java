package Loops;

import java.util.Scanner;

public class FactorialwithoutRecursion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number for the factorial:");
		int factNumber = scan.nextInt();
		if (factNumber == 0) {
			System.out.println("0 factorial is 1");
			}
		else if (factNumber>0){

			for (int i = factNumber - 1; i > 0; i--) {
				factNumber = factNumber * i;
			}
			System.out.println("factorial is :" + factNumber);
		}else
		{System.out.println("pls enter a number >=0");}

		scan.close();
	}

}
