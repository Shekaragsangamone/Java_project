package com.well.java.practice;
public class Programmer implements People{  
	int id;  
	String name;  
	int salary;  
	public Programmer(int id,String name,int salary){  
		this.id=id;  
		this.name=name;  
		this.salary=salary;  
	} 

	public String getName() {
		return name;
	}
}