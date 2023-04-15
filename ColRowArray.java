//Santiago, Bryan Aaron B. | ICT-101

import java.util.*;

public class ColRowArray
{
    static void Sample1()
    {
        // int[][] oddNumbers = {{1, 3, 5, 7}, {9, 11, 13, 15}};
        // System.out.println(oddNumbers[0][0]); //1
        // System.out.println(oddNumbers[0][1]); //3
        // System.out.println(oddNumbers[1][1]); //11
        // System.out.println(oddNumbers[1][3]); //15
        // System.out.println(oddNumbers[0][3]); //7

        // //Column by Row
        // int[][] rents = {{1500, 3500, 450, 750}, {900, 1100, 1300, 715}};
        // System.out.println(rents[0][0]); //1500
        // System.out.println(rents[0][1]); //3500
        // System.out.println(rents[1][1]); //1100
        // System.out.println(rents[1][3]); //715
        // System.out.println(rents[0][3]); //750

        int[][] numArr = new int[10][10];
        int i, j, col, row;
        int val = 20;
        //place values
        for (col = 0; col < 10; col++)
        {
            for(row = 0; row < 10; row++)
            {
                val = val + 5;
                numArr[col][row] = val;
            }
        }
        //print values
        for(i = 0; i < 10; i++)
        {
            for(j = 0; j < 10; j++)
            {
                System.out.print(" "+ numArr[i][j]);
            }
        }
    }
    static void ArrayActivity()
    {
    //TASKS
    //1. CREATE A PROGRAM THAT WILL ASK FOR DIMENSIONS OF THE ARRAYS COL AND ROW
    //2. INPUT THE VALUES OF THE ARRAY
    //3. INCLUDE A TRY CATCH ON ARRAY INDEX OUT OF BOUNDS ERRORS
        Scanner array = new Scanner(System.in);
        int row, col, i, j;
        System.out.print("Enter rows: ");
        row = array.nextInt();
        System.out.print("Enter columns: ");
        col = array.nextInt();

        int[][] numArr = new int[row][col];

        for (i = 0; i < row; i++)
        {
            for(j = 0; j < col; j++)
            {
                System.out.print("Enter the value for row " + i + " column " + j + ": ");
                numArr[i][j] = array.nextInt();
            }
        }
        try 
        {
            System.out.print("Enter the row index to access: ");
            row = array.nextInt();

            System.out.print("Enter the column index to access: ");
            col = array.nextInt();

            System.out.println("Value at [" + row + "][" + col + "]: " + numArr[row][col]);
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Invalid array index!");
        }
    }
    public static void main(String[] args)
    {
        //Sample1();
        ArrayActivity();
    }
}
