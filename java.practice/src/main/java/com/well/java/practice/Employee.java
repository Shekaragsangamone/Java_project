package com.well.java.practice;
public class Employee implements People{  
	int id;  
	private String name;  
	int salary;  
	public Employee(int id,String name,int salary){  
		this.id=id;  
		this.name=name;  
		this.salary=salary;  
	}
	@Override
	public String getName() {
		return name;
	}
	
}
