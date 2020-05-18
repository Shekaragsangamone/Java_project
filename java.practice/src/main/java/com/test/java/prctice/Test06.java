package com.test.java.prctice;



import java.util.*;
class Test06
{
 public static void main(String args[])
 {
  HashMap hm=new HashMap();
  hm.put("009","John");
  hm.put("002","Robert");
  hm.put("008","Mac");
  hm.put("004","David");
  System.out.println(hm);
  Set s=hm.entrySet();
  Iterator str=s.iterator();
  System.out.println("----travesing----");
 

while(str.hasNext())
  {
   Map.Entry e=(Map.Entry)str.next();
   System.out.println("Keys:"+e.getKey()+"Values:"
   +e.getValue());
   
   if(e.getKey().equals("004"))
   {
    e.setValue("Bob");
   }
  }
  System.out.println(hm);
 }
}