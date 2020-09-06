package com.skilldistillery.foodproject;

public class FoodTruck {
	public String name;
	public String foodType;
	public int rating;
	public int totalNumTrucks=1;
	public static int nextTruckID=1;
	
	

	
	public FoodTruck(String n, String f, int r, int nextTruckID) {
		name = n;
		foodType = f;
		rating=r;
		nextTruckID=1;
		nextTruckID++;
		
	}
	
		
	public String getName() {
		return name;
	}


	public String getFoodType() {
		return foodType;
	}

	public int getRating() {
		return rating;
	}
	
	public String toString() {
		return "FoodTruck [name=" + name + ", foodType=" + foodType + ", rating=" + rating + ", totalNumTrucks="
				+ totalNumTrucks + "]";
	}


	}


	

