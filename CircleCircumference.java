import java.util.Scanner;
public class CircleCircumference
{
	public static void main(String[] args) 
	{
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Radius: ");
		double radius = inputDevice.nextInt();
		double circumference = Math.PI * 2*radius;
		System.out.println("The circumference is "+circumference+"");
	}
}