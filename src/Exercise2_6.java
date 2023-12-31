import java.util.Scanner;

public class Exercise2_6 {
    public static void main(String[] args) {
        /*
        (Multiply the digits in an integer) Write a program that reads an integer between
        0 and 1000 and multiplies all the digits in the integer. For example, if an integer
        is 932, the multiplication of all its digits is 54.
        Hint: Use the % operator to extract digits, and use the / operator to remove the
        extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
        Here is a sample run:

        Enter a number between 0 and 1000: 999
        The multiplication of all digits in 999 is 729
        */

        // create a scanner
        Scanner input = new Scanner(System.in);

        // get integer between 0 and 1000 from user
        System.out.print("Enter a number between 0 and 1000: ");
        short inputNumber = input.nextShort();
        short number = inputNumber;

        short result = 1;
        // extract last digit first time
        short digit = (short)(number % 10);
        result *= digit;
        number /= 10;

        // extract last digit second time
        digit = (short)(number % 10) ;
        result *= digit;
        number /= 10;

        // extract last digit third time
        digit = (short)(number % 10) ;
        result *= digit;
        number /= 10;

        // print multiplication result
        System.out.println("The multiplication of all digits in " + inputNumber + "is " + result);
    }
}
