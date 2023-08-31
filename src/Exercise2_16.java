import java.util.Scanner;

public class Exercise2_16 {
    public static void main(String[] args) {
        /*
        (Geometry: area of a hexagon) Write a program that prompts the user to enter the
        side of a hexagon and displays its area. The formula for computing the area of a
        hexagon is

        area = ((3 * sqrt(3)) / 2) * s * s

        where s is the length of a side. Here is a sample run:

        Enter the length of the side: 5.5
        The area of the hexagon is 78.5918
        */

        // create a Scanner
        Scanner input = new Scanner(System.in);

        // get the length from user
        System.out.print("Enter the length of the side: ");
        double s = input.nextDouble();


        // compute the area
        double area = ((3 * Math.sqrt(3)) / 2) * s * s;



        // print the area
        System.out.println("The area of the hexagon is " + (int)(area * 10000) / 10000.0);
    }
}
