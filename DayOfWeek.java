import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day (1-31): ");
        int day = scanner.nextInt();
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        int century = year / 100;
        year = year % 100;
        int dayOfWeek = (day + (13 * (month + 1)) / 5 + year + year / 4 + century / 4 + 5 * century) % 7;
        String dayOfWeekString;
        switch (dayOfWeek) 
        {
            case 0:
                dayOfWeekString = "Saturday";
                break;
            case 1:
                dayOfWeekString = "Sunday";
                break;
            case 2:
                dayOfWeekString = "Monday";
                break;
            case 3:
                dayOfWeekString = "Tuesday";
                break;
            case 4:
                dayOfWeekString = "Wednesday";
                break;
            case 5:
                dayOfWeekString = "Thursday";
                break;
            case 6:
                dayOfWeekString = "Friday";
                break;
            default:
                dayOfWeekString = "Invalid day of week";
                break;
        }
        System.out.println("The day of the week is " + dayOfWeekString);
    }
}
