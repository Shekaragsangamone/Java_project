package com.hackerRank.java.practice;

import java.util.Scanner;

public class Primittive {
	public static void main (String args[]) {
		System.out.println("enter the number of trails");
		Scanner scanner=new Scanner(System.in);
		int t = scanner.nextInt();

		for(int i=0;i<t;i++) {
			try {
				long num=scanner.nextLong();
				System.out.println(num+"can be fitted in");
				if(num>=-127 && num<=127) {
					System.out.println("* byte");
				}else if(num>=-32768 && num<=32767) {
					System.out.println("* short");
					System.out.println("* int");
					System.out.println("* long");
				}else if(num >=-2147483648 && num<=2147483647) {
					System.out.println("* int");
					System.out.println("* long");
				}else if(num >= -9223372036854775808L && num<=9223372036854775807L) {
					System.out.println("* long");
				}
			}
			catch(Exception e)
			{
				System.out.println(scanner.next()+" can not be fitted in anywhere");
			}


		}

	}

}
