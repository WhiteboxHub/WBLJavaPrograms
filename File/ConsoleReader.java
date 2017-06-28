package File;

import java.io.Console;

public class ConsoleReader{
public static void main(String args[])throws Exception{

Console con=System.console();
System.out.println("Enter the first number:");
int num1=Integer.parseInt(con.readLine());

System.out.println("Enter the second number:");
int num2=Integer.parseInt(con.readLine());

int division=num1/num2;
System.out.println(division);



}
}


