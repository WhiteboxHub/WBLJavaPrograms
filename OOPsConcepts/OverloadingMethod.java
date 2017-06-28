package OOPsConcepts;

class Add1{  
static int add(int a,int b){return a+b;}  
static int add(int a,int b,int c){return a+b+c;}  
}  
    
public class OverloadingMethod {

	public static void main(String[] args) {
		System.out.println("overaloading methods with different arguments");
		System.out.println(Add1.add(11,11));  
		System.out.println(Add1.add(11,11,11)); 

	}

}
