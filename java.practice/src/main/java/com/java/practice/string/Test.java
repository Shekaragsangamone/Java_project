package com.java.practice.string;

interface BookMyShow
{
 void getBankOffer();
}
class CITIBank implements BookMyShow
{
   public void getBankOffer()
   {
    System.out.println("buy 1 get 1 free/friday");	
   }
}
class HSBC implements BookMyShow
{
   public void getBankOffer()
   {
    System.out.println("buy 2 get 2 free/saturaday");	
   }
}
class Test
{
 public static void main(String args[])
 {
	 BookMyShow b1;
	 b1=new CITIBank();
	 b1.getBankOffer();
	 b1=new HSBC();
	 b1.getBankOffer();
 }
}
