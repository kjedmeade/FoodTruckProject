package com.skilldistillery.foodproject;

import java.util.Scanner;

public class FoodTruckApp {

	
	public int numTrucks=1;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		FoodTruck[] fTrucks = new FoodTruck[5];
		FoodTruckApp fta = new FoodTruckApp();
		fTrucks = fta.getUserInfo(sc);
		fta.printMenu(sc,fTrucks);
		sc.close();
	}

	public FoodTruck[] getUserInfo(Scanner sc) {
		int numTrucks = 1;
		FoodTruck[] allFoodTrucks = new FoodTruck[5];
		

		System.out.println("Enter name, foodtype, and rating for up to 5 food trucks.");
		System.out.println("Please enter 'quit' when prompted for name to exit.");

		for (int i = 0; i < 5; i++) {
			System.out.println("Name");
			String input1 = sc.next();
			if (input1.equals("quit")) {
				break;
			}
			System.out.println("Foodtype;");
			String input2 = sc.next();
			System.out.println("Rating (1-10):");
			int input3 = sc.nextInt();
			FoodTruck ft = new FoodTruck(input1, input2, input3, numTrucks);
			allFoodTrucks[i] = ft;
			numTrucks++;
		}
		return allFoodTrucks;

	}
	
	public int printMenu(Scanner sc, FoodTruck[] x) {
		System.out.println("Choose a menu option using 1-5");
		System.out.println("1. List all existing food trucks.");
		System.out.println("2. See the average rating of food trucks.");
		System.out.println("3. Display the highest-rated food truck.");
		System.out.println("4. Quit the program.");

		int option = sc.nextInt();
boolean keepGoing =true;
	while (keepGoing) {
		switch (option) {

		case 1:
			
			displayFoodTrucks(x);
			break;
		case 2:
			averageRating(x);
			break;
		case 3:
			highestRated(x);
			break;
		case 4:
			break;

		default:
			System.out.println("Please enter a valid entry");

		}
		return option;
	}
	
	public void displayFoodTrucks(FoodTruck[] x) {
		for  (int i=0; i<x.length; i++) {
			if (x[i] == null)
				continue;
			System.out.println(x[i]);
			
		}
	}


	public void averageRating(FoodTruck[] z) {
		double sum = 0.0;
		double average = 0.0;
		int counter=0;
		for (int i = 0; i < z.length; i++) {
			if (z[i]==null) {
				continue;
			}
			counter++;
			sum+= z[i].getRating();
		}
		average = sum / counter;
		System.out.println(" The average rating is " + average);

	}

	public void highestRated(FoodTruck[] a) {
		int highest = 0;
		int highestRating = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]==null) {
				continue;
			}
			int rating = a[i].getRating();
			if (rating >= highest) {
				rating = highest;
				highestRating = i;
			} else
				continue;
		}
		System.out.println("The highest rated food truck is " + a[highestRating]);

	}
}
	
