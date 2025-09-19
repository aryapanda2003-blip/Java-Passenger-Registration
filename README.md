# Java Passenger Registration & Sorting System

A comprehensive console application built in Java that manages passenger registration and demonstrates advanced object-oriented programming and the Java Collections Framework. The program ensures data integrity by validating the uniqueness of passenger IDs and provides a menu-driven interface to sort passenger data based on multiple criteria.

---

## Key Features & Concepts Demonstrated

-   Java Collections Framework Utilized `ArrayList` for data storage and `HashSet` for efficient, O(1) uniqueness checking of passenger IDs.
-   `Comparable` Interface Implemented a default, natural sort order for `Passenger` objects based on their ID.
-   `Comparator` Interface Developed multiple custom comparators to provide flexible sorting options based on user selection (e.g., by name, age, custom ticket class hierarchy).
-   Object-Oriented Design Built a well-encapsulated `Passenger` class and separated business logic from user-interface logic.
-   Robust Input Validation Created a loop to ensure passenger IDs are unique before an object is created.

---

## How to Run

1.  Compile all the `.java` files in the `compassengerRegistration` directory.
2.  Run the `main` method in the `Main` class.
3.  Follow the on-screen prompts to enter details for 5 passengers.
4.  Choose a sorting option from the menu to see the sorted list.