package com.interview.java.practice;

import java.util.Arrays;

public class RemoveWhiteSpaces {
	public static void main (String args[]) {
		String sentence = "kohli 	is a good cricketer";
		char [] array = sentence.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<array.length;i++) {
			if(array[i]!=' '&& array[i]!='\t') {
				
				sb.append(array[i]);	
			}
			
		}
		System.out.println("array is :"+Arrays.toString(array));
		System.out.println(sb);
		
	}
}
