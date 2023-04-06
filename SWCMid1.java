import java.util.Scanner;

public class SWCMid1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int [] num = new int [10];
        int ctr = 0, sum = 0;

        System.out.println("Please input 10 number: ");
        
		for(ctr = 0; ctr < 10; ctr++) 
		{
        	System.out.print("num "+ctr+":");
        	num[ctr] = input.nextInt();
        	sum += num[ctr];
		}
    		System.out.println("The sum of 10 inputted numbers are: "+sum);
	}
}