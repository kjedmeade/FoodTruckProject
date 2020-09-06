package com.skilldistillery.foodproject;

import java.util.Scanner;

public class RunProgram {
	public static void main(String[] args) {
		getInfoFromUser();

	}

	public static void getInfoFromUser() {
		Scanner sc = new Scanner(System.in);
		System.out.println("You will enter name, foodtype, and rating for up to five Food Trucks.");
		System.out.println(
				"Please enter 'quit' for the name of a food truck to stop entering more food truck information");

		for (int i = 1; i < 6; i++) {
			String input1 = "";
			if (input1.equals("quit") || input1.equals("Quit") || input1.equals("Quit")) {
				System.out.println("Please enter the name of the food Truck::");
				input1 = sc.nextLine();
				System.out.println("Please enter the foodtype for this truck:");
				String input2 = sc.nextLine();
				System.out.println("Please enter the rating for this truck:");
				int input3 = sc.nextInt();
			
				FoodTruck ft = new FoodTruck {input1, input2, input3};
				addFoodTruck();
				
			}
			
			
public void addFoodTruck(FoodTruck f) {
	allFoodTrucks[numTrucks]= f;
	numTrucks++;
		
	}
}

		}

		String input4 = "";
		if (input4.equals("quit") || input4.equals("Quit") || input4.equals("Quit")) {
			System.out.println("Please enter the name of the second food Truck:");
			input4 = sc.nextLine();
			System.out.println("Please enter the foodtype for this truck:");
			String input5 = sc.nextLine();
			System.out.println("Please enter the rating for this truck:");
			int input6 = sc.nextInt();
		}

		String input7 = "";
		if (input7.equals("quit") || input7.equals("Quit") || input7.equals("Quit")) {
			System.out.println("Please enter the name of the third food Truck:");
			input7 = sc.nextLine();
			System.out.println("Please enter the foodtype for this truck:");
			String input8 = sc.nextLine();
			System.out.println("Please enter the rating for this truck:");
			int input9 = sc.nextInt();
		}

		String input10 = "";
		if (input10.equals("quit") || input10.equals("Quit") || input10.equals("Quit")) {
			System.out.println("Please enter the name of the fourth food Truck:");
			input10 = sc.nextLine();
			System.out.println("Please enter the foodtype for this truck:");
			String input11 = sc.nextLine();
			System.out.println("Please enter the rating for this truck:");
			int input12 = sc.nextInt();
		}

		String input13 = "";
		if (input13.equals("quit") || input13.equals("Quit") || input13.equals("Quit")) {
			System.out.println("Please enter the name of the fifth food Truck:");
			input13 = sc.nextLine();
			System.out.println("Please enter the foodtype for this truck:");
			String input14 = sc.nextLine();
			System.out.println("Please enter the rating for this truck:");
			int input15 = sc.nextInt();
		}
	}

}
