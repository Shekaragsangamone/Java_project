package com.well.java.practice;



class Parent
{
	int age=50;
	static String name="Parent";

	void saving()
	{
		System.out.println("Parent's saved money");
	}

	void lifeStyle()
	{
		System.out.println("eat, sleep, work");
	}

}
class Child extends Parent
{
	int age=21;
	static String name="child";

	void keepLearning()
	{
		System.out.println("keep Learning");
	}
}


class Test3
{
	public static void main(String args[])
	{
		Parent p1=new Parent();
		p1.lifeStyle();
		Child c1=new Child();
		c1.saving();
		c1.lifeStyle();
		c1.keepLearning();
		System.out.println(p1.age + p1.name);
		System.out.println(c1.age + c1.name);
		System.out.println(c1.age + Child.name);
	} 
}