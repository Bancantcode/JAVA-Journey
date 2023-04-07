import java.util.Scanner;

public class FahrenheitToCelsius {
    
    public static void FahToCel()
    {
        double fahrenheit, celsius;
        Scanner input = new Scanner(System.in);
        System.out.print("Input a degree in Fahrenheit: ");
        fahrenheit = input.nextDouble();
        celsius = ((5 * (fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit+ " degree Fahrenheit is equal to "+ celsius +" in Celsius");
    }
    public static void main(String[] args)
    {
        FahToCel();
    }
}
