package com.will.java.practice;

class Test1
{
	public static void main(String args[])
	{
		String st1=new String("Raj");
		String st2=new String("Lucky");
		String st3=new String("Raj");
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));
		System.out.println(st1);
	}
}