import java.util.Scanner;
public class Activity1
{
	public static void main(String[] args)
	{
	String username;
	int num1, num2, num3, num4, sum; 
	Scanner inputDevice = new Scanner(System.in);
	System.out.print("What is your name? ");
	username = inputDevice.nextLine();
	System.out.println("Your username is "+username+"");
	
	System.out.println("Give two numbers to add!");
	System.out.print("num 1: ");
	num1 = inputDevice.nextInt();
	System.out.print("num 2: ");
	num2 = inputDevice.nextInt();
	sum = num1 + num2;
	System.out.println("Sum of two numbers is "+sum+"");
	
	System.out.println("Give two numbers to subtract!");
	System.out.print("num 1: ");
	num3 = inputDevice.nextInt();
	System.out.print("num 2: ");
	num4 = inputDevice.nextInt();
	int subtract = num3 - num4;
	System.out.println("Difference of two numbers is "+subtract+"");
	}
}

/*Bryan Aaron B. Santiago (BAN) - ICT-101*/