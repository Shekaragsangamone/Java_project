package com.mob.java.practice;

abstract class BookMyShow
{    
abstract void getFreeMovietickets();    
}    
class ICICI extends BookMyShow
{    
void getFreeMovietickets()
{
System.out.println("2 movie tickets free/month");
}    
}    
class HSBC extends BookMyShow
{    
void getFreeMovietickets()
{
System.out.println("1 movie tickets free/month");
}   
}    
class Test{    
public static void main(String args[])
{ 
BookMyShow b;   
b=new ICICI();
b.getFreeMovietickets();     
b=new HSBC();
b.getFreeMovietickets();   
}
}