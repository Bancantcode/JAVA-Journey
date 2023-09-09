//Santiago, Bryan Aaron B. | WD-202

import java.util.Scanner;

public class Main_Customer 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Customer customer = new Customer(20, "Bryan Aaron Santiago", "Guagua, Pampanga","Pancake", 20.0, 5, 3); // Creating a Customer object with the constructor
        customer.display();

        //With User-Input / Scanner
        System.out.print("Enter Your Number: "); customer.setCustomerNumber(input.nextInt());
        input.nextLine(); //buffer
        System.out.print("Enter your Name: "); customer.setCustomerName(input.nextLine());
        System.out.print("Enter your Address: "); customer.setCustomerAddress(input.nextLine());
        System.out.print("Enter Item Name: "); customer.setItemDescription(input.nextLine());
        System.out.print("Enter Item Price: "); customer.setItemPrice(input.nextDouble());
        System.out.print("Enter Item Quantity: "); customer.setQuantity(input.nextInt());
        System.out.print("Enter Mode Of Payment [1/2/3]: "); customer.setModeOfPayment(input.nextInt());
        customer.display();
    }
}
