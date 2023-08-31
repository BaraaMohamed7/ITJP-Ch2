import java.util.Scanner;

public class Exercise2_21 {
    public static void main(String[] args) {
        /*
        (Financial application: calculate future investment value) Write a program that
        reads in investment amount, annual interest rate, and number of years and displays
        the future investment value using the following formula:

        (__ -> to power of)


        futureInvestmentValue =
        investmentAmount * (1 + monthlyInterestRate)
         __numberOfYears*12

        For example, if you enter amount 1000, annual interest rate 3.25%, and number
        of years 1, the future investment value is 1032.98.
        Here is a sample run:

        Enter investment amount: 1000.56
        Enter annual interest rate in percentage: 4.25
        Enter number of years: 1
        Future value is $1043.92
        */

        // create a Scanner
        Scanner input = new Scanner(System.in);

        // get investment amount, annual interest rate, and number of years from user
        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years: ");
        double numberOfYears = input.nextDouble();

        // compute monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;

        // compute future investment value
        double  futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), numberOfYears*12);

        // print future value
        System.out.println("Future value is $" + (int)(futureInvestmentValue * 100) / 100.0);
    }
}
