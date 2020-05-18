package com.test.java.prctice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicketCounter {

	public static void main(String[] args) {
		System.out.println("****************** Welcome to IPL Ticket Booking *********************");

		AudienceManager audienceManager = new AudienceManager();
		int option = displayAndCollectMainMenu();
		processOption(option,audienceManager);

	}

	private static void processOption(int option,AudienceManager audienceManager) {
		Audience audience = null;
		Tickets tickets =null;
		switch(option) {
		case 1:
			audience = displayAndCollectRegisterMenu();
			if(audience!=null){
				boolean isRegistered = audienceManager.register(audience);
				if(isRegistered) {
					System.out.println("Registration successfull");
				}
			}
			else {
				System.out.println("Registration is not succesfull. Please try again");
			}
			if(audience!=null){
				int selectedOption = displayAndCollectMainMenu();
				processOption(selectedOption, audienceManager);
			}
			break;
		case 2:
			audience = displayAndCollectLoginMenu();
			boolean isValidated = audienceManager.validate(audience);
			if(isValidated) {
				option = displayAndCollectTicketMenu();
				if(option == 1){
					tickets=displayAndCollectBookingMenu();
					boolean isRegistered=audienceManager.register(tickets);
					if(isRegistered){
						System.out.println("Ticket booked successflly");
					}else{
						System.out.println("Tickets are not exist....please book your tickets");
					}
					//displayAndCollectTicketMenu();

				}
				option=displayAndCollectTicketMenu();
				if(option == 2){
					//System.out.println("Tickets are not exist....please book your tickets");
					audienceManager.show();
				}
				/*displayAndCollectTicketMenu();
				if (option==2){
				audienceManager.show();
				}*/



			}
			break;
		case -1:
			break;
		default:
			break;
		}
	}

	private static Tickets displayAndCollectBookingMenu() {
		System.out.println("Enter the match Date:");
		Scanner scanner=new Scanner(System.in);
		String date=scanner.nextLine();
		System.out.println("Enter the number of tickets");
		String ticket=scanner.nextLine();
		
		Tickets tickets=new Tickets();
		tickets.setDate(date);
		tickets.setTicket(ticket);
		return tickets;
	}

	private static int displayAndCollectTicketMenu() {
		System.out.println("1. Book Ticket");
		System.out.println("2. Show Ticket");

		Scanner scanner=new Scanner(System.in);
		try{

			return scanner.nextInt();
		}catch(InputMismatchException e){
			System.out.println("Please enter a valid option");
		}
		return -1;



	}

	private static Audience displayAndCollectLoginMenu() {
		System.out.println("Enter your userId:");
		Scanner scanner=new Scanner(System.in);
		String userId=scanner.nextLine();
		System.out.println("Enter your password");
		String password=scanner.nextLine();
		Audience audience = new Audience();
		audience.setUserId(userId);
		audience.setPassword(password);
		return audience;

	}

	private static Audience displayAndCollectRegisterMenu() {
		System.out.println("Enter your name :");
		Scanner scanner=new Scanner(System.in);
		String name=scanner.nextLine();
		System.out.println("Enter your phone number:");
		String phoneNumber=scanner.nextLine();
		System.out.println("Enter your user id:");
		String userId=scanner.nextLine();
		System.out.println("Enter your password:");
		String password=scanner.nextLine();
		System.out.println("Re enter your password");
		String enteredPassword=scanner.nextLine();

		if(password.equalsIgnoreCase(enteredPassword)){
			Audience audience=new Audience();
			audience.setName(name);
			audience.setPhoneNumber(phoneNumber);
			audience.setUserId(userId);
			audience.setPassword(password);
			audience.setEnteredPassword(enteredPassword);

			return audience;

		}
		else{
			System.out.println("Password does not match");
		}
		return null;
	}

	private static int displayAndCollectMainMenu() {
		System.out.println("Please select your option:");
		System.out.println("1. Register");
		System.out.println("2. Login");

		Scanner scanner = new Scanner(System.in);
		try {
			return scanner.nextInt();
		}catch (InputMismatchException e) {
			System.out.println("Please enter a valid option");
		}
		return -1;
	}


}
