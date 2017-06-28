package OOPsConcepts;



interface ConstantShape {
	double pi=3.14;
	void area();
	
}
class Circle1 implements ConstantShape{
	public void area(){
		int radius=10;
		System.out.println("implementing interface:"+2*pi*radius);
	}
	
}
class Triangle1 implements ConstantShape{
	public void area(){
		System.out.println("implementing inteface:"+pi);
	}
}

class ShapeConstant{
	public static void main(String args[]){
		ConstantShape obj1=new Circle1();
		obj1.area();
		ConstantShape obj2=new Triangle1();
		obj2.area();
	}
}