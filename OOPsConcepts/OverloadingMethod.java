package OOPsConcepts;

class Add1{  
static int add(int x,int y){return x+y;}  
static int add(int i,int j,int k){return i+j+k;}  
}  
    
public class OverloadingMethod {

	public static void main(String[] args) {
		System.out.println("overaloading methods with different arguments");
		System.out.println(Add1.add(20,30));  
		System.out.println(Add1.add(15,20,24)); 

	}

}
