public class TwoDimSumOfDiagonalElem 
{
    public static int sumDiagonal(int[][] arr) 
    {
        int sum = 0;
    
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[i].length; j++) 
            {
                if (i == j) 
                {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
}
