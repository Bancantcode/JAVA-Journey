//Santiago, Bryan Aaron B. | ICT-101

public class MidLabAct1
{
	public static void main(String[] args)
	{
		int [] seq = new int[10];
		int ctr, num1 = 1, num2 = 0;

		System.out.println("Fibonacci Sequence of 10 numbers");
		for (ctr = 0; ctr < 10; ctr++)
		{
			seq[ctr] = num1 + num2;
			num1 = num2;
			num2 = seq[ctr];
			
			System.out.print(seq[ctr]+" ");
		}	
	}
}

//Output: 1 1 2 3 5 8 13 21 34 55

//Create Midterm Lab Activity 1 with the class name MidLabAct1 and file name MidLabAct1.java
//You are to compute for the Fibonacci Sequence of 10 numbers.