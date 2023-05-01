//Write a program that prompts the user to enter their age, and then outputs whether they are old enough to vote (i.e., age 18 or older).

import java.util.Scanner;

public class BooleanOldEnoughToVote 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        boolean canVote = age >= 18;
        System.out.println("You are old enough to vote: " + canVote);
    }
}
