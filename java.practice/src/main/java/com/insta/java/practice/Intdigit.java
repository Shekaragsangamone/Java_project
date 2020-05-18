package com.insta.java.practice;

import java.util.*;

public class Intdigit {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 int num,count=0,temp,digit;
		 System.out.println("Enter any Integer:");
		 num=sc.nextInt();
		 sc.close();
		 temp=num;
		 while(num>0) {
			 num=num/10;
			 count++;
		}
		 while(temp>0) {
			 digit=temp%10;
			 //System.out.println(String.format("Digit at  place %s is %s ", count,digit));
			 System.out.println("Digit at  place "+count+" is "+digit);
			 temp/=10;
			 count--;
			 
		 }
	}

}
