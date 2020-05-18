package com.test.java.prctice;

import java.util.*;

public class AudienceManager {

	private ArrayList list;
	public AudienceManager(){
		list=new ArrayList();
		ticketList=new ArrayList();
	}
	public boolean register(Audience audience) {
		return	list.add(audience);


	}

	public boolean validate(Audience audience) {
		for(int i=0;i<list.size();i++){
			Audience registeredAudience = (Audience) list.get(i);
			if(registeredAudience.getUserId().equalsIgnoreCase(audience.getUserId()) && registeredAudience.getPassword().equalsIgnoreCase(audience.getPassword())){


				return true;
			}
		}
		return false;
	}
	private ArrayList ticketList;

	public boolean register(Tickets tickets){

		return ticketList.add(tickets);
	}

	public void show(){
		for(int i=0;i<ticketList.size();i++){
			Tickets ticket = (Tickets) ticketList.get(i);
			System.out.println("DATE\t NO. OF TICKETS");
			System.out.println(ticket.getDate()+"\t"+ticket.getTicket());
			//System.out.println("Booked Tickets are:"+ticket.getTickets());
		}
	}
	
	
	
}

