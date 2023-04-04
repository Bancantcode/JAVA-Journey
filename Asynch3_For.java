import java.util.Scanner;
public class Asynch3_For
{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		int num;   

		System.out.print("Input a number: ");
		num = userInput.nextInt(); 
          
		for (int x = (num + 1); x <= (num + 9); x++) {
		System.out.println(x);
		}
	}
}