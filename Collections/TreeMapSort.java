package Collections;
import java.util.*;
public class TreeMapSort {	
	 public static void main(String args[]){  
	  Map<String,Integer> hm=new TreeMap<String,Integer>();  
	  hm.put("Hello",10);  
	  hm.put("How",12);  
	  hm.put("Are",11);  
	  hm.put("You",13);  
	  for(Map.Entry<String,Integer> m:hm.entrySet()){  
	   System.out.println(m.getKey()+" "+m.getValue());  
	  }  
	 }  
	}  


