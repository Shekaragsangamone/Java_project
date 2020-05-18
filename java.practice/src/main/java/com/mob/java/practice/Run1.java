package com.mob.java.practice;
interface Test1
{
  int i=10;
  void test1();
}
 
class Complete implements Test1
{
  public void test1()
  {
   System.out.println("test1() body");
  }
}
 
class Run1
{
 public static void main(String args[])
 {
  Test1 t1=new Complete();
  t1.test1();
 }
}