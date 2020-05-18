package com.mob.java.practice;

class A
{

	int count;

	// abstract final void test();
	// abstract static void test();
	A()
	{
		count++;	
	}
	void display()
	{
		System.out.println("display() of A");
	}
}

class B extends A
{
	B()
	{
		count++;
	}
	void display()
	{
		System.out.println("display() of B");
		//super.display();
	}
	void test()
	{
		System.out.println("test() of B");


		//super.test();
	}
}

class Abstract
{
	public static void main(String args[])
	{
		//A a=new A();
		B a=new B();
		a.display();
		a.test();
		
		System.out.println(a.count);
		
		//B b=new B();
		//b.display();
		//b.test();
	}
}