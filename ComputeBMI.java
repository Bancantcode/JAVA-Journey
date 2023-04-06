import java.util.Scanner;

public class ComputeBMI {
    
    public static void Compute()
    {
        double weight, inches, bmi;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        weight = scan.nextDouble();
        System.out.print("Enter height in inches: ");
        inches = scan.nextDouble();
        bmi = weight * 0.453592 / ((inches* 0.0254) * inches* 0.0254);
        System.out.println("Body Mass Index is "+ String.format("%.2f", bmi));

    }
    public static void main(String[] args)
    {
        Compute();
    }
}
