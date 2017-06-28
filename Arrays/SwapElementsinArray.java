package Arrays;

import java.util.Scanner;

public class SwapElementsinArray {

	public static void main(String[] args) {
		int temp = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of the array:");
		int size = scan.nextInt();
		if (size <= 0) {
			System.out.println("pls enter a number greater than zero:");
			size = scan.nextInt();
		}

		int a[] = new int[size];

		System.out.println("Enter " + size + " elements to the array:");
		for (int i = 0; i < size; i++) {
			a[i] = scan.nextInt();
		}

		System.out.print("Array elements before swap:");
		for (int i = 0; i < size; i++) {
			System.out.print(" " + a[i] + " ");
		}

		for (int i = 0; i < size; i++) {
			for (int j = 1; j < (size - i); j++) {
				if (a[j - 1] > a[j]) {
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.print("Array elements after swap:");
		for (int k = 0; k < size; k++) {
			System.out.print(" " + a[k] + " ");
		}

		scan.close();
	}

}
