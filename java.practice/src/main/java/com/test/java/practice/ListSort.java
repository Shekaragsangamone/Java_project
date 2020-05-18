package com.test.java.practice;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.List;

public class ListSort {
	public static void main (String args[]) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("obama");
		name.add("trump");
		name.add("bsy");
		
		Collections.sort(name);
		for(Object i:name) {
			System.out.println(i);
		}
		
	}

}
