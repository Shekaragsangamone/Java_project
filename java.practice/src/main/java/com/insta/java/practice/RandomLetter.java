package com.insta.java.practice;

public class RandomLetter {
	public static void main (String []args) {

		String Alphabet="abcdefghijklmnopqrstuvwxyz";
		System.out.println(Alphabet.charAt((int)(Math.random()*25)));
	}
}