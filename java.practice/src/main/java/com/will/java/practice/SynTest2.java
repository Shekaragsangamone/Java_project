package com.will.java.practice;

class C
{
	public synchronized void show()
	{
		System.out.println("How are you");
		System.out.println("i am");
		System.out.println("good");
	}
}
class Thread3 extends Thread
{
	public void run()
	{
		C a1=new C();
		a1.show();
	}
}
class SynTest2
{
	public static void main(String args[])
	{
		Thread3 t1=new Thread3();
		Thread3 t2=new Thread3();
		t1.start();
		t2.start();
	}
}