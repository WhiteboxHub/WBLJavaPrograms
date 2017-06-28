package Arrays;

public class ArraySortBubblesort {

	public static void main(String[] args) {
		int[] ar1={10,40,60,50,30};
		int n=ar1.length;
		int temp=0;
		//sorting the array
		for(int i=0;i<n;i++){
			for(int j=1;j<(n-i);j++){
			if(ar1[j-1]>ar1[j]){
				temp=ar1[j-1];
				ar1[j-1]=ar1[j];
				ar1[j]=temp;
								}		
				}
				}
		//displaying the sorted array
		for(int k=0;k<n;k++){
			System.out.println(ar1[k]);
		}

}
}