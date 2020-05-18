package com.insta.java.practice;

public class Number {
	static int i=0;
	public static void main(String[] args) {
		System.out.println(getNumber());
		System.out.println(getNumber());
		System.out.println(getNumber());

		System.out.println(getNumber());
		System.out.println(getNumber());
	}
	public static int getNumber() {

		//int value=i%4;
		return i++;
		
	}
}