package com.passengerRegistration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;



public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		List<Passenger> passengerList = new ArrayList<Passenger>();
		Set<String> validPassengerID = new HashSet<String>();
		
        while (passengerList.size() < 5) {
        	System.out.println("--Enter details for Passenger #"+(passengerList.size() +1)+" ---");
            Passenger newPassenger = getPassengerDetail(passengerList,validPassengerID);
            passengerList.add(newPassenger);
        }
		
//		name, Passenger ID, age, ticket class, or destination.
        
        System.out.println(" Initial Unsorted List ");
        System.out.println("-------------------------------");
        for(Passenger p : passengerList) {
            System.out.println(p);
            System.out.println("-------------------------------");
        }
		
		System.out.println("Please select the attribut to sort the list: ");
		System.out.println("1.Sort by name"
				+ "\n2.Sort by Passenger Id(Custom sort)"
				+ "\n3.Sort by Passenger Id(Default sort)"
				+ "\n4.Sort by age"
				+ "\n5.Sort by Ticket Class"
				+ "\n6.Sort by destination");
		int attribute = sc.nextInt();
		
		switch(attribute) {
		case 1: passengerList.sort(new SortByName());
			break;
		case 2: passengerList.sort(new SortByPassengerId());
			break;
		case 3:Collections.sort(passengerList);
			break;
		case 4: passengerList.sort(new SortByAge());
			break;
		case 5: passengerList.sort(new SortByTicketClass());
			break;
		case 6: passengerList.sort(new SortByDestination());
			break;
		default:
			System.out.println("InValid attribute! Please select the correct attribute");
		}
		
		System.out.println("Final Sorted List");
		System.out.println("-------------------------------");
		for(Passenger passenger: passengerList) {
			System.out.println(passenger);
			System.out.println("-------------------------------");
		}
		
		
		
	}
	
	public static Passenger getPassengerDetail(List<Passenger> passengerList,Set<String> validPassengerID) {
		 
		 String passengerId;
		 do {
	            System.out.print("Enter Passenger ID (Aadhar): ");
	            passengerId = sc.nextLine(); 

	            if(validPassengerID.contains(passengerId)) {
	            	System.out.println("Error: Id already exist");
	            }else {
	            	break;
	            }
	        } while (true);
		 validPassengerID.add(passengerId);
		 
		System.out.println("Enter Passenger name");
		String name = sc.nextLine();
		
		System.out.println("Enter Passenger age");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Passenger Ticket Class(Economy, Business, First)");
		String ticketClass = sc.nextLine();
		
		System.out.println("Enter Passenger start Location");
		String startPlace = sc.nextLine();
		
		System.out.println("Enter Passenger destination");
		String destination = sc.nextLine();
		
		System.out.println("Enter Passenger seat number");
		String seatNumber = sc.nextLine();
		
		return new Passenger(name, passengerId, age, ticketClass, startPlace, destination, seatNumber);
	}

}
