package com.well.java.practice;



class Bulb
{  
	int watt;  
	String color;
	float price; 

	// The value which are received while constructor calling
	//will be reflected within constructor block only. 
	//The values of object will not be changed.

	Bulb(int watt, String color, float price)
	{   
		this.   watt=watt;  
		this.   color=color;  
		this.   price=price;
		System.out.println("Bulb is created with default values");
	} 


	void showValue()
	{
		System.out.println("display data");  
		System.out.println("watt :"+ watt);
		System.out.println("color :"+ color);
		System.out.println("price :"+ price);
	} 
	public static void main(String args[]){
		//constructor calling	
		Bulb b1=new Bulb(100,"white",15.50F);  
		b1.showValue();  
	}  
}
