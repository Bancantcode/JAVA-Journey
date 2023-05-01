//Write a program that reads in two integers from the user and prints "true" if the first integer is divisible by the second integer, and "false" otherwise.

import java.util.Scanner;

public class BooleanDivisible 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two integers, separated by a space: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        boolean isDivisible = num1 % num2 == 0;
        System.out.println(isDivisible);
    }
}
