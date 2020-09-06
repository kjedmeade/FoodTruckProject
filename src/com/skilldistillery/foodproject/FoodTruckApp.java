package com.skilldistillery.foodproject;

import java.util.Scanner;

public class FoodTruckApp {
	public FoodTruck[] allFoodTrucks = new FoodTruck[5];
	public int numTrucks = 0;
	public int total = 0;
	private String input1, input2;
	private int input3;

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FoodTruckApp rp = new FoodTruckApp();
		FoodTruck[] fTrucks = rp.getUserInfo(sc);
		rp.printMenu(sc);
		
	
		sc.close();
	}

	public FoodTruck[] getUserInfo(Scanner sc) {
		
		System.out.println("Enter name, foodtype, and rating for up to five Food Trucks.");
		System.out.println(
				"Please enter 'quit' for the name of a food truck to stop entering more food truck information");

		for (int i = 1; i < 6; i++) {
			int x=1;
			System.out.println("Please enter the name of the food truck:");
			String input1 = sc.next();
			if (input1.equals("quit")) {
				break;
			}
			System.out.println("Please enter the foodtype for this truck:");
			String input2 = sc.next();
			System.out.println("Please enter the rating for this truck (between 1 and 10):");
			int input3 = sc.nextInt();
			FoodTruck ft = new FoodTruck(input1, input2, input3, x);
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
	for (int i=0; i<numTrucks;i++)
		y[i].toString();
}

public void averageRating(FoodTruck[] z) {
	double sum=0;
	double counter=0;
	double average =0.0;
	for (int i=0; i<z.length;i++) {
		sum=z[i].getRating();
		counter++;
	}
	average= sum/counter;
	System.out.println(" The average rating is" + average);
		
}

public void highestRated(FoodTruck[] a) {
	int highest=0;
	int highestRating=0;
	for (int i=0; i<a.length;i++) {
		int rating= a[i].getRating();
		 if (rating>=highest) {
			 rating =highest;
			 highestRating = i;
		 }
		 else
			 continue;
	}
	System.out.println("The highest rated food truck is"+ highest + "at" + highestRating);
	
}

	
	
	
public void printMenu(Scanner sc) {
	
	System.out.println("Choose a menu option using 1-5");
	System.out.println("1. List all existing food trucks.");
	System.out.println("2. See the average rating of food trucks.");
	System.out.println("3. Display the highest-rated food truck.");
	System.out.println("4. Quit the program.");
	
	int option=sc.nextInt();
	switch(option){
	
	case 1:
		listFoodTrucks();
		break;
	case 2:
		averageRating();
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



}