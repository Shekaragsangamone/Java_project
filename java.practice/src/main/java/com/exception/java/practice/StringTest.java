package com.exception.java.practice;

class Pointer {

	public String one() {
		String name = null;
		return name;
	}
}
class StringTest{	
	public static void main(String args[]) {
		Pointer po = new Pointer();
		System.out.println(po.one().length());
	}
}
