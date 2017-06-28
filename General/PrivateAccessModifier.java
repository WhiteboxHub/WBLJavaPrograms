//private access modifiers can be accessed only within the clas
//it can't be accessed within package,outside package thru subclass
//or can't be accessed in out side package
package General;
class test{
	private test(){
		System.out.println("private constructor");
	}
	private int a=10;//private variable
	private void message(){
		System.out.println("This cant be accessed outside the class");
	}
}

public class PrivateAccessModifier {
	public static void main(String args[]){
	//test t1=new test();//this will trigger a compile time error
	//t1.message();
	int x=25;//public variable
	System.out.println("private methods or variables cant be accessed");
	
	}
}
