package com.passengerRegistration;


public class Passenger implements Comparable<Passenger>{
	private String name;
	private String passengerId;
	private int age;
	private String ticketClass;
	private String startPlace;
	private String destination;
	private String seatNumber;
	
	public Passenger(String name, String passengerId, int age, String ticketClass, String startPlace, String destination, String seatNumber ) {
		this.name = name;
		this.passengerId = passengerId;
		this.age=age;
		this.ticketClass = ticketClass;
		this.startPlace = startPlace;
		this.destination = destination;
		this.seatNumber = seatNumber;
	}
	
	public String getName() {
		return name;
	}

	public String getPassengerId() {
		return passengerId;
	}

	public int getAge() {
		return age;
	}

	public String getTicketClass() {
		return ticketClass;
	}

	public String getDestination() {
		return destination;
	}
	
	public String toString() {
		return String.format("Passenger Name:	%s"
				+ "\nPassenger ID(Adhar):	%s"
				+ "\nPassenger Age:	%d"
				+ "\nPassenger Ticket Class:	%s"
				+ "\nPassnger Start Place:	%s"
				+ "\nPassenger Destination:	%s"
				+ "\nPassenger Seat Number:	%s",name,passengerId,age,ticketClass,startPlace, destination, seatNumber);
	}

	@Override
	public int compareTo(Passenger that) {
		
		return this.passengerId.compareTo(that.getPassengerId());
	}
	
}
