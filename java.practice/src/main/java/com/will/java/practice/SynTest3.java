package com.will.java.practice;

class D
{
	public void show()
	{
		System.out.println("How are you");
		synchronized(this)
		{
			System.out.println("i am");
			System.out.println("good");
		}
	}
}
class Thread4 extends Thread{
	public void run()
	{
		D a1=new D();
		a1.show();
	}
}
class SynTest3
{
	public static void main(String args[])
	{
		Thread4 t1=new Thread4();
		Thread4 t2=new Thread4();
		t1.start();
		t2.start();
	}
}