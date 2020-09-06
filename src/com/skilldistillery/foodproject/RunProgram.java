package com.skilldistillery.foodproject;

import java.util.Scanner;

public class RunProgram {
	public FoodTruck[] allFoodTrucks = new FoodTruck[5];
	public int numTrucks = 0;
	public int total = 0;

	public static void main(String[] args) {
		
		RunProgram rp = new RunProgram();
		FoodTruck[] fTrucks = rp.getUserInfo();
		rp.printMenu();
		
		rp.findNumOfTrucks(fTrucks);

	}

	public FoodTruck[] getUserInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("You will enter name, foodtype, and rating for up to five Food Trucks.");
		System.out.println(
				"Please enter 'quit' for the name of a food truck to stop entering more food truck information");

		for (int i = 1; i < 6; i++) {
			System.out.println("Please enter the name of the food truck:");
			String input1 = sc.next();
			if (input1.equals("quit")) {
				break;
			}
			System.out.println("Please enter the foodtype for this truck:");
			String input2 = sc.next();
			System.out.println("Please enter the rating for this truck:");
			int input3 = sc.nextInt();
			FoodTruck ft = new FoodTruck(input1, input2, input3);
			allFoodTrucks[numTrucks] = ft;
			numTrucks++;
		}
		
		return allFoodTrucks;

	}

	public void findNumOfTrucks(FoodTruck[] x) {
		for (int i = 0; i < 6; i++) {

			if (x[i] != null) {
				total++;
			} else {
				break;
			}
		}
		System.out.println(total);
	}

public void listOfFoodTrucks(FoodTruck[] y) {
	for (int i=0; i<5;i++)
		y.toString();
}

	
	
	
	
public void printMenu() {
	
	System.out.println("Choose a menu option using 1-5");
	System.out.println("1. List all existing food trucks.");
	System.out.println("2. See the average rating of food trucks.");
	System.out.println("3. Display the highest-rated food truck.");
	System.out.println("4. Quit the program.");
	
	int option= sc.nextInt;
	switch(option){
	
	case 1:
		listFoodTrucks();
		break;
	case 2:
		AverageRating();
		break;
	case 3:
		highestRated();
		break;
	case 4:
		break;
		
	default:
		System.out.println("Please enter a valid entry");
	}
	
}
	

sc.close();
}