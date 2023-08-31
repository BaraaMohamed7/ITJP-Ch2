import java.util.Scanner;

public class Exercise2_14 {
    public static void main(String[] args) {
        /*
        (Health application: computing BMI) Body Mass Index (BMI) is a measure of
        health on weight. It can be calculated by taking your weight in kilograms and
        dividing, by the square of your height in meters. Write a program that prompts the
        user to enter a weight in pounds and height in inches and displays the BMI. Note
        one pound is 0.45359237 kilograms and one inch is 0.0254 meters. Here is a
        sample run:

        Enter weight in pounds: 95.5
        Enter height in inches: 50
        BMI is 26.8573
        */

        // create a Scanner
        Scanner input = new Scanner(System.in);

        // get weight in pounds from user
        System.out.print("Enter weight in pounds: ");
        double weightPounds = input.nextDouble();

        // get height in inches from user
        System.out.print("Enter height in inches: ");
        double heightInches = input.nextDouble();

        // convert weight to kilograms
        double weight = weightPounds * 0.45359237;

        // convert height to meters
        double height = heightInches * 0.0254;

        // compute BMI = ( weight / ( height  * height) )
        double BMI = weight / ( height  * height);

        // print BMI
        System.out.println("BMI is " + (int)(BMI * 10000) / 10000.0);
    }
}
