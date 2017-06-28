package Strings;

import java.util.Scanner;

public class SubstringandReplace {

	public static void main(String[] args) {
		String newString;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string:");
		newString = scan.nextLine();
		System.out.println("Enter word to be replaced:");
		String oldword = scan.nextLine();
		findandReplace(newString, oldword);
		scan.close();
	}

	public static void findandReplace(String newString, String oldword) {
		String replacedString;
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the string to replace");
		String replaceWord = scan1.nextLine();
		replacedString = newString.replace(oldword, replaceWord);
		System.out.println(replacedString);

		scan1.close();
	}

}
