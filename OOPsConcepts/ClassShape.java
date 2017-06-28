//classShape.java,Circle.java,MainforClassShapeandCircle.java together
package OOPsConcepts;

abstract class ClassShape {
	int radius=10;
	public ClassShape(){
		System.out.println("Constructor");
		//int sidesNumber=1;
		}
	//pir^2
	void circleArea(){
		System.out.println("implementation within main class");
	}
	//2pir
	void circlePerimeter(){
		System.out.println("implementation within main class");
	}

}
