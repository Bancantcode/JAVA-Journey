import java.util.Scanner;

public class MinuteToDateYear {
    
    public static void ConvertMinute()
    {
        int minutes, years, day;
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of minutes: ");
        minutes = input.nextInt();
        years = minutes / (60 * 24 * 365);
        day = (minutes / 60 / 24) % 365;

        System.out.println(minutes+" is approximately "+years+" years and "+day+" days");
    }
    public static void main(String[] args)
    {
        ConvertMinute();
    }
}
