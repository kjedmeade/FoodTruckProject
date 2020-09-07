package com.skilldistillery.foodproject;

public class FoodTruck {
	private String name;
	private String foodType;
	private int rating;
	private int nextTruckID = 1;
	private int counter;

	public FoodTruck(String n, String f, int r, int nextTruckID) {
		name = n;
		foodType = f;
		rating = r;
		nextTruckID = counter;
		counter++;

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
		return "FoodTruck [name=" + name + ", foodType=" + foodType + ", rating=" + rating + ", ID="
				+ nextTruckID + "]";
	}

}
