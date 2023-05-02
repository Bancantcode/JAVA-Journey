import java.util.Scanner;

public class CaseTrafficLight 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time in 24-hour format (e.g. 14 for 2pm): ");
        int time = input.nextInt();

        switch(time / 100) 
        {
            case 6:
            case 7:
            case 8:
                System.out.println("Green");
                break;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                System.out.println("Yellow");
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                System.out.println("Red");
                break;
            default:
                System.out.println("Invalid time.");
                break;
        }
    }
}
