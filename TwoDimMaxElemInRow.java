public class TwoDimMaxElemInRow 
{
    public static void maxInEachRow(int[][] arr) 
    {
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i][0];
            for (int j = 1; j < arr[i].length; j++) 
            {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            System.out.println("Max element in row " + (i + 1) + ": " + max);
        }
    }
}
