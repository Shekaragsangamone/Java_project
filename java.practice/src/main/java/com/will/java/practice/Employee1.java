package com.will.java.practice;

class Employee1
{

	String name;
	int id;

	Employee1(String name, int id)
	{
		this.name=name;
		this.id=id;
	}

	public static void main(String[] args)
	{
		Employee1 e1=new Employee1("Raj",20);
		Employee1 e2=new Employee1("Dheeraj",30);
		System.out.println(e1.equals(e2));
	}
}
