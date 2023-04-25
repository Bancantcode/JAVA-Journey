import java.util.*;

public class TwoDimMultipleOfEight 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int loop = input.nextInt();

        int[][] array = {{1}, {8}};

        for(int i = 1; i < loop; i++)
        {
            System.out.println(array[0][0] + " x 8 = " + array[1][0]);
            array[0][0] += 1;
            array[1][0] += 8;
        }
    }    
}
