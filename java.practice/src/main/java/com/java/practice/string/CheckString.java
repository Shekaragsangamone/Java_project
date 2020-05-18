package com.java.practice.string;

public class CheckString {

	public static void main(String[] args) {
		String mobNumber = "+919876543210";
		printMobNumber(mobNumber);
		//printChars(mobNumber);
	}

	public static void  printMobNumber(String input) {

		System.out.println(input.substring(0, 3));
		System.out.println(input.substring(3, input.length()));

	}

	public static void printMob(String input) {
		String cc="";
		for(int i=0; i<3;i++) {
			cc = cc+input.charAt(i);
		}
		System.out.println(cc);

		String mobNumber = "";
		for(int i=3; i< input.length(); i++) {
			mobNumber = mobNumber+input.charAt(i);
		}
		System.out.println(mobNumber);
	}

	public static void printChars(String input) {
		for(int i=0;i<input.length();i++) {
			System.out.println(input.charAt(i));
		}
	}

}