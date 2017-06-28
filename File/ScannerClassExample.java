package File;

import java.util.Scanner;

public class ScannerClassExample {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number:");
		int n1=scan.nextInt();
		System.out.println("Enter second number:");
		int n2=scan.nextInt();
		
		int sum=n1+n2;
		System.out.println("Sum of "+n1+" and "+n2+" is "+sum);

	scan.close();}

}
