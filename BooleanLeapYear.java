//Write a program that reads in a year from the user and outputs whether it is a leap year (i.e., divisible by 4, but not divisible by 100 unless also divisible by 400).

import java.util.Scanner;

public class BooleanLeapYear 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        boolean isLeapYear = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
        System.out.println("Is leap year? " + isLeapYear);
    }
}
