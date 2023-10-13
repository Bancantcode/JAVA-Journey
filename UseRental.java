import java.util.InputMismatchException;
import java.util.Scanner;

public class UseRental 
{
    static Scanner ban = new Scanner(System.in);
    public static void main(String[] args) 
    {
        try 
        {
            System.out.println("Enter Car Rental Details");    
            System.out.print("Enter Renter's Name: "); String name = ban.nextLine();
            System.out.print("Enter Renter's ZipCode: "); int zip = ban.nextInt();
            System.out.print("Enter the No of days to rent: "); int days = ban.nextInt();
            System.out.println("Choose Car Size\n[1]\tEconomy\n[2]\tMidsize\n[3]\tFullSize\n[4]\tLuxury\n[5]\tExit");
            System.out.print("Enter choice: "); int size = ban.nextInt();
            check(size, days, zip);//method caller
            System.out.println("Message\t:\t"+ DataMessage.message[0]);

            if (size == 1 || size == 2 || size == 3)
            {
                CarRental car1 = new CarRental(name, zip, size, days);
                System.out.println("Displaying Car Details");
                car1.display();
            }
            else if (size == 4)
            {
                Luxury car2 = new Luxury(name, zip, size, days);
                System.out.println("Displaying Luxury Car Details");
                car2.display();
            }
            else if (size == 5)
            {
                System.out.println("Terminating the program.");
                System.out.println("Thank you for using my program.");
                System.exit(0);
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("Error\t:\t"+DataMessage.message[6]);
        }
        catch(banException e)
        {
            System.out.println("Some data are out of range");
            System.out.println("Error\t:\t"+e.getMessage());
        }
    }
    static void check(int size, int days, int zip) throws banException
    {
        if (size != 1 && size != 2 && size != 3 && size != 4 && size != 5)
        {
            throw new banException(DataMessage.message[1]);
        }
        if (days < 1)
        {
            throw new banException(DataMessage.message[2]);
        }
        if (days > 15)
        {
            throw new banException(DataMessage.message[3]);
        }
        if (zip < 1000)
        {
            throw new banException(DataMessage.message[4]);
        }        
        if (zip > 9999)
        {
            throw new banException(DataMessage.message[5]);
        }
    }
}
