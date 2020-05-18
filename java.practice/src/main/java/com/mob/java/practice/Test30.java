package com.mob.java.practice;

import java.util.*; 
 class Employee{  
	  int id;  
	  String name;  
	  int salary;  
	 public Employee(int id,String name,int salary){  
	   this.id=id;  
	   this.name=name;  
	   this.salary=salary;  
	  }  
	}
public class Test30{  
 public static void main(String args[]){  
  Employee e1=new Employee(501,"Raj",4000);  
  Employee e2=new Employee(502,"David",5000);  
  ArrayList al=new ArrayList(); 
  al.add(e1);  
  al.add(e2);  
    
  Iterator itr=al.iterator();   
  while(itr.hasNext()){  
    Employee e=(Employee)itr.next();  
    System.out.println(e.id+" "+e.name+" "+e.salary);  
  }
 }  
}  