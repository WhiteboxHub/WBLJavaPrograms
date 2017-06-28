package Arrays;

public class LargestinArray {

	public static void main(String[] args) {
		int[] array1={500,20,4,600,78,145};
		int temp=0;
		for(int i=0;i<array1.length;i++){
			if(array1[i]>temp){
				temp=array1[i];
			}
		}
		System.out.println("Largest number is "+temp);
	}

	}


