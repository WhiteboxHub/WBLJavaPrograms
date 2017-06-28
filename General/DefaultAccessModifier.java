//default can be accessed within the package
//it is the default access modifier if you don't mention anything
package General;
class AccessDefault{
	int a=25;
	void message(){
		System.out.println("this method is not public but");
		System.out.println("can be accessed within same package 'General'");
	}
	
}
public class DefaultAccessModifier {
	public static void main(String args[]){
		AccessDefault obj1=new AccessDefault();
		obj1.message();//accessible within the same package
		
	}

}
