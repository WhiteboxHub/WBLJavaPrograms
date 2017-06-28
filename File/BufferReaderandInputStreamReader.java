package File;
import java.io.*;
	public class BufferReaderandInputStreamReader{

	public static void main(String args[]) throws Exception {

		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter the first number:");
		String str1=br.readLine();
		int num1=Integer.parseInt(str1);
		System.out.println("Enter second number:");
		String str2=br.readLine();
		int num2=Integer.parseInt(str2);
		System.out.println("Waiting...");
		int subtract=num1-num2;
		System.out.println("Result of subtraction is:"+subtract);

	isr.close();
	br.close();}
	}


