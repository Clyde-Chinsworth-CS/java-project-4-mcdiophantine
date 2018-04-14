//Mcdiophantine Project
//14/04/2018
import java.io.*;
import java.util.*;
public class Mcdiophantine
{
	public static void main(String args[])
	{
	Scanner kbReader = new Scanner(System.in);
	System.out.print("Enter the amount of McNuggets the program will run up to: ");
	int nuggets = kbReader.nextInt(); //program will calculate values for highest possible number less than or equal to user input
	for (int sum = 1; sum <= nuggets; sum++)
	{
		for (int i = 0; i * 6 <= sum; i++) //loops for every value of 6 * i until it is greater or equal to amount of nuggets 
		{
			for (int j = 0; i * 6 + j * 9 <= sum; j++) //loops for every value of (i * 6) + (j * 9), i remains constant throughout all trials
			{
				for (int k = 0; i * 6 + j * 9 + k * 20 <= sum; k++) //loops for every value of (i * 6) + (j * 9) + (k * 9), i and j remains constant throughout all trials
				{
				}
			}
		} 
	
	}
	
	}
}
