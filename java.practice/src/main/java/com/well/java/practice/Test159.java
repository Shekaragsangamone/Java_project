package com.well.java.practice;



class Bulb1{  
 int watt;  
 String color;
 float price; 
 
 void createBulb(int w)
 {   
  watt=w;  
 }  
  
 void createBulb(int w, float p)
 {   
  createBulb(w);  
  price=p;
 }  
 
  void createBulb(int w,String c,float p)
 {   
  createBulb(w,p);  
  color=c;  
 } 

void displayDetails()
 {
 System.out.println("watt: "+watt);
 System.out.println("price: "+price);
 System.out.println("color: "+color);
 }
}
 
class Test159
{  
 public static void main(String args[])
 {  
  Bulb1 b1=new Bulb1();  
  b1.createBulb(100,"white",15.50F);
  b1.displayDetails();  
 }  
}  