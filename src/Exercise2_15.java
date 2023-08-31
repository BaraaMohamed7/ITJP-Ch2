import java.util.Scanner;

public class Exercise2_15 {
    public static void main(String[] args) {
        /*
        (Geometry: distance of two points) Write a program that prompts the user to enter
        two points (x1, y1) and (x2, y2) and displays their distance. The formula for
        computing the distance is ( sqrt( pow((x2 -x1), 2) +  pow((y2 -y1), 2) ) )

        Here is a sample run:

        Enter x1 and y1: 1.5 -3.4
        Enter x2 and y2: 4 5
        The distance between the two points is 8.76413144584219
        */

        // create a Scanner
        Scanner input = new Scanner(System.in);

        // get point 1 from user
        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        // get point 2 from user
        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // compute the distance
        double distance = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));



        // print the distance
        System.out.println("The distance between the two points is " + distance);
    }
}
