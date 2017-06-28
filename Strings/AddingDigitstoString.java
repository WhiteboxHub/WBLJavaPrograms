package Strings;

import java.util.Scanner;

public class AddingDigitstoString {

	public static void main(String[] args) {
		String string1;
		int count=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string:");
		string1=scan.nextLine();
		String a[]=string1.split(" ");
		//adding word count at the end of each word
				for(String m : a){
			        System.out.print(m + count++ + " ");
			}
			
				scan.close();}
		}
