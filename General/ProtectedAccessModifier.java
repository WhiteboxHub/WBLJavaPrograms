//this is a subclass extended from parent class
package General;
import File.*;//imported the other package classes

public class ProtectedAccessModifier extends ProtectedAccessModifier1 {

	public static void main(String[] args) {
		ProtectedAccessModifier obj1=new ProtectedAccessModifier();
		obj1.message();
		System.out.println("ProtectedAccessModifier class in General package extends ProtectedAccessModifier1 in File package");

	}

}
