package OOPsConcepts;

abstract class Shape{
	Shape(){System.out.println("its a constructor of the abstract class");}
	void nonAbstractMethod(){
		System.out.println("its a non abstract method running");
	}
	abstract void calculateArea(int h,int b);
	abstract void calculatePerimeter(int x,int y,int z);
	abstract void setSides(int a,int b,int c);
	
}
//Implementation of Shape abstract class by Triangle
class Triangle extends Shape{
	void calculateArea(int h,int b){
		System.out.println("This is an implimentation of abstract method");
		System.out.println("Area of the traingle h*b/2:"+(h*b)/2);
	}
	void calculatePerimeter(int x,int y,int z){
		System.out.println("This is an implimentation of abstract method");
		System.out.println("Perimeter:"+(x+y+z));}
	
		void setSides(int a,int b,int c){
			System.out.println("setSides abstract method implimented here");
			System.out.println("Perimeter with sides:"+(a+b+c));
		}
		
		
	}


public class AbstractClasswithMethods {

	public static void main(String[] args) {
		Shape obj1=new Triangle();
		obj1.nonAbstractMethod();
		obj1.calculateArea(10,12);
		obj1.calculatePerimeter(14,15,23);
		obj1.setSides(10,12,25);

	}

}
