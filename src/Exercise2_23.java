import java.util.Scanner;

public class Exercise2_23 {
    public static void main(String[] args) {
        /*
        (Cost of driving) Write a program that prompts the user to enter the distance to
        drive, the fuel efficiency of the car in miles per gallon, and the price per gallon
        then displays the cost of the trip. Here is a sample run:

        Enter the driving distance: 900.5
        Enter miles per gallon: 25.5
        Enter price per gallon: 3.55
        The cost of driving is $125.36
        */

        // create a Scanner
        Scanner input = new Scanner(System.in);

        // get distance, fuel efficiency (miles per gallon), price per gallon
        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();

        System.out.print("Enter miles per gallon: ");
        double fuelEfficiency = input.nextDouble();

        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();

        // compute trip cost
        double gallons = distance / fuelEfficiency;
        double cost = gallons * pricePerGallon;


        // print trip cost
        System.out.println("The cost of driving is $" + (int)(cost * 100) / 100.0);
    }
}
