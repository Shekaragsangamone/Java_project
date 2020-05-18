package com.insta.java.practice;

public class ReturnTypes {
	public static double findArea(int radius) {
		double area=Math.PI*radius*radius;
		return area;
		
	}
public static void main(String []args) {
	double area= findArea(3);
	System.out.println("Area is "+area);
}
}
