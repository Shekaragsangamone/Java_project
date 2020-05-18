package com.well.java.practice;

class D1
{
	public static void main(String args[])
	{
		int i=5;

		System.out.println(i);   //5

		{                  //local block
			i=10;
			System.out.println(i); //10
		}

		System.out.println(i);//10
	}
}
