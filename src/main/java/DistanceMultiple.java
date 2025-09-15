// NAME						:	Bara Omaira
// GROUP					:	APCS-A
// LAST MODIFIED			:	11 September 2025
// PROBLEM ID				:	Lewis 2.8: Distance Program
// PROBLEM DESCRIPTION		:	Prompt the user for two coordinate points
//							:	and find the distance between them.
// SOURCES I USED			:	Java Textbook, Mr. Houtrouw, Mr. Afsal
// PEOPLE I HELPED			:	N/A
// PEOPLE WHO HELPED ME		:	Mr. Houtrouw

// import a scanner
import java.util.Scanner;

public class DistanceMultiple
{
    public static void main(String[] args)
    {
        // create a scanner object
        Scanner sc = new Scanner(System.in);

        // declare variables
        double sum, product, average;

        // signature
        System.out.print("Bara Omaira\nAPCS-A\nLewis 2.8: Distance Program\n\n\n");

        // ask the user how many times they want to run the program
        System.out.println("How many times would you like to run the program?  ");
        int numRuns = sc.nextInt();

        for(int j=0; j<numRuns; j++)
        {

            // read in input
            System.out.println("\nEnter 3 numbers:  ");
            double num1 = sc.nextFloat();
            double num2 = sc.nextFloat();
            double num3 = sc.nextFloat();

            // calculate sum
            sum = num1 + num2 + num3;

            // calculate product
            product = num1 * num2 * num3;

            // calculate average
            average = (num1 + num2 + num3)/3;

            // print the results
            System.lineSeparator();
            System.out.println("Sum: " + sum);
            System.out.println("Product: " + product);
            System.out.println("Average: " + average);
            System.lineSeparator();
            System.lineSeparator();
        }
    }
}