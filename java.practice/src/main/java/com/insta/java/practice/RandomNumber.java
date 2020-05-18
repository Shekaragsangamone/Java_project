package com.insta.java.practice;

import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		int randomNumber = (int)(Math.random()*100+1);
		boolean hasWon=false;
		System.out.println("I have chosen a number between 1-100 randomly");
		System.out.println("Guess the number");
		System.out.println("Random Number is: "+randomNumber);

		Scanner scanner = new Scanner(System.in);
		for(int i=10;i>0;i--) {
			System.out.println(" You have"+i+"guesses left. choose again!");
			int guess=scanner.nextInt();
			if (guess>randomNumber) {
				System.out.println("Your guess is smaller: " + guess);
			}
			else if(guess<randomNumber){
				System.out.println("Your guess is greater: " + guess);
			}
			else {
				hasWon=true;
				System.out.println("correct..You won ");
			}
		}

	}

}
