package com.passengerRegistration;

import java.util.Comparator;

public class SortByTicketClass implements Comparator< Passenger> {
	
	@Override
	public int compare(Passenger p1, Passenger p2) {
		int rank1 = getRank(p1.getTicketClass());
		int rank2 = getRank(p2.getTicketClass());
		return Integer.compare(rank1, rank2);
	}

	private int getRank(String ticketClass) {
		if(ticketClass.equalsIgnoreCase("Economy")) {
			return 1;
		}else if(ticketClass.equalsIgnoreCase("Business")) {
			return 2;
		}else if(ticketClass.equalsIgnoreCase("First")) {
			return 3;
		}else {
			return 4;
		}
		
	}
}
