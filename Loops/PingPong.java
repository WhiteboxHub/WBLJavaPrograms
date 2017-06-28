package Loops;

import java.util.Scanner;

public class PingPong {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		System.out.println();
		int n1 = scan.nextInt();

		if (n1 % 3 == 0 && n1 % 5 == 0) {
			System.out.println("ping pong");
		} else if (n1 % 3 == 0) {
			System.out.println("ping");
		} else if (n1 % 5 == 0) {
			System.out.println("pong");
		} else {
			System.out.println("Number is not divisible by 3 and 5:" + n1);
		}
		scan.close();
	}
	
}
