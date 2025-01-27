package com.vehiclerentalsystem;

public class VehicleRentalControlar {
	// Main method to execute the program
	public static void main(String[] args) {

		// Create a Car object with specific details (vehicle number and rental rate)
		Car car = new Car("AC04", 50.0, 0.11);

		// Create a Bike object with specific details (vehicle number and rental rate)
		Bike bike = new Bike("A9001", 20.0 , 0.18);

		// Create a Truck object with specific details (vehicle number and rental rate)
		Truck truck = new Truck("T091", 100.0, 0.08);

		// Display the rental and insurance details for the car
		System.out.println("Car Details:");
		System.out.println("Rental Cost (2 days): $" + car.calculateRentalCost(2));
		System.out.println("Insurance Cost: $" + car.calculateInsurance());
		System.out.println(car.getInsuranceDetails());

		// Display the rental and insurance details for the bike
		System.out.println("\nBike Details:");
		System.out.println("Rental Cost (3 days): $" + bike.calculateRentalCost(3));
		System.out.println("Insurance Cost: $" + bike.calculateInsurance());
		System.out.println(bike.getInsuranceDetails());

		// Display the rental and insurance details for the truck
		System.out.println("\nTruck Details:");
		System.out.println("Rental Cost (5 days): $" + truck.calculateRentalCost(5));
		System.out.println("Insurance Cost: $" + truck.calculateInsurance());
		System.out.println(truck.getInsuranceDetails());
	}
}
