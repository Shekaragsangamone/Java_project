package com.mob.java.practice;

import java.util.Scanner;

public class Mobile {

	
	public static void main(String args[]) {

		Scanner scan= new Scanner(System.in);
		System.out.println("Please Enter the mobile number ");
		String MobNumber=scan.nextLine();
		mobileNumber(MobNumber);
		scan.close();
	}

		public static boolean mobileNumber(String MobNumber) { 	
			if(MobNumber!=null) {
				System.out.println("+91");
				System.out.println("mobile number is "+MobNumber);
				return true;
			}else {
				System.out.println("Please enter a valid Mobile Number");
			}
			return false;

		}

	}
