package com.test.java.practice;

import java.util.Arrays;
class ArraySort
{
	public static void main(String args[]){
		char ch[] ={'D','A','C','B'};
		Arrays.sort(ch);
		for(char i: ch) 
			System.out.println(i);  
	}
}
