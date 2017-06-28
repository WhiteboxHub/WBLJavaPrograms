package Collections;

import java.util.ArrayList;

public class ArraylistToArray {
	public static void main(String a[]) {
		ArrayList<String> arrl = new ArrayList<String>();
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Final");
		System.out.println("Actual ArrayList:" + arrl);
		String[] strArr = new String[arrl.size()];
		arrl.toArray(strArr);
		System.out.println("Created Array content:");
		for (String str : strArr) {
			System.out.println(str);
		}
	}
}
