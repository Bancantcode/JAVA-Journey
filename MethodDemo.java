//Santiago, Bryan Aaron B. | ICT-101
import java.util.Scanner;
public class MethodDemo
{
	//main program or main method
	public static void main(String[] args)
	{
		int mainX, mainNum = 5;
		getValue(mainNum);
		mainX = inputValue();
		System.out.println("The value of x is "+mainX);
	}
	//methods that do not return use void
	public static void displayText1()
	{
		System.out.println("********************************************************************************");
		System.out.println("\t\tThis is placed in a separate method");
		System.out.println("********************************************************************************");
		System.out.println("\n\n");
	}
	public static void displayText2()
	{
		System.out.println("\n\n");
		System.out.println("*******************************************************************************");
		System.out.println("*******************************************************************************");
	}
	public static int getValue(int num)
	{
		int methodNum;
		methodNum = num;
		displayText1();
		System.out.println("\t\tThis method accepts a value");
		System.out.println("\t\tThe value of number is "+methodNum);
		displayText2();
		return methodNum;
	}
	public static int inputValue()
	{
		Scanner userInput = new Scanner(System.in);
		int x,y;
		System.out.print("Please give a value for x: ");
		x = userInput.nextInt();

		return(x);
	}
}
