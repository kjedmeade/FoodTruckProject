//package com.skilldistillery.foodproject;
//
//public class Excess {
//
//}	}
//
//String input4 = "";
//if (input4.equals("quit") || input4.equals("Quit") || input4.equals("Quit")) {
//	System.out.println("Please enter the name of the second food Truck:");
//	input4 = sc.nextLine();
//	System.out.println("Please enter the foodtype for this truck:");
//	String input5 = sc.nextLine();
//	System.out.println("Please enter the rating for this truck:");
//	int input6 = sc.nextInt();
//}
//
//String input7 = "";
//if (input7.equals("quit") || input7.equals("Quit") || input7.equals("Quit")) {
//	System.out.println("Please enter the name of the third food Truck:");
//	input7 = sc.nextLine();
//	System.out.println("Please enter the foodtype for this truck:");
//	String input8 = sc.nextLine();
//	System.out.println("Please enter the rating for this truck:");
//	int input9 = sc.nextInt();
//}
//
//String input10 = "";
//if (input10.equals("quit") || input10.equals("Quit") || input10.equals("Quit")) {
//	System.out.println("Please enter the name of the fourth food Truck:");
//	input10 = sc.nextLine();
//	System.out.println("Please enter the foodtype for this truck:");
//	String input11 = sc.nextLine();
//	System.out.println("Please enter the rating for this truck:");
//	int input12 = sc.nextInt();
//}
//
//String input13 = "";
//if (input13.equals("quit") || input13.equals("Quit") || input13.equals("Quit")) {
//	System.out.println("Please enter the name of the fifth food Truck:");
//	input13 = sc.nextLine();
//	System.out.println("Please enter the foodtype for this truck:");
//	String input14 = sc.nextLine();
//	System.out.println("Please enter the rating for this truck:");
//	int input15 = sc.nextInt();
//}
//}
//
//}
//FoodTruck ft = new FoodTruck(input1, input2, input3);
//allFoodTrucks[totalNumTrucks]= ft;
//totalNumTrucks++;
//
//}
//return allFoodTrucks;
//
//
//String input1 = "";
//String input2 = "";
//int input3 = 0;
//	System.out.println("Please enter the name of the food Truck::");
//	input1 = sc.nextLine();
//	if (input1.equals("quit") || input1.equals("Quit") || input1.equals("Quit")) {
//		quit=false;
//		break;
//	}
//	else {
//	System.out.println("Please enter the foodtype for this truck:");
//	input2 = sc.nextLine();
//	System.out.println("Please enter the rating for this truck:");
//	input3 = sc.nextInt();
//}
//
//	String input4 = "";
//	String input5 = "";
//	int input6 = 0;
//	System.out.println("Please enter the name of the second food Truck:");
//	input4 = sc.nextLine();
//	if (input4.equals("quit") || input4.equals("Quit") || input4.equals("Quit")) {
//		break;
//	}
//	else {
//	System.out.println("Please enter the foodtype for this truck:");
//	input5 = sc.nextLine();
//	System.out.println("Please enter the rating for this truck:");
//	input6 = sc.nextInt();
//	}
//
//String input7 = "";
//String input8 = "";
//int input9 = 0;
//		System.out.println("Please enter the name of the third food Truck:");
//		input7 = sc.nextLine();
//		if (input7.equals("quit") || input7.equals("Quit") || input7.equals("Quit")) {
//			break;
//		}
//		else {
//		System.out.println("Please enter the foodtype for this truck:");
//		input8 = sc.nextLine();
//		System.out.println("Please enter the rating for this truck:");
//		input9 = sc.nextInt();
//	}
//
//String input10 = "";
//String input11 = "";
//int input12 = 0;
//		System.out.println("Please enter the name of the fourth food Truck:");
//		input10 = sc.nextLine();
//		if (input10.equals("quit") || input10.equals("Quit") || input10.equals("Quit")) {
//			break;
//		}
//		else {
//		System.out.println("Please enter the foodtype for this truck:");
//		input11 = sc.nextLine();
//		System.out.println("Please enter the rating for this truck:");
//		input12 = sc.nextInt();
//	}
//
//String input13 = "";
//String input14 = "";
//int input15 = 0;
//		System.out.println("Please enter the name of the fifth food Truck:");
//		input13 = sc.nextLine();
//		if (input13.equals("quit") || input13.equals("Quit") || input13.equals("Quit")) {
//			break;
//		}
//		else {
//		System.out.println("Please enter the foodtype for this truck:");
//		input14 = sc.nextLine();
//		System.out.println("Please enter the rating for this truck:");
//		input15 = sc.nextInt();
//	
//		
//		public void displayFoodTrucks(FoodTruck[] y) {
//			for (int i=0; i<numTrucks;i++)
//				y.toString();
//		}
//		
//		
//		
//
//		switch(option){
//		
//		case 1:
//			System.out.println("hello");
//			break;
//		case 2:
//			averageRating();
//			break;
//		case 3:
//			highestRated();
//			break;
//		case 4:
//			break;
//			
//		default:
//			System.out.println("Please enter a valid entry");
//
//			
//			public FoodTruck[] copyOfTruck() {
//				FoodTruck[] copyTrucks = new FoodTruck[index];
//				for (int i=0; i<copyTrucks.length;i++) {
//					copyTruck[i]= fTrucks[i];
//				}
//				return copyTrucks[i];
//			}
//			
//			int option=sc.nextInt();
//			if (option==1) {
//				printTrucks(fTrucks);
//			}
////			if (option==2) {
////				averageRating(findNumOfTrucks(allFoodTrucks));
////				
////			if (option==3) {
////				highestRating (findNumOfTrucks(allFoodTrucks));
////				
////			}
//		//	
//			
//			public void findNumOfTrucks(FoodTruck[] x) {
//				for (int i = 0; i < 5; i++) {
//
//					if (x[i] != null) {
//						total++;
//					} else {
//						break;
//					}
//				}
//				System.out.println(total);
//			}


//	public FoodTruck[] listOfFoodTrucks(FoodTruck[] x) {
//		FoodTruck[] copyft = new FoodTruck[5];
//		for (int i = 0; i < 5; i++) {
//			copyft[i] = x[i];
//		}
//		;
//		return copyft;
//		
//	}



//	public void printTrucks(FoodTruck[] trucks) {
//		for (int i = 0; i < trucks.length; i++) {
//			System.out.println(trucks[i]);
//		}
//	}
