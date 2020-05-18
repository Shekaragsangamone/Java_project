package com.insta.java.practice;

public class AreaCalculator {
	public static double findArea(int radius) {
		double area=Math.PI*radius*radius;
		return area;

}
public static void main(String args[]) {
	for(int cm=1;cm<=4;cm++) {
		System.out.print("Radius="+cm+",");
		double area=findArea(cm);
		System.out.println("Area="+area);
	}
}
}
