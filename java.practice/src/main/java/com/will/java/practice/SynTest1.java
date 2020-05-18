package com.will.java.practice;

class B
{
	public static void show()
	{
		System.out.println("How are you");
		synchronized(B.class)
		{
			System.out.println("i am");
			System.out.println("good");
		}
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		A.show();
	}
}
class SynTest1{
	public static void main(String args[])
	{
		Thread2 t1=new Thread2();
		Thread2 t2=new Thread2();
		t1.start();
		t2.start();
	}
}