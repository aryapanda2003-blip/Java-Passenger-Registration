package com.passengerRegistration;

import java.util.Comparator;

public class SortByDestination implements Comparator<Passenger> {

	@Override
	public int compare(Passenger p1, Passenger p2) {
		return p1.getDestination().compareTo(p2.getDestination());
	}

}
