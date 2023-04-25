public class TwoDimRotate90clockwise 
{
    public static int[][] rotateClockwise(int[][] arr) 
    {
        int n = arr.length;
        int[][] result = new int[n][n];
    
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                result[j][n - i - 1] = arr[i][j];
            }
        }
        return result;
    }
}
