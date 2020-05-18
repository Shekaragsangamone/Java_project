package com.well.java.practice;
import java.util.*;  
public class Test10{  
	public static void main(String args[]){  
		Employee e1=new Employee(501,"Raj",4000);  
		Employee e2=new Employee(502,"Dav",5000); 
		Programmer p1=new Programmer(503,"Joh",4500);  
		ArrayList<People> al=new ArrayList<People>(); 
		al.add(e1);  
		al.add(e2);
		al.add(p1);  
		Iterator<People> itr=al.iterator(); 
		while(itr.hasNext()){  
			People e = (People)itr.next();  
			System.out.println(e.getName());

			/* while(itr.hasNext()){ 
    Object obj=itr.next();
	if(obj instanceof Employee)
	{
             Employee e=(Employee)obj;
	System.out.println(e.id+" "+e.name+" "+e.salary); 
    } 
	}*/  
		}  
	}}