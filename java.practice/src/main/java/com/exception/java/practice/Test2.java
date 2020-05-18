package com.exception.java.practice;

public class Test2
{
	public static void main(String args[])
	{
		try(Student s1=new Student(1,"Neeraj");)
		{
			s1.check();
		}catch (InvalidAmountException e) {
			System.out.println(e);
		}
	}
}