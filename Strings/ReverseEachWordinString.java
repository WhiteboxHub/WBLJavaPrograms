package Strings;

import java.util.Scanner;

public class ReverseEachWordinString {

	public static void main(String[] args) {
		String temp="";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string to be reversed:");
		String str1=scan.nextLine();
		String a[]=str1.split(" ");
		int len=a.length;
		for(int i=len-1;i>=0;i--){
			temp=temp+a[i]+" ";
					
		}
		System.out.println("Reversed string is:"+temp);
		
				

	scan.close();}

}
