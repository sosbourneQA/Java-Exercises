package com.qa.main;

public abstract class Vehicle {

	private int noOfWheels;
	private int cost;
	private String fuelType;

	public Vehicle(int noOfWheels, int cost, String fuelType) {
		super();
		this.noOfWheels = noOfWheels;
		this.cost = cost;
		this.fuelType = fuelType;

	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return " noOfWheels= " + noOfWheels + ", cost= " + cost + ", fuelType= " + fuelType + "]";
	}

}

//1 	Using Vehicle as a base class, create three derived classes (car, motorcycle etc.), 
//each derived class should have its own attributes in addition to the normal Vehicle attributes.

//2 	Using a List implementation, store all your vehicles in a Garage class.

//3 	Create a method in Garage that iterates through each Vehicle, calculating a bill 
//for each type of Vehicle in a different way, depending on the type of vehicle it is.  
//You can decide how this bill is calculated based on any attributes you see fit. 
//(You do not get extra marks for making the calculation overly complex)

//4 	Garage should have methods that add Vehicle, remove Vehicle(s) (By ID, By Vehicle Type) 
//fix Vehicle (Calculate bill) and empty the garage.
