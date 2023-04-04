import java.util.Scanner;
public class Asynch3_While
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int value;
		System.out.print("Enter a number: ");
		value = input.nextInt();
		
		while (value != 0) 
		{
			System.out.print("Enter a number: ");
			value = input.nextInt();
		} 
	}
}