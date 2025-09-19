package com.passengerRegistration;

import java.util.Comparator;

public class SortByAge implements Comparator<Passenger> {

	@Override
	public int compare(Passenger p1, Passenger p2) {
		
		return Integer.compare(p1.getAge(), p2.getAge());
	}

}
