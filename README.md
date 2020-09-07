## FOOD TRUCK PROJECT

##Overview

In this project, a user enters information for different food trucks. The user is then given the option to request info on the Food Trucks entered via simple menu. This project contained a class for the FoodTruck object, and the second class, FoodTruckApp, where the main program is run.

###Topics

*Taking User Input
Using the getUserInfo() method the user is asked to input name, foodtype, and rating for a food truck. The user can input info for no more than five food trucks. The user can input info for less than five food trucks. Following input of information, the input is stored in a FoodTruck array and returned to the main method.

*Print Menu and asking for user option
After taking user input, a main menu is printed asking the user if they would like to list all existing food trucks, see the average rating of food trucks, display the highest-rated food truck, or quit the program. This option is entered using a number corresponding to each of the options. Following this, a switch statement captures the option and calls a method or other option of choice.

*method displayFoodTrucks
Calling the displayFoodTrucks method iterates through a for loop producing a printed toString for each FoodTruck in the array.

*method averageRating
Calling the averageRating method prints out the average rating for all the  food trucks entered by the user.

*method highestRated
Calling the highestRated method prints out the highest rated food truck entered by the user.

*Variables and objects
FoodTruck contains the descriptive variables of name, foodtype, rating, and nextTruckID. NextTruckID is the unique ID given to every Food Truck at creation. FoodTruck [] ftruck captures the array of FoodTrucks entered by the user. FoodTruckApp is the object associated with the main program class.

*Instructions
The user is prompted to enter food truck info. Following this the user is prompted to request info for different outputs shared in menu.

*Lessons learned
I learned that a scanner can be called in a method (e.g. method(sc)). I also learned a bit more about how a toString works within and between classes.
