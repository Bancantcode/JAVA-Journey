import java.util.Scanner;

public class SeasonCalculator 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        String season;
        if (month >= 1 && month <= 2 || month == 12) 
        {
            season = "winter";
        } 
        else if (month >= 3 && month <= 5) 
        {
            season = "spring";
        } 
        else if (month >= 6 && month <= 8) 
        {
            season = "summer";
        } 
        else if (month >= 9 && month <= 11) 
        {
            season = "fall";
        } 
        else 
        {
            season = "Invalid month";
        }
        System.out.println("The season is " + season);
    }
}
