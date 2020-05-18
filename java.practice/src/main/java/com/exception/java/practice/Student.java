package com.exception.java.practice;

import java.io.IOException;

class Student implements AutoCloseable
{
	int id;
	String name;

	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public void check() throws InvalidAmountException {
		
		//throw new IOException("I am a sample exception");
		
		//check1();
		
		throw new InvalidAmountException(1, "test");
	}
	public void check1() throws IOException {
		// TODO Auto-generated method stub
		
	}

	public void close()
	{
		System.out.println("id:"+id+" name:"+name);
	}
}
