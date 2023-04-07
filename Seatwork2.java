//Santiago, Bryan Aaron B. | ICT-101

import java.util.Scanner;
public class Seatwork2	{

	public static void main(String[] args) 
	{
		final double pi = 3.1416;
		int num1, num2, num3, num4, sum, diff, prod;
		float quo, ans;
		double withpi;
		
		num1 = 12;
		num2 = 15;
		num3 = 100;
		num4 = 256;
		
		sum = num1 + num4;
		diff = num3 - num2;
		prod = num1 * num2;
		quo = num4/ num3;

		System.out.println("The value on num1 is "+num1+" added to num4 which is "+num4+" becomes " +sum); //268
		System.out.println("The value on num2 is "+num2+" subtracted from num3 which is "+num3+" becomes " +diff); //85
		System.out.println("The value on num1 is "+num1+" multiplied to num2 which is "+num2+" becomes " +prod); //180
		System.out.println("The value on num4 is "+num4+" divided to num3 which is "+num3+" becomes " +quo+"\n"); //2.0

		Scanner inputNum = new Scanner(System.in);
		
		System.out.print("Enter a number1: ");
		num1 = inputNum.nextInt();
		System.out.print("Enter a number2: ");
		num2 = inputNum.nextInt();
		System.out.print("Enter a number3: ");
		num3 = inputNum.nextInt();
		System.out.print("Enter a number4: ");
		num4 = inputNum.nextInt();

		System.out.println("The value on num1 is "+num1+" added to num4 which is "+num4+" becomes " +sum);
		System.out.println("The value on num2 is "+num2+" subtracted from num3 which is "+num3+" becomes " +diff);
		System.out.println("The value on num1 is "+num1+" multiplied to num2 which is "+num2+" becomes " +prod);
		System.out.println("The value on num4 is "+num4+" divided to num3 which is "+num3+" becomes " +quo+ "\n");

		ans = num1 + num2 - num3 * num4 / num1;
		System.out.println("Performed PEMDAS 1: " +ans);
		ans = num4 / num3 * num2 - num1 + num4;
		System.out.println("Performed PEMDAS 2: " +ans);
		ans = num3 * num4 / num1 + num2 - num3;
		System.out.println("Performed PEMDAS 3: " +ans);
		ans = num2 % num1 * num3 + num4 - num2 + num1 / num3;
		System.out.println("Performed PEMDAS 4: " +ans+"\n");

		ans = ((((num1 + num2) - num3) * num4) / num1);
		System.out.println("Performed PEMDAS 1: " +ans);
		withpi = ans * pi;
		System.out.println("Performed PEMDAS 1 with pi: " +withpi);

		ans = ((((num4 / num3) * num2) - num1) + num4);
		System.out.println("Performed PEMDAS 2: " +ans);
		withpi = ans * pi;
		System.out.println("Performed PEMDAS 2 with pi: " +withpi);

		ans = ((((num3 * num4) / num1) + num2) - num3);
		System.out.println("Performed PEMDAS 3: " +ans);
		withpi = ans * pi;
		System.out.println("Performed PEMDAS 3 with pi: " +withpi);

		ans = ((((((num2 % num1) * num3) + num4) - num2) + num1) / num3);
		System.out.println("Performed PEMDAS 4: " +ans);
		withpi = ans * pi;
		System.out.println("Performed PEMDAS 4 with pi: " +withpi);
	}
}










