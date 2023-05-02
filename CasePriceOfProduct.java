import java.util.Scanner;

public class CasePriceOfProduct 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the product code: ");
        char code = input.next().charAt(0);

        switch(code) 
        {
            case 'A':
                System.out.println("$10");
                break;
            case 'B':
                System.out.println("$20");
                break;
            case 'C':
                System.out.println("$30");
                break;
            default:
                System.out.println("Invalid product code.");
                break;
        }
    }
}
