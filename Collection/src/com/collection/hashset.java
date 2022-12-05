package com.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class hashset {
public static void main(String[] args) {
		
		// Creating HashSet and adding elements
		Set<String> set = new LinkedHashSet();
		//Treeset-ascending order
		//Hashset-Random order
		//LinkedHashset-insert order
		set.add("methods");
		set.add("inheritance");
		set.add("constructor");
		set.add("interface");
		set.add("abstract");
		set.add("abstract");

		System.out.println(set);
		
		for(String h:set) {
			System.out.println(h);
		}
		
		  set.remove("interface");
		  System.out.println("set values after remove"+set);
		 
		  Set<String> set1=new LinkedHashSet<String>(); 
		  set1.add("Aggregation");
		  set1.add("composition"); 
		  set1.add("Association");
		  set1.add("access modifier");
		  set1.add("composition"); 
		  set1.add("Association");

		  System.out.println(set1);
		  set.addAll(set1);
		  
		 System.out.println("list added after set1 "+set);
		 

	}

}




