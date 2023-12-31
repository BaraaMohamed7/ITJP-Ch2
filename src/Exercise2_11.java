import java.util.Scanner;

public class Exercise2_11 {
    public static void main(String[] args) {
        /*
        (Population projection) Rewrite Programming Exercise 1.11 to prompt the user
        to enter the number of years and display the population after the number of years.
        Use the hint in Programming Exercise 1.11 for this program. Here is a sample run
        of the program:

        Enter the number of years: 5
        The population in 5 years is 325932969
        */

        // create a Scanner
        Scanner input = new Scanner(System.in);

        // get number of years from the user
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        // initialize population
        int initialPopulation = 312032486;

        // compute year seconds
        int yearSeconds = 365 * 24 * 60 * 60;

        // compute populationChangeRate
        int populationChangeRate = (yearSeconds / 7) + (yearSeconds / 45) - (yearSeconds /13);

        // compute future population
        int futurePopulation = initialPopulation + (populationChangeRate * years);

        // display the future population
        System.out.println("The population in " + years +  " years is " + futurePopulation);
    }
}
