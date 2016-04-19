/****************************************************************************************************************
 *	Matthew Frank																								*
 *	Assignment Last																								*
 *	Due: 04.19.16																								*
 *	IT2045C/003/16SS																							*
 *	Project Euler #30 :																							*
 *	Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:	*
 *	1634 = 14 + 64 + 34 + 44																					*
 *	8208 = 84 + 24 + 04 + 84																					*
 *	9474 = 94 + 44 + 74 + 44																					*
 *	As 1 = 14 is not a sum it is not included.																	*
 *	The sum of these numbers is 1634 + 8208 + 9474 = 19316.														*
 *	Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.				*
 ****************************************************************************************************************/

package AssignmentLast_frankmj;
public class Main
{
	public static void main(String[] args)
	{	//define variable for solution
		int solution = 0;
		
		//define loop to to step through each integer to max integer value (Knowing the solution, I could have set it there to speed it up...)
		for (int i = 2; i < Integer.MAX_VALUE; i++)
		{	
			//define variable to track the sum of the powers (to compare to the integer itself)
		    int sumOfPowers = 0;
		    
		    //define a variable set equal to the counter so we can split it into its digits
		    int number = i;
		    
		    //define a loop to split the number into its digits (adapted from your in-class example)
		    while (number > 0)
		    {
		    	int digit = number % 10;

		    	//divide by 10 and redefine for next digit
		    	number /= 10;
		    	
		    	//define another variable (equal to current digit) to find the fifth power
		    	int power = digit;
		    	
		    	//loop to calculate the fifth power
		    	for(int j = 1; j < 5; j++)
		    	{
		    		power *= digit;
		    	}
		    	//add that digits fifth power to the sum
		    	sumOfPowers += power;
		    }
		    
		    //if it is a # that can be written as the sum of its fifths, add it to the running total (solution)
		    if (sumOfPowers == i)
		    {
		    	solution += i;
		    }
		}
		System.out.println("The sum of all the numbers that can be written as the sum of fifth powers of their digits = " + solution);
	}
}