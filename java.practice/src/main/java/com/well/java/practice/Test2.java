package com.well.java.practice;



class Address
{
	int houseNumber;
	String city;
	String state;
	String country;

	Address(int houseNumber, String city, String state, String country)
	{
		this.houseNumber=houseNumber;
		this.city =city;
		this.state =state;
		this.country =country;
	}
}
class Person
{
	int adhaarNum;
	String personName;
	Address ad1; 

	Person(int adhaarNum, String personName, Address ad1)
	{
		this.adhaarNum=adhaarNum;
		this.personName=personName;
		this.ad1=ad1;
	}


	void displayDetails() 
	{
		System.out.println("Adaar number: "+adhaarNum);
		System.out.println("person name :"+personName);
		System.out.println("houseno:"+    ad1.houseNumber);
		System.out.println("person city :"+ad1.city);
		System.out.println(ad1.state);
		System.out.println(ad1.country);
	}
}

class Test2
{
	public static void main(String args[])
	{
		Address ad1 = new Address(26, "Bangalore", "Karnatka", "India");
		Person p1 = new Person(555, "Ram",ad1);
		p1.displayDetails();
	}
}
