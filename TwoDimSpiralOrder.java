public class TwoDimSpiralOrder
{
    public static void printSpiral(int[][] arr) 
    {
        int rowStart = 0, rowEnd = arr.length - 1;
        int colStart = 0, colEnd = arr[0].length - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) 
        {
            // print the first row
            for (int j = colStart; j <= colEnd; j++) 
            {
                System.out.print(arr[rowStart][j] + " ");
            }
            rowStart++;

            // print the last column
            for (int i = rowStart; i <= rowEnd; i++) 
            {
                System.out.print(arr[i][colEnd] + " ");
            }
            colEnd--;

            // print the last row
            if (rowStart <= rowEnd) 
            {
                for (int j = colEnd; j >= colStart; j--) 
                {
                    System.out.print(arr[rowEnd][j] + " ");
                }
                rowEnd--;
            }

            // print the first column
            if (colStart <= colEnd) 
            {
                for (int i = rowEnd; i >= rowStart; i--) 
                {
                    System.out.print(arr[i][colStart] + " ");
                }
                colStart++;
            }
        }
    }
}