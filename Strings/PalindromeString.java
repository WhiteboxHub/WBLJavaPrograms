package Strings;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		String str2="";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string to check whether palindrome or not:");
		String str=scan.nextLine();
		int len=str.length();
		
		for(int i=len-1;i>=0;i--){
			str2=str2+str.charAt(i);
		}
		System.out.println("str2:"+str2);
		if(str.equals(str2)){
			System.out.println("The word "+ str+" is palindrome");
		}
		else{
			System.out.println("The word "+str+" is not palindrome");
		}

	scan.close();}

}
