//Santiago, Bryan Aaron B. | ICT-101

import java.util.Scanner;

public class MidLabAct1Bonus
{
	public static void main(String[] args)
	{
		Scanner cue = new Scanner(System.in);
		System.out.println("THE FIBONACCI SEQUENCE");
		System.out.print("Please enter the sequence length: ");
		int sequence = cue.nextInt();

		int [] seq = new int[sequence];
		int ctr, num1 = 0, num2 = 1;

		System.out.println("The Fibonacci Sequence for "+sequence+" digits are: ");
		System.out.print("0 1 ");
		for (ctr = 1; ctr < sequence; ctr++)
		{
			seq[ctr] = num1 + num2;
			num1 = num2;
			num2 = seq[ctr];
			System.out.print(+seq[ctr]+" ");
		}	
	}
}

//Optional for additional 20 points, you may submit the code that accepts the number of series that the Fibonacci Sequence will follow.
//Given below is a sample:

//THE FIBONACCI SEQUENCE
//Please enter the sequence length: 10
//The Fibonacci Sequence for 10 digits are:
//0 1 1 2 3 5 8 13 21 34 55