package Arrays;

import java.util.Scanner;

public class LinearSearchinArray {

	public static void main(String[] args) {
		int i;
		Scanner scan = new Scanner(System.in);
		// getting the array size from input
		System.out.println("Enter the size of the array:");
		int size = scan.nextInt();
		if (size <= 0) {
			System.out.println("pls enter a number greater than zero:");
			size = scan.nextInt();
		}
		int a[] = new int[size];

		// getting the numbers to the array
		System.out.println("Enter " + size + " intergers in to the array ");
		for (i = 0; i < size; i++) {
			a[i] = scan.nextInt();
		}

		// getting the number to search
		System.out.println("Enter the number to search:");
		int n = scan.nextInt();

		for (i = 0; i < size; i++) {
			if (a[i] == n) {
				System.out.println("Number " + n + " found at position " + (i + 1));
			}
		}

		scan.close();
	}

}
