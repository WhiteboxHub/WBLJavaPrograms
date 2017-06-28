package Strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String rstring, rev = "";
		int length, i;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string to reverse:");
		rstring = scan.nextLine();
		length = rstring.length();
		for (i = length - 1; i >= 0; i--) {
			rev = rev + rstring.charAt(i);
		}
		System.out.println(rev);

		scan.close();
	}

}
