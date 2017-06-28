package Collections;

import java.util.EnumSet;
import java.util.Set;

enum months{
January,February,March,April,May,June,July,August,September,October,November,December
}
public class EnumMonths {

	public static void main(String[] args) {
		Set<months> set1=EnumSet.allOf(months.class);
		System.out.println("Months:"+set1);

	}

}
