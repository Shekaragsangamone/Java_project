package com.exception.java.practice;

class InvalidAmountException extends Throwable{  

	private int i;
	private String s;

	InvalidAmountException(String s){
		super(s);
	}

	public InvalidAmountException(int i, String s) {
		super(i+s);
		this.i = i;
		this.s = s;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return i+s+this.getClass().getCanonicalName();
	}
}