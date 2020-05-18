package com.test.java.prctice;



import java.util.*;
class Employee
{
int id;
String name;
 
Employee(int id,String name)
{
this.id=id;
this.name=name;
}
public String toString()
{
	return id+"  "+name;
}
}
 
class DescComparator implements Comparator
{
 public int compare(Object ob1,Object ob2) {
	 Employee x=(Employee)ob1;
              Employee y=(Employee)ob2;	 
      
	  if(x.id > y.id)
	  return -1;
	  else if(x.id < y.id)
	  return 1;
	  else
	  return 0;
	  }
}
class Test04
{
public static void main(String[] args){
TreeSet ts1=new TreeSet(new DescComparator());
ts1.add(new Employee(91,"David"));
ts1.add(new Employee(20,"John"));
ts1.add(new Employee(30,"Cena"));
System.out.println(ts1);
}
}

