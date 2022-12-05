package com.collection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class hashmap {
	 public static void main(String args[]){ 
		 
		 
		   Map<Integer,String> map=new TreeMap<Integer,String>();//Creating HashMap    
		   map.put(1,"Mango");  //Put elements in Map  
		   map.put(2,"Apple"); 
		   map.put(3,"Grapes");
		   map.put(9,"Banana");
		   map.put(5,"Grapes Import"); 
		   map.put(3,"orange"); 
		   map.put(8,"Grapes"); 
		   
		  System.out.println(map);
		   
		   //Value with Key----Entry set    
		   System.out.println("Iterating Hashmap...");  
		   for(Entry<Integer, String> m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
		}  
}  




