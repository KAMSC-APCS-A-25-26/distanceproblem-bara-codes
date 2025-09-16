// NAME					:	Bara Omaira
// GROUP				:	APCS-A
// LAST MODIFIED		:	11 September 2025
// PROBLEM ID			:	Lewis 2.8: Distance Program
// PROBLEM DESCRIPTION	:	Prompt the user for two coordinate points
//							and find the distance between them. 
// SOURCES I USED		:	Java Textbook, Mr. Houtrouw, Mr. Afsal
// PEOPLE I HELPED		:	N/A
// PEOPLE WHO HELPED ME	:	Mr. Houtrouw

import java.util.Scanner;
public class DistanceMultiple 
{
	public static void main(String[] args) 
	{
		// create a scanner object
		Scanner sc = new Scanner(System.in);
		
		// declare variables
		double deltaX, deltaY, sum, distance;
		
		// signature
		System.out.print("Bara Omaira\nAPCS-A\nLewis 2.8: Distance Program\n\n\n");
		
		// ask the user how many times they want to run the program
		System.out.print("How many times do you want to run the program?  ");
		int numRuns = sc.nextInt();
		sc.nextLine();
		System.out.print("\n\n");

		for(int j=0; j<numRuns; j++)
		{
			// read in input and take out delimiters
			System.out.print("Enter two coordinate points:  ");
			String initialInput = sc.nextLine();
			initialInput = initialInput.replace(")(",",");
			String[] tokens = initialInput.replace("(", "").replace(")", "").split(",");
			
			// assign each token to a variable
			double x1 = Double.parseDouble(tokens[0]);
			double y1 = Double.parseDouble(tokens[1]);
			double x2 = Double.parseDouble(tokens[2]);
			double y2 = Double.parseDouble(tokens[3]);
			
			// calculate the distance
			deltaX = x2 - x1;
			deltaY = y2 - y1;
			sum = ((deltaX * deltaX)) + ((deltaY * deltaY));
			distance = Math.sqrt(sum);
			
			// print the result
			System.out.print("\n");
			System.out.println("The distance between the two points is: " + distance);
			System.out.print("\n\n");
		}
	}
}

/*
Bara Omaira
APCS-A
Distance Program


How many times do you want to run the program?  3


Enter two coordinate points:  (2,3)(7,3)

The distance between the two points is: 5.0


Enter two coordinate points:  (4,5)(8,8)

The distance between the two points is: 5.0


Enter two coordinate points:  (-1,-2)(0,7)

The distance between the two points is: 9.055385138137417
*/
