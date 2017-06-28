//classShape.java,Circle.java,MainforClassShapeandCircle.java together
package OOPsConcepts;

public class Circle extends ClassShape {
	//method overriding
	@Override
	void circleArea(){
		System.out.println("Implementation1:"+2*3.14*radius*radius);
	}
	@Override
	void circlePerimeter(){
		System.out.println("Implementation2:"+2*3.14*radius);
	}

}
