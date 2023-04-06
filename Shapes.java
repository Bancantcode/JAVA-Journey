//Santiago, Bryan Aaron B. | ICT-101

import java.util.Scanner;

public class Shapes
{
  	static void MainProgram()
  	{
		Scanner cue = new Scanner(System.in);
		System.out.println(">>>>>>    Shapes    <<<<<<<\n\t[1] Circle\n\t[2] Square\n\t[3] Triangle\n\t[4] Rectangle");
		System.out.print("Choice: ");
		char choice = cue.next().charAt(0);
		if (choice == '1')
		{
			Circle();
		} 
		else if (choice == '2')
		{
			Square();
		}
		else if (choice == '3')
		{
			Triangle();
		}
		else if (choice == '4')
		{
			Rectangle();
		}
		else
		{
			System.out.println("See You Next Time!");
		}
  	}
	public static void Circle()
	{
		Scanner circleScanner = new Scanner(System.in);
		System.out.println(">>>>>>>>>>   Circle    <<<<<<<<<<\n\t[A] Area\n\t[P] Perimeter");
		System.out.print("What would you like to compute? ");
		char cCompute = circleScanner.next().charAt(0);
		if (cCompute == 'A' || cCompute == 'a')
		{
			Circle myCircle = new Circle();
			System.out.print("Give a value for Radius: ");
			double radius = circleScanner.nextDouble();
			double area = myCircle.area(radius);
			System.out.println("The Perimeter of the circle is "+area);

			Scanner repeat = new Scanner(System.in);
			System.out.print("Press X to Exit the program Y to compute again Z for Main Menu --> ");
			char letter = repeat.next().charAt(0);
			while (true) {
				if (letter == 'X' || letter == 'x')
				{
					break;
				}
				else if (letter == 'Y' || letter == 'y')
				{
					Circle();
				}
				else if (letter == 'Z' || letter == 'z')
				{
					MainProgram();
				}
				else
				{
					break;
				}
			}
		} 
		else if (cCompute == 'P' || cCompute == 'p')
		{
			Circle myCircle = new Circle();
			System.out.print("Give a value for Radius: ");
			double radius = circleScanner.nextDouble();
			double perimeter = myCircle.perimeter(radius);
			System.out.println("The Perimeter of the circle is "+perimeter);

			Scanner repeat = new Scanner(System.in);
			System.out.print("Press X to Exit the program Y to compute again Z for Main Menu --> ");
			char letter = repeat.next().charAt(0);
			while (true) {
				if (letter == 'X' || letter == 'x')
				{
					break;
				}
				else if (letter == 'Y' || letter == 'y')
				{
					Circle();
				}
				else if (letter == 'Z' || letter == 'z')
				{
					MainProgram();
				}
				else
				{
					break;
				}
			}
		}
	}
	public static void Square()
	{
		Scanner squareScanner = new Scanner(System.in);
		System.out.println(">>>>>>>>>>   Square    <<<<<<<<<<\n\t[A] Area\n\t[P] Perimeter");
		System.out.print("What would you like to compute? ");
		char sCompute = squareScanner.next().charAt(0);
		if (sCompute == 'A' || sCompute == 'a')
		{
			Square mySquare = new Square();
			System.out.print("Give a value for Side: ");
			double side = squareScanner.nextDouble();
			double area = mySquare.area(side);
			System.out.println("The Area of the square is "+area);

			Scanner repeat = new Scanner(System.in);
			System.out.print("Press X to Exit the program Y to compute again Z for Main Menu --> ");
			char letter = repeat.next().charAt(0);
			while (true) {
				if (letter == 'X' || letter == 'x')
				{
					break;
				}
				else if (letter == 'Y' || letter == 'y')
				{
					Square();
				}
				else if (letter == 'Z' || letter == 'z')
				{
					MainProgram();
				}
				else
				{
					break;
				}
			}
		} 
		else if (sCompute == 'P' || sCompute == 'p')
		{
			Square mySquare = new Square();
			System.out.print("Give a value for Side: ");
			double side = squareScanner.nextDouble();
			double perimeter = mySquare.perimeter(side);
			System.out.println("The Perimeter of the square is "+perimeter);

			Scanner repeat = new Scanner(System.in);
			System.out.print("Press X to Exit the program Y to compute again Z for Main Menu --> ");
			char letter = repeat.next().charAt(0);
			while (true) {
				if (letter == 'X' || letter == 'x')
				{
					break;
				}
				else if (letter == 'Y' || letter == 'y')
				{
					Square();
				}
				else if (letter == 'Z' || letter == 'z')
				{
					MainProgram();
				}
				else
				{
					break;
				}
			}
		}
	}
	public static void Rectangle()
	{
		Scanner rectangleScanner = new Scanner(System.in);
		System.out.println(">>>>>>>>>>   Rectangle   <<<<<<<<<<\n\t[A] Area\n\t[P] Perimeter");
		System.out.print("What would you like to compute? ");
		char rCompute = rectangleScanner.next().charAt(0);
		if (rCompute == 'A' || rCompute == 'a')
		{
			Rectangle myRectangle = new Rectangle();
			System.out.print("Give a value for Length: ");
			double length = rectangleScanner.nextDouble();
			System.out.print("Give a value for Width: ");
			double width = rectangleScanner.nextDouble();
			double area = myRectangle.area(length, width);
			System.out.println("The Area of the rectangle is "+area);

			Scanner repeat = new Scanner(System.in);
			System.out.print("Press X to Exit the program Y to compute again Z for Main Menu --> ");
			char letter = repeat.next().charAt(0);
			while (true) {
				if (letter == 'X' || letter == 'x')
				{
					break;
				}
				else if (letter == 'Y' || letter == 'y')
				{
					Rectangle();
				}
				else if (letter == 'Z' || letter == 'z')
				{
					MainProgram();
				}
				else
				{
					break;
				}
			}
		}
		else if (rCompute == 'P' || rCompute == 'p')
		{
			Rectangle myRectangle = new Rectangle();
			System.out.print("Give a value for Length: ");
			double length = rectangleScanner.nextDouble();
			System.out.print("Give a value for Width: ");
			double width = rectangleScanner.nextDouble();
			double perimeter = myRectangle.perimeter(length, width);
			System.out.println("The Perimeter of the rectangle is "+perimeter);

			Scanner repeat = new Scanner(System.in);
			System.out.print("Press X to Exit the program Y to compute again Z for Main Menu --> ");
			char letter = repeat.next().charAt(0);
			while (true) {
				if (letter == 'X' || letter == 'x')
				{
					break;
				}
				else if (letter == 'Y' || letter == 'y')
				{
					Rectangle();
				}
				else if (letter == 'Z' || letter == 'z')
				{
					MainProgram();
				}
				else
				{
					break;
				}
			}
		}
	}
	public static void Triangle()
	{
		Scanner triangleScanner = new Scanner(System.in);
		System.out.println(">>>>>>>>>>   Triangle   <<<<<<<<<<\n\t[A] Area\n\t[P] Perimeter");
		System.out.print("What would you like to compute? ");
		char tCompute = triangleScanner.next().charAt(0);
		if (tCompute == 'A' || tCompute == 'a')
		{
			Triangle myTriangle = new Triangle();
			System.out.print("Give a value for Base: ");
			double base = triangleScanner.nextDouble();
			System.out.print("Give a value for Height: ");
			double height = triangleScanner.nextDouble();
			double area = myTriangle.area(base, height);
			System.out.println("The Area of the triangle is "+area);

			Scanner repeat = new Scanner(System.in);
			System.out.print("Press X to Exit the program Y to compute again Z for Main Menu --> ");
			char letter = repeat.next().charAt(0);
			while (true) {
				if (letter == 'X' || letter == 'x')
				{
					break;
				}
				else if (letter == 'Y' || letter == 'y')
				{
					Triangle();
				}
				else if (letter == 'Z' || letter == 'z')
				{
					MainProgram();
				}
				else
				{
					break;
				}
			}
		}
		else if (tCompute == 'P' || tCompute == 'p')
		{
			Triangle myTriangle = new Triangle();
			System.out.print("Give a value for Base: ");
			double base = triangleScanner.nextDouble();
			System.out.print("Give a value for Height: ");
			double height = triangleScanner.nextDouble();
			System.out.print("Give a value for Side: ");
			double side = triangleScanner.nextDouble();
			double perimeter = myTriangle.perimeter(base, height, side);
			System.out.println("The Perimeter of the triangle is "+perimeter);

			Scanner repeat = new Scanner(System.in);
			System.out.print("Press X to Exit the program Y to compute again Z for Main Menu --> ");
			char letter = repeat.next().charAt(0);
			while (true) {
				if (letter == 'X' || letter == 'x')
				{
					break;
				}
				else if (letter == 'Y' || letter == 'y')
				{
					Triangle();
				}
				else if (letter == 'Z' || letter == 'z')
				{
					MainProgram();
				}
				else
				{
					break;
				}
			}
		}
	}
	public static void main(String[] args)
	{
		MainProgram();
	}
}


//circle

//area = PI * (radius*radius);
//per = 2 * PI * radius;

//square

//area = side * side;
//perimeter = 4 * side;

//rectangle

//area = length * width;
//perimeter = 2 * (length * width);

//triangle

//area = (base * height) / 2;
//perimeter = side + base + side;






