package General;

public class StaticMethod {
	int regNumber;
	String name;
	static String collegeName="BDU";
	
	static void nameChange(){
		collegeName="ITU";
	}
	
	StaticMethod(int a,String b){
		regNumber=a;
		name=b;
	}
	
	public void display(){
		System.out.println("Register Number:"+regNumber+" Student name:"+name+" College:"+collegeName);
	}
	

	public static void main(String[] args) {
		StaticMethod.nameChange();//static method don't need to be instantiated
		StaticMethod s1=new StaticMethod(1,"Jane");
		StaticMethod s2=new StaticMethod(2,"John");
		StaticMethod s3=new StaticMethod(3,"Matt");
		
		s1.display();
		s2.display();
		s3.display();

	}

}
