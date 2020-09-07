package com.skilldistillery.foodproject;

public class FoodTruck {
	private String name;
	private String foodType;
	private int rating;
	private static int nextTruckID = 0;
	private int counter;

	public FoodTruck(String n, String f, int r) {
		name = n;
		foodType = f;
		rating = r;
		counter=nextTruckID;
		nextTruckID++;

	}
	public FoodTruck() {
		nextTruckID = counter;
		counter++;
	}

	public String getName() {
		return name;
	}

	public int getRating() {
		return rating;
	}

	
	

	@Override
	public String toString() {
		return "FoodTruck Name=" + name + ", FoodType=" + foodType + ", Rating=" + rating + ", ID="
				+ counter;
	}

}
