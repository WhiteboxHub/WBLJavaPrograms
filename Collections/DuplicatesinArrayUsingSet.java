package Collections;

import java.util.HashSet;

public class DuplicatesinArrayUsingSet {

	public static void main(String[] args) {
		String[] strArray = { "john", "dow", "jane", "man", "kam", "man", "jane" };

		HashSet<String> set = new HashSet<String>();

		for (String arrayElement : strArray) {
			if (!set.add(arrayElement)) {
				System.out.println("Duplicate Element is : " + arrayElement);
			}
		}
	}
}
