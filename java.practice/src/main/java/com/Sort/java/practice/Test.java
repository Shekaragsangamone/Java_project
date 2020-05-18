package com.Sort.java.practice;
import java.util.Arrays;
class Test{
	public static void main(String args[]){
		String name[]= new String[] {"Trump","Obama","Modi"};
		for(int i=0; i < name.length;i++) { 
			System.out.println(name[i]);  
		}
		System.out.println("after sorting:");
		Arrays.sort(name);
		//for(String temp: name){
			//System.out.println(temp);
		//}
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
	}
}
