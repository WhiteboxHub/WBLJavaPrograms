package Arrays;

public class CommonNumberinArrays {

	public static void main(String[] args) {
		int[] a={52,12,78,45,600,18,3};
		int[] b={8,4,3,12,600};
		System.out.print("common numbers are   ");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j])
					{
					System.out.print(" "+a[i]+" ");
					}
			}
		}
		
		

	}

}
