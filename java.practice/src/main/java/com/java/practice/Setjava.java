package com.java.practice;

import java.util.HashSet;

public class Setjava {
	public static void main (String args[]) {
		HashSet<String> h=new HashSet<String>();
		h.add("john");
		h.add("z");
		System.out.println(h.add("z"));
		h.add("100");
		h.add("200");
		System.out.println(h.iterator());
		
	
	
	}

}
