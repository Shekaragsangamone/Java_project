package com.test.java.practice;

import java.util.*;  
class ArrayListSorts{  
	public static void main(String args[]){  
		ArrayList al=new ArrayList();  
		al.add("Viru");  
		al.add("Saurav");  
		al.add("Mukesh");  
		al.add("Tahir");  
		Collections.sort(al); 
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	}  
}