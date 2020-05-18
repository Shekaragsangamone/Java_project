package com.will.java.practice;

class A
{
	public synchronized static void show() 
	{
		System.out.println("How are you");
		System.out.println("i am");
		System.out.println("good");
	}
}
class Thread1 extends Thread
{
	public void run()
	{
		A.show();
	}
}
class SynTest
{
	public static void main(String args[])
	{
		Thread1 t1=new Thread1();
		Thread1 t2=new Thread1();
		t1.start();
		t2.start();
	}
}