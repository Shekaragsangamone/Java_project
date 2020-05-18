package com.mob.java.practice;

import java.util.*;
class Test20{
	public static void main(String args[]){
		Collection c=new ArrayList();
		//adding elements into Collection
		c.add("Pune");
		c.add("Lucknow");
		c.add("Mysore");
		c.add("Bangalore");
		System.out.println(c);//[Pune,Lucknow,Mysore,bangalore]
		Iterator itr=c.iterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			System.out.println(obj);
			if(obj.equals("Mysore"))
			{
				itr.remove();
			}
		}
		System.out.println(c); //[Pune,Lucknow, bangalore]
	}
}