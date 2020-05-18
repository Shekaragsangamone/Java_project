package com.java.list.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



public class Employee {
	public static void main (String argd[]) {
		Employee emp = new Employee();

		Collection list =  new ArrayList();
		list.add("shekar");
		list.add("manu");
		list.add("sachin");
		list.add(emp);

		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			Object obj = itr.next();
			System.out.println(obj);
		}
		System.out.println(list);

	}
}
