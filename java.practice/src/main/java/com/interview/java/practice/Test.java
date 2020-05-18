package com.interview.java.practice;

public class Test 
{ 
	private int data ; 

	public int getData() 
	{ 
		return this.data; 
	} 
	public int getData(int value) 
	{ 
		return (data+1); 
	} 
	public int getData(int... value) 
	{
		int sum = 0;
		for(int i=0;i<value.length;i++) {
			sum = sum + value[i];
		}
		return sum;
		//return (data+2);
	} 

	public static void main(String[] args) 
	{ 
		Test temp = new Test(); 
		System.out.println(temp.getData(7, 8, 12));
		System.out.println(temp.getData(7, 8));
	} 
} 
