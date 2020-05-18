package com.mob.java.practice;

class Parent
{
	
 void lifeStyle()
 {
 System.out.println("eat,sleep,work");
 }  
} 
 class Child extends Parent
{ 
  void lifeStyle()
 {
 System.out.println("party,eat,sleep,play,study");
 } 
}  
class Test0210
{ 
 public static void main(String args[])
 { 
 Child c1=new Child();
 c1.lifeStyle(); 
  }
}  