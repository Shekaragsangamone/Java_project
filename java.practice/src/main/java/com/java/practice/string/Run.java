package com.java.practice.string;

interface A
{

	static String name="nokia";
	void m1();

	default void m2()
	{
		System.out.println("use default keyword with method");
	} 

	static void cname()
	{
		System.out.println("name:"+name);
	}   
}  

class Test1 implements A
{  
	public void m1()
	{
		System.out.println("m1() of A");
	}  
}

class Test2 implements A
{  
	public void m1()
	{
		System.out.println("m1() of Test1");
	}  
}
class Run
{  
	public static void main(String args[]){  
		A a1=new Test1();
		a1.m2();  
		a1.m1();
		
		test(a1);
		
		A.cname(); 
	}
	
	
	public static void test(A test) {
		System.out.println(test.toString());
	}
}  