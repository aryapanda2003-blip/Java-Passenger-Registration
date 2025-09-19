package com.passengerRegistration;

import java.util.Comparator;

public class SortByPassengerId implements Comparator<Passenger> {

	@Override
	public int compare(Passenger p1, Passenger p2) {
		
		return p1.getPassengerId().compareToIgnoreCase(p2.getPassengerId());
	}

}
