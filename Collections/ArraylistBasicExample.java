package Collections;

import java.util.*;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistBasicExample {
	public static void main(String[] args) {
		//creating array list and adding elements to it
		List<String>list=new ArrayList<String>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Fourth");
		list.add("Fifth");
		//adding an iterator
		Iterator<String> itr=list.iterator();
		//displaying using iterator-forward
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		//searching an element
		boolean finder=list.contains("Fourth");
		//System.out.println(finder);
		System.out.println("**********************");
		if(finder){
			System.out.println("Element found");
		}else
		{System.out.println("Element not found");}
		
		System.out.println("****************************");
		System.out.println("Ascending order:");
		ListIterator<String> lIterator = list.listIterator();
		while (lIterator.hasNext())
        {
            System.out.println(lIterator.next());
        }
		//reversing using listiterator-backward
		
		System.out.println("Descending order:");
		while (lIterator.hasPrevious())
        {
            System.out.println(lIterator.previous());
        }
		

	}

}
