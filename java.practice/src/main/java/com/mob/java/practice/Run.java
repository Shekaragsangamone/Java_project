package com.mob.java.practice;
interface Test10{
	int i=10;
	void test1();
}
interface Test2{
	int j=20;
	void test2();
}
class Completed implements Test1,Test2
{
	public void test1()
	{
		System.out.println("test1() body");
	}

	public void test2()
	{
		System.out.println("test2() body");
	}
}

class Run
{
	public static void main(String args[])
	{
		Test1 t1=new Complete();
		t1.test1();
		Test2 t2=new Completed();
		t2.test2();
		System.out.println(Test1.i);
		System.out.println(Test2.j);
	}
}
