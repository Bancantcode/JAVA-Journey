import java.util.Scanner;

public class SumOfArray 
{
    static void SumOfArray()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < size; i++) 
        {
            arr[i] = input.nextInt();
        }
        
        int sum = 0;
        for(int i = 0; i <size; i++) 
        {
            sum += arr[i];
        }
        
        System.out.println("The sum of all elements in the array is: " + sum);
    }
    public static void main(String[] args)
    {
        SumOfArray();
    }
}
