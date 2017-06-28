package Arrays;

import java.util.Scanner;

public class ArrayMergeTwo {

	public static void main(String[] args) {
		int i, j, k, size, size1, size2;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the size of the first array:");
		size1 = scan.nextInt();
		int a[] = new int[size1];

		System.out.println("Enter size of the next array:");
		size2 = scan.nextInt();
		int b[] = new int[size2];

		System.out.println("Enter " + size1 + " elements to the first array:");
		for (i = 0; i < size1; i++) {
			a[i] = scan.nextInt();
		}

		System.out.println("Enter " + size2 + " elements to the second array:");
		for (j = 0; j < size2; j++) {
			b[j] = scan.nextInt();
		}

		// merging arrays
		System.out.println("Merging arrays...");
		size = size1 + size2;
		int mergeArray[] = new int[size];
		for (i = 0; i < size1; i++) {
			mergeArray[i] = a[i];
		}

		for (j = 0, k = size1; j < size2 && k < size; j++, k++) {
			mergeArray[k] = b[j];
		}

		System.out.print("Merged array:");
		for (i = 0; i < size; i++) {
			System.out.print(" " + mergeArray[i] + " ");
		}

		scan.close();
	}

}
